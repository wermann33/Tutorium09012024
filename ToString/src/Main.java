class Student{
    int id;
    String firstName;
    String lastName;
    String city;

    Student(int id, String firstName, String lastName, String city){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
    }

    @Override
    public String toString(){
        return id + ", " + firstName + ", " + lastName + ", " + city;
    }
}

class Main
{
    public static void main(String[] args){
        Student s1=new Student(101,"Max", "Mustermann", "Wien");
        Student s2=new Student(102,"Erika", "Müller", "Graz");

        System.out.println(s1);
        System.out.println(s2);
    }
}