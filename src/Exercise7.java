import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true) {
            int t = in.nextInt();
            if (t % 4 == 0 && t % 100 != 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }
}
