package com.alexander.lesson5.object_;

public class Test3 {
	
	private String name;
	private String name2;
	private long d;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (d ^ (d >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((name2 == null) ? 0 : name2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test3 other = (Test3) obj;
		if (d != other.d)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (name2 == null) {
			if (other.name2 != null)
				return false;
		} else if (!name2.equals(other.name2))
			return false;
		return true;
	}
	
	

}
