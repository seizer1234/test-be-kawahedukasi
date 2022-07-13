public class Main {
    public static void main(String args[]) {
      Object[] data = new Object[]{1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        for(int i=0;i<data.length;i++){
         if(Integer.parseInt(data[i].toString())==5){
             System.out.println("Fizz");
         }else if(Integer.parseInt(data[i].toString())==11){
             System.out.println("Buzz");
         }else if(Integer.parseInt(data[i].toString())==5 && Integer.valueOf(data[i].toString())==11){
             System.out.println("FizzBuzz");
         }else{
             System.out.println("Bukan FizzBuzz");
         }
     }
    }
}