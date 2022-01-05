public class BuyCar {
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    	int[] r = new int[2];
    	boolean b = true;
    	int monthCounter = 0;
    	int totalSavings = startPriceNew;
    	while(totalSavings < startPriceNew){
      		monthCounter++;
      		totalSavings = totalSavings+ savingperMonth;
    		};
	return null;
	}
}
