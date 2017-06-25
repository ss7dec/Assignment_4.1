//Assignment 4.1

//Write a program to demonstrate the use of method overloading and method overriding.



//                                     Method OverRiding Example

// In the above example, the class 'Dogs' and its parent class 'Animals' have the same 
//method public void sound(). When the object 'd' of the class Dogs calls this method, 
//then the method in the child class 'Dogs' is called, not that in the parent class. Thus, 
//the method in the child class overrides the method in the parent class.
//This is called method Overriding.




package assignment_4_1_D;

public class Animals {
	public void sound(){
	    System.out.println("This is parent class.");
	  }
	}
	class Dogs extends Animals{
	  public void sound(){
	    System.out.println("Dogs bark");
	  }
	}
	
	// Conditions for Method Overriding are enlisted below:
	//•	Methods of both parent and child class must have the same name.
	//•	Methods must have the same argument list and return type.
	//•	A method declared static cannot be overridden.
	//•	If a method cannot be inherited, it cannot be overridden

	
		
	class m{
	public static void main(String[] args){
	  Dogs d = new Dogs();
	  d.sound();
	}
}
