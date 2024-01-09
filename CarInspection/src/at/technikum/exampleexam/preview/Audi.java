package at.technikum.exampleexam.preview;

public class Audi extends Car{
    Audi(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " / " + year;
    }
}
