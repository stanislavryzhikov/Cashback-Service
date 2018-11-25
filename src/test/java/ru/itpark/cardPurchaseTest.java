package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cardPurchaseTest {
    @Test
    void calculateCashback(){
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(0, 1);
            assertEquals(0, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(0, 2);
            assertEquals(0, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(0, 3);
            assertEquals(0, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000, 1);
            assertEquals(10, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000, 2);
            assertEquals(50, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000, 3);
            assertEquals(300, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000000, 1);
            assertEquals(3000, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000000, 2);
            assertEquals(3000, cashback);
        }
        {
            cardPurchase service = new cardPurchase();
            double cashback = service.calculateCashback(1000000, 3);
            assertEquals(3000, cashback);
        }
    }

}