public class Pattern3 {
    public static void main(String[] args) {
        int row;
        int col;
        // int space;
        for(row = 1 ; row <=5 ; row++){
            for(col = 5 ; col>=row ; col--){
                System.out.print("*");
            }System.out.println(" ");   
        }
    }
    
}
