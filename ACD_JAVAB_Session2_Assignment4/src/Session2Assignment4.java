//Session2_Assignment4 : 24.4.2016
//Author: Kamakshi Abbi
import java.util.Scanner;
public class Session2Assignment4 {
	public static void main(String[] args) {
		String month;
		System.out.println("Please enter the month");
		Scanner input = new Scanner(System.in);
		month = input.next();
		input.close();
		switch(month){
			case "January":
				System.out.println("31 days");
				break;
			case "Febraury":
				System.out.println("28 days");
				break;
			case "March":
				System.out.println("31 days");
				break;
			case "April":
				System.out.println("30 days");
				break;
			case "May":
				System.out.println("31 days");
				break;
			case "June":
				System.out.println("30 days");
				break;
			case "July":
				System.out.println("31 days");
				break;
			case "August":
				System.out.println("31 days");
				break;
			case "September":
				System.out.println("30 days");
				break;
			case "October":
				System.out.println("31 days");
				break;
			case "November":
				System.out.println("30 days");
				break;
			case "December":
				System.out.println("31 days");
				break;
			default: System.out.println("Enter valid month correctly in title case");
				break;
		}
	}
}
