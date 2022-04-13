package com.codingbat.finalmost;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String helloName(String name) {
		return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2, out.length());
	}

	public String extraEnd(String str) {
		return (str.substring(str.length() - 2, str.length())) + (str.substring(str.length() - 2, str.length()))
				+ (str.substring(str.length() - 2, str.length()));
	}

	public String firstTwo(String str) {
		if (str.length() > 2) {
			return str.substring(0, 2);
		} else {
			return str;
		}
	}

	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public String comboString(String a, String b) {
		if (b.length() < a.length()) {
			return b + a + b;
		} else {
			return a + b + a;
		}
	}

	public String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

	public String left2(String str) {
		if (str.length() > 2) {
			return str.substring(2, str.length()) + str.substring(0, 2);
		}

		else {
			return str;
		}
	}

	public String right2(String str) {
		if (str.length() > 2) {
			return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
		}

		else {
			return str;
		}
	}

	public String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);

		} else {
			return str.substring((str.length() - 1), (str.length()));

		}
	}

	public String withouEnd2(String str) {
		String newStr = "";
		if (str.length() == 0) {
			newStr = str;
		}

		if (str.length() == 1) {
			newStr = "";
		}

		if (str.length() > 2) {
			newStr = str.substring(1, str.length() - 1);
		}
		return newStr;
	}

	public String middleTwo(String str) {
		return str.substring(((str.length() / 2) - 1), ((str.length() / 2) + 1));
	}

	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	public String nTwice(String str, int n) {

		return str.substring(0, n) + str.substring(str.length() - n, str.length());
	}

	public String twoChar(String str, int index) {
		String ret = "";

		if (index > 0 && str.length() - 2 >= index) {
			ret = str.substring(index, index + 2);
		}

		else {
			ret = str.substring(0, 2);
		}
		return ret;
	}

	public String middleThree(String str) {
		return str.substring((str.length() / 2 - 1), (str.length() / 2 + 2));
	}

	public boolean hasBad(String str) {
		if ((str.length() >= 3) && (str.substring(0, 3).equals("bad"))) {
			return true;
		}

		if ((str.length() >= 4) && (str.substring(1, 4).equals("bad"))) {
			return true;
		}

		else
			return false;
	}

	public String atFirst(String str) {
		String ret = "";
		if (str.length() == 0) {
			ret = "@@";
		}

		if (str.length() == 1) {
			ret = str.substring(0, 1) + "@";
		}

		if (str.length() >= 2) {
			ret = str.substring(0, 2);
		}
		return ret;
	}

	public String lastChars(String a, String b) {
		if (a.length() >= 1 && b.length() >= 1) {
			return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
		} else if (a.length() == 0 && b.length() >= 1) {
			return "@" + b.substring(b.length() - 1, b.length());
		} else if (a.length() >= 1 && b.length() == 0) {
			return a.substring(0, 1) + "@";
		} else
			return "@" + "@";
	}

	public String conCat(String a, String b) {
		String ret = "";
		if (a.length() > 0 && b.length() > 0 && (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1)))) {
			ret = a + b.substring(1, b.length());
		} else {
			ret = a + b;
		}
		return ret;

	}

	public String lastTwo(String str) {
		String newStr = "";
		if (str.length() >= 2) {
			newStr = str.substring(0, str.length() - 2) + str.substring(str.length() - 1, str.length())
					+ str.substring(str.length() - 2, str.length() - 1);
		} else {
			newStr = str;
		}
		return newStr;
	}

	public String seeColor(String str) {
		String newStr = "";
		if (str.startsWith("red")) {
			newStr = "red";
		} else if (str.startsWith("blue")) {
			newStr = "blue";
		} else {
			newStr = "";
		}
		return newStr;
	}

	public boolean frontAgain(String str) {
		boolean newStr = false;

		if (str.length() >= 2) {
			newStr = str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
		} else {
			newStr = false;
		}
		return newStr;
	}

	public String minCat(String a, String b) {
		String newString = "";
		int len1 = a.length();
		int len2 = b.length();
		if (len1 > len2) {
			newString = a.substring((len1 - len2), len1) + b;
		}

		else if (len2 > len1) {
			newString = a + b.substring((len2 - len1), len2);
		}
		return newString;
	}

	public String extraFront(String str) {
		String newStr = "";
		if (str.length() >= 2) {
			newStr = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
		} else if (str.length() == 1) {
			newStr = str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
		} else if (str.length() == 0) {
			newStr = str + str + str;
		}
		return newStr;
	}

	public String without2(String str) {
		String newStr = "";
		if (str.length() >= 2) {

			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				newStr = str.substring(2);
			} else {
				newStr = str;
			}
		} else if (str.length() == 1) {

			newStr = str;

		}

		return newStr;
	}

	public String deFront(String str) {
		String newStr = "";
		if (str.length() >= 2) {

			if (str.startsWith("a") && str.charAt(1) == 'b') {
				newStr = "a" + "b" + str.substring(2);
			}

			else if (str.startsWith("a")) {
				newStr = "a" + str.substring(2);
			} else if (str.charAt(1) == 'b') {
				newStr = "b" + str.substring(2);
			}

			else {
				newStr = str.substring(2);
			}

		}

		return newStr;
	}

	public String startWord(String str, String word) {
		String newStr = "";
		int len1 = str.length();
		int len2 = word.length();

		if (len1 >= 1 && len1 < len2) {

			newStr = "";

		}

		if (len1 >= 1 && len1 >= len2) {
			if (str.substring(1, len2).equals(word.substring(1, len2))) {
				newStr = str.substring(0, len2);

			} else {
				newStr = "";
			}
		}
		return newStr;
	}

	public String withoutX(String str) {
		String newStr = "";

		if (str.length() == 1) {

			if (str.startsWith("x")) {
				newStr = "";
			} else {
				newStr = str;
			}
		} else if (str.startsWith("x") && str.endsWith("x")) {
			newStr = str.substring(1, str.length() - 1);
		} else if (str.startsWith("x")) {
			newStr = str.substring(1, str.length());
		} else if (str.endsWith("x")) {
			newStr = str.substring(0, str.length() - 1);
		} else {
			newStr = str;
		}

		return newStr;
	}

	public String withoutX2(String str) {
		String newStr = "";

		if (str.length() == 0 || str.length() == 1) {
			newStr = "";
		}

		else if ((str.charAt(0) == 'x') && (str.charAt(1) == 'x')) {
			newStr = str.substring(2);
		} else if ((str.charAt(0) == 'x')) {
			newStr = str.substring(1);
		} else if ((str.charAt(1) == 'x')) {
			newStr = str.substring(0, 1) + str.substring(2);
		} else {
			newStr = str;
		}

		return newStr;
	}

}
