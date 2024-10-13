package ControlStatement;

public class Loop3 {
    public static void main(String[] args){
        int rows=4;
        for(int i=1;i<=rows;i++){
            for(int y=rows;y>i;y--){
                System.out.println( " ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
    
}
}
}