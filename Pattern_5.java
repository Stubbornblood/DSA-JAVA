import java.util.Scanner;
public class Pattern_5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int low = num;
        for(int i = 1;i<=num;i++){
            for(int j=1;j<= low;j++){
                System.out.print(j+" ");
            }
            low--;
            System.out.println();
           
        }

    }
}