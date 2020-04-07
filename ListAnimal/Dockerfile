FROM library/ubuntu:latest

# Install OpenJDK-8
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y ant && \
    apt-get clean;

# Fix certificate issues
RUN apt-get update && \
    apt-get install ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
RUN export JAVA_HOME

#Install git
RUN apt-get update && \        
     apt-get install -y git
RUN git clone https://github.com/dhananjaysinghsengar/ListAnimal.git

# Download and install Gradle
RUN apt-get update
RUN apt-get install curl --assume-yes
RUN curl -L https://services.gradle.org/distributions/gradle-2.4-bin.zip -o gradle-2.4-bin.zip
RUN apt-get install -y unzip
RUN unzip gradle-2.4-bin.zip
ENV GRADLE_HOME=/app/gradle-2.4
ENV PATH=$PATH:$GRADLE_HOME/bin
RUN /bin/bash -c "source $HOME/.bashrc"
RUN rm gradle-2.4-bin.zip
RUN cd ./ListAnimal/ListAnimal
WORKDIR ./ListAnimal/ListAnimal
RUN chomd 777 *
RUN bash ./gradlew build --stacktrace
RUN bash ./gradlew tasks --stacktrace
RUN bash ./gradlew run --stacktrace

