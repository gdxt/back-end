FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER wangiegie@gmail.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /gdzr-qrcode

WORKDIR /gdzr-qrcode

EXPOSE 8091

ADD qrcode-0.0.1-SNAPSHOT.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar qrcode-0.0.1-SNAPSHOT.jar
