import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i=1;i<=num;i++){
           for(int j = 1;j<=(2*num)-1;j++){

            if(j>=num-(i-1)&&j<=num+(i-1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
              
           }
           System.out.println();
           
        }
    }
}
