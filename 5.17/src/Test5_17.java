import java.util.Scanner;

public class Test5_17 {
    public static void main(String[] args) {
        // 获取输入
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        // 输出
        for (int n = 1; n <= lines;n++){        // n表示第n行，一共lines行
            // 前半部分：(lines-n)个空元素
            if(lines != n){
                for (int a = 1; a <= (lines - n); a++)
                    System.out.print("  ");
            }

            // 中间(2*n-1)个元素part1：从n开始到1
            for (int b = n; b > 0 ; b--)
                System.out.printf("%d ",b);;

            // part2：从1到n
            if(n >= 2) {
                for (int c = 2; c <= n; c++)
                    System.out.printf("%d ", c);;
            }

            // 换行
            System.out.println();
        }
        input.close();
    }
}
