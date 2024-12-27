public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing t1 = new Thing("Get milk");
        Thing t2 = new Thing("Remove the obstacles");
        Thing t3 = new Thing("Stand up");
        Thing t4 = new Thing("Eat lunch");
        t3.complete();
        t4.complete();
        fleet.add(t1);
        fleet.add(t2);
        fleet.add(t3);
        fleet.add(t4);
        System.out.println(fleet);
    }
}