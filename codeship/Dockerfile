# We're using the official Maven 3 image from the Docker Hub (https://hub.docker.com/_/maven/).
# Take a look at the available versions so you can specify the Java version you want to use.
FROM maven:3.6-jdk-8
# INSTALL any further tools you need here so they are cached in the docker build
WORKDIR /app
# Install custom settings
COPY ./codeship/settings.xml ./
# Copy the pom.xml into the image to install all dependencies
COPY pom.xml ./
# Run install task so all necessary dependencies are downloaded and cached in
# the Docker image. We're running through the whole process but disable
# testing and make sure the command doesn't fail.
RUN mvn -s settings.xml install clean --fail-never -B -DfailIfNoTests=false
# Copy the whole repository into the image
COPY . ./
# Download codacy reporter
RUN wget https://github.com/codacy/codacy-coverage-reporter/releases/download/4.0.5/codacy-coverage-reporter-4.0.5-assembly.jar &&\
    mv codacy-coverage-reporter*.jar codacy-coverage-reporter.jar &&\
    rm -rf ./codeship &&\
    ls ./