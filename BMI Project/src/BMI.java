import java.util.*;
import java.util.Arrays;
import java.text.DecimalFormat;
public class BMI 
{
	 //instance variables
    private double height = 0;
    private double weight = 0;
    private double BMI = 0;
    private double avg = 0;
    private double kilograms=0;
    private double total = 0;
    private int numValue = 0;
    private double MeterHeight=0;
    private int i =0;
    
    DecimalFormat df = new DecimalFormat("#.#");
    
    
    //array to store bmi
    private double [] bmiArray;
    ArrayList bmiArrayList=new ArrayList();//not used
    Scanner in = new Scanner(System.in);
    Scanner in2= new Scanner(System.in);
    ////////////////////////////////////////
    
    public void BMICalculator(int num)
    {
        i = num;
        bmiArray = new double [i];
        
    }
    ////////////////////////////////////////
    //get data 
    public  void getData()
    {
        System.out.println("Enter height(inches)");
        height=in.nextDouble();
        System.out.println("Your height is: "+height);
        System.out.println("Enter weight");
        weight=in.nextInt();
   
    }
    ///////////////////////////////////////////////////////////
    //compute group bmi
    public void computeGroupBMI()
    {
        System.out.println("Enter the number of people: ");
        bmiArray[i]=in.nextDouble();        
        for(int i=bmiArray.length;i<bmiArray.length;i++)
        {
         System.out.println("Enter height(inches)");
         height=in.nextDouble();
         System.out.println("Enter weight");
         weight=in.nextInt();
         kilograms=weight/2.204;
         MeterHeight=height/39.37;
         BMI= kilograms /Math.pow(MeterHeight, 2);
         avg=BMI/i;
         if (BMI <18.4)
         {
             System.out.println("BMI in kilograms is: "+df.format(BMI));
             System.out.println("Underweight");
         }
         else if (BMI >= 18.5 && BMI==24.9)
         {
             System.out.println("BMI in kilograms is: "+df.format(BMI));
             System.out.println("Normal");
         }
         else if (BMI >=25.0 && BMI ==29.9)
         {  
             System.out.println("BMI in kilograms is: "+df.format(BMI));
             System.out.println("Overweight");
         }
         else  
         {
             System.out.println("BMI in kilograms is: "+df.format(BMI));
             System.out.println("Obese");
         }
         System.out.println("Average BMI of Group: "+df.format(avg));
         
        }
     }

    //////////////////////////////////////////////////////////
    //calculate bmi
    public void computeBMI() 
    {
    	
        kilograms=weight/2.205;
        MeterHeight=height/39.37;
        BMI= kilograms /Math.pow(MeterHeight, 2);
        if (BMI <18.4) 
        {
            System.out.println("BMI in kilograms is: "+df.format(BMI));

        	System.out.println("Underweight");
        }
        else if (BMI >= 18.5 && BMI==24.9) 
        {
            System.out.println("BMI in kilograms is: "+df.format(BMI));

        	System.out.println("Normal");
        }
        else if (BMI >=25.0 && BMI ==29.9) 
        {	
            System.out.println("BMI in kilograms is: "+df.format(BMI));

        	System.out.println("Overweight");
        }
        else if (BMI >=30.0)
        {
            System.out.println("BMI in kilograms is: "+df.format(BMI));

        	System.out.println("Obese");
        }
    }
    
    
    //////////////////////////////////////////////////////////
    //menu
    public void menu()
    {
        System.out.println("1. Find individual BMI");
        System.out.println("2. Find group BMI");
        System.out.println("3. Exit");
    }
    /////////////////////////////////////////////////////////////
    //return kilograms
    public double returnKilo()
    {
    	return kilograms;
    }
    /////////////////////////////////////////////////////
    //return weight
    public double returnWeight() 
    {
    	return weight;
    }
    /////////////////////////////////////////////////////
    //return height
    public double returnHeight() 
    {
    	return height;
    }
    //////////////////////////////////////////////////////
    //return bmi
    public double returnBMI()
    {
    	return BMI;
    }
    ///////////////////////////////////////////////////////
    //return avg
    public double returnAVG() 
    {
    	return avg;
    }
    ///////////////////////////////////////////////////////
    //return total
    public double returnTotal() 
    {
    	return total;
    }
    public double[] returnArray() 
    {
    	return bmiArray;
    }
    
    
}


