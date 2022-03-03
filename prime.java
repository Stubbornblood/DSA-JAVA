import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int flag = 0;
        for(int i = 1;i*i<=num;i++){
            if(num%i==0){
             flag = 1;
             break;
            }
        }
        if(flag == 1){
            System.out.println("Is Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}


