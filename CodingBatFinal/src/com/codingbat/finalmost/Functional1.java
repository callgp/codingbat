package com.codingbat.finalmost;

import java.util.List;

public class Functional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		return strings;
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n + n + n);
		return strings;

	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (1 + n) * 10);
		return nums;
	}

	public List<Integer> rightDigit(List<Integer> nums) {

		nums.replaceAll(n -> (n) % 10);
		return nums;
	}

	public List<String> lower(List<String> strings) {

		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

	public List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replace("x", ""));
		return strings;

	}

}
