package client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import server.WebInterface;

public class Main {
	
	 public static void main(String[] args) {
	        try {
	            URL url = new URL("http://localhost:8080/web?wsdl");
	            QName name = new QName("http://server/", "WebImplService");
	            Service service = Service.create(url,name);
	            WebInterface web = service.getPort(WebInterface.class);
	            System.out.println(web.getHelloWorldAsString("asd"));
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
}
