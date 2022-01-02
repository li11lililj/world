import java.util.Scanner;
public class SalseTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amoount: ");
		double purchaseAmount = input.nextDouble();
		double tax = purchaseAmount * 0.06;
		System.out.println("Salse tax is S" + (int)(tax * 100) / 100.0);

	}

}
