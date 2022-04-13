package com.codingbat.finalmost;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String doubleChar(String str) {
		String ret = "";

		for (int i = 0; i < str.length(); i++) {
			ret = ret + str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return ret;
	}

	public int countHi(String str) {
		int ret = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				ret = ret + 1;
			}
		}
		return ret;
	}

	public boolean catDog(String str) {
		boolean ret = false;
		int catCount = 0;
		int dogCount = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equals("cat")) {
				catCount = catCount + 1;
			}

			if (str.substring(i, i + 3).equals("dog")) {
				dogCount = dogCount + 1;
			}
		}

		if (catCount == dogCount) {
			ret = true;

		} else {
			ret = false;
		}
		return ret;
	}

	public int countCode(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 3; i++) {

			if (str.substring(i, i + 2).equals("co")) {
				if (str.substring(i + 3, i + 4).equals("e")) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	public boolean endOther(String a, String b) {
		boolean ret = false;

		if (a.length() > b.length()) {
			for (int i = 0; i < a.length() - 2; i++) {

				if (a.substring(a.length() - b.length()).equalsIgnoreCase(b)) {
					ret = true;
				}
			}
		} else if (b.length() > a.length()) {
			for (int i = 0; i < b.length() - 2; i++) {

				if (b.substring(b.length() - a.length()).equalsIgnoreCase(a)) {
					ret = true;
				}
			}
		} else if (a.equals(b)) {
			// a.substring(0,b.length());
			// b.substring(b.equalsIgnoreCase(a));
			// if(a.equals(b)){
			return true;
		}

		return ret;
	}

	public boolean xyzThere(String str) {
		boolean ret = false;
		if (str.length() == 3) {
			if (str.substring(0, 3).equals("xyz")) {
				ret = true;
			}
		} else if (str.startsWith("xyz")) {
			ret = true;
		} else {
			for (int i = 0; i < str.length() - 3; i++) {
				if (str.substring(i + 1, i + 4).equals("xyz")) {
					// System.out.println("str.substring(i,i+1) is"+str.substring(i,i+1));
					if (str.charAt(i) != '.') {
						ret = true;
						break;
					} else {
						ret = false;
					}
				}

				else {
					ret = false;
				}
			}
		}
		return ret;
	}

	public boolean bobThere(String str) {
		boolean ret = false;
		for (int i = 0; i < str.length() - 2; i++) {

			if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
				ret = true;
				break;
			} else {
				ret = false;
			}
		}
		return ret;
	}

	public boolean xyBalance(String str) {
		boolean ret = false;

		int index = str.lastIndexOf("x");

		if (index == -1) {
			return true;
		}

		if (str.substring(index).contains("y")) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public String mixString(String a, String b) {
		String ret = "";
		if (a.length() > b.length()) {

			for (int i = 0; i < b.length(); i++) {
				ret = ret + a.substring(i, i + 1) + b.substring(i, i + 1);
			}
			ret = ret + a.substring(b.length());
		}

		else if (a.length() < b.length()) {
			for (int j = 0; j < a.length(); j++) {
				ret = ret + a.substring(j, j + 1) + b.substring(j, j + 1);
			}
			ret = ret + b.substring(a.length());
		} else {
			for (int k = 0; k < a.length(); k++) {
				ret = ret + a.substring(k, k + 1) + b.substring(k, k + 1);
			}

		}
		return ret;
	}

	public String repeatEnd(String str, int n) {
		String ret = "";
		for (int i = 0; i < n; i++) {
			ret = ret + str.substring(str.length() - n);
		}
		return ret;
	}

	public String repeatFront(String str, int n) {
		String ret = "";
		for (int i = 0; i < n; i++) {
			ret = ret + str.substring(0, n - i);
		}
		return ret;
	}

	public String repeatSeparator(String word, String sep, int count) {

		String ret = "";
		if (count == 0) {
			return "";
		}

		for (int i = 0; i < count - 1; i++) {
			ret = ret + word + sep;
		}

		ret = ret + word;
		return ret;
	}

	public boolean prefixAgain(String str, int n) {
		boolean ret = false;

		String first = str.substring(0, n);

		if (str.substring(n, str.length()).contains(first)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean xyzMiddle(String str) {

		boolean ret = false;
		if (str.length() <= 2) {
			return false;
		} else if (str.length() == 3) {
			if (str.equals("xyz")) {
				ret = true;
			} else {
				ret = false;
			}
		} else if (str.length() % 2 == 1) {

			int middle = (str.length() / 2);
			if (str.substring(middle - 1, middle + 2).contains("xyz")) {
				ret = true;
			} else {
				ret = false;
			}
		} else if (str.length() % 2 == 0) {
			int middle = str.length() / 2;
			if (str.substring(middle - 2, middle + 2).contains("xyz")) {
				ret = true;
			} else {
				ret = false;
			}
		}
		return ret;
	}

	public String getSandwich(String str) {
		String ret = "";

		int count = 0;
		int startIndex = 0;
		int endIndex = 0;

		if (!str.contains("bread")) {
			ret = "";
		} else {
			for (int i = 0; i < str.length() - 4; i++) {
				// System.out.println("is "+str.substring(i,i+5));
				if (str.substring(i, i + 5).contains("bread")) {
					count++;
				}
			}

			if (count >= 2) {

				for (int j = 0; j < str.length(); j++) {
					startIndex = 0;
					if (str.substring(j, j + 5).equals("bread")) {
						startIndex = j;
						break;
					}
				}

				for (int k = str.length() - 1; k > 0; k--) {
					endIndex = 0;
					// System.out.println("str.substring(k-4, k+1) is "+str.substring(k-4, k+1));
					if (str.substring(k - 4, k + 1).equals("bread")) {
						endIndex = k - 4;
						break;
					}
				}
				ret = str.substring(startIndex + 5, endIndex);
			}
		}
		return ret;
	}

	public boolean sameStarChar(String str) {

		boolean ret = false;
		if (str.length() < 2) {
			ret = true;
		}
		if (!str.contains("*")) {
			return true;
		}
		for (int i = 1; i < str.length() - 1; i++) {

			if (str.charAt(i) == '*') {

				if (str.charAt(i - 1) == str.charAt(i + 1)) {
					ret = true;
					// return ret;
				} else {
					ret = false;
					return ret;
				}
			}

		}
		return ret;
	}

	public String oneTwo(String str) {
		String ret = "";
		for (int i = 0; i < str.length() - 2; i = i + 3) {
			ret = ret + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
		}
		return ret;
	}

	public String zipZap(String str) {
		String answer = "";

		for (int i = 0; i < str.length(); i++) {

			if (i + 2 < str.length()) {
				if (str.charAt(i) == 'z') {
					if (str.charAt(i + 2) == 'p') {
						answer = answer + "zp";
						i = i + 2;
					} else {
						answer = answer + str.charAt(i);
					}
				} else {
					answer = answer + str.charAt(i);
				}
			} else {
				answer = answer + str.charAt(i);
			}
		}

		return answer;
	}

	public String starOut(String str) {
		String ret = "";

		for (int i = 0; i < str.length(); i++) {

			if (i > 0 && str.charAt(i - 1) == '*' || i < str.length() - 1 && str.charAt(i + 1) == '*'
					|| str.charAt(i) == '*') {

			} else {
				ret = ret + str.charAt(i);
			}
		}

		return ret;
	}

	public String plusOut(String str, String word) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.substring(i).startsWith(word)) {
				res = res + word;
				i = i + word.length() - 1;
			} else {
				res = res + "+";
			}
		}
		return res;
	}

	public String wordEnds(String str, String word) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.substring(i).startsWith(word)) {
				// res=res+word;
				// i=i+word.length()-1;
				if (i > 0) {
					res = res + str.charAt(i - 1);
				}
				if (i + word.length() < str.length()) {
					res = res + str.charAt(i + word.length());
				}
			} else {
				// res=res+"+";
			}
		}
		return res;
	}

}
