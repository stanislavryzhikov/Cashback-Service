package ru.itpark;

public class cardPurchase {
    public double calculateCashback(double purchaseAmount, int purchaseType) {
        double result = 0;
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
        result = purchaseAmount / 100 * cashbackRatio;
        if (result > 3000){
            result = 3000;
        }
        return result;
    }
}
