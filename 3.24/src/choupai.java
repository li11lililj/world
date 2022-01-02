public class choupai {
    public static void main(String[] args) {
        // number的值对应牌的大小，color通过switch转为花色
        int number = (int)(Math.random() * 13 + 1);
        int color = (int)(Math.random() * 4);

        // number转为String类型
        String str_Number;
        if(number == 1)
            str_Number = "ACE";
        else if(number == 11)
            str_Number = "Jack";
        else if(number == 12)
            str_Number = "Queen";
        else if(number == 13)
            str_Number = "King";
        else
            str_Number = "" + number;

        // color转为String类型
        String str_Color;
        switch (color){
            case 0:str_Color="Clubs";break;
            case 1:str_Color="Diamonds";break;
            case 2:str_Color="Heart";break;
            default:str_Color="Spades";
        }

        // 输出
        System.out.println("The card you picked is " + str_Number + " of " + str_Color);
    }
}
