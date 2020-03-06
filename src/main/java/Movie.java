public class Movie {
    public static final int CHILEDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    private String titile;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.titile = title;
        this.priceCode = priceCode;

    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (this.getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILEDRENS:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;

                }
                break;

        }
        return result;
    }

    public int getFreuentRenterPoints(int dayRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && dayRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }

}
