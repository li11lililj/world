import java.util.Scanner;

public class sanjiaoxing {
    public static void main(String[] args) {
        // ��ȡ�õ�x���ꡢy����
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double x_judge = input.nextDouble(), y_judge = input.nextDouble();

        // �жϸõ��Ƿ����������ڣ�����������Ϊfalse
        boolean bool = true;
        // �ж�x��y�����Ƿ��ڷ�Χ��
        if( (x_judge < 0 || x_judge > 200) || (y_judge < 0 || y_judge > 100) ) {
            bool = false;
        }
        // ��������������Ӧ��ֱ��б�ʣ�k��������x_judge y_judge�����ж�
        double k = 100.0 / (0 - 200);
        double b_judge = y_judge - k * x_judge;
        if(b_judge < 0 || b_judge > 100)
            bool = false;

        // ���
        if(bool)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
