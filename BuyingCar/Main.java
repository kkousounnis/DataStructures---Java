public class Main {

	public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingperMonth, double percentLossByMonth) {
    		int[] results = new int[2];
    		boolean b = true;
    		double monthCounter = 0;
    		double totalSavings = 0;
    
   		while(totalSavings < startPriceNew){      
     			monthCounter++;
      			totalSavings = totalSavings + savingperMonth + startPriceOld;
      			startPriceNew = startPriceNew - startPriceNew * (percentLossByMonth/100);
      			startPriceOld = startPriceOld - startPriceOld * (percentLossByMonth/100);    
      			if(monthCounter % 2 == 0 ){

        			percentLossByMonth = percentLossByMonth + 0.5;
      			}
    		};
    
    		results[0] = (int)monthCounter;
    		results[1] = (int)((totalSavings + startPriceOld) - startPriceNew);
    
		return (results);
	}
}
