package com.chuidiang;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UnWebService {
   @WebMethod
   public double suma(double a, double b) {
      return a + b;
   }
}