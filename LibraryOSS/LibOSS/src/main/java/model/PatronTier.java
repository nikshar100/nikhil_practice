package model;

public enum PatronTier {
    STANDARD(5, 0.25, 14),
    PREMIUM(7, 0.25, 28),
    STUDENT(10, 0.10, 14);

    private final int maxCheckouts;
    private final double fineByDay;
    private final int checkoutTerm;

    PatronTier(int maxCheckouts, double fineByDay, int checkoutTerm) {
        this.maxCheckouts = maxCheckouts;
        this.fineByDay = fineByDay;
        this.checkoutTerm = checkoutTerm;
    }

    public int getMaxCheckouts() {
        return maxCheckouts;
    }

    public double getFineByDay() {
        return fineByDay;
    }

    public int getCheckoutTerm() {
        return checkoutTerm;
    }
}
