public class Test5_19 {
    public static void main(String[] args) {
        // 定义变量
        int lines = 8;

        // for循环
        for(int n = 1;n <= lines;n++){
            // 1. 空格：第一行7组，第二行6组，第三行5组……
            for(int a = n; a < lines; a++)
                System.out.print("    ");
            // 2. 到最高值（含）左侧的数字部分（从1到最大值）
            for(int b = 0; b <= n - 1;b++){
                int num = (int) Math.pow(2, b);
                //根据num位数分情况输出
                if(num / 100 > 0)
                    System.out.printf("%d ", num);
                else if (num % 100 / 10 > 0)
                    System.out.printf(" %d ", num);
                else
                    System.out.printf("  %d ", num);
            }
            // 3. 最高值（不含）到1
            if(n != 1){
                for(int c = n - 2; c >= 0;c--){
                    int num = (int) Math.pow(2, c);
                    //+根据num位数分情况输出
                    if (num / 10 > 0)
                        System.out.printf(" %d ", num);
                    else
                        System.out.printf("  %d ", num);
                }
            }
            // 换行
            System.out.println();
        }
    }
}
     
    
