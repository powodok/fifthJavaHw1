package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationServiceTest {
    @Test
    void calculateVacationMonthsTest() {
        VacationService vacationService = new VacationService();
        assertEquals(4, vacationService.calculateVacationMonths(10000, 3000, 20000));
        assertEquals(12, vacationService.calculateVacationMonths(100000, 0, 0));
    }
    @Test
    void calculateVacationMonthTest2() {
        VacationService vacationService = new VacationService();
        assertEquals(3, vacationService.calculateVacationMonths(100000, 60000, 150000));
    }

    @Test
    void calculateVacationMonthTest3() {
        VacationService vacationService = new VacationService();
        assertEquals(0, vacationService.calculateVacationMonths(1000, 3000, 20000));
    }

    @Test
    void calculateVacationMonthTest4() {
        VacationService vacationService = new VacationService();
        assertEquals(12, vacationService.calculateVacationMonths(100000, 0, 0));
    }
}
