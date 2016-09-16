import java.util.Scanner;

public class QB_Rating {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter number of touchdowns: ");
		double TD = in.nextDouble();
		
		System.out.println("Enter the number of total yards: ");
		double YDS = in.nextDouble();
		
		System.out.println("Enter the number of Interceptions: ");
		double INT = in.nextDouble();
		
		System.out.println("Enter the number of Completions: ");
		double COMP = in.nextDouble();
		
		System.out.println("Enter the number of Passes Attempted: ");
		double ATT = in.nextDouble();
	
	double a = (((COMP/ATT)-.3)*5);
	double b = (((YDS/ATT)-3)*.25);
	double c = ((TD/ATT)*20);
	double d = (2.375-((INT/ATT)*25));
	double QB = (((a+b+c+d)/6)*100);
	
	System.out.print("The QB's Rating is: ");
	System.out.print(QB);
	
	in.close();

	}
}
