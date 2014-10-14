package org.webservice.Client;  
import org.webservice.HelloWorld;  
import org.webservice.HelloWorldImplService;  
  
public class JAXWSClient {  
  
    public static void main(String[] args) {  
          
        HelloWorldImplService helloWorldService = new HelloWorldImplService();  
        HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();  
        System.out.println(helloWorld.helloWorld("Elena"));  
    }  
}

