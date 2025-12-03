import java.util.Scanner;
public class Lcm{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number of choice: ");
    int firstNumber = input.nextInt();
    int count = 0;
    int counter = 0;
    int lowest = 0;
    int common1 = 0;
    int common2 = 0;

    for( count = 1 ; count <= firstNumber ; count++)
    if(firstNumber % count == 0){
    System.out.println(count + " ");
    }
    System.out.print("Enter second number of choice: ");
    int secondNumber = input.nextInt();
    for(counter = 1 ; counter <= secondNumber ; counter++)
    if(secondNumber % counter == 0){
    System.out.println(counter + " ");
    }

//    if(counter )
}
if (firstNumber % count == 0 && secondNumber % count == 0){
System.out.print(count);
}
if(secondNumber % counter == 0 && firstNumber % counter == 0){
System.out.print(counter);
}
 
}
