package com.test.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Map is a key-value pair storage.
 * 
 * @author Yogi
 *
 */
public class MapTest {
	public static void main(String[] args) {
		Map<String, House> map = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			House h = new House("A1-10" + i, i, i + 1);
			map.put(h.getHouseNumber(), h); // "A1-101 => {h}"
		}

		System.out.println(map.get("A1-101"));
	}
}
