public class Perfect{
    public static void main(String[] args){
            int number = 0;
            int sum = 0;

        for(int counter = 1; counter <= 1000; counter++){
             number = counter;
             sum = 0;
            for(int count= 1; count < number ; count ++){ 
                if(number % count == 0){
                sum += count;
                }
            }
              if(number == sum){
                 System.out.println(sum);
                }  
         }
        


}
}
