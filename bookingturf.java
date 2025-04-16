class Turf {
    String name;
    String location;
    boolean isAvailable;

    public Turf(String name, String location) {
        this.name = name;
        this.location = location;
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("Turf Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Booked"));
    }

    public void bookTurf() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Turf booked successfully.");
        } else {
            System.out.println("Turf is already booked.");
        }
    }
}
class User {
    String username;
    String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void book(Turf turf) {
        System.out.println(username + " is trying to book the turf.");
        turf.bookTurf();
    }
}

public class Main {
    public static void main(String[] args) {
        Turf turf1 = new Turf("Green Field", "salem");
        User user1 = new User("Dhabu", "john@gmail.com");

        turf1.displayInfo();
        user1.book(turf1);
        turf1.displayInfo();
    }
}
