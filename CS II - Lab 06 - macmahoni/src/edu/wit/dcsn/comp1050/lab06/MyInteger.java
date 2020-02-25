package edu.wit.dcsn.comp1050.lab06;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Write program that tests a variety of different methods using no parameters, 
 * integer parameters, and object parameters. Include many different numbers 
 * (negative, zero, and positive) in the tests.
 * 
 * @author Isabella MacMahon
 * @version 1.0.0
 */
public class MyInteger {
	public int value;

	/**
	 * Constructor for default integer value
	 */
	public MyInteger() {
		// default integer value
		value = 7;
	}

	/**
	 * Constructor for specified integer value
	 * @param val - specified integer value
	 */
	public MyInteger(int val) {
		// specified integer value
		value = val;
	}

	/**
	 * Gets original value of value
	 * 
	 * @return value
	 */
	public int valueOf() {
		return value;
	}

	/**
	 * Sets the value of value equal to the value of val
	 * 
	 * @param val - integer to change value of value
	 */
	public void setValue(int val) {
		value = val;
	}

	/**
	 * Determines if value = val
	 * 
	 * @param val - integer compared to value
	 * @return true if value = val, false if otherwise
	 */
	public boolean equals(int val) {
		if (val == value) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Creates a string of the number stored in value
	 * 
	 * @return valueString - value in String form
	 */
	public String toString() {
		String valueString = "";
		if (value <= 999) {
			valueString = valueString + value;
		} else {
			DecimalFormat df = new DecimalFormat("#,###");
			valueString = df.format(value);
		}

		return valueString;
	}

	/**
	 * Determines if val is zero
	 * 
	 * @param val - integer to be determined if zero
	 * @return true if zero, false if otherwise
	 */
	public static boolean isZero(int val) {
		if (val == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if val is even
	 * 
	 * @param val - integer to be determined if even
	 * @return true if even, false if otherwise
	 */
	public static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if val is odd
	 * 
	 * @param val - integer to be determined if odd
	 * @return true if odd, false if otherwise
	 */
	public static boolean isOdd(int val) {
		if (val % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if value is zero
	 * 
	 * @return returns true if zero, false if otherwise
	 */
	public boolean isZero() {
		if (value == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if value is even
	 * 
	 * @return returns true if even, false if otherwise
	 */
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines if value is odd
	 * 
	 * @return returns true if odd, false if otherwise
	 */
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determines the value of value+1
	 * 
	 * @return value incremented by 1
	 */
	public int increment() {
		value++;
		return value;
	}

	/**
	 * Determines the value of value-1
	 * 
	 * @return value decremented by 1
	 */
	public int decrement() {
		value--;
		return value;
	}

	/**
	 * Determines the sum of value+val
	 * 
	 * @param val - integer that adds to value
	 * @return value with new value of the sum 
	 */
	public int add(int val) {
		value = value + val;
		return value;
	}
	/**
	 * Determines the difference of value-val
	 * 
	 * @param val - integer that subtracts from value
	 * @return value with new value of the difference 
	 */
	public int subtract(int val) {
		value = value - val;
		return value;
	}

	/**
	 * Determines the product of value*val
	 * 
	 * @param val - integer that multiplies by value
	 * @return value with new value of product 
	 */
	public int multiplyBy(int val) {
		value = value * val;
		return value;
	}

	/**
	 * Determines the quotient of value/val
	 * 
	 * @param val - integer that divides value
	 * @return value with new value of quotient
	 */
	public int divideBy(int val) {
		value = value / val;
		return value;
	}

	/**
	 * Determines the remainder of value/val
	 * 
	 * @param val - integer that divides value
	 * @return value with new value of remainder 
	 */
	public int remainder(int val) {
		value = value % val;
		return value;
	}

	/**Determines if value = Object o
	 * 
	 * @param o - object compared to value
	 * @return true if value = o, false if otherwise
	 */
	public boolean equals(Object o) {
		MyInteger temp = (MyInteger) o;
		if (this.valueOf() == temp.valueOf()) {
			return true;
		} else {
			return false;
		}
	}

	/**Determines the sum of value+object
	 * 
	 * @param o - object added to value
	 * @return value with value of sum
	 */
	public int add(Object o) {
		MyInteger temp = (MyInteger) o;
		value = value + temp.valueOf();
		return value;
	}

	/**Determines the difference of value-object
	 * 
	 * @param o - object value subtracts
	 * @return value with value of difference
	 */
	public int subtract(Object o) {
		MyInteger temp = (MyInteger) o;
		value = value - temp.valueOf();
		return value;
	}

	/**Determines the product of value*object
	 * 
	 * @param o - object value multiplies by
	 * @return value with value of product
	 */
	public int multiplyBy(Object o) {
		MyInteger temp = (MyInteger) o;
		value = value * temp.valueOf();
		return value;
	}
	
	/**Determines the quotient of value/object
	 * 
	 * @param o - object value divides
	 * @return value with value of quotient
	 */
	public int divideBy(Object o) {
		MyInteger temp = (MyInteger) o;
		value = value / temp.valueOf();
		return value;
	}

	/**Determines the remainder of value/object
	 * 
	 * @param o - object value divides
	 * @return value with value of remainder
	 */
	public int remainder(Object o) {
		MyInteger temp = (MyInteger) o;
		value = value % temp.valueOf();
		return value;
	}

	/**
	 * Determines if value is prime.
	 * @return true if prime, false otherwise
	 */
	public boolean isPrime() {
		if (Math.abs(value) == 1) {
			return true;
		}
		for (int i = 2; i < Math.abs(value); i++) {
			if ((Math.abs(value)) % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	/**
	 * Determines if an object is prime
	 * @param o - object to be checked if prime
	 * @return true if prime, false otherwise
	 */
	public static boolean isPrime(Object o) {
		MyInteger temp = (MyInteger) o;
		if(Math.abs(temp.valueOf()) == 1) {
			return true;
		}
		for (int i = 2; i < Math.abs(temp.valueOf()); i++) {
			if (Math.abs(temp.valueOf()) % i == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	/**
	 * Creates a single number for an array of character 
	 * @param characters - array of characters
	 * @return num - single number made from characters
	 */
	public static int parseInt(char[] characters) {
		int num = 0;
		int factor = 1;
		for (int i = (characters.length - 1); i > -1; i--) {
			num += factor * (characters[i]-48);
			factor *= 10;
		}
		return num;
	}

	/**
	 * Creates an integer from a string holding a number
	 * @param s - string of numbers
	 * @return an integer holding what was in s
	 */
	public static int parseInt(String s) {
		return parseInt(s.toCharArray());
	}

	/**
	 * Tests the output of each method with a variety
	 * of different numbers
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("MyInteger Testing...");
		System.out.println();
		MyInteger myInt = new MyInteger(7);
		System.out.println("Creating new MyInteger...");
		System.out.println();
		System.out.println("valueOf() created MyInteger: " + myInt.valueOf());
		System.out.println();
		System.out.println("Setting value to 107 using setValue() method.");
		myInt.setValue(107);
		System.out.println("toString() of MyInteger: " + myInt.toString());
		System.out.println();
		System.out.println("Testing equals() method");
		System.out.println("107 = 10? " + myInt.equals(10));
		System.out.println("107 = 107? " + myInt.equals(107));
		System.out.println("107 = -1? " + myInt.equals(-1));
		System.out.println("107 = 0? " + myInt.equals(0));
		System.out.println();
		System.out.println("Testing isZero() method");
		System.out.println("107 = 0? " + myInt.isZero());
		myInt.setValue(0);
		System.out.println("0 = 0? " + myInt.isZero());
		myInt.setValue(-3);
		System.out.println("-3 = 0? " + myInt.isZero());
		myInt.setValue(300);
		System.out.println("300 = 0? " + myInt.isZero());
		System.out.println();
		System.out.println("Testing isEven() method");
		myInt.setValue(17);
		System.out.println("is 17 even? " + myInt.isEven());
		myInt.setValue(10);
		System.out.println("is 10 even? " + myInt.isEven());
		myInt.setValue(-13);
		System.out.println("is -13 even? " + myInt.isEven());
		myInt.setValue(0);
		System.out.println("is 0 even? " + myInt.isEven());
		System.out.println();
		System.out.println("Testing isOdd() method");
		myInt.setValue(107);
		System.out.println("is 107 odd? " + myInt.isOdd());
		myInt.setValue(26);
		System.out.println("is 26 odd? " + myInt.isOdd());
		myInt.setValue(-17);
		System.out.println("is -17 odd? " + myInt.isOdd());
		myInt.setValue(0);
		System.out.println("is 0 odd? " + myInt.isOdd());
		System.out.println();
		System.out.println("Tesing isZero(int val) method");
		System.out.println("107 = 0? " + myInt.isZero(107));
		System.out.println("0 = 0? " + myInt.isZero(0));
		System.out.println("-18 = 0? " + myInt.isZero(-18));
		System.out.println("340 = 0? " + myInt.isZero(340));
		System.out.println();
		System.out.println("Testing isEven(int val) method");
		System.out.println("is 100 even? " + myInt.isEven(100));
		System.out.println("is 7 even? " + myInt.isEven(7));
		System.out.println("is 0 even? " + myInt.isEven(0));
		System.out.println("is -35 even? " + myInt.isEven(-35));
		System.out.println();
		System.out.println("Testing isOdd(int val) method");
		System.out.println("is 103 odd? " + myInt.isOdd(103));
		System.out.println("is 6 odd? " + myInt.isOdd(6));
		System.out.println("is 0 odd? " + myInt.isOdd(0));
		System.out.println("is -19 odd? " + myInt.isOdd(-19));
		System.out.println();
		System.out.println("Tesing increment() method");
		myInt.setValue(12);
		System.out.println("increment 12? " + myInt.increment());
		myInt.setValue(-10);
		System.out.println("increment -10? " + myInt.increment());
		myInt.setValue(0);
		System.out.println("increment 0? " + myInt.increment());
		myInt.setValue(-1);
		System.out.println("increment -1? " + myInt.increment());
		System.out.println();
		System.out.println("Testing decrement() method");
		myInt.setValue(-13);
		System.out.println("decrement -13? " + myInt.decrement());
		myInt.setValue(3);
		System.out.println("decrement 3? " + myInt.decrement());
		myInt.setValue(0);
		System.out.println("decrement 0? " + myInt.decrement());
		myInt.setValue(777);
		System.out.println("decrement 777? " + myInt.decrement());
		System.out.println();
		System.out.println("Testing add(int val) method");
		myInt.setValue(17);
		System.out.println("17 + 12 = ? " + myInt.add(12));
		myInt.setValue(3);
		System.out.println("3 + 4 = ? " + myInt.add(4));
		myInt.setValue(-2);
		System.out.println("-2 + 2 + ? " + myInt.add(2));
		myInt.setValue(0);
		System.out.println("0 + 139 = ? " + myInt.add(139));
		System.out.println();
		System.out.println("Testing subtract(int val) method");
		myInt.setValue(17);
		System.out.println("17 - 12 = ? " + myInt.subtract(12));
		myInt.setValue(3);
		System.out.println("3 - 4 = ? " + myInt.subtract(4));
		myInt.setValue(-2);
		System.out.println("-2 - 2 + ? " + myInt.subtract(2));
		myInt.setValue(0);
		System.out.println("0 - 139 = ? " + myInt.subtract(139));
		System.out.println();
		System.out.println("Tesing multiplyBy(int val) method");
		myInt.setValue(17);
		System.out.println("17 * 12 = ? " + myInt.multiplyBy(12));
		myInt.setValue(3);
		System.out.println("3 * 4 = ? " + myInt.multiplyBy(4));
		myInt.setValue(-2);
		System.out.println("-2 * 2 + ? " + myInt.multiplyBy(2));
		myInt.setValue(0);
		System.out.println("0 * 139 = ? " + myInt.multiplyBy(139));
		System.out.println();
		System.out.println("Testing divideBy(int val) method");
		myInt.setValue(17);
		System.out.println("17 / 2 = ? " + myInt.divideBy(2));
		myInt.setValue(3);
		System.out.println("3 / 1 = ? " + myInt.divideBy(1));
		myInt.setValue(-2);
		System.out.println("-2 / 2 + ? " + myInt.divideBy(2));
		myInt.setValue(0);
		System.out.println("0 / 139 = ? " + myInt.divideBy(139));
		System.out.println();
		System.out.println("Testing remainder(int val) method");
		myInt.setValue(17);
		System.out.println("17 % 12 = ? " + myInt.remainder(12));
		myInt.setValue(3);
		System.out.println("3 % 4 = ? " + myInt.remainder(4));
		myInt.setValue(-13);
		System.out.println("-13 % 7 + ? " + myInt.remainder(7));
		myInt.setValue(0);
		System.out.println("0 % 139 = ? " + myInt.remainder(139));
		System.out.println();
		System.out.println("Testing equals(Object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp1 = new MyInteger(17);
		System.out.println("17 = 17? " + myInt.equals(temp1));
		System.out.println("Creating another MyInteger with the value of 100...");
		MyInteger temp2 = new MyInteger(100);
		System.out.println("100 = 17? " + myInt.equals(temp2));
		myInt.setValue(-7);
		System.out.println("Creating another MyInteger with the value of 0...");
		MyInteger temp3 = new MyInteger(0);
		System.out.println("-7 = 0? " + myInt.equals(temp3));
		System.out.println();
		System.out.println("Testing add(Object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp4 = new MyInteger(17);
		System.out.println("17 + 1 = ? " + myInt.add(1));
		myInt.setValue(0);
		System.out.println("Creating another MyInteger with the value of 0...");
		MyInteger temp5 = new MyInteger(0);
		System.out.println("0 + -22 = ? " + myInt.add(-22));
		myInt.setValue(12);
		System.out.println("Creating another MyInteger with the value of 12...");
		MyInteger temp6 = new MyInteger(12);
		System.out.println("12 + 5 = ? " + myInt.add(5));
		System.out.println();
		System.out.println("Testing subtract(Object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp7 = new MyInteger(17);
		System.out.println("17 - 1 = ? " + myInt.subtract(1));
		myInt.setValue(1);
		System.out.println("Creating another MyInteger with the value of 1...");
		MyInteger temp8 = new MyInteger(1);
		System.out.println("1 - 100 = ? " + myInt.subtract(100));
		myInt.setValue(-1);
		System.out.println("Creating another MyInteger with the value of -1...");
		MyInteger temp9 = new MyInteger(-1);
		System.out.println("-1 - 0 = ? " + myInt.subtract(0));
		System.out.println();
		System.out.println("Testing multiplyBy(Object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp10 = new MyInteger(17);
		System.out.println("17 * 1 = ? " + myInt.multiplyBy(1));
		myInt.setValue(0);
		System.out.println("Creating another MyInteger with the value of 0...");
		MyInteger temp11 = new MyInteger(0);
		System.out.println("0 * 7 = ? " + myInt.multiplyBy(7));
		myInt.setValue(22);
		System.out.println("Creating another MyInteger with the value of 22...");
		MyInteger temp12 = new MyInteger(22);
		System.out.println("22 * -14 = ? " + myInt.multiplyBy(-14));
		System.out.println();
		System.out.println("Testing divideBy(object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp13 = new MyInteger(17);
		System.out.println("17 / 1 = ? " + myInt.divideBy(1));
		myInt.setValue(22);
		System.out.println("Creating another MyInteger with the value of 22...");
		MyInteger temp14 = new MyInteger(22);
		System.out.println("22 / -4 = ? " + myInt.divideBy(-4));
		myInt.setValue(0);
		System.out.println("Creating another MyInteger with the value of 0...");
		MyInteger temp15 = new MyInteger(17);
		System.out.println("0 / 5 = ? " + myInt.divideBy(5));
		System.out.println();
		System.out.println("Testing remainder(Object) method");
		myInt.setValue(17);
		System.out.println("Creating another MyInteger with the value of 17...");
		MyInteger temp16 = new MyInteger(17);
		System.out.println("17 % 1 = ? " + myInt.remainder(1));
		myInt.setValue(-1);
		System.out.println("Creating another MyInteger with the value of -1...");
		MyInteger temp17 = new MyInteger(-1);
		System.out.println("-1 % 6 = ? " + myInt.remainder(6));
		myInt.setValue(100);
		System.out.println("Creating another MyInteger with the value of 100...");
		MyInteger temp18 = new MyInteger(100);
		System.out.println("100 % -30 = ? " + myInt.remainder(-30));
		System.out.println();
		System.out.println("Testing isPrime() method");
		myInt.setValue(18);
		System.out.println("is 18 prime? " + myInt.isPrime());
		myInt.setValue(29);
		System.out.println("is 29 prime? " + myInt.isPrime());
		myInt.setValue(-7);
		System.out.println("is -7 prime? " + myInt.isPrime());
		myInt.setValue(0);
		System.out.println("is 0 prime? " + myInt.isPrime());
		System.out.println();
		System.out.println("Testing isPrime(Object) method");
		System.out.println("is 16 prime? " + MyInteger.isPrime(new MyInteger(16)));
		System.out.println("is 3 prime? " + MyInteger.isPrime(new MyInteger(3)));
		System.out.println("is 6 prime? " + MyInteger.isPrime(new MyInteger(6)));
		System.out.println("is -1 prime? " + MyInteger.isPrime(new MyInteger(-1)));
		System.out.println();
		System.out.println("Testing parseInt(Object) method");
		System.out.println("Creating array of characters containing {2, 8, 7}...");
		char[] charsArr1 = {'2', '8', '7'};
		System.out.println("Parsing created array: " + MyInteger.parseInt(charsArr1));
		System.out.println("Creating string containing '2346'...");
		String s1 = "2346";
		System.out.println("Parsing created string: " + MyInteger.parseInt(s1));
		System.out.println();
		System.out.println("Creating array of characters containing {4, 9, 5}...");
		char[] charsArr2 = {'4', '9', '5'};
		System.out.println("Parsing created array: " + MyInteger.parseInt(charsArr2));
		System.out.println("Creating string containing '4957'...");
		String s2 = "4957";
		System.out.println("Parsing created string: " + MyInteger.parseInt(s2));
		System.out.println();
		System.out.println("Creating array of characters containing {3, 5, 1}...");
		char[] charsArr = {'3', '5', '1'};
		System.out.println("Parsing created array: " + MyInteger.parseInt(charsArr));
		System.out.println("Creating string containing '1234'...");
		String s = "1234";
		System.out.println("Parsing created string: " + MyInteger.parseInt(s));
	}
}
