package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

 public class CashbackHackServiceTest {

    @Test
    void ShouldViewIssueTest() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 1000;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void ShouldBeOkay() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

     @Test
     public void JustForInterest() {
         CashbackHackService service = new CashbackHackService();
         int expected = 500;
         int amount = 1500;
         int actual = service.remain(amount);

         assertEquals(expected,actual);
     }


}

