import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size matrix");
        byte size=scanner.nextByte();
        int matrix[][]=new int[size][size];
        for (byte i=0; i<size;i++){
            for (byte j=0; j<size;j++){
                System.out.println("enter element of Matrix id ["+i+"]["+j+"]");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Your Matrix");
        for (byte i=0; i<size;i++){
            for (byte j=0; j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        int sum1=0;
        for (byte i=0; i<size; i++){
            sum1+=matrix[i][i];
        }
        int sum2=0;
        for(byte i=0; i<size; i++){
            sum2+=matrix[i][size-1-i];
        }
        System.out.println("sum1: "+sum1);
        System.out.println("sum2: "+sum2);

    }
}
