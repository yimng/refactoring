public class HtmlStatement extends Statement {
    @Override
    public String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H><P>\n";
    }

    @Override
    public String eachRentalString(Rental rental) {
        return rental.getMovie().getTitile() + ": "
                + String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    @Override
    public String footerString(Customer customer) {
        return "<P> Yow owe <EM>" + String.valueOf(customer.getTotalCharge())
                + "</EM><P>" + "On this rental you earned <EM>"
                + String.valueOf(customer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
    }
}
