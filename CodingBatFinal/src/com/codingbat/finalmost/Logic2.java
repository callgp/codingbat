package com.codingbat.finalmost;

public class Logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean makeBricks(int small, int big, int goal) {
		if (big >= goal / 5) {
			big = goal / 5;
		}

		return (big * 5) + small >= goal;
	}

	public int loneSum(int a, int b, int c) {
		int ret = 0;
		if (a == b && b == c && c == a) {
			ret = 0;
		} else if (a == b && b != c && c != a) {
			ret = c;
		} else if (a != b && b == c && c != a) {
			ret = a;
		} else if (a != b && b != c && c == a) {
			ret = b;
		}

		else {
			ret = a + b + c;
		}
		return ret;
	}

	public int luckySum(int a, int b, int c) {
		int ret = 0;
		if (a == 13) {
			ret = 0;
		} else if (b == 13) {
			ret = a;
		} else if (c == 13) {
			ret = a + b;
		} else {
			ret = a + b + c;
		}
		return ret;
	}

	public int noTeenSum(int a, int b, int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}

	public int fixTeen(int n) {

		if ((n >= 13 && n < 15) || (n > 16 && n <= 19)) {
			return 0;
		} else {
			return n;
		}
	}

	public int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public int round10(int n) {
		if ((n % 10) >= 5) {
			return (((n / 10) + 1) * 10);
		} else {
			return (((n / 10)) * 10);
		}
	}

	public boolean closeFar(int a, int b, int c) {
		boolean ret = false;

		if ((Math.abs(a - b) <= 1) && (Math.abs(c - a) >= 2) && Math.abs(b - c) >= 2)
			ret = true;

		else if ((Math.abs(c - a) <= 1) && (Math.abs(b - a) >= 2) && Math.abs(b - c) >= 2)
			ret = true;

		else
			ret = false;

		return ret;
	}

	public int blackjack(int a, int b) {
		int ret = 0;
		if (a > 21) {
			if (b > 21) {
				ret = 0;
			} else {
				ret = b;
			}
		}
		if (a == 21) {
			if (b > 21) {
				ret = a;
			} else {
				ret = a;// if a==21 b==21 edge test cases fails
			}
		}

		if (a < 21) {
			if (b > 21) {
				ret = a;
			} else if (b == 21) {
				ret = b;
			}
			if (b < 21) {
				// both a b less than 21 t=return nearest21
				// ret= Math.min(21-a,21-a);
				int diffA = 21 - a;
				int diffB = 21 - b;
				if (diffA > diffB) {
					ret = b;
				} else {
					ret = a;
				}
			}

		}
		return ret;
	}

	public boolean evenlySpaced(int a, int b, int c) {
		boolean ret = false;
		int diff1 = 0;
		int diff2 = 0;
		int diff3 = 0;

		if (a == b && b == c) {
			return true;

		}

		else if (a == b || b == c || c == a) {
			return false;

		}

		diff1 = Math.abs(a - b);
		diff2 = Math.abs(b - c);
		diff3 = Math.abs(c - a);

		if (diff1 == diff2) {
			return true;
		}

		if (diff2 == diff3) {
			return true;
		}

		if (diff1 == diff3) {
			return true;
		}
		return false;

	}

	public int makeChocolate(int small, int big, int goal) {
		int ret = 0;
		int goalBigNeeded = goal / 5;
		int goalRemainingForSmall = goal - (Math.min(goalBigNeeded, big) * 5);
		if (small < goalRemainingForSmall) {
			ret = -1;
		} else {
			ret = goalRemainingForSmall;
		}
		return ret;
	}

}
