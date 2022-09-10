/**
 * Name:		Justin Chandler
 * Date:		08/17/22
 * File:		StockPickerApp.java
 * Description:	For helping investors select stocks back on certain criteria
 */


import java.util.Scanner;
    

public class StockPickerApp 
{

	
    public static void main(String args[])
    {
    	/*
    	 	Variables defined
    	*/
    	String ticker = "";
        double moneyToInvest = 0;
        double stockPrice = 0;
        double peRatio = 0;
        
      
        
		
		
        
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Welcome to the Stock Picker App!");
			System.out.println();
			
			
			int x = 9;

	        System.out.print(x);
	        do 

	        { 

	              System.out.print(x); 

	              x -= 2;

	        }

	        while (x > 0);
			
			/*
				Initial investment Input
			 */
			System.out.print("Enter the total amount of money you are willing to invest: $");
			moneyToInvest = input.nextDouble();
			
			/*
				Sends ticker for validation to confirm string length is under 5 With the exception of the string "ABCDEF"
			 */
			boolean validStockTicker = false;
			while(!validStockTicker) 
			{
				System.out.print("Enter the stock ticker: ");
			    ticker = input.next();          
				validStockTicker = StockPickerApp.validateTicker(ticker);
				
			}
        
			/*
				Sends price for validation to confirm price is at least $0.01 
			 */
			boolean validPrice = false;
			while(!validPrice) 
			{
				System.out.print("Enter the Price: ");
			    stockPrice = input.nextDouble();          
				validPrice = StockPickerApp.validatePrice(stockPrice);
				
			}
			
			
			
			System.out.print("Enter thee P/E Ratio: ");
			peRatio = input.nextDouble();
		}
        
        
        System.out.println();
        
        /*
        	Results begin to display
         */
                
        System.out.println("Below are your results: ");
        
        System.out.println();
        
        System.out.print("Stock: ");
        System.out.println(ticker);
        
        System.out.print("Price: $");
        System.out.println(stockPrice);
        
        System.out.print("P/E Ratio: ");
        System.out.println(peRatio);
        
        /*
    		Warning if peRatio is above 60
         */
        
        if (peRatio > 60)
        {
        	System.out.println ("WARNING: This company may be overvalued!");
        }

        
        System.out.print("# of shares able to purchase: ");
        System.out.println((int)(moneyToInvest / stockPrice));
        
        
    }
    
    /*
		Returns true if ticker contains "ABCDEF" or ticker.length is no more than 5
     */
    
    public static boolean validateTicker(String ticker) 
    {
    	if(ticker.equals("ABCDEF"))
    	{
    		return true;
    	}
    	else if (ticker.length() > 5)
        {
        	System.out.println("Invalid input. Try again.");
        
        	return false;
        }
    	
    	return true;
    }
    
    /*
     * Returns true only if stockPrice has a value of 0.01 or higher
     */
    
    public static boolean validatePrice(double stockPrice)
    {
        
        if (stockPrice < 0.01)
        {
        	System.out.println("Invalid input. Try again.");
        
        	return false;
        }
    	
    	return true;
    }
    
    
    
}