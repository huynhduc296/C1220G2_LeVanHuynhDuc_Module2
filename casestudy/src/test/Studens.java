package test;

public class Studens {
    private String id;
    private String name;
    private String age;

    public Studens(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Studens(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studens{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public String showinfor(){
        return this.id+" "+this.age+" "+this.name;

    }
}