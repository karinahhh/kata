import java.util.Arrays;
import java.util.function.BooleanSupplier;

public class IPvalidator {

	public boolean ValidateIp4Address(String ipString) {
		if(hasThreeDots(ipString) && firstNumberInRange1_254(ipString) && numbersInRange(ipString)) {
			return false;
		}
		return true;
	}

	private boolean hasThreeDots(String ipString) {

		return ipString.chars().filter(c->c=='.').count()==3;
	}


	public int[] getNumbers(String string) {
		return Arrays.stream(string.split("\\.")).mapToInt(Integer::parseInt).toArray();
	}
	
	private boolean firstNumberInRange1_254(String ipString) {
		return getNumbers(ipString)[0]>0 && getNumbers(ipString)[0]<255;
	}
	
	private boolean numbersInRange(String ipString) {
		return Arrays.stream(getNumbers(ipString)).allMatch(nr->nr>=0&&nr<=255);
	}

}
