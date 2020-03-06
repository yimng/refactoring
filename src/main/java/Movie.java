public class Movie {
    public static final int CHILEDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String titile;
    private Price price;

    public Movie(String title, int priceCode) {
        this.titile = title;
        this.setPriceCode(priceCode);

    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILEDRENS:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }


    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFreuentRenterPoints(int dayRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && dayRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }

}
