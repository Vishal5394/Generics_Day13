package com.BridgeLabz.generics;

	public class FindMaxValueWithGenerics {

		public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
			T max = a1;
			if (a2.compareTo(max) > 0)
				max = a2;
			if (a3.compareTo(max) > 0)
				max = a3;
			return max;
		}

		public static void main(String[] args) {
			System.out.println("Welcome To Find Maximun Problem Using Generics \n");
			
			System.out.println("The maximum value between the three integer is : " + maxOfValues(25, 18, 85)+ "\n");
			System.out.println("The maximum value between the three float is : " + maxOfValues(2.5f, 4.56f, 7.87f) + "\n");
			System.out.println("The maximum value between the three string is : " + maxOfValues("abc", "pqr", "jkl"));
		}
	}
