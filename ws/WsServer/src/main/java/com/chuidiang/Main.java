package com.chuidiang;

import javax.xml.ws.Endpoint;

public class Main {
   /**
    * @param args
    */
   public static void main(String[] args) {
      Endpoint
            .publish("http://localhost:8080/UnWebService", new UnWebService());
   }
}