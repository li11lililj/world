import java.util.Scanner;

public class sanjiaoxing {
    public static void main(String[] args) {
        // 获取该点x坐标、y坐标
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double x_judge = input.nextDouble(), y_judge = input.nextDouble();

        // 判断该点是否在三角形内，如果不在则改为false
        boolean bool = true;
        // 判断x、y坐标是否在范围内
        if( (x_judge < 0 || x_judge > 200) || (y_judge < 0 || y_judge > 100) ) {
            bool = false;
        }
        // 求出其它两个点对应的直线斜率（k），并将x_judge y_judge代入判断
        double k = 100.0 / (0 - 200);
        double b_judge = y_judge - k * x_judge;
        if(b_judge < 0 || b_judge > 100)
            bool = false;

        // 输出
        if(bool)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
