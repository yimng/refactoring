import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = headerString(customer);
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            result += eachRentalString(rental);
        }
        result += footerString(customer);
        return result;
    }

    public abstract String headerString(Customer customer);

    public abstract String eachRentalString(Rental rental);

    public abstract String footerString(Customer customer);
}
