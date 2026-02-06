class HelloWorld {
   static int emailid;
   }
   
   
public class Demo {
   static int x = 50;
   int x = 60;
  
  public static void m2() {
    int y = 30;
	System.out.println("m2 local var" +y)
	m2();

}

   public static void m1() {
     int y = 20;
		System.out.println("m1 local var" +y);
		m1(); 