package _07_abstractclassinterface.baitap.Resizeable;


public class Test {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.resize(Math.random());
        Circle circle=new Circle();
        circle.resize(Math.random());
        Square square=new Square();
        square.resize(Math.random()*100);

    }
}
