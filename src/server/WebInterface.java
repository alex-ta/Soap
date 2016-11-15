package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC) //optional
public interface WebInterface{

	@WebMethod String getHelloWorldAsString(String name);

}