package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger lasha = new Passenger("Lasha", true);
        Passenger miranda = new Passenger("Miranda", false);
        Passenger akaki = new Passenger("Akaki", true);

        Train train = new Train();
        train.addPassenger(lasha);
        train.addPassenger(miranda);
        train.addPassenger(akaki);

        for (Passenger passenger: train.getPassengerList())
            System.out.println(passenger.getName());
    }
}
