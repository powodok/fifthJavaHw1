package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;

        for (int i = 1; i <= 12; i++) {
            if (balance < threshold) { // нужно работать
                balance += income - expenses;
            } else { // можно отдыхать
                vacationMonths++;
                balance -= expenses;
                balance -= balance / 3; // расходы на отдых
            }
        }

        return vacationMonths;
    }
}
