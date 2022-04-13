package com.codingbat.finalmost;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length == 0) {
			return false;
		}
		if (nums[0] == nums[nums.length - 1]) {
			return true;
		} else
			return false;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };
	}

	public int[] maxEnd3(int[] nums) {
		int large = 0;
		if (nums[0] > nums[nums.length - 1]) {
			large = nums[0];
		} else {
			large = nums[nums.length - 1];
		}
		return new int[] { large, large, large };
	}

	public int sum2(int[] nums) {
		int ret = 0;

		if (nums.length >= 2) {
			ret = nums[0] + nums[1];
		}

		else if (nums.length == 1) {
			ret = nums[0];
		}

		else if (nums.length == 0) {
			ret = 0;
		}

		return ret;
	}

	public int[] middleWay(int[] a, int[] b) {

		return new int[] { a[1], b[1] };
	}

	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	public boolean has23(int[] nums) {

		// if( nums[0]==2 || nums[1]==2 ){
		// return true;
		// }

		// if( nums[0]==3 || nums[1]==3 ){
		// return true;
		// }

		// else
		// return false;

		return !(contains(nums, 2) || contains(nums, 3));

	}

	public boolean no23(int[] nums) {

		// if(nums[0]!=2||nums[1]!=2){
//		    return true;
		// }
		// if(nums[0]!=3||nums[1]!=3){
//		    return true;
		// }
		// else
		// return false;
		return !(contains(nums, 2) || contains(nums, 3));

	}

	public boolean contains(int[] nums, int val) {
		return nums[0] == val || nums[1] == val;
	}

	public int[] makeLast(int[] nums) {
		int len = 2 * nums.length;
		int newArray[] = new int[len];
		newArray[len - 1] = nums[nums.length - 1];
		return newArray;
	}

	public boolean double23(int[] nums) {

		return containsTwice(nums, 2) || containsTwice(nums, 3);

	}

	public boolean containsTwice(int[] nums, int val) {

		return nums.length == 2 && nums[0] == val && nums[1] == val;

	}

	public int[] fix23(int[] nums) {
		// int[] newArray=new int[3];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i + 1] == 3) {
				// newArray[0]=nums[0];
				// newArray[1]=nums[1];
				nums[i + 1] = 0;
			}
		}
		return nums;
	}

	public int start1(int[] a, int[] b) {
		int count = 0;

		if (a.length >= 2 && b.length >= 2 && a[0] == 1 && b[0] == 1) {
			count = 2;
		}

		else if (a.length >= 2 && b.length == 1 && a[0] == 1 && b[0] == 1) {
			count = 2;
		}

		else if (a.length == 1 && b.length == 1 && a[0] == 1 && b[0] == 1) {
			count = 2;
		}

		else if (a.length != 0 && a[0] == 1) {
			count = 1;
		}

		else if (b.length != 0 && b[0] == 1) {
			count = 1;
		}

		else if (b.length == 0 && a.length == 0) {
			count = 0;
		}
		return count;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int sumA = 0;
		int sumB = 0;
		sumA = a[0] + a[1];
		sumB = b[0] + b[1];
		if (sumA > sumB) {
			return a;
		} else if (sumA < sumB) {
			return b;
		} else {
			return a;
		}
	}

	public int[] makeMiddle(int[] nums) {
		int[] arr = new int[2];
		arr[0] = nums[(nums.length / 2) - 1];
		arr[1] = nums[(nums.length / 2)];
		return arr;
	}

	public int[] plusTwo(int[] a, int[] b) {
		int lenA = a.length;
		int lenB = b.length;

		int lenNew = lenA + lenB;
		int[] arrNew = new int[lenNew];
		arrNew[0] = a[0];
		arrNew[1] = a[1];
		arrNew[2] = b[0];
		arrNew[3] = b[1];

		return arrNew;
	}

	public int[] swapEnds(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];

		nums[0] = last;
		nums[nums.length - 1] = first;

		return nums;
	}

	public int[] midThree(int[] nums) {
		int len = nums.length / 2;
		int[] arrNew = new int[3];
		arrNew[0] = nums[len - 1];
		arrNew[1] = nums[len];
		arrNew[2] = nums[len + 1];
		return arrNew;
	}

	public int maxTriple(int[] nums) {
		int largest = nums[0];
		int mid = nums.length / 2;
		int[] largeArray = { nums[0], nums[mid], nums[nums.length - 1] };

		for (int i = 0; i < largeArray.length; i++) {
			if (largeArray[i] > largest) {
				largest = largeArray[i];
			}
		}
		return largest;
	}

	public int[] frontPiece(int[] nums) {
		int[] arrNew = null;
		if (nums.length == 0) {
			arrNew = new int[0];
			// arrNew[0]=nums[0];
		}

		else if (nums.length == 1) {
			arrNew = new int[1];
			arrNew[0] = nums[0];
		} else if (nums.length >= 2) {
			arrNew = new int[2];
			arrNew[0] = nums[0];
			arrNew[1] = nums[1];

		}

		return arrNew;
	}

	public boolean unlucky1(int[] nums) {
		int len = nums.length;
		if (len == 1) {
			return false;
		} else if (len == 0) {
			return false;
		} else if (len >= 2 && (nums[0] == 1 && nums[1] == 3) || (nums[len - 2] == 1 && nums[len - 1] == 3)) {
			return true;
		} else if (len >= 2 && (nums[0] == 1 && nums[1] == 3)) {
			return true;
		} else if (len >= 2 && (nums[1] == 1 && nums[2] == 3)) {
			return true;
		} else if (len >= 2 && (nums[len - 2] == 1 && nums[len - 1] == 3)) {
			return true;
		} else {
			return false;
		}
	}

	public int[] make2(int[] a, int[] b) {
		int[] arrNew = new int[2];
		if (a.length == 0) {
			arrNew[0] = b[0];
			arrNew[1] = b[1];
		} else if (a.length == 1) {
			arrNew[0] = a[0];
			arrNew[1] = b[0];
		}
		if (a.length >= 2) {
			arrNew[0] = a[0];
			arrNew[1] = a[1];
		}
		return arrNew;
	}

	public int[] front11(int[] a, int[] b) {
		int[] arrNew = null;

		if (a.length >= 1 && b.length >= 1) {
			arrNew = new int[2];
			arrNew[0] = a[0];
			arrNew[1] = b[0];

		}

		if (a.length >= 1 && b.length == 0) {
			arrNew = new int[1];
			arrNew[0] = a[0];
			// arrNew[1]=b[0];

		}

		if (a.length == 0 && b.length >= 1) {
			arrNew = new int[1];
			// arrNew[0]=a[0];
			arrNew[0] = b[0];

		}
		if (a.length == 0 && b.length == 0) {
			arrNew = new int[0];
			// arrNew[0]=a[0];
			// arrNew[1]=b[0];

		}

		return arrNew;

	}

}
