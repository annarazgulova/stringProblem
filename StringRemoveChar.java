package interview;

public class StringRemoveChar {
	// Iterate through the String, one character at a time
	public static String removeChar(String string, char removeChar) {		
		if (string ==null ||string.isEmpty()) {
			return string;
		}
		StringBuffer res = new StringBuffer();
		char[] arr = string.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != removeChar) {
				res.append(arr[i]);
			}
		}
		return res.toString();
	}

	public static String removeCharOneline(String string, char c) {
		if (string ==null ||string.isEmpty()) {
			return string;
		}
		return string.replaceAll(String.valueOf(c), "");
	}

	public static boolean verifyNoChar(String string, char c) {
		if (string ==null ||string.isEmpty()) {
			return false;
		}
		return string.contains(String.valueOf(c));
	}		 
	
}
