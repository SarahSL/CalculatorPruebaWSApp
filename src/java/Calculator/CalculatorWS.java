
package Calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        return i+j;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        return x-y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mult")
    public int mult(@WebParam(name = "z") int z, @WebParam(name = "k") int k) {
        //TODO write your implementation code here:
        return (z*k);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "m") int m, @WebParam(name = "l") int l) {
        //TODO write your implementation code here:
        return (m/l);
    }
}
