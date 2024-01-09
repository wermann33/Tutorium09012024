package at.technikum.exampleexam.preview;

public class JuniorWorker extends Worker{
    JuniorWorker(String name){
        super.name = name;
    }
    int getHourlyRate(){
        return 20;
    }

    @Override
    public String toString(){
        return "Junior (" + name + ")";
    }
}
