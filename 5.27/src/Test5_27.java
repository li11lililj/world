public class Test5_27 {
    public static void main(String[] args) {
        boolean bool = false;
        int count = 0;

        for (int year = 101; year <= 2100; year++) {
            bool = false;
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                bool = true;
                count++;
                System.out.print(year + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("\nÈòÄêÊýÄ¿:" + count);
    }
}
