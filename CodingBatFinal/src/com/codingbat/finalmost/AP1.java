package com.codingbat.finalmost;

public class AP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean scoresIncreasing(int[] scores) {
		boolean ret = false;
		for (int i = 1; i < scores.length; i++)
			if (scores[i] < scores[i - 1])
				return false;
		return true;
	}

	public boolean scores100(int[] scores) {
		boolean ret = false;
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i + 1] == 100 && scores[i] == 100) {
				ret = true;
			} else {
				ret = false;
			}
		}
		return ret;
	}

	public boolean scoresClump(int[] scores) {
		// boolean ret=false;
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 2] - scores[i] <= 2) {
				return true;
			}

		}
		return false;
	}

	public int scoresAverage(int[] scores) {
		int firstHalf = average(scores, 0, (scores.length) / 2);
		int secondHalf = average(scores, (scores.length) / 2, (scores.length));

		if (firstHalf > secondHalf) {
			return firstHalf;
		}
		return secondHalf;
	}

	int average(int[] scores, int start, int end) {
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < end; i++) {
			avg = (sum + scores[i]) / (end - start);

		}
		return avg;
	}

	public int wordsCount(String[] words, int len) {
		int counts = countMethod(words, len);
		return counts;
	}

	int countMethod(String[] words, int len) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}
		return count;
	}

	public String[] wordsFront(String[] words, int n) {
		String counts[] = countStrMethod(words, n);
		return counts;
	}

	String[] countStrMethod(String[] words, int n) {
		String[] countStr = new String[n];
		for (int i = 0; i < n; i++) {
			countStr[i] = words[i];
		}
		// words[]
		return countStr;
	}

	public List wordsWithoutList(String[] words, int len) {
		List<String> list = new ArrayList<String>();
		for (String word : words) {
			if (word.length() != len) {
				list.add(word);
			}
		}
		return list;
	}

	public boolean hasOne(int n) {
		return String.valueOf(n).contains("1");
	}

	public boolean dividesSelf(int n) {
		int x = n;
		while (x > 0) {
			int digit = x % 10;
			x = x / 10;
			if (digit == 0 || n % digit != 0) {
				return false;
			}
		}
		return true;
	}

	public int[] copyEvens(int[] nums, int count) {
		int[] ret = new int[count];
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				ret[counter] = nums[i];
				counter++;
			}
			if (counter == count) {
				return ret;
			}
		}
		return nums;
	}

	public int[] copyEndy(int[] nums, int count) {
		int[] arr = new int[count];
		int arrIndex = 0;
		// int numsIndex=0;
		for (int numsIndex = 0; numsIndex < nums.length && arrIndex < count; numsIndex++) {
			int n = nums[numsIndex];
			// boolean endy=isEndy(i);
			if (isEndy(n)) {
				arr[arrIndex] = n;
				arrIndex++;
			}
		}
		return arr;
	}

	boolean isEndy(int i) {
		if ((i <= 10 && i >= 0) || (i <= 100 && i >= 90)) {
			return true;
		} else {
			return false;
		}
	}

	public int matchUp(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if ((!a[i].isEmpty()) && (!b[i].isEmpty()) && a[i].substring(0, 1).equals(b[i].substring(0, 1))) {
				count++;
			}
		}
		return count;
	}

	public int scoreUp(String[] key, String[] answers) {
		int count = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals("?")) {
				count = count + 0;
			} else if (answers[i].equals(key[i])) {
				count = count + 4;
			} else if (!answers[i].equals(key[i])) {
				count = count - 1;
			}
		}
		return count;
	}

	public String[] wordsWithout(String[] words, String target) {
		int count = 0;
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				count++;
			}
		}

		String[] ret = new String[words.length - count];
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				ret[index] = words[i];
				index++;
			}
		}
		return ret;
	}

	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecicalScore(a) + largestSpecicalScore(b);
	}

	public int largestSpecicalScore(int[] nums) {
		int large = 0;
		for (int n : nums) {
			if (n % 10 == 0) {
				// large=i;
				large = Math.max(large, n);
			}
		}
		return large;
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum = sum + Math.abs(heights[i] - heights[i + 1]);
		}
		return sum;
	}

	public int sumHeights2(int[] heights, int start, int end) {

		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i + 1] > heights[i]) {
				sum = sum + 2 * Math.abs(heights[i] - heights[i + 1]);
			} else {
				sum = sum + Math.abs(heights[i] - heights[i + 1]);
			}
		}
		return sum;
	}

	public int bigHeights(int[] heights, int start, int end) {

		int count = 0;
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				count++;
			}
		}
		return count;
	}

	public int userCompare(String aName, int aId, String bName, int bId) {

	}

	public String[] mergeTwo(String[] a, String[] b, int n) {
		Set<String> set = new HashSet<>();
		Collections.addAll(set, a);
		Collections.addAll(set, b);
		List<String> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		return list.subList(0, n).toArray(new String[0]);
	}

	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		Set<String> aSet = new HashSet<>();
		Collections.addAll(aSet, a);
		for (String s : aSet) {
			if (contains(b, s)) {
				count++;
			}
		}
		return count;
	}

	boolean contains(String[] bArray, String aSingleElement) {
		for (String s : bArray) {
			if (s.equals(aSingleElement)) {
				return true;
			}
		}
		return false;

	}

}
