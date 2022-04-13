package com.codingbat.finalmost;

public class Logic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend && cigars >= 40) {
			return true;
		} else if (!isWeekend && cigars >= 40 && cigars <= 60) {
			return true;
		} else {
			return false;
		}
	}

	public int dateFashion(int you, int date) {

		if (you >= 8 && date > 2) {
			return 2;
		} else if (you > 2 && date >= 8) {
			return 2;
		}

		else if (you <= 2 || date <= 2) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		boolean ret = false;
		if (isSummer && temp >= 60 && temp <= 100) {
			// return true;
			ret = true;
		} else if (!isSummer && temp >= 60 && temp <= 90) {
			// return true;
			ret = true;
		}
		return ret;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int ret = 0;
		if (!isBirthday && speed <= 60) {
			ret = 0;
		} else if (!isBirthday && speed <= 80 && speed >= 61) {
			ret = 1;

		}

		else if (!isBirthday && speed > 80) {
			ret = 2;

		}

		if (isBirthday && speed <= 65) {
			ret = 0;
		} else if (isBirthday && speed <= 85 && speed >= 66) {
			ret = 1;

		}

		else if (isBirthday && speed > 85) {
			ret = 2;

		}

		return ret;
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;
		int ret = 0;
		if (sum <= 19 && sum >= 10) {
			ret = 20;
		} else {
			ret = sum;
		}
		return ret;
	}

	public String alarmClock(int day, boolean vacation) {
		String ret = "";

		if (!vacation && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)) {
			ret = "7:00";
		}

		if (!vacation && (day == 0 || day == 6)) {
			ret = "10:00";
		}

		if (vacation && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)) {
			ret = "10:00";
		}

		if (vacation && (day == 0 || day == 6)) {
			ret = "off";
		}
		return ret;
	}

	public boolean love6(int a, int b) {
		boolean ret = false;
		int sum = a + b;
		if (a == 6 || b == 6) {
			ret = true;
		} else if (Math.abs(a - b) == 6) {
			ret = true;
		} else if (sum == 6) {
			ret = true;
		}
		return ret;
	}

	public boolean in1To10(int n, boolean outsideMode) {

		boolean ret = false;
		if (outsideMode && (n <= 1 || n >= 10)) {
			ret = true;
		}

		else if (!outsideMode && (n >= 1 && n <= 10)) {
			ret = true;
		}
		return ret;
	}

	public boolean specialEleven(int n) {
		boolean ret = false;

		if ((n % 11 == 0) || (n % 11 == 1)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean more20(int n) {
		boolean ret = false;
		if (n % 20 == 1 || n % 20 == 2) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean old35(int n) {
		boolean ret = false;
		if (n % 3 == 0 && n % 5 == 0) {
			ret = false;
		} else if (n % 3 == 0) {
			ret = true;
		} else if (n % 5 == 0) {
			ret = true;
		}
		return ret;
	}

	public boolean less20(int n) {
		boolean ret = false;

		if (n % 20 == 18 || n % 20 == 19) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean nearTen(int num) {
		boolean ret = false;
		if (num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9 || num % 10 == 0) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int teenSum(int a, int b) {
		int ret = 0;
		int sum = a + b;

		if (a == 13 || a == 14 || a == 15 || a == 16 || a == 16 || a == 17 || a == 18 || a == 19 || b == 13 || b == 14
				|| b == 15 || b == 16 || b == 16 || b == 17 || b == 18 || b == 19) {
			ret = 19;
		} else {
			ret = sum;
		}
		return ret;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (!isAsleep && isMorning && !isMom) {
			return false;
		} else {
			return true;
		}
	}

	public int teaParty(int tea, int candy) {
		int ret = 0;

		if (tea < 5 || candy < 5) {
			ret = 0;
		} else if (tea >= 2 * candy || candy >= 2 * tea) {
			ret = 2;
		} else if (tea >= 5 && candy >= 5) {
			ret = 1;
		}

		return ret;
	}

	public String fizzString(String str) {
		String ret = "";

		if (str.startsWith("f") && str.endsWith("b")) {
			ret = "FizzBuzz";
		} else if (str.startsWith("f")) {
			ret = "Fizz";
		}

		else if (str.endsWith("b")) {
			ret = "Buzz";
		} else
			ret = str;
		return ret;
	}

	public String fizzString2(int n) {
		String ret = "";

		if ((n % 3 == 0) && (n % 5 == 0)) {
			ret = "FizzBuzz!";
		} else if ((n % 3 == 0)) {
			ret = "Fizz!";
		}

		else if ((n % 5 == 0)) {
			ret = "Buzz!";
		} else {
			ret = "" + n + "!";
		}
		return ret;
	}

	public boolean twoAsOne(int a, int b, int c) {
		boolean ret = false;
		if ((a + b == c) || (b + c == a) || (c + a) == b) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		boolean ret = false;

		if (bOk && (c > b)) {
			ret = true;
		}

		else if ((b > a) && (c > b)) {
			ret = true;
		}
		return ret;
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		boolean ret = false;
		if (equalOk && a <= b && b <= c && a <= c) {
			ret = true;
		}

		if (a < b && b < c && a < c) {
			ret = true;
		}
		return ret;
	}

	public boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10;
	}

	public boolean lessBy10(int a, int b, int c) {
		boolean ret = false;

		if (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		int ret = 0;
		if (noDoubles && die1 == die2) {
			ret = die1 + die2 + 1;
		} else if (die1 == 6 && die2 == 6) {
			ret = die1 + die2 - 5;
		} else {
			ret = die1 + die2;
		}
		return ret;
	}

	public int maxMod5(int a, int b) {
		int ret = 0;
		if (a == 0 && b == 0) {
			ret = 10;
		} else if (a == b && b == c) {
			ret = 5;
		} else if (b != a && c != a) {
			ret = 1;
		} else {
			ret = 0;
		}

	}

	public int redTicket(int a, int b, int c) {
		int ret = 0;
		if (a == 2 && b == 2 && c == 2) {
			ret = 10;
		} else if (a == b && b == c) {
			ret = 5;
		} else if (b != a && c != a) {
			ret = 1;
		} else {
			ret = 0;
		}
		return ret;
	}

	public int greenTicket(int a, int b, int c) {

		int ret = 0;

		if (a != b && b != c && c != a) {
			ret = 0;
		}
		if (a == b && b == c && c == a) {
			ret = 20;
		}

		if (a == b || b == c || c == a) {
			ret = 10;
		}
		return ret;
	}

	public int blueTicket(int a, int b, int c) {
		int ret = 0;
		if ((a + b == 10) || (b + c == 10) || (c + a == 10)) {
			ret = 10;
		} else if ((a + b == (b + c + 10)) || (a + b == (c + a + 10))) {
			ret = 5;
		} else {
			ret = 0;
		}
		return ret;
	}

	public boolean shareDigit(int a, int b) {
		boolean ret = false;
		if ((a % 10 == b % 10) || (a / 10 == b % 10) || (a % 10 == b / 10) || (a / 10 == b / 10)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int sumLimit(int a, int b) {
		int ret = 0;

		if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
			ret = a;
		} else {
			ret = a + b;
		}

		return ret;
	}

}
