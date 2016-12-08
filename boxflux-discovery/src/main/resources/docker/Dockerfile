FROM docker.io/java
MAINTAINER "Guanglin Wang"<wanggl_1024@foxmail.com>
ENV HTTP_PORT 8761
ADD boxflux-discovery.jar app.jar
EXPOSE 8761
CMD java -jar app.jar