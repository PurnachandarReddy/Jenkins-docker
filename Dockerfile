FROM openjdk
EXPOSE 8080
ADD target/JenkinsDockerIntegration-0.0.1.jar JenkinsDockerIntegration-0.0.1.jar
ENTRYPOINT ["java","-jar","JenkinsDockerIntegration-0.0.1.jar"]