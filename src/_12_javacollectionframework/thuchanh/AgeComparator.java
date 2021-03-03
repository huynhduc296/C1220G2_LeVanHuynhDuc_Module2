package _12_javacollectionframework.thuchanh;

import java.util.Comparator;

public class AgeComparator implements Comparator<Studen>{

    @Override
    public int compare(Studen o1, Studen o2) {
        return o1.getAge()-o2.getAge();
    }
}