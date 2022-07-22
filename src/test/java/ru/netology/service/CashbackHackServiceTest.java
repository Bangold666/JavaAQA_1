package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void ShouldReturnZero() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnHundred() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainOne() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemain1() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 999;

        int amount = 1;
        int actual = cashbackHackService.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}

