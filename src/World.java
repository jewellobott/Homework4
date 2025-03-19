package World;// world dimensions: 2500*2000 - 3.10.2025
// world dimensions: changed to 800*1200*400 - 3.11.2025
// skeleton code copied from PracticeRPG - 3.11.2025
// setting up directions for travel - 3.17.2025
// scrap everything and rewrite - 3.18.2025
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class World {
    static class Location {
        int id;
        String title;
        String info;
        public Location(int id, String title, String info) {
            this.id = id;
            this.title = title;
            this.info = info;
        }
    }
    public static void main(String[] args) {
        String name, locationchoice;
        float task;

        List<Location> locations = new ArrayList<>();
        locations.add(new Location(1, "Field", "Cold, dark, full of foxes and corn"));
        locations.add(new Location(2, "Front Door", "Tall stone, surrounded by bushes and ghosts"));
        locations.add(new Location(3, "Castle", "A Black shadow against the night sky"));
        locations.add(new Location(4, "Village", "Where is everyone?"));
        locations.add(new Location(5, "Throne Room", "It should be here..."));
        locations.add(new Location(6, "Town Square", "Seriously, where is everyone??"));

        System.out.println("Welcome, Challenger! I've been waiting for you.");

        System.out.println("\n Map");
        for (Location location: locations) {
            System.out.printf("%d: %s \n %f\n", location.id, location.title, location.info);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("\n %s! What a pleasure. Where do you wish to start our little game?");
        int locationId = scanner.nextInt();
        Location selectedLocation = null;
        for (Location location : locations) {
            if (location.id == locationId) {
                selectedLocation = location;
                break;
            }
        }
        scanner.nextLine();

        if (selectedLocation == null) {
            System.out.println("Hahahaha! Trying to leave the map, are you? It's too late for that.");
            return;
        }
        if (selectedLocation.id > 4) {
            System.out.println("Aah! Straight into the fire I see. Good luck.");
        }
        System.out.println("Interesting choice. Well, %s, let us begin. See you soon.");
        return;
    }
}