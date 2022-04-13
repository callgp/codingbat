package com.codingbat.finalmost;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSpan(int[] nums) {
		int max = 0;
		for (int n : nums) {
			max = Math.max(max, span(nums, n));
		}
		return max;
	}

	int span(int[] nums, int n) {
		return lastIndexOf(nums, n) - indexOf(nums, n) + 1;
	}

	int indexOf(int[] nums, int n) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == n) {
				return i;
			}
		}
		return -1;
	}

	int lastIndexOf(int[] nums, int n) {
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public int[] fix34(int[] nums) {

		return null;
	}

	public int[] fix45(int[] nums) {
		return null;
	}

	public boolean canBalance(int[] nums) {
		for (int i = 0; i <= nums.length; i++) {
			if (sums(nums, 0, i) == sums(nums, i, nums.length)) {
				return true;
			}
		}
		return false;
	}

	int sums(int[] nums, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public boolean linearIn(int[] outer, int[] inner) {
		for (int n : inner) {
			if (!contains(outer, n)) {
				return false;
			}
		}
		return true;
	}

	boolean contains(int[] nums, int x) {
		for (int y : nums) {
			if (y == x) {
				return true;
			}
		}
		return false;
	}

	public int[] squareUp(int n) {
		if (n == 0) {
			return new int[0];
		}

		int[] arr = new int[n * n];
		int max = 1;

		for (int i = n - 1; i < arr.length; i += n) {
			for (int j = 1; j <= max; j++) {
				arr[i - j + 1] = j;
			}
			max++;
		}
		return arr;
	}

	public int[] seriesUp(int n) {
		int[] arr = new int[n * (n + 1) / 2];
		int max = 1;
		for (int i = 0; i < arr.length;) {
			for (int j = 1; j <= max; j++) {
				arr[i] = j;
				i++;
			}
			max++;
		}
		return arr;
	}

	public int maxMirror(int[] nums) {

	}

	public int countClumps(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((i == 0 || nums[i] != nums[i - 1]) && (i != nums.length - 1 && nums[i] == nums[i + 1])) {
				count++;
			}
		}
		return count;
	}

}
