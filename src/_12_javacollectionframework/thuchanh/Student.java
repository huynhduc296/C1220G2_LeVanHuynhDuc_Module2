package _12_javacollectionframework.thuchanh;

public class Student {
    private String name;
    private int age;
    private String address;
    public Student(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String address){
        super();
        this.name=name;
        this.address=address;
        this.age=age;
    }
    @Override
   public String toString() {
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}