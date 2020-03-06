abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFreuentRenterPoints(int dayRented) {
        return 1;
    }
}
