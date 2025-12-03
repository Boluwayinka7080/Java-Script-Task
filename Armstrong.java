import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of choice: ");
    int number = input.nextInt();

    int firstNumber = number / 100;
    int secondNumber = (number % 100) / 10;
    int thirdNumber = (number % 100) % 10;

    int multiple = 3;
    double cubeFirstNumber = Math.pow(firstNumber,multiple);
    double cubeSecondNumber = Math.pow(secondNumber,multiple);
    double cubeThirdNumber = Math.pow(thirdNumber,multiple);
    double sum = (cubeFirstNumber + cubeSecondNumber + cubeThirdNumber);
    System.out.println(sum);

    boolean equal = true;
    boolean notequal = false;
    if(number == sum){
    System.out.print(equal);
    }else{
    System.out.print(notequal);    
    }
}
}

    

