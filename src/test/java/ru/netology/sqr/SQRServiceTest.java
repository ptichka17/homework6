package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void testSQRService() {
        SQRService service = new SQRService();

        int actual = service.enumerationAndScore(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test0SQRService() {
        SQRService service = new SQRService();

        int actual = service.enumerationAndScore(20, 80);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}