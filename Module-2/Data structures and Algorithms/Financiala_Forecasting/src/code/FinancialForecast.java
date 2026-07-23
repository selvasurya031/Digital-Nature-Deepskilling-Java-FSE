package code;

import java.util.Scanner;

public class FinancialForecast {


	    public static double forecast(double currentValue,double growthRate,int years) {


	        if(years == 0) {
	            return currentValue;
	        }

	        return forecast(
	                currentValue * (1 + growthRate),  growthRate,  years - 1
	        );
	    }

	    public static void main(String[] args) {
	    	Scanner s = new Scanner(System.in);
	    	
	    	System.out.print("Enter the Present Value :");
	        double presentValue = s.nextDouble();

	    	System.out.print("\nEnter the Grothe Rate :");
	        double growthRate = s.nextDouble();

	        System.out.print("\nEnter the Years :");
	        int years = s.nextInt();
	        System.out.println();

	        double futureValue =
	                forecast(presentValue, growthRate, years);

	        System.out.println(
	                "Future Value after " + years + " years = ₹"  + futureValue
	        );
	    }
	

}
