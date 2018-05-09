import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0 ; i<6;i++){
            int s = scn.nextInt();
            if(s>0){
                x++;

            }else if(s==0){
                y++;

            }else if(s<0){
                z++;


            }

        }
        System.out.println("+="+x);
        System.out.println("-="+z);
        System.out.println("0="+y);
    }
}
