import javax.xml.ws.Endpoint;

import service.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8585/";
		Endpoint.publish(url , new BanqueService());
	}

}
