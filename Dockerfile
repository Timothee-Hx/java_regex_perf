FROM ubuntu:latest
LABEL authors="tim"
# this is a VM to test regex performance with production settings (cpu, memory, etc) with java 8
# install java 8
RUN apt-get update && apt-get install -y openjdk-8-jdk


# install maven
RUN apt-get install -y maven

# get the code
RUN mkdir /code
WORKDIR /code
COPY . /code

# build the code
RUN mvn clean package

# limit usage to 1 cpu
ENV JAVA_OPTS="-XX:ParallelGCThreads=1 -XX:ConcGCThreads=1"
# set the memory limit to 512m
ENV JAVA_TOOL_OPTIONS="-Xmx512m"

# run the code
CMD ["java", "-jar", "target/regex-1.0-SNAPSHOT.jar"]
