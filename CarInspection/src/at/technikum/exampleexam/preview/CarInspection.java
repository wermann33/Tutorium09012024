package at.technikum.exampleexam.preview;

public class CarInspection implements Job{
    Car car;
    CarInspection(Car car){
        this.car = car;
    }
    @Override
    public int getMinNumberOfWorkers() {
        return 2;
    }
    // A car inspections costs 200 if the car was build
    // before the year 2000 and 150 if the car was build
    // beginning from the year 2000
    public int getBasePrice(){
        if (car.year < 2000) return 200;
        else return 150;
    }
    @Override
    public int getHours() {
        return 10;
    }
}
