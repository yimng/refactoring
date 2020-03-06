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

}
