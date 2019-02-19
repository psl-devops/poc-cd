# We're using the official Maven 3 image from the Docker Hub (https://hub.docker.com/_/maven/).
# Take a look at the available versions so you can specify the Java version you want to use.
FROM maven:3.6-jdk-8

# INSTALL any further tools you need here so they are cached in the docker build

WORKDIR /app

# Copy the pom.xml into the image to install all dependencies
COPY pom.xml ./

# Run install task so all necessary dependencies are downloaded and cached in
# the Docker image. We're running through the whole process but disable
# testing and make sure the command doesn't fail.
RUN mvn install clean --fail-never -B -DfailIfNoTests=false

# Install Heroku CLI
RUN curl https://cli-assets.heroku.com/install.sh | sh
# Install the java plugin for jar deployments
heroku plugins:install java
# Login to heroku
(
  echo "$HEROKU_CREDENTIALS_EMAIL"
  echo "$HEROKU_CREDENTIALS_PASSWORD"
) | heroku login
heroku create --no-remote

# Copy the whole repository into the image
COPY . ./