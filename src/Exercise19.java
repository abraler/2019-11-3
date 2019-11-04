/*
19.有一个猜数字游戏，系统随机生成一个数用户来猜，每人有10次机会。
当用户猜完之后统计用户得分情况（猜对一次给1分，猜错不得分），
每一个档次的分数所给出的提示不同。（要求当用户连续输入三次错误的时候直接退出并给出评价）
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise19 {
    Scanner i=new Scanner(System.in);
    Random a=new Random();
    int cs=0;

    private int Game1(){



        for (int w = 1; w <4 ; w++) {

            int d = 0;//保存下限
            int e = 100;//保存上限
            int send = a.nextInt(100);
            System.out.println("范围在" + d + "~" + e);
            for (int j = 1; j < 10; j++) {
                System.out.println("请输入");
                int q = i.nextInt();
                if (q == send) {
                    System.out.println("恭喜通过");
                    w = 0;
                    cs++;
                    break;
                }
                if (q > send) {
                    System.out.println(d + "~" + q+"左闭右开");
                    e = q;
                } else {
                    System.out.println(q + "~" + e+"左闭右开");
                    d = q;
                }

            }
            if (w == 1 || w == 2) {
                System.out.println("重新开始");
                System.out.println("现在得分" + cs);
                System.out.println("还有" + (3 - w) + "次机会");
            }
        }
    return cs;
    }
    public static void main(String[] args) {
        Exercise19 a = new Exercise19();
        System.out.println("最终得分"+a.Game1());
    }
}
