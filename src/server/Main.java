package server;
import javax.xml.ws.Endpoint;

public class Main {
	
	public static void main(String[] args) {
			   String url = "http://localhost:8080/web";
			   Endpoint p = Endpoint.publish(url, new WebImpl());
			   System.out.println(url + "?wsdl");
	}

}
