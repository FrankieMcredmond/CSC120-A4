public class Passenger {
    
     String name;

    public Passenger(String name) {
        this.name = name;
    }

    public  void Boardcar(Car c, Passenger p){
        if (c.addPassenger(p)==true){
            System.out.println("done");
        };
    }
    public void getOffCar(Car c, Passenger p){
        if (c.removePassenger(p)==true){
            System.out.println("done");

    }}
    public static void main(String[] args) {
        Car myCar= new Car (10);
        Passenger Sarah= new Passenger("sarah");
        Sarah.Boardcar(myCar, Sarah);
        Sarah.getOffCar(myCar,Sarah);}
}
