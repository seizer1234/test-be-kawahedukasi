public class Main {
    public static void main(String args[]) {
        
      Object[] data = new Object[]{1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};
        for(int i=0;i<data.length;i++){
            try {
    int intValue = Integer.parseInt(data[i].toString());
    if(Integer.parseInt(data[i].toString())<=0){
        System.out.println("Tidak bisa di validasi sistem");
        }else{
    System.out.println("index ke "+i+" adalah integer dengan data "+data[i].toString());
    }
} catch (NumberFormatException e) {
    System.out.println("index ke "+i+" adalah string dengan data "+data[i].toString());
     }
    }
}}
