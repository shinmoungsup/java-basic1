package java1_novice_grammar;

public class java2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(6); // Number
		System.out.println("6"); // String 6

		System.out.println(6+6); // 12
		System.out.println("6"+"6"); // 66

		System.out.println(6*6); // 36
//		System.out.println("6"*"6");

		System.out.println("1111".length()); // 4
//		System.out.println(1111.length());

		System.out.println("Hello World"); // String 문자열
		System.out.println('H'); // Char 문자
		System.out.println("H");

		// Operator
		System.out.println(6 + 2); // 8
		System.out.println(6 - 2); // 4
		System.out.println(6 * 2); // 12
		System.out.println(6 / 2); // 3

		// class : 변수(variable), 메소드(method)
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(Math.PI)); // Descending
		System.out.println(Math.ceil(Math.PI)); // Lifting
		System.out.println(Math.round(Math.PI)); // Rounding 四捨五入

		// Character VS String
		System.out.println("Hello World"); // String
		System.out.println('H'); // Character

		System.out.println("Hello "
				+ "World");

		// new line
		System.out.println("Hello \nWorld");

		// escape
		System.out.println("Hello \"World\"");// Hello "World"

		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));

	}

}
