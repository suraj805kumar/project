package com.ok.example.miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> input = new HashMap<>();
		
		input.put("First", "ABC");
		input.put("Second", "ABC");
		input.put("Third", "ABC");
		input.put("Forth", "ABC");
		input.put("Fifth", "ABC");
		
		System.out.println(input);
		
		if(input.containsKey("First")) {
			input.remove("First");
		}
		input.put("six", "ABC");
		System.out.println(input);
		
		double d = 0.0;
		
		if(d == 0.0) {
			System.out.println("done");
		}

	}

}
