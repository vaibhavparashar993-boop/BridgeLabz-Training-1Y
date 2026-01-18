import java.util.Scanner;


public class KmToMiles {
  public statics void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter distance in Kilometers: ");
   double Kilometers = sc.nextdouble();
   
   double miles = Kilometers * 0.621371;
   
   System.out.println("Distance in miles = " + miles);
   
   sc.close();
   }
   
}
