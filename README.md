## Example of spring boot p6spy configuration


P6Spy is a framework that enables database data to be seamlessly intercepted and logged with no code changes to existing application. The P6Spy distribution includes P6Log, an application which logs all JDBC transactions for any Java application.

### set up p6spy in spring boot application
- add p6spy dependency
```
<dependency>
    <groupId>p6spy</groupId>
    <artifactId>p6spy</artifactId>
    <version>3.9.1</version>
</dependency> 
```
- add p6spy to url
```
spring.datasource.url=jdbc:p6spy:h2:mem:persistence
```
- add spy.properties

- add real database in apy.properties 
```
driver=org.h2.Driver
```

### Configuration

| properties   |  Description | default value |
|--------------|:-----------------------|----------------|
| logfile | name of logfile to use | spy.log |
| append | append to the p6spy log file | true |
| logMessageFormat | class to use for formatting log messages | SingleLineFormat |
| useNanoTime | if set to true, the execution time will be measured in nanoseconds | false |
| executionThreshold | Execution threshold applies to the standard logging of P6Spy | 0 |
   

For full documentation refer to project page: [p6spy](https://github.com/p6spy/p6spy)