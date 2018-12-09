FROM tomcat:8.0.20-jre8

COPY ./target/javawebsite.war /usr/local/tomcat/webapps/myapp.war
EXPOSE 8080