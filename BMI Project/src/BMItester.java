import java.util.*;
public class BMItester 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Body Mass Index (BMI) Evaluation");
		System.out.println("**************************************************");
		System.out.println("Body Mass Index (BMI) Range");
		System.out.println("18.4 and under: Underweight");
		System.out.println("18.5-24.9: Normal");
		System.out.println("25.0-29.9: Overweight");
		System.out.println("30.0 and above: Obese");
		System.out.println("       ");
		BMI myBMI = new BMI();
		int choice;
		int numValue;
		System.out.println("Please select a menu option");
		//call the menu
		myBMI.menu();
		choice=in.nextInt();
		int i=0;
		//compute 1 persons BMI
		if (choice==1) 
		{
			myBMI.getData();
			myBMI.computeBMI();
		}
		//compute group BMI
		else if(choice ==2) 
		{
			myBMI.computeGroupBMI();
			
		}
		//exit 
		else if (choice ==3) 
		{
			System.out.println("Have a nice day!");
		}

	}

}
