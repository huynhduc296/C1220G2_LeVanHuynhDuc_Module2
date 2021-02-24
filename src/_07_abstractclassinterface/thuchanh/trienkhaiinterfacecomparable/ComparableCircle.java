package _07_abstractclassinterface.thuchanh.trienkhaiinterfacecomparable;


public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    private static final double radius =5 ;
    private static final String color ="blue" ;
    private static final boolean filled =true ;

    public ComparableCircle() {
        super(radius, color, filled);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}

