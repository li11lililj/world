import java.util.Arrays;
import java.util.Scanner;

public class caipiao {
    public static void main(String[] args) {
        // �������һ����λ��������ȡÿλ��ֵ
        int a0 = (int)(Math.random()*1000);
        int a1 = a0 / 100;
        int a2 = (a0 % 100) / 10;
        int a3 = a0 % 10;

        // ��ȡ�û�����һ������
        Scanner input = new Scanner(System.in);
        System.out.println("������һ����λ����");
        int b0 = input.nextInt();
        if(b0 < 0 || b0 >= 1000){
            System.out.println("�������ݲ��Ϸ�");
            System.exit(0);
        }
        int b1 = b0 / 100;
        int b2 = (b0 % 100) / 10;
        int b3 = b0 % 10;

        // �ж����������Ƿ����
        if(a0 == b0){
            System.out.println("��ȫƥ�䣬����10000");
        }

        // �Ƿ�������ƥ�䣺����
        // ��λ����ѭ��ͬ�������������������бȽ�
        // �������մ�С��������
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
            System.out.println("��������ƥ�䣬����3000");
        }

        // �ж��Ƿ���һλƥ�䣺���������Ŀ�����ѵ�
        // �������Ҳ���һ����£��ú������������������
        int[] array = {a1, a2, a3, b1, b2, b3};
        Arrays.sort(array);
        for(int i = 0;i < 5;i++){
            if(array[i] == array[i+1]){
                System.out.println("��1������ƥ�䣬����1000");
            }
        }
    }
}
