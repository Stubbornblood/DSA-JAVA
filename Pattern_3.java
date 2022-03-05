import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int alfa = 'A';
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)alfa+" ");
            }
            alfa++;
            System.out.println();
        }
    }
}
