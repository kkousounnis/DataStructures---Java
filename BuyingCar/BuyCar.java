
public class BuyCar {

    public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingperMonth, double percentLossByMonth) {

        int[] results = new int[2];
        boolean b = true;
        double monthCounter = 0;
        double totalSavings = startPriceOld;

        while (totalSavings < startPriceNew) {

            monthCounter++;

            if (monthCounter % 2 == 0) {
                percentLossByMonth = percentLossByMonth + 0.5;
            }

            totalSavings = totalSavings + savingperMonth - (startPriceOld * (percentLossByMonth / 100));
            startPriceNew = startPriceNew - startPriceNew * (percentLossByMonth / 100);
            startPriceOld = startPriceOld - startPriceOld * (percentLossByMonth / 100);

        };

        results[0] = (int) monthCounter;
        if ((int) (totalSavings - startPriceNew) <= totalSavings - startPriceNew) {
            results[1] = (int) (Math.round(totalSavings - startPriceNew));
        }

        return (results);
    }
}
