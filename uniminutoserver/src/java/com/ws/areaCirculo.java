/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author BOG-A411-E-011
 */
@WebService(serviceName = "areaCirculo")
public class areaCirculo {

 
    @WebMethod(operationName = "Area")
    public Double area (@WebParam(name = "radio") Double radio) {
        return 2*Math.PI*(Math.pow(radio, 2));
    }

   
}
