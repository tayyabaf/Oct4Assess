import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> listOfJobs){
        for (FlightCrewJob x : listOfJobs){
            System.out.println(x);
        }
    }

    public static void printAmountForEachThingThatIsPayable(Payable[] payableItems){
        for (int i = 0; i < payableItems.length; i++){
            payableItems[i].printPaymentAmount();
        }
    }

    public static void sortAndPrintFlightCrewJobsByTitle(ArrayList<FlightCrewJob> listOfJobs){
        Comparator jobsComparator = new FlightCrewJobsComparator();
        Collections.sort(listOfJobs, jobsComparator);
        System.out.println(listOfJobs);
    }

    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> listOfJobs, CrewMember crew){
        for (FlightCrewJob x : listOfJobs){
            if (crew.getJob() != x) {
                System.out.println(x);
            }
        }
    }
}
