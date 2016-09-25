package pkg;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Mian {

	public static void main(String[] args) {
		double IncreaseRate;
		double total;
		double CurrentTuition;
		Scanner input = new Scanner(System.in);
		System.out.print("Please type in the initial tuition cost: ");
		Float InitialCost = input.nextFloat();
		total = InitialCost;
		CurrentTuition = InitialCost;
		for (int i = 1;i < 4;i++){
			System.out.printf("Please type in the increase rate of the %dth year: ",i);
			IncreaseRate = input.nextFloat();
			CurrentTuition *= ( 1 + IncreaseRate / 100);
			total += CurrentTuition;
			
		}
		DecimalFormat df = new DecimalFormat(".##");
		String totalf = df.format(total);
		System.out.println("The total tuition in four years is $ " + totalf);

	}

}
