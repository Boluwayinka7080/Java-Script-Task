import java.util.Scanner;
    public class PerfectNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of choice: ");
    int number = input.nextInt();
    int sum = 0;
    for(int count = 1; count < number ; count ++)
    if(number % count == 0){
    System.out.println(count);
    sum += count;
    }
    System.out.println(sum);


    boolean same = true; 
    boolean notSame = false;
    if(number == sum){
    System.out.print(same);
    }else{
    System.out.print(notSame);
    }
}
    

}
