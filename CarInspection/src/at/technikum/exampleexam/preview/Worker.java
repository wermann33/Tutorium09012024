package at.technikum.exampleexam.preview;

public abstract class Worker {
    public String name;
    public Worker(){
    };
    public Worker(String name){
        this.name = name;
    }
    abstract int getHourlyRate();
}
