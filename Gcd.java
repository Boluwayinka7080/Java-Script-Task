import java.util.Scanner;
public class Gcd{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two numbers of choice: ");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();

    int count = 0;
    int counter = 0;
    int largest = 0;
    for(count = 1; count < firstNumber ; count++)
    if(firstNumber % count == 0 && secondNumber % count == 0){
    
        System.out.println(count + " ");
        if(largest < count) 
           largest = count;
    }System.out.println("The greatest common divisor is "+ largest);

   


}

    





}
