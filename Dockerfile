FROM openjdk
EXPOSE 8080
ADD /target/Recommendations.jar /Recommendations.jar
ENTRYPOINT ["java","-jar","Recommendations.jar"]