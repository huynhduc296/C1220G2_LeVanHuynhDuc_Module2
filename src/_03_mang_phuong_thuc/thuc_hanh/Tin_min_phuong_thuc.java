package _03_mang_phuong_thuc.thuc_hanh;

public class Tin_min_phuong_thuc {
    public static int minValue(int[] array){
        int index=0;
        int min=array[0];
        for (int j=0;j<array.length;j++){
            if(array[j]<min){
                min=array[j];
                index=j;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("vị trí phẩn tủ nhở nhất: " +index);

    }
}
