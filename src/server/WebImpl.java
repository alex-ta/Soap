package server;

import javax.jws.WebService;

@WebService(endpointInterface = "server.WebInterface")
public class WebImpl implements WebInterface{
		
		@Override
		public String getHelloWorldAsString(String name) {
			return "Hello World JAX-WS " + name;
		}

}
