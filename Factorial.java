import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    System.out.print("Enter number of choice: ");
    int number = input.nextInt();
    int sum = 1;
    for(int count = 1 ; count <= number ; count++){
    System.out.println(count + " ");
     sum *= count;
    }
     System.out.println(sum);
}
}
