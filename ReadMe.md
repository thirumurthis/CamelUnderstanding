##### ContextBean-from.xml
##### ContextBean-to.xml

Above context files uses direct:hello (endpoint) to transfer message.
And the ContextBean-to.xml receives message from the direct:hello endpoint and invokes the bean hello.
In this case the ContextBean-to.xml consits of java DSL configuration.

To execute both the context on seperate jvm
  - use ```org.apache.camel.spring.Main``` with ```-fa file/path/of/ContextBean-to.xml``` or ```-ac ContextBean-to.xml``` 
  note -ac if the application context is within the classpath else -fa is direct file location of the context.
  
  The other way to invoke is through custom main program and DefaultCamelContext class.
  
  Sample Representation:
  ![](https://github.com/thirumurthis/CamelUnderstanding/blob/master/CamelSampleRepresentation.png)
