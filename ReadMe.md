##### ContextBean-from.xml
##### ContextBean-to.xml

Above context files uses direct:hello (endpoint) to transfer message.

`ContextBean-to.xml` receives message from the `direct:hello` endpoint and invokes the bean method hello.
The ContextBean-to.xml consits of java DSL configuration.

Execute both the context on seperate jvm
  - use ```org.apache.camel.spring.Main``` with ```-fa file/path/of/ContextBean-to.xml``` or ```-ac ContextBean-to.xml``` 
  
  **`Note:`** 
  
  `-ac` to be used when the application context within the classpath 
  
  `-fa` to use the direct file location of the context when it is not in the classpath.
  
  The other way to run or invoke is through custom main program and DefaultCamelContext class, check camel documentation.
  
  Sample Representation:
  ![](https://github.com/thirumurthis/CamelUnderstanding/blob/master/CamelSampleRepresentation.png)
