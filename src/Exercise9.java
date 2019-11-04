import java.util.Scanner;

//9.已知2019年3月17日是星期日,求出用户输入一个代表年月日的8位整数是星期几
public class Exercise9 {
    public static int Sub(int n){
        int t=n/10000;
        int e=0;//有多少个闰年
        int q=0;//一共多少天
        int w=n/100%100-1;//月数
        int month=0;
        int days=0;
        for (; t%4==0&&t%100!=0&&t>=0 ; t--) {
            e++;
        }
        for(;w>0;w--){
        switch (w) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                month = 31;
                break;
            case 2:
                if (t % 4 == 0 && t % 100 != 0)
                    month = 29;
                else month = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                month = 30;
                break;
                default:
                break;
        }
        days+=month;
        }
        q=(t-e)*365+e*366+days+(n%100);

        return q;
    }

    public static void jast(int a){
        switch (a){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 0:
                System.out.println("星期天");
                break;

        }
    }
    public static void main(String[] args) {
        // weekOfDay(date);
        Scanner in=new Scanner(System.in);
        while(true) {
            int t = in.nextInt();

            int a = Sub(20190317);
            int b = Sub(t);
            if (a > b) {
                jast((a - b) % 7);
            } else
                jast((b - a) % 7);
        }
    }
}
