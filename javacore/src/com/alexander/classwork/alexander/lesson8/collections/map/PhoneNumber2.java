package com.alexander.classwork.alexander.lesson8.collections.map;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber2 {
	
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;

	public PhoneNumber2(int areaCode, int prefix, int lineNumber) {
		//rangeCheck(areaCode, 999, "area code");
		//rangeCheck(prefix, 999, "prefix");
		//rangeCheck(lineNumber, 9999, "line number");
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if (arg < 0 || arg > max) {
			System.out.println("Error " + name + ": " + arg);
			// throw new IllegalArgumentException(name + ": " + arg);
		}
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (!(o instanceof PhoneNumber))
			return false;

		PhoneNumber pn = (PhoneNumber) o;

		return pn.lineNumber == lineNumber && pn.prefix == prefix
				&& pn.areaCode == areaCode;
	}

	

	
	

	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();

		System.out.println(m.put(new PhoneNumber(707, 867, 5309), "Jenny"));
		System.out.println(m.put(new PhoneNumber(727, 867, 5309), "Tom"));
		System.out.println(m.put(new PhoneNumber(707, 867, 5309), "John"));
		
		System.out.println("Map size: "+m.size());

		System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
		
		
		PhoneNumber p = new PhoneNumber(707, 867, 5309);
		PhoneNumber p2 = new PhoneNumber(707, 867, 5309);
		
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) {
			result = 17;
			result = 31 * result + areaCode;
			result = 31 * result + prefix;
			result = 31 * result + lineNumber;
			hashCode = result;
		}
		return result;
	}
	
	
	
	private  int hashCode =0;

}
