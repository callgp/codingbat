package com.codingbat.finalmost;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}
		return 2 + bunnyEars(bunnies - 1);
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}

		if (bunnies % 2 == 0) {
			return 3 + bunnyEars2(bunnies - 1);
		} else {
			return 2 + bunnyEars2(bunnies - 1);
		}
	}

	public int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}

		return rows + triangle(rows - 1);
	}

	public int sumDigits(int n) {
		if (n < 10) {
			return n;
		}

		return (n % 10) + sumDigits(n / 10);
	}

	public int count7(int n) {

		if (n < 1)
			return 0;

		if (n % 10 == 7)
			return 1 + count7(n / 10);

		else
			return count7(n / 10);

	}

	public int count8(int n) {
		if (n < 1)
			return 0;

		if (n % 10 == 7)
			return 1 + count8(n / 10);

		else
			return count8(n / 10);

	}

	public int powerN(int base, int n) {

		if (n == 0)
			return 1;

		return base * powerN(base, n - 1);

	}

	public int countX(String str) {

		if (str.equals(""))
			return 0;

		if (str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));

		else
			return countX(str.substring(1));

	}

	public int countHi(String str) {
		if (str.length() < 2)
			return 0;

		if (str.substring(0, 2).equals("hi")) {
			return 1 + countHi(str.substring(1));

		}

		else
			return countHi(str.substring(1));

	}

	public String changeXY(String str) {

		if (str.equals(""))
			return str;

		if (str.charAt(0) == 'x')
			return "y" + changeXY(str.substring(1));

		return str.charAt(0) + changeXY(str.substring(1));

	}

	public String changePi(String str) {
		if (str.equals("") || str.length() < 2)
			return str;

		if (str.charAt(0) == 'p' && str.charAt(1) == 'i')

			return "3.14" + changePi(str.substring(2));

		return str.charAt(0) + changePi(str.substring(1));

	}

	public String noX(String str) {

		if (str.equals(""))
			return str;

		if (str.charAt(0) == 'x')
			return noX(str.substring(1));

		else
			return str.charAt(0) + noX(str.substring(1));

	}

	public boolean array6(int[] nums, int index) {

		if (index >= nums.length)
			return false;

		if (nums[index] == 6)
			return true;

		else
			return array6(nums, index + 1);

	}

	public int array11(int[] nums, int index) {

	}

	public boolean array220(int[] nums, int index) {

	}

	public String allStar(String str) {

		if (str.equals("") || str.length() == 1)
			return str;

		return str.charAt(0) + "*" + allStar(str.substring(1));

	}

	public String pairStar(String str) {
		if (str.equals("") || str.length() == 1)
			return str;

		if (str.charAt(0) == str.charAt(1))

			return str.charAt(0) + "*" + pairStar(str.substring(1));

		else

			return str.charAt(0) + pairStar(str.substring(1));

	}

	public String endX(String str) {

		if (str.equals(""))
			return str;

		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + 'x';

		else
			return str.charAt(0) + endX(str.substring(1));

	}

	public int countPairs(String str) {

		if (str.equals("") || str.length() < 3)
			return 0;

		if (str.charAt(0) == str.charAt(2))
			return 1 + countPairs(str.substring(1));

		else
			return countPairs(str.substring(1));

	}

	public int countAbc(String str) {

		if (str.length() < 3)
			return 0;

		if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))

			return 1 + countAbc(str.substring(1));

		else

			return countAbc(str.substring(1));

	}

	public int count11(String str) {

		if (str.length() < 2)
			return 0;

		if (str.substring(0, 2).equals("11"))

			return 1 + count11(str.substring(2));

		else

			return count11(str.substring(1));

	}

	public String stringClean(String str) {
		if (str.length() < 2)
			return str;

		if (str.charAt(0) == str.charAt(1))

			return stringClean(str.substring(1));

		else

			return str.charAt(0) + stringClean(str.substring(1));

	}

	public int countHi2(String str) {

		int len = str.length();

		if (len < 2)
			return 0;

		if (str.substring(len - 2, len).equals("hi")) {

			if ((len > 2 && str.charAt(len - 3) != 'x') || len == 2)
				return 1 + countHi2(str.substring(0, len - 1));

		}

		return countHi2(str.substring(0, len - 1));
	}

	public String parenBit(String str) {

		if (str.equals(""))
			return str;

		if (str.charAt(0) == '(') {

			if (str.charAt(str.length() - 1) == ')')

				return str;

			else

				return parenBit(str.substring(0, str.length() - 1));

		} else

			return parenBit(str.substring(1));

	}

	public boolean nestParen(String str) {
		if (str.equals(""))
			return true;

		if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')

			return nestParen(str.substring(1, str.length() - 1));

		else

			return false;

	}

	public int strCount(String str, String sub) {

	}

	public boolean strCopies(String str, String sub, int n) {

		if (func(str, sub) == n)
			return true;

		else
			return false;

	}

	private int func(String str, String sub) {

		int strlen = str.length();

		int sublen = sub.length();

		if (strlen < sublen)
			return 0;

		if (str.substring(0, sublen).equals(sub))

			return 1 + func(str.substring(1), sub);

		else

			return func(str.substring(1), sub);

	}

	public int strDist(String str, String sub) {

		return func(str, sub).length();

	}

	private String func(String str, String sub) {

		int strlen = str.length();

		int sublen = sub.length();

		if (str.equals(""))
			return str;

		if (str.startsWith(sub)) {

			if (str.substring(strlen - sublen, strlen).equals(sub))

				return str;

			else

				return func(str.substring(0, strlen - 1), sub);

		}

		else

			return func(str.substring(1), sub);

	}

}
