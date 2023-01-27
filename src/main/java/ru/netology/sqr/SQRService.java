package ru.netology.sqr;

public class SQRService {


    public int enumerationAndScore (int min, int max) {        // метод
        int counter = 0;
        for (int i = 10; i <=99; i ++) {                       //перебираемый диапазон числа
            int iSquare = i * i;                                //квадрат перебираемого числа
            if (iSquare >= min) {
                if (iSquare <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }

}