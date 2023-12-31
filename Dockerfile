FROM maven:alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD pom.xml $HOME
RUN mvn verify --fail-never

ADD . $HOME
RUN mvn package


FROM openjdk:8-jdk-alpine
# limit usage to 1 cpu
ENV JAVA_OPTS="-XX:ParallelGCThreads=1 -XX:ConcGCThreads=1"

# set the memory limit to 512m
ENV JAVA_TOOL_OPTIONS="-Xmx128m"
COPY --from=build /usr/app/target/regex-1.0-SNAPSHOT.jar /app/regex-1.0-SNAPSHOT.jar
ENTRYPOINT java -jar /app/regex-1.0-SNAPSHOT.jar