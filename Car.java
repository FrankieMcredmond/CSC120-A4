import java.util.ArrayList;
public class Car {
    int max_capacity;
    ArrayList<String> manifest;

    public Car(int max_capacity){
        this.max_capacity=max_capacity;
        this.manifest= new ArrayList<String>(max_capacity);
    }
    public int getCapacity(){
        return manifest.size();
    }
    public int seatsRemaining(){
        return max_capacity-getCapacity();
    }
    public boolean addPassenger(Passenger p){
        if (max_capacity-getCapacity()>0){
            manifest.add(p.name);
            if (manifest.contains(p.name)){
                return true;}
            else{
                return false;}}
        else{
            return false;}  }

    public boolean removePassenger(Passenger p){
        if (manifest.contains(p.name)){
            manifest.remove(p.name);
            return true;}
        else{
            return false;}}

    public void printmanifest(){
        if (manifest.size()==0){
            System.out.println("sorry Car is empty");}
        else{
            for (int i = 0; i < getCapacity(); i++){
            System.out.println(manifest.get(i));}}}

     public static void main(String[] args) {
        Car myCar= new Car(10);
        Passenger Sarah= new Passenger("sarah");
        Passenger Ryan= new Passenger("Ryan");
        Passenger Ange= new Passenger("Ange");
        Passenger Alex= new Passenger("Alex");
        myCar.addPassenger(Sarah);
        myCar.addPassenger(Ryan);
        myCar.addPassenger(Ange);
        myCar.addPassenger(Alex);
        myCar.printmanifest();
        myCar.removePassenger(Alex);
        myCar.printmanifest();
        }
}