package _05_accessmodifier_staticmethod_staticproperty.thuchanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactiv 3");
        System.out.println(car1.numOfCars);
        Car car2=new Car("Mazda 6","Skyactiv 6");
        System.out.println(car2.numOfCars);
    }
}
