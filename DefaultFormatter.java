
public class DefaultFormatter implements NumberFormatter {
	
	public String format(int num) {
		String str = "" + num;
		String temp = "";
		int firstComma;
		if (str.length()%3 == 0) firstComma = 2;
		else if (str.length()%3 == 1) firstComma = 0;
		else firstComma = 1;
		boolean commaTime = false;
		for (int i = 0; i<str.length(); i++) {
			if (i == firstComma) commaTime = true;
			temp += str.charAt(i);
			if (i != str.length()-1 && commaTime && i%3 == firstComma) temp += ",";
		}
		return temp;
	}

}
