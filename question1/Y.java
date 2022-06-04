package question1;

public interface Y {
     void y1();
	 
	 default void y2() {
		System.out.println("Y interface y2 function"); 
	 }
	 static void y3(){
		 System.out.println("Y interface y2 function");
	 }
}
