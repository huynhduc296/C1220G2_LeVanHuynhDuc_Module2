package _12_javacollectionframework.thuchanh;

public class Studen implements Comparable<Studen>  {
    private String name;
    private int age;
    private String address;
    public Studen(String name,int age,String address){
        this.age=age;
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Studen studen) {
        return this.getName().compareTo(studen.getName());
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +age+
                '}';
    }
}
