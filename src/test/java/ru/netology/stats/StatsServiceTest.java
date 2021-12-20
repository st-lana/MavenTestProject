package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

//    Автотест метода, считающего сумму всех продаж
    @Test
     public void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] allSails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(allSails);
         assertEquals(expected, actual);

    }
//    Автотест метода, возвращающего среднюю сумму месячных продаж

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] avgSails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(avgSails);
        assertEquals(expected, actual);

    }
// Автотест метода, возвращающего последний месяц с пиком продаж
    @Test
    public void shouldCalculateNumMonthMax() {
        StatsService service = new StatsService();
        int[] lastMonthMaxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        assertEquals(8, service.calculateNumMonthMax(lastMonthMaxSales));

    }

//    Автотест, возвращающий номер месяца, в котором был минимум продаж

    @Test
    public void shouldCalculateNumMonthMin() {
        StatsService service = new StatsService();
        int[] minMonthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateNumMonthMin(minMonthSales);

        assertEquals(expected, actual);

    }
// Автотест метода, возвращающего количество месяцев, в которых продажи меньше среднемесячной

    @Test
    public void shouldcountMonthsWithSalesUnderAvg() {
        StatsService service = new StatsService();
        int[] monthsWithSalesUnderAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsWithSalesUnderAvg(monthsWithSalesUnderAvg);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldCountMonthsWithSalesOverAvg() {
        StatsService service = new StatsService();
        int[] monthsWithSalesOverAvg = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsWithSalesOverAvg(monthsWithSalesOverAvg);

        assertEquals(expected, actual);

    }

}


