import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Your name is " + name + ","); 
    System.out.println("You are " + age + " years old,"); 
    System.out.println("and you make about " + salary + " a year."); 
  }
}
