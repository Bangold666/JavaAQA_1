package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

 public class CashbackHackServiceTest {

    @Test
    void ShouldReturnZero() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturnHundred() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

}

