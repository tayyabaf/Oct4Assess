public class Passenger extends Person{
    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;

    public Passenger(String name, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public int getAmtOfLuggage(){
        return luggage.length;
    }

    public void printTicket(){
        System.out.println(ticket);
    }
}
