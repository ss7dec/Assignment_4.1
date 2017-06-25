//Assignment 4.1

//Write a program to demonstrate the use of method overloading and method overriding.

//                                     Method overloading

// Similar to constructors, we can also overload methods. Conditions for method overloading are:-
//1. Methods to be overloaded must have the same name.
//2. All methods must have different arguments( either different number of parameters or 
//different type of parameters ).



package assignment_4_1_B;

public class Overload_Eg {
	public static void main(String args[]) {
		System.out.println(playMusic("C sharp","D sharp"));
		System.out.println(playMusic("C","D flat","E flat"));
	}

	public static String playMusic(String c, String d) {
		return c+d;
	}
	public static String playMusic(String c, String d, String e){
		return c+d+e;


}

}