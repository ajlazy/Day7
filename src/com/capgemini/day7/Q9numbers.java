package com.capgemini.day7;

import java.util.Objects;

public class Q9numbers implements Comparable<Q9numbers> {
private int number;

	
	public Q9numbers(int number) {
	super();
	this.number = number;
}

	public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

	public Q9numbers() {
	super();
	// TODO Auto-generated constructor stub
}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q9numbers other = (Q9numbers) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String  toString() {
		
		return  number+" " ;
	}

	@Override
	public int compareTo(Q9numbers o) {
		return Integer.compare(this.number,o.number);
	}

}
	


