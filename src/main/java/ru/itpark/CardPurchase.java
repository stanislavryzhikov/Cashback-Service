package ru.itpark;

public class CardPurchase {
    public double calculateCashback(double purchaseAmount, int purchaseType) {

        int cashbackRatio = 0;
        int ordinaryPurchaseRatio = 1;
        int increasedCashbackRatio = 5;
        int specialOfferRatio = 30;

        if (purchaseType == 1) {
            cashbackRatio = ordinaryPurchaseRatio;
        } else if (purchaseType == 2) {
            cashbackRatio = increasedCashbackRatio;
        } else if (purchaseType == 3) {
            cashbackRatio = specialOfferRatio;
        }
        double result = purchaseAmount / 100 * cashbackRatio;
        if (result > 3_000){
            result = 3_000;
        }
        return result;
    }
}
