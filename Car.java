public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + ", j'ai " + this.getKilometers() + " Kilometres au compteur et je fais vroum vroum !";
    }

}
