FROM maven:3.6-jdk-8

WORKDIR /app
COPY ./codeship/settings.xml pom.xml ./
RUN mvn -s settings.xml install clean --fail-never -q -DfailIfNoTests=false
RUN wget -nv https://github.com/codacy/codacy-coverage-reporter/releases/download/4.0.5/codacy-coverage-reporter-4.0.5-assembly.jar &&\
    mv codacy-coverage-reporter*.jar codacy-coverage-reporter.jar
COPY . .
RUN mvn cobertura:cobertura -Dcobertura.report.format=xml -Pci