/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 8402-01
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    @WebMethod(operationName = "addNumber")
    public double addNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {

        double addNumber = a + b;
        return (a + b);

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideNumber")
    public double divideNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double divideNumber = a / b;
        return (a / b);

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplyNumber")
    public double multiplyNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double divideNumber = a * b;
        String xx = String.valueOf(a*b);
        return (a * b);
       

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substractNumber")
    public double substractNumber(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        //TODO write your implementation code here:
        double divideNumber = a - b;
        return (a - b);

    }
}
