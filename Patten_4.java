import java.util.Scanner;
public class Patten_4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int low = num;
        for(int i = 1;i<=num;i++){
            for(int j=1;j<=low;j++){
                System.out.print("*\t");
            }
            low = low-1;
            System.out.println();
        }

    }
}
