FROM hub.furycloud.io/mercadolibre/java-maven:jdk8

ENV MVN_RUN="compile exec:java"

####### CODECOV #######
ENV CODECOV_TOKEN=""