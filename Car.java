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
            manifest.add(p);
            if manifest.contain(p){return true
        }
    }
}