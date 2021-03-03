package _12_javacollectionframework.baitap;

import java.util.Comparator;

public class SortCostProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCost()-o2.getCost();
    }
}
