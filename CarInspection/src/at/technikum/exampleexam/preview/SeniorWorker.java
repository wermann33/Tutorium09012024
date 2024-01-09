package at.technikum.exampleexam.preview;

public class SeniorWorker extends Worker{
    SeniorWorker(String name){
        super.name = name;
    }
    int getHourlyRate(){
        return 50;
    }

    @Override
    public String toString(){
        return "Senior (" + name + ")";
    }
}
