import java.util.function.BooleanSupplier;

public class IPvalidator {

	public boolean ValidateIp4Address(String ipString) {
		if(ipString=="") {
			return false;
		}
		return true;
	}

	private boolean hasThreeDots(String ipString) {

		return ipString.chars().filter(c->c=='.').count()==3;
	}
}
