package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }
    //2-й метод

    public int calculateAverage(int[] sales) {
        int avg = calculateSum(sales) / sales.length;

        return avg;
    }
    // 3-й метод

    public int calculateNumMonthMax(int[] sales) {
        int maxSales = sales[0];
        for (int sale : sales) {
            if (maxSales < sale) {
                maxSales = sale;
            }
        }
        int countMonthMax = 0;
        int monthWithMaxSales = 0;
        for (int sale : sales) {
            countMonthMax++;
            if (sale == maxSales) {
                monthWithMaxSales = countMonthMax;
            }


        }
        return monthWithMaxSales;
    }

//    4-й метод

    public int calculateNumMonthMin(int[] sales) {
        int minSales = sales[0];
        for (int sale : sales) {
            if (minSales >= sale) {
                minSales = sale;
            }
        }
        int countMonthMin = 0;
        int monthWithMinSales = 0;
        for (int sale : sales) {
            countMonthMin++;
            if (sale == minSales) {
                monthWithMinSales = countMonthMin;
            }


        }
        return monthWithMinSales;
    }
// 5-й метод

    public int countMonthsWithSalesUnderAvg(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        int countMonthsUnderAvg = 0;
        for (int sale : sales) {
            if (sale < avg) {
                countMonthsUnderAvg++;
            }

        }

        return countMonthsUnderAvg;
    }

// 6-й метод

    public int countMonthsWithSalesOverAvg(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        int countMonthsOverAvg = 0;
        for (int sale : sales) {
            if (sale > avg) {
                countMonthsOverAvg++;
            }

        }

        return countMonthsOverAvg;
    }





}



