
public class DecimalFormatter implements NumberFormatter {
	public String format(int num) {
		String str = "" + num;
		String temp = "";
		int firstDec;
		if (str.length()%3 == 0) firstDec = 2;
		else if (str.length()%3 == 1) firstDec = 0;
		else firstDec = 1;
		boolean decTime = false;
		for (int i = 0; i<str.length(); i++) {
			if (i == firstDec) decTime = true;
			temp += str.charAt(i);
			if (i != str.length()-1 && decTime && i%3 == firstDec) temp += ".";
		}
		return temp;
	}
}
