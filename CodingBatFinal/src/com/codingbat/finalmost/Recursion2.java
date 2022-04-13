package com.codingbat.finalmost;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean groupSum(int start, int[] nums, int target) {

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

	public boolean groupSum6(int start, int[] nums, int target) {

		if (start >= nums.length)

			return (target == 0);

		if (groupSum6(start + 1, nums, target - nums[start]))
			return true;

		if (nums[start] != 6 && groupSum6(start + 1, nums, target))
			return true;

		return false;

	}

	public boolean groupNoAdj(int start, int[] nums, int target) {

		if (start >= nums.length)

			return (target == 0);

		if (groupNoAdj(start + 1, nums, target))
			return true;

		if (groupNoAdj(start + 2, nums, target - nums[start]))
			return true;

		return false;

	}

	public boolean groupSum5(int start, int[] nums, int target) {

		if (start >= nums.length)
			return (target == 0);

		if (groupSum5(start + 1, nums, target - nums[start]) && checkOne(start, nums))

			return true;

		if (nums[start] % 5 != 0 && groupSum5(start + 1, nums, target))
			return true;

		return false;

	}

	private boolean checkOne(int start, int[] nums) {

		if (start == 0)
			return true;

		if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1)

			return false;

		else

			return true;

	}

	public boolean groupSumClump(int start, int[] nums, int target) {

		altArray(nums);

		if (start >= nums.length)
			return target == 0;

		if (groupSumClump(start + 1, nums, target - nums[start]))
			return true;

		if (groupSumClump(start + 1, nums, target))
			return true;

		else
			return false;

	}

	private void altArray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {

				nums[i - 1] += nums[i];

				if (i + 1 < nums.length && nums[i] != nums[i + 1])

					nums[i] = 0;

				else if (i == nums.length - 1)

					nums[i] = 0;

			}

		}

	}

	public boolean splitArray(int[] nums) {
		int index = 0;

		int sum1 = 0;

		int sum2 = 0;

		return recArray(nums, index, sum1, sum2);

	}

	private boolean recArray(int[] nums, int index, int sum1, int sum2) {

		if (index >= nums.length) {

			return sum1 == sum2;

		}

		int value = nums[index];

		return (recArray(nums, index + 1, sum1 + value, sum2) ||

				recArray(nums, index + 1, sum1, sum2 + value));

	}

	public boolean splitOdd10(int[] nums) {

		int index = 0;

		int sum1 = 0;

		int sum2 = 0;

		return recArray(nums, index, sum1, sum2);

	}

	private boolean recArray(int[] nums, int index, int sum1, int sum2) {

		if (index >= nums.length) {

			return (sum1 % 10 == 0 && sum2 % 2 != 0) || (sum2 % 10 == 0 && sum1 % 2 != 0);

		}

		int value = nums[index];

		return (recArray(nums, index + 1, sum1 + value, sum2) ||

				recArray(nums, index + 1, sum1, sum2 + value));

	}

	public boolean split53(int[] nums) {

		int index = 0;

		int sum1 = 0;

		int sum2 = 0;

		return recArray(nums, index, sum1, sum2);

	}

	private boolean recArray(int[] nums, int index, int sum1, int sum2) {

		if (index >= nums.length) {

			return sum1 == sum2;

		}

		int value = nums[index];

		if (value % 5 == 0)

			return recArray(nums, index + 1, sum1 + value, sum2);

		else if (value % 3 == 0)

			return recArray(nums, index + 1, sum1, sum2 + value);

		else

			return (recArray(nums, index + 1, sum1 + value, sum2) ||

					recArray(nums, index + 1, sum1, sum2 + value));

	}

}
