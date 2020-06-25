public class Boat extends Vehicle {

    public Boat(String brand) {
        super(brand);
    }
    
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + ", j'ai " + this.getKilometers() + " heures au compteur et je fais glou glou !";
    }
    
}
