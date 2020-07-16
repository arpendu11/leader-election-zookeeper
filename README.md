# leader-election-zookeeper
A Java client code to connect to Apache Zookeeper and perform distributed consensus using Leader Election algorithm.

You need to run Zookeper for this. You can either download from [Zookeeper download](https://zookeeper.apache.org/releases.html) or you can use [Zookeeper Docker](https://hub.docker.com/r/wurstmeister/zookeeper/) if yuo have a docker instance running.

Create a znode in zookeper by logging in:
```
bin/zkCli.sh --server localhost:2181
create /election election
```

In order to package it, run 
```
mvn clean package
```

In order to run, use following command:
```
java -jar target/leader-election-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

You can run multiple instances and view it like this:
![]()
