import java.util.Scanner;

public class Test5_28 {
    public static void main(String[] args) {
        // 接收用户输入
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份和代表该年第一天是周几的数字");
        int year = input.nextInt();
        int day = input.nextInt();

        // 计算指定年份1月1号到
        String str = "";
        String str1 = "";
        for (int month = 1; month <= 12 ; month++){
            // 月份天数（不考虑闰年）
            switch (month){
                case 1: {str1 += "January 1, ";} break;
                case 2: {day += 31; str1 += "Febuary 1, ";} break;
                case 3: {day += 28; str1 += "March 1, ";} break;
                case 4: {day += 31; str1 += "April 1, ";} break;
                case 5: {day += 30; str1 += "May 1, ";} break;
                case 6: {day += 31; str1 += "June 1, ";} break;
                case 7: {day += 30; str1 += "July 1, ";} break;
                case 8: {day += 31; str1 += "Auguest 1, ";} break;
                case 9: {day += 31; str1 += "September 1, ";} break;
                case 10: {day += 30; str1 += "October 1, ";} break;
                case 11: {day += 31; str1 += "November 1, ";} break;
                case 12: {day += 30; str1 += "December 1, ";}
            }
            // 判断闰年+month大于等于2则day+1
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                if (month != 1)
                    day +=1;
            }
            // 求是周几
            int week = day % 7;
            switch (week){
                case 1:str1= " is Monday";break;
                case 2:str1 = " is Tuesday";break;
                case 3:str1 = " is Wednesday";break;
                case 4:str1 = " is Thurday";break;
                case 5:str1 = " is Friday";break;
                case 6:str1 = " is Saturday";break;
                case 0:str1 = " is Sunday";break;
            }
            // 输出
            System.out.println(str + year + str1);
            str = "";
            str1 = "";
        }
    }
}

