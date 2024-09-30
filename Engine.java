public class Engine {
    FuelType powerType;
    double current_fuel;
    double max_fuel;


    public Engine(FuelType powerType, double max_fuel ){
        this.powerType=powerType;
        this.current_fuel= 100.0;
        this.max_fuel= max_fuel;
    }
    public void refuel(double current_fuel, double max_fuel){
        current_fuel=max_fuel;
    }
    public boolean go(){
        current_fuel-=5;
        if (current_fuel>0){
            return true;}
        else {
            return false;}
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");}
}