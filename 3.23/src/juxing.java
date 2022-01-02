
import java.util.Scanner;

public class juxing {
    public static void main(String[] args) {
        // 获取点坐标
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // 矩形
        double x0 = -2.5, x1 = 2.5;      // x值上下限
        double y0 = -5.0, y1 = 5.0;      // y值上下限

        // 分别判断x、y是否在矩形范围内：boolX判断x2是否在范围内，boolY判断y2是否在范围内
        boolean boolX = false,boolY = false;
        if(x2 >= x0 && x2 <= x1)
            boolX = true;
        if(y2 >= y0 && y2 <= y1)
            boolY = true;

        // bool汇总boolX和boolY的结果（配合三目运算符食用）
        boolean bool = (boolX && boolY)? true : false;

        // 输出结果
        if(bool){
            System.out.println("Point (" + x2 + ", " +  y2 + ") is in the rectangle");
        }else{
            System.out.println("Point (" + x2 + ", " +  y2 + ") is not in the rectangle");
        }
    }
}
