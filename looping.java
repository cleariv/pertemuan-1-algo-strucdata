package Lat;

public class looping {
    public static void main(String[] args) {
        
        int vlue = 4; for (int o= 0; o<vlue; o++){
            for(int c = 0; c<vlue; c++){
                if(c<vlue-o-1){
                    System.out.print(" S ");
                }
                else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }    
}