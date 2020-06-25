public class Hangar {

     public static void main(String[] args) {

        Boat arcoa = new Boat("Arcoa");
        Car corvette = new Car("Corvette");

        arcoa.setKilometers(5269);
        corvette.setKilometers(35903);
        System.out.println(corvette.doStuff());
        System.out.println(arcoa.doStuff());
    }
}
