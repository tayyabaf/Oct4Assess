
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.PILOT;

        CrewMember crewMember1 = new CrewMember("Mahnoor", flightCrewJob1, 100000.0f);
        CrewMember crewMember2 = new CrewMember("Noor", flightCrewJob2, 90000.0f);
        CrewMember crewMember3 = new CrewMember("Aisha", flightCrewJob3, 70000.0f);

        PlaneTicket planeTicket = new PlaneTicket(4564, "London", "NYC", "39B", 100.0, true );
        BusTicket busTicket = new BusTicket(9807, "Wilmington", "Philadephia", "12A", 50.0);

        String [] luggage1 = {"blue suitcase", "green suitcase", "yellow suitcase"};
        String [] luggage2 = {"black suitcase", "orange suitcase"};
        Passenger passenger57 = new Passenger("Julia", planeTicket, 1000.0, luggage1);
        Passenger passenger07 = new Passenger("Sarah", busTicket, 800.0, luggage2);

        System.out.println(passenger57.getAmtOfLuggage());
        passenger07.printTicket();

        crewMember3.serve(passenger57);

        Payable [] payables = {crewMember1, crewMember2, crewMember3, planeTicket, busTicket};
        FlightApp.printAmountForEachThingThatIsPayable(payables);

        ArrayList <FlightCrewJob> flightCrewJobList = new ArrayList<>();
        flightCrewJobList.add(flightCrewJob3);
        flightCrewJobList.add(flightCrewJob1);
        flightCrewJobList.add(flightCrewJob2);

        System.out.println("============");
        FlightApp.printEachFlightCrewJob(flightCrewJobList);

        System.out.println("============");

        FlightApp.sortAndPrintFlightCrewJobsByTitle(flightCrewJobList);

        System.out.println("============");

        FlightApp.printAllJobsExceptThisCrewMemberJob(flightCrewJobList, crewMember3);






    }
}
