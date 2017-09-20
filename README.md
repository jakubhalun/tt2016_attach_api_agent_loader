# Attach API Agent Loader

This application uses [Attach API](http://docs.oracle.com/javase/7/docs/technotes/guides/attach/index.html)
to load a Java Agent into a running Java Virtual Machine with a provided process id.

## Prerequisites
* System variable JAVA_HOME set to JDK directory

## Execution
Discover the process id of the running virtual machine:
```
jps
```

Example output:

    $ jps
    10160
    7832 jar
    3356 Jps

Load the Java agent:
```
java -classpath $JAVA_HOME/lib/tools.jar:attach-api-agent-loader.jar -Djava.library.path=$JAVA_HOME/jre/bin pl.halun.demo.attach.api.AgentLoader 7832 agent.jar
```