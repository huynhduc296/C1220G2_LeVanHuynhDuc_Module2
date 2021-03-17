package controllers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import file.FileUtils;
import models.House;
import models.Room;
import models.Villa;

import javax.xml.bind.ValidationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
        List<House> listHouses = new ArrayList<>();
        List<Room> listRooms = new ArrayList<>();
        List<Villa> listVillas = new ArrayList<>();

    public List<House> getListHouses() {
        return listHouses;
    }

    public void setListHouses(List<House> listHouses) {
        this.listHouses = listHouses;
    }

    public List<Room> getListRooms() {
        return listRooms;
    }

    public void setListRooms(List<Room> listRooms) {
        this.listRooms = listRooms;
    }

    public List<Villa> getListVillas() {
        return listVillas;
    }

    public void setListVillas(List<Villa> listVillas) {
        this.listVillas = listVillas;
    }

    public void displayMainMenu() {
            boolean check = true;
            while (check) {
                System.out.println("Chọn :\n" +
                        "1.Thêm dịch vụ mới \n" +
                        "2.Hiển thị dịch vụ\n" +
                        "3.Thêm khách hàng mới \n" +
                        "4.Hiển thị thông tin của khách hàng \n" +
                        "5.Thêm đặt chỗ mới\n" +
                        "6.Hiển thị thông tin của nhân viên \n" +
                        "7.Thoát \n"
                );
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập lựa chọn nếu bạn muốn");
                String choice = scanner.nextLine();
                try {
                    validateError(7,Integer.parseInt(choice));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                switch (choice) {
                    case "1":
                        addNewServies();
                        break;
                    case "2":
                        showServices();
                        break;
                    case "3":

                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "6":
                        break;
                    case "7":
                        check = false;
                        break;
                    default:
                        break;
                }
            }
        }

    public void addNewServies () {
            boolean check = true;
            while (check) {
                System.out.println("Chọn :\n" +
                        "1.Thêm Villa mới \n" +
                        "2.Thêm Houses mới\n" +
                        "3.Thêm Room mới \n" +
                        "4.Quay lại Menu \n" +
                        "5.Thoát \n"
                );
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập lựa chọn nếu bạn muốn");

                String choice1 = scanner.nextLine();
                try {
                    validateError(5,Integer.parseInt(choice1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                switch (choice1) {
                    case "1":
                        addVilla();
                        break;
                    case "2":
                        addHouse();
                        break;
                    case "3":
                        addRoom();
                        break;
                    case "4":
                        displayMainMenu();
                        break;
                    case "5":
                        check=false;
                        break;
                    default:
                        break;
                }
            }
        }
        public void  validateError(int numOfChoose, int numIn)throws ValidationException{
            if(numIn<=0||numIn>numOfChoose){
                throw new ValidationException("có các lựa chọn từ 1 đến"+numOfChoose);
            }
        }
        public boolean CheckChoose(String choose,int numOfChoose){
        try {
            validateError(numOfChoose,Integer.parseInt(choose));
            return true;
        }catch (ValidationException m){
            System.out.println(m+"\n----"+"hãy nhập lại");
            return false;
        }catch (Exception e){
            System.out.println("Lỗi nhập"+
                    "hãy nhập lại");
            return false;
        }
        }


    public void addVilla(){
            System.out.println("Nhập thông tin");

            Scanner scanner=new Scanner(System.in);
            Villa villa=new Villa();
            System.out.println("Nhập id");
            String id =scanner.nextLine();
            villa.setId(id);
            System.out.println("nhập tên dịch vụ");
            String ServiceName=scanner.nextLine();
            villa.setServiceName(ServiceName);
            System.out.println("Tiêu chuẩn phòng");
            String standard=scanner.nextLine();
            villa.setStandardRoom(standard);
            System.out.println("Tiện nghi khác");
            String otherAmenities=scanner.nextLine();
            villa.setOtherAmenities(otherAmenities);
            System.out.println("Diện tích hồ bơi");
            int acreagePool=scanner.nextInt();
            villa.setAcreagePool(acreagePool);
            System.out.println("Số tầng");
            int floors=scanner.nextInt();
            villa.setFloors(floors);
            listVillas.add(villa);
            String line=id+","+ServiceName+","+standard+","+otherAmenities+","+acreagePool+","+floors;
        FileUtils.writeFile("D:\\casestudy\\src\\file\\villa.csv",line);
        }
    public void addHouse (){
        System.out.println("Nhập thông tin");

        Scanner scanner=new Scanner(System.in);
        House house=new House();
        System.out.println("Nhập id");
        String id =scanner.nextLine();
        house.setId(id);
        System.out.println("nhập tên dịch vụ");
        String ServiceName=scanner.nextLine();
        house.setServiceName(ServiceName);
        System.out.println("Tiêu chuẩn phòng");
        String standard=scanner.nextLine();
        house.setStandardRoom(standard);
        System.out.println("Tiện nghi khác");
        String otherAmenities=scanner.nextLine();
        house.setOtherAmenities(otherAmenities);
        System.out.println("Số tầng");
        int floors=scanner.nextInt();
        house.setFloors(floors);
        listHouses.add(house);
        String line=id+","+ServiceName+","+standard+","+otherAmenities+","+floors;
        FileUtils.writeFile("D:\\casestudy\\src\\file\\house.csv",line);
    }
    public void addRoom (){
        System.out.println("Nhập thông tin");

        Scanner scanner=new Scanner(System.in);
        Room room=new Room();
        System.out.println("Nhập id");
        String id =scanner.nextLine();
        room.setId(id);
        System.out.println("nhập tên dịch vụ");
        String ServiceName=scanner.nextLine();
        room.setServiceName(ServiceName);
        System.out.println("Dịch vụ miễn phí");
        String freeService=scanner.nextLine();
        room.setFreeService(freeService);
        listRooms.add(room);
        String line=id+","+ServiceName+","+freeService;
        FileUtils.writeFile("D:\\casestudy\\src\\file\\room.csv",line);
    }
    public void showVilla() {
        List<String> listLine = FileUtils.readerFile("D:\\casestudy\\src\\file\\villa.csv");
        List<Villa> villaList = new ArrayList<>();
        for (String s : listLine) {
            String[] lineSplit = s.split(",");
            Villa villa = new Villa(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), Integer.parseInt(lineSplit[5]));
            villaList.add(villa);
        }
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println(villaList.get(i).showInfor());
        }
    }
        public  void showHouse() {
            List<String> listLine1 = FileUtils.readerFile("D:\\casestudy\\src\\file\\villa.csv");
            List<House> houseList = new ArrayList<>();
            for (String s : listLine1) {
                String[] lineSplit = s.split(",");
                House house = new House(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]));
                houseList.add(house);
            }
            for (int i = 0; i < houseList.size(); i++) {
                System.out.println(houseList.get(i).showInfor());
            }
        }
    public  void showRoom() {
        List<String> listLine1 = FileUtils.readerFile("D:\\casestudy\\src\\file\\villa.csv");
        List<Room> roomList = new ArrayList<>();
        for (String s : listLine1) {
            String[] lineSplit = s.split(",");
            Room room = new Room(lineSplit[0], lineSplit[1], lineSplit[2]);
            roomList.add(room);
        }
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i).showInfor());
        }
    }
    public void showServices(){
        boolean check = true;
        while (check) {
            System.out.println("Chọn :\n" +
                    "1.Hiện thị tất cả Villa \n" +
                    "2.Hiển thị tất cả House\n" +
                    "3.Hiển thị tất cả Room\n" +
                    "4.Show All Name Villa Not Duplicate\n" +
                    "5.Show All Name House Not Duplicate\n" +
                    "6.Show All Name Name Not Duplicate\n" +
                    "7.Back to menu\n" +
                    "8.Thoát \n"
            );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn nếu bạn muốn");
            String choice1 = scanner.nextLine();
            try {
                validateError(8,Integer.parseInt(choice1));
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice1) {
                case "1":
                    showVilla();
                    break;
                case "2":
                    showHouse();
                    break;
                case "3":
                    showRoom();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    displayMainMenu();
                    break;
                case "8":
                    check=false;
                    break;
                default:

            }
        }
    }
    }


