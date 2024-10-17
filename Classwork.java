import java.util.Scanner;

public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item = sc.nextLine();
    System.out.println(" How many are you buying?");
    int a = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double b = sc.nextDouble();
    double totalWeight = a*b;
    System.out.println(a + " " + item + " at " +b +" pounds each will weigh " + totalWeight + " pounds total");

  }
}
