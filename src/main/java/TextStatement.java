public class TextStatement extends Statement {
    @Override
    public String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitile() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    public String footerString(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" + "You earned " +
                String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }


}
