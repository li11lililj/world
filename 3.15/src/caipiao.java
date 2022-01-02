import java.util.Arrays;
import java.util.Scanner;

public class caipiao {
    public static void main(String[] args) {
        // 随机生成一个三位整数，提取每位数值
        int a0 = (int)(Math.random()*1000);
        int a1 = a0 / 100;
        int a2 = (a0 % 100) / 10;
        int a3 = a0 % 10;

        // 获取用户输入一个整数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int b0 = input.nextInt();
        if(b0 < 0 || b0 >= 1000){
            System.out.println("输入数据不合法");
            System.exit(0);
        }
        int b1 = b0 / 100;
        int b2 = (b0 % 100) / 10;
        int b3 = b0 % 10;

        // 判断两者整体是否相等
        if(a0 == b0){
            System.out.println("完全匹配，奖金10000");
        }

        // 是否所有数匹配：排序
        // 三位数遵循相同方法进行排序，排序后进行比较
        // 本例按照从小到大排序
        int temp = 0;
        if(a1 > a2){
            temp = a2;
            a2 = a1;
            a1 = temp;
        }
        if(a1 > a3){
            temp = a3;
            a3 = a1;
            a1 = temp;
        }
        if(a2 > a3){
            temp = a3;
            a3 = a2;
            a2 = temp;
        }
        if(b1 > b2){
            temp = b2;
            b2 = b1;
            b1 = temp;
        }
        if(b1 > b3){
            temp = b3;
            b3 = b1;
            b1 = temp;
        }
        if(b2 > b3){
            temp = b3;
            b3 = b2;
            b2 = temp;
        }
        if(a1 == b1 && a2 == b2 && a3 == b3){
            System.out.println("所有数字匹配，奖金3000");
        }

        // 判断是否有一位匹配：这是这个题目中最难的
        // 在这里我不讲一下武德，用后续的数组来做这道题
        int[] array = {a1, a2, a3, b1, b2, b3};
        Arrays.sort(array);
        for(int i = 0;i < 5;i++){
            if(array[i] == array[i+1]){
                System.out.println("有1对数字匹配，奖金1000");
            }
        }
    }
}
