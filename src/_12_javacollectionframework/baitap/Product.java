package _12_javacollectionframework.baitap;

public class Product {
    private int id;
    private String nameOfProduct;
    private int cost;

    public Product(int id,String nameOfProduct,int cost){
        this.cost=cost;
        this.id=id;
        this.nameOfProduct=nameOfProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", cost=" + cost +
                '}';
    }
}
