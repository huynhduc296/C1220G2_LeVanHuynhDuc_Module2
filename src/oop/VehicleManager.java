package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    private String nameVehicle;
    private double cylinderCapacity;
    private double pricesOfVehicle;
    public static List<VehicleManager> listVehicle = new ArrayList<>();

    public VehicleManager() {
    }

    public VehicleManager(String nameVehicle, double cylinderCapacity, double pricesOfVehicle) {
        this.nameVehicle = nameVehicle;
        this.cylinderCapacity = cylinderCapacity;
        this.pricesOfVehicle = pricesOfVehicle;
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getPricesOfVehicle() {
        return pricesOfVehicle;
    }

    public void setPricesOfVehicle(double pricesOfVehicle) {
        this.pricesOfVehicle = pricesOfVehicle;
    }

    public double registrationFee() {
        if (this.cylinderCapacity < 100) {
            return this.pricesOfVehicle / 100;
        } else if (this.cylinderCapacity > 100 && this.cylinderCapacity < 200) {
            return this.pricesOfVehicle * 3 / 100;
        } else
            return this.pricesOfVehicle * 5 / 100;
    }

    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin của xe" +
                "\n-------------" +
                "\n tên xe ");
        String nameVehicle = scanner.nextLine();
        System.out.println("Dung tích xylanh (Đơnvi: cc) ");
        double cylinderCapacity = scanner.nextDouble();
        System.out.println("Gía tri của xe(Đơn vi: $) ");
        double pricesOfVehicle = scanner.nextDouble();
        listVehicle.add(new VehicleManager(nameVehicle, cylinderCapacity, pricesOfVehicle));
        System.out.println("Nhập thành công!");
    }
    public void showList(){
        for (VehicleManager vehicleManager:listVehicle){
            System.out.println("Tên: "+vehicleManager.getNameVehicle()+"---xylanh: "+vehicleManager.getCylinderCapacity()+
                    "---Gía xe: "+vehicleManager.getPricesOfVehicle()+"--- thuế: "+vehicleManager.registrationFee());
        }
    }
    public void disPlay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Nhập thông tin xe" +
                "\n2.Tiền thuế của xe" +
                "\n3. Thoat");
        byte choice = scanner.nextByte();
        switch (choice) {
            case 1:
                addNew();
                System.out.println("1. quay lại menu" +
                        "\n2.thoát");
                byte choiceCase1 = scanner.nextByte();
                switch (choiceCase1) {
                    case 1:
                        disPlay();
                        break;
                    case 2:
                        break;
                    default:
                }
                break;
            case 2:
                showList();
                System.out.println("1. quay lại menu" +
                        "\n2.thoát");
                byte choiceCase2 = scanner.nextByte();
                switch (choiceCase2) {
                    case 1:
                        disPlay();
                        break;
                    case 2:
                        break;
                    default:
                }
                break;
            case 3:
                break;
            default:
        }

    }

    }


