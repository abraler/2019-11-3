import java.util.Scanner;

public class Exercise14 {
    public static int facSum(int n){
        int sum = 0;
        int temp = 1;
        int i = 1;
        while(i <= n){
            temp *= i;
            sum += temp;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        System.out.println(facSum(t));
    }
}
