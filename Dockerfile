FROM openjdk:8
EXPOSE 8096
COPY SSL/cacerts /usr/local/openjdk-8/jre/lib/security/cacerts
ADD target/inps-adhoc.jar inps-adhoc.jar
ENTRYPOINT ["java","-jar","/inps-adhoc.jar"]