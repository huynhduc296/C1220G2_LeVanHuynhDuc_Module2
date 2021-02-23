package _06_kethua.baitap.PointendMoveablePoint;

public class Testpoint {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint(0,0,3,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
