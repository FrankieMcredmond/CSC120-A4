import java.util.ArrayList;
public class Car {
    int max_capacity;
    ArrayList<Passenger> manifest;

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
            if (manifest.contains(p)){
                return true;}
            else{
                return false;}}
        else{
            return false;}  }

    public boolean removePassenger(String){
        if (manifest.contains(string)){
            manifest.remove(string);
            return true;}
        else{
            return false;}}
    public void printmanifest(){
        if (manifest.size()==0){
            System.out.println("sorry Car is empty");}
        else{
            for (int i = 0; i < max_capacity; i++){
            System.out.println(manifest.get(i));}}}
    public static void main(){
        Car myCar= new Car(10);
        myCar.addPassenger("Sarah");

    }
    
}