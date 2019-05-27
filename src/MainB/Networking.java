package MainB;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Networking {
	public static void showNetwork() throws UnknownHostException {
		InetAddress oc = InetAddress.getLocalHost();
		System.out.println(oc);

	}

}
