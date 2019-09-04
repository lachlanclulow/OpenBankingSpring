FROM ibmjava:8-sfj
LABEL maintainer="IBM Java Engineering at IBM Cloud"

COPY target/openapi-spring-0.9.5.jar /app.jar

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
