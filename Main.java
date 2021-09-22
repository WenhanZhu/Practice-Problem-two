import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input 2 whole numbers");
    int number1;
     number1=s.nextInt();
     int number2;
     number2=s.nextInt();


     if ( number1<number2)
   while (number1<=number2) {
   System.out.println(number1);
   number1++;}

   else if (number2<number1)
    while (number2<=number1) {
   System.out.println(number2);
   number2++;}
  
  }
   }
