package com.codingbat.finalmost;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String s : strings) {
			map.put(s, 0);
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String s : strings) {
			map.put(s, s.length());
		}
		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String s : strings) {
			map.put(s.substring(0, 1), s.substring(s.length() - 1));
		}
		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : strings) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				int count = map.get(s);
				map.put(s, count + 1);
			}
		}
		return map;

	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<String, String>();
		for (String s : strings) {
			if (!map.containsKey(s.substring(0, 1))) {
				map.put(s.substring(0, 1), s);
			} else {
				String existing = map.get(s.substring(0, 1));
				map.put(s.substring(0, 1), existing + s);
			}
		}
		return map;
	}

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String result = "";
		for (int i = 0; i < strings.length; i++) {
			String key = strings[i];
			if (map.containsKey(key)) {
				int val = map.get(key);
				val++;
				if (val % 2 == 0) {
					result = result + key;
				}
				map.put(key, val);
			} else {
				map.put(key, 1);
			}
		}

		return result;
	}

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<>();
		for (String s : strings) {
			if (!map.containsKey(s)) {
				map.put(s, false);
			} else {
				map.put(s, true);
			}
		}
		return map;
	}

	public String[] allSwap(String[] strings) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < strings.length; i++) {

			String key = String.valueOf(strings[i].charAt(0));

			if (map.containsKey(key)) {

				// swap
				int pos = map.get(key);
				String tmp = strings[pos];
				strings[pos] = strings[i];
				strings[i] = tmp;

				// delete
				map.remove(key);

			} else {
				map.put(key, i);
			}

		}

		return strings;
	}

	public String[] firstSwap(String[] strings) {
		return strings;

	}

}
