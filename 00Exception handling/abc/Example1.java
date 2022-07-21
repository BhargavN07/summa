package chumma;

class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("My Exception Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Try block started");
			// I'm throwing the custom exception using throw
			throw new MyException("This is the error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}

