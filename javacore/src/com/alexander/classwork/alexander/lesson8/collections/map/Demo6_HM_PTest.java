package com.alexander.classwork.alexander.lesson8.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Demo6_HM_PTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>(9000);

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			m.put(new PhoneNumber(i, i, 5309), "Jenny" + i);

		}

		long endTime = System.currentTimeMillis();

		long duration = endTime - startTime;
		
		
		Map<PhoneNumber2, String> m2 = new HashMap<PhoneNumber2, String>();

		long startTime1 = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			m2.put(new PhoneNumber2(i, i, 5309), "Jenny" + i);

		}

		long endTime1 = System.currentTimeMillis();

		long duration2 = endTime1 - startTime1;

		System.out.println("HashSet : " + duration);

		System.out.println("HashSet2: " + duration2);

	}

}
