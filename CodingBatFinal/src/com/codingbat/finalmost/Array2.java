package com.codingbat.finalmost;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countEvens(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int bigDiff(int[] nums) {
		int diff = 0;
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				// max=nums[i+1];
				min = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				// min=nums[i+1];
				max = nums[i];
			}
		}
		return max - min;
	}

	public int centeredAverage(int[] nums) {

		Arrays.sort(nums);
		int count = 0;
		int sum = 0;

		for (int i = 1; i < nums.length - 1; i++) {
			sum = sum + nums[i];
			count = count + 1;

		}
		return sum / count;
	}

	public int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!(nums[i] == 13)) {
				sum = sum + nums[i];
			} else if (i < nums.length - 1 && (nums[i] == 13)) {
				nums[i] = 0;
				nums[i + 1] = 0;
				sum = sum + nums[i] + nums[i + 1];
			}
		}
		return sum;
	}

	public int sum67(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6) {
				sum = sum + nums[i];
			} else {
				while (nums[i] != 7) {
					i++;
				}
			}
		}
		return sum;
	}

	public boolean has22(int[] nums) {
		if (nums.length < 2)
			return false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1])
				return true;
		}
		return false;
	}

	public boolean lucky13(int[] nums) {
		boolean ret = true;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] == 1) && (nums[i] == 3)) {
				ret = false;
			}
		}
		return ret;
	}

	public boolean sum28(int[] nums) {
		boolean ret = false;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count = count + 2;
			}
		}

		if (count == 8) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public boolean more14(int[] nums) {
		boolean ret = false;
		int countOne = 0;
		int countFour = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				countOne++;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				countFour++;
			}
		}

		if (countOne > countFour) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int[] fizzArray(int n) {
		int[] ret = new int[n];
		for (int i = 0; i < n; i++) {
			ret[i] = i;
		}
		return ret;
	}

	public boolean only14(int[] nums) {
		boolean ret = false;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 4) {
				count++;
			}
		}

		if (count == nums.length) {
			ret = true;
		}
		return ret;
	}

	public String[] fizzArray2(int n) {
		String[] ret = new String[n];
		for (int i = 0; i < n; i++) {
			ret[i] = "" + i;
		}
		return ret;
	}

	public boolean no14(int[] nums) {
		boolean ret = false;
		boolean fours = false;
		boolean ones = false;
		for (int i = 0; i < nums.length; i++) {

			if ((nums[i] == 1)) {
				ones = true;
			}
			if ((nums[i] == 4)) {
				fours = true;
			}
		}
		return !(ones && fours);
	}

	public boolean isEverywhere(int[] nums, int val) {

		boolean result = true;

		for (int i = 0; i <= nums.length - 2; i++)

		{

			if (nums[i] != val && nums[i + 1] != val)

				result = false;

		}

		return result;

	}

	public boolean either24(int[] nums) {
		boolean ret = false;
		boolean twos = false;
		boolean fours = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				twos = true;
			} else if (nums[i] == 4 && nums[i + 1] == 4) {
				fours = true;
			}
		}
		if ((fours && !twos) || (!fours && twos)) {
			ret = true;
		} else {
			ret = false;
		}
		return ret;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if ((nums1[i] - nums2[i] == 2) || (nums1[i] - nums2[i] == 1) || (nums2[i] - nums1[i] == 2)
					|| (nums2[i] - nums1[i] == 1)) {
				count++;
			}
		}
		return count;

	}

	public boolean has77(int[] nums) {
		boolean ret = false;
		for (int i = 0; i < nums.length; i++) {
			if ((i + 1 < nums.length && (nums[i] == 7 && nums[i + 1] == 7))
					|| (i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7)) {
				ret = true;
			}
		}
		return ret;
	}

	public boolean has12(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 1) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == 2)
						return true;
				}
			}
		}

		return false;
	}

	public boolean modThree(int[] nums) {
		boolean ret = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0)) {
				ret = true;
			} else if ((nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1) && (nums[i + 2] % 2 == 1)) {
				ret = true;
			}
		}
		return ret;
	}

	public boolean haveThree(int[] nums) {
		return hasThreeNotNextToEach(nums) && hasThreeTimes(nums);
	}

	boolean hasThreeNotNextToEach(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 3 && nums[i + 1] == 3) {
				return false;
			}
		}
		return true;
	}

	boolean hasThreeTimes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				count++;
			}
		}
		return (count == 3);
	}

	public boolean twoTwo(int[] nums) {
		boolean ret = false;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count++;

				if ((i < nums.length - 1 && nums[i + 1] == 2) || (i > 0 && nums[i - 1] == 2)) {
					ret = true;
				} else {
					ret = false;
				}
			}
		}
		if (count == 0) {
			ret = true;
		}
		return ret;

	}

	public boolean sameEnds(int[] nums, int n) {
		for (int i = 0; i < n; i++) {
			if (nums[i] != nums[nums.length - n + i]) {
				return false;
			}
		}
		return true;
	}

	public boolean tripleUp(int[] nums) {
		boolean ret = false;
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i + 1] == nums[i] + 1) && (nums[i + 2] == nums[i + 1] + 1)) {
				return true;
			}

		}
		return ret;

	}

	public int[] fizzArray3(int start, int end) {
		int len = end - start;
		int[] ret = new int[len];
		for (int i = 0; i < len; i++) {
			ret[i] = start++;

		}
		return ret;
	}

	public int[] shiftLeft(int[] nums) {
		int len = nums.length;
		int[] ret = new int[len];

		if (len == 0) {
			return nums;
		}
		ret[len - 1] = nums[0];
		if (len <= 1) {
			return nums;
		}
		for (int i = 0; i < len - 1; i++) {
			ret[i] = nums[i + 1];
		}
		return ret;
	}

	public int[] tenRun(int[] nums) {
		int len = nums.length;
		int cur = -1;
		int[] ret = new int[len];
		for (int i = 0; i < len; i++) {
			if (nums[i] % 10 == 0) {
				cur = nums[i];
			} else {
				if (cur != -1) {
					nums[i] = cur;
				}
			}
		}

		return nums;
	}

	public int[] pre4(int[] nums) {
		int index4 = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				index4 = i;
				break;
			}
		}

		int[] arr = new int[index4];
		for (int i = 0; i < index4; i++) {
			arr[i] = nums[i];
		}
		return arr;
	}

	public int[] post4(int[] nums) {
		int last4 = -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == 4) {
				last4 = i;
				break;
			}
		}

		return Arrays.copyOfRange(nums, last4 + 1, nums.length);
	}

	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;
	}

	public int[] zeroFront(int[] nums) {
		int zeroCount = zeroCounting(nums);
		int arrIndex = zeroCount;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				arr[arrIndex] = nums[i];
				arrIndex++;
			}
		}
		return arr;
	}

	public int zeroCounting(int[] nums) {
		int count = 0;
		for (int n : nums) {
			if (n == 0) {
				count++;
			}
		}
		return count;
	}

	public int[] withoutTen(int[] nums) {
		// int tenCount=tenCounting(nums);
		int arrIndex = 0;
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				arr[arrIndex] = nums[i];
				arrIndex++;
			}
		}
		return arr;
	}

	public int[] zeroMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = largestNumber(nums, i);
				// nums[i] = lar;
			}
		}
		return nums;
	}

	int largestNumber(int[] nums, int n) {
		int maxi = 0;
		for (int i = n + 1; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				maxi = Math.max(maxi, nums[i]);
			}

		}
		return maxi;
	}

	public int[] evenOdd(int[] nums) {
		// int evenIndex=0;
		// for (int i = 0; i < nums.length; i++) {
		// if (nums[i]%2 == 0) {
		// int temp=nums[i];
		// nums[i] = nums[evenIndex];
		// nums[evenIndex]=temp;
		// evenIndex++;
		// }
		// }
		// return nums;
		// }
		int countE = 0;
		int countO = nums.length - 1;
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[countE] = nums[i];
				countE++;
			} else {

				array[countO] = nums[i];

				countO--;

			}

		}

		return array;

	}

	public String[] fizzBuzz(int start, int end) {
		String[] arr = new String[end - start];
		for (int i = 0; i < arr.length; i++) {
			int n = i + start;
			boolean f = n % 3 == 0, b = n % 5 == 0;
			if (f && b) {
				arr[i] = "FizzBuzz";
			} else if (f) {
				arr[i] = "Fizz";
			} else if (b) {
				arr[i] = "Buzz";
			} else {
				arr[i] = String.valueOf(n);
			}

		}
		return arr;
	}

}
