import java.util.Scanner;

public class Exercise8 {

    public static void dateOfDay(long date){
        int year = (int)(date / 10000);
        int month = (int)(date / 100) % 100;
        int day = (int)(date % 100);
        if(month == 1){
            if(day == 1){
                System.out.println("上一天：" + (year - 1) + "年12月31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 30){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 2){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){   //是闰年
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "1月31日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 29){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }else{
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "1月31日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 28){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }
        }else if(month == 3){
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {   //是闰年
                if(day == 1){
                    System.out.println("上一天：" + year + "年" + "2月29日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 31){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }else{
                if(day == 1) {
                    System.out.println("上一天：" + year + "年" + "2月28日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }else if(day == 31){
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
                }else{
                    System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                    System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
                }
            }
        }else if(month == 8) {
            if(day == 1){
                System.out.println("上一天：" + year + "年" + "7月31日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + "9月1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else if(month == 12){
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "30日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + (year + 1) + "年" + "1月1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }else{   //5,7,10
            if(day == 1){
                System.out.println("上一天：" + year + "年" + (month - 1) + "月" + "30日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }else if(day == 31){
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + (month + 1) + "月" + "1日");
            }else{
                System.out.println("上一天：" + year + "年" + month + "月" + (day - 1) + "日");
                System.out.println("下一天：" + year + "年" + month + "月" + (day + 1) + "日");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i++ < 10) {
            System.out.println("请输入一个代表日期的8位整数：");
            long date = scanner.nextLong();
            dateOfDay(date);

        }
    }
}

