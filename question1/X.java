package question1;

public interface X {
	 void x1();
	 
	 default void x2() {
		 System.out.println("X interface method x2");
	 }
	 static void x3(){
		 System.out.println("X interface method x3");
	 }
}
