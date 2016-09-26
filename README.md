# Attach API Agent Loader

Loads java agent to virtual machine with provided process id.

##Prerequisites
* System variable JAVA_HOME must be set to JDK directory

##Execution
Check running virtual machine process id:

```
jps
```

Example output:

    $ jps
    10160
    7832 jar
    3356 Jps

Load java agent:

```
java -classpath $JAVA_HOME/lib/tools.jar:attach-api-agent-loader.jar -Djava.library.path=$JAVA_HOME/jre/bin pl.halun.demo.attach.api.AgentLoader 7832 agent.jar
```