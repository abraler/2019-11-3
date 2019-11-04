import java.util.Scanner;

public class Exercise15 {
    public static void printRightTriangle(int n){
        int i = 1;
        while(i <= n){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        printRightTriangle(t);
    }
}
