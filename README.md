
# KAFKA IMPLEMETATION In Springboot Application

*Note: Follow any one process from local machine or as docker containers.

In this hands on we are going to implement apache kafka.
I ceeated two micreservices or teo small application. 

application1:"delivery_boy"  
producer data which is continuesly sent to kafka to a particular topic.  

application2:"end_user"                                         
consumer subscribe to a particular topic, based on that is consumes data producer.

Follow the applications to know about code implementation of spring applications and kafks configurations.









## Screenshots

![App Screenshot](https://www.openlogic.com/sites/default/files/image/2020-05/image-blog-apacha-kafka.jpg)


## Installation 

Install kafka zip file from given link and extract it.
link: https://downloads.apache.org/kafka/3.6.2/kafka_2.12-3.6.2.tgz

Open cmd and locate to the directory ehre kafka is located.

Start zookeeper:

```cmd
    bin\windows\zookeeper-server-start.bat config\zookeeper.properties

```
Open another tab of cmd and start kafka client
```cmd
    bin\windows\kafka-server-start.bat config\server.propertieses

```

# Running in Docker Containers
If wwe dont want to run kafka and zookeper in local machine, then follow below steps to run zookeper and kafka in docker containers.

*Note:Download Docker first.

# Pull Kafka Docker Image:
```cmd
    docker pull wurstmeister/zookeeper
    docker pull wurstmeister/kafka
```
## create network:
```cmd
docker network create kafka-net
```


## Start Zookeeper container:
```cmd
    docker run -d --name zookeeper --network kafka-net -p 2181:2181 wurstmeister/zookeeper

```
## Start Kafka container:
```cmd
docker run -d --name kafka --network kafka-net -p 9092:9092 \
    -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
    -e KAFKA_LISTENER_SECURITY_PROTOCOL_MAP=PLAINTEXT:PLAINTEXT \
    -e KAFKA_INTER_BROKER_LISTENER_NAME=PLAINTEXT \
    -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 \
    wurstmeister/kafka
```
