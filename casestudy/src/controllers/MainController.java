package controllers;

import file.FileUtils;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;
import validcheck.CheckInformation;

import javax.xml.bind.ValidationException;
import java.util.*;

public class MainController {
        List<House> listHouses = new ArrayList<>();
        List<Room> listRooms = new ArrayList<>();
        List<Villa> listVillas = new ArrayList<>();
        List<Customer>listCustomer=new ArrayList<>();

    public List<House> getListHouses() {
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\house.csv");
        List<House> houseList = new ArrayList<>();
        for (String s : listLine1) {
            String[] lineSplit = s.split(",");
            House house = new House(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]));
            houseList.add(house);
        }
        for (int i = 0; i < houseList.size(); i++) {
            System.out.println(houseList.get(i).showInfor());
        }
        return houseList;
    }

    public void setListHouses(List<House> listHouses) {
        this.listHouses = listHouses;
    }

    public List<Room> getListRooms() {
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\room.csv");
        List<Room> roomList = new ArrayList<>();
        for (String s : listLine1) {
            String[] lineSplit = s.split(",");
            Room room = new Room(lineSplit[0], lineSplit[1], lineSplit[2]);
            roomList.add(room);
        }
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i).showInfor());
        }
        return roomList;
    }


    public void setListRooms(List<Room> listRooms) {
        this.listRooms = listRooms;
    }

    public List<Villa> getListVillas() {
        List<String> listLine = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\villa.csv");
        List<Villa> villaList = new ArrayList<>();
        for (String s : listLine) {
            String[] lineSplit = s.split(",");
            Villa villa = new Villa(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), Integer.parseInt(lineSplit[5]));
            villaList.add(villa);
        }
        for (int i = 0; i < villaList.size(); i++) {
            System.out.println(villaList.get(i).showInfor());
        }
        return villaList;
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
                        addNewCustomer();
                        break;
                    case "4":
                        showCustomer();
                        break;
                    case "5":
                        addNewBooking();
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

    public void  addNewCustomer(){
        Customer customer=new Customer();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên khách hàng");
        String fullName=scanner.nextLine();
        customer.setFullName(fullName);
        System.out.println("Nhập ngày tháng năm sinh");
        String dateOfBirth=scanner.nextLine();
        customer.setDateOfBirth(dateOfBirth);
        System.out.println("Nhập giới tính ");
        String gender=scanner.nextLine();
        customer.setGender(gender);
        System.out.println("Nhập số CMND");
        String idCard=scanner.nextLine();
        customer.setIdCard(idCard);
        System.out.println("Nhập số điên thoại");
        String phoneNumber=scanner.nextLine();
        customer.setPhoneNumber(phoneNumber);
        System.out.println("Nhập email");
        String email=scanner.nextLine();
        customer.setEmail(email);
        System.out.println("kiểu khách hàng");
        String typeOFCustomer=scanner.nextLine();
        customer.setTypeOFCustomer(typeOFCustomer);
        System.out.println("Nhập địa chỉ");
        String address=scanner.nextLine();
        customer.setAddress(address);
        listCustomer.add(customer);
        String line=fullName+","+dateOfBirth+","+gender+","+idCard+","+phoneNumber+","+email+","+typeOFCustomer+","+address;
        FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\customer.csv",line);
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
    public void addVilla(){
            System.out.println("Nhập thông tin");

            Scanner scanner=new Scanner(System.in);
            Villa villa=new Villa();
            System.out.println("Nhập id");
            String id;
            do{
                id =scanner.nextLine();

            }while (!CheckInformation.isValidService(id,CheckInformation.id_Regex));
            villa.setId(id);
            System.out.println("nhập tên dịch vụ");
            String ServiceName;
            do {
                ServiceName = scanner.nextLine();
            }while (!CheckInformation.isValidService(ServiceName,CheckInformation.name_Regx));
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
        FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\villa.csv",line);
        }
    public void addHouse (){
        System.out.println("Nhập thông tin");

        Scanner scanner=new Scanner(System.in);
        House house=new House();
        System.out.println("Nhập id");
        String id;
        do{
            id =scanner.nextLine();

        }while (!CheckInformation.isValidService(id,CheckInformation.id_Regex));
        house.setId(id);
        System.out.println("nhập tên dịch vụ");
        String ServiceName;
        do {
            ServiceName = scanner.nextLine();
        }while (!CheckInformation.isValidService(ServiceName,CheckInformation.name_Regx));
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
        FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\house.csv",line);
    }
    public void addRoom (){
        System.out.println("Nhập thông tin");

        Scanner scanner=new Scanner(System.in);
        Room room=new Room();
        System.out.println("Nhập id");
        String id;
        do{
            id =scanner.nextLine();

        }while (!CheckInformation.isValidService(id,CheckInformation.id_Regex));
        room.setId(id);
        System.out.println("nhập tên dịch vụ");
        String ServiceName;
        do {
            ServiceName = scanner.nextLine();
        }while (!CheckInformation.isValidService(ServiceName,CheckInformation.name_Regx));
        room.setServiceName(ServiceName);
        System.out.println("Dịch vụ miễn phí");
        String freeService=scanner.nextLine();
        room.setFreeService(freeService);
        listRooms.add(room);
        String line=id+","+ServiceName+","+freeService;
        FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\room.csv",line);
    }
    public void  addNewBooking(){
        Scanner scanner=new Scanner(System.in);
        List<Customer>listCustomer=showCustomer();
        System.out.println("an so thu tu cua customer ban chon: ");
        String index;
        String choiceBooking;
        do {
            index = scanner.nextLine();
        } while (!CheckChoose(index,listCustomer.size()));
        Customer customer = listCustomer.get(Integer.parseInt(index) - 1);
        String lineBooking = customer.getFullName() + "," + customer.getDateOfBirth() + "," + customer.getGender() + "," + customer.getIdCard()
                + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getTypeOFCustomer() + "," + customer.getAddress();
        System.out.println("them dich vu cho khach hang " + customer.getFullName());
        System.out.println("1. Booking Villa" +
                "\n2. Booking House" +
                "\n3. Booking Room");
        do{
            choiceBooking=scanner.nextLine();
        }while (!CheckChoose(choiceBooking,3));
        switch (choiceBooking){
            case "1":
                List<Villa>villaList=getListVillas();
                System.out.println("chọn số thứ tự của dịch vụ bạn muốn booking:");
                String indexVilla;
                do {
                    indexVilla=scanner.nextLine();
                }while (CheckChoose(indexVilla,listVillas.size()));
                customer.setServices(villaList.get(Integer.parseInt(indexVilla)-1));
                lineBooking+=","+customer.getServices().showInfor();
                FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\booking.csv",lineBooking);
                System.out.println("Thêm thành công");
                break;
            case "2":
                List<House>houseList=getListHouses();
                System.out.println("Nhập số thứ tự của dịch vụ bạn muốn booking");
                String indexHouse;
                do {
                    indexHouse=scanner.nextLine();
                }while (CheckChoose(indexHouse,listVillas.size()));
                customer.setServices(houseList.get(Integer.parseInt(indexHouse)-1));
                lineBooking+=","+customer.getServices().showInfor();
                FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\booking.csv",lineBooking);
                System.out.println("Thêm thành công");
                break;
            case "3":
                List<Room>roomList=getListRooms();
                System.out.println("Nhập số thứ tự của dịch vụ ban muốn booking");
                String indexRoom;
                do {
                    indexRoom=scanner.nextLine();
                }while (CheckChoose(indexRoom,listVillas.size()));
                customer.setServices(roomList.get(Integer.parseInt(indexRoom)-1));
                lineBooking+=","+customer.getServices().showInfor();
                FileUtils.writeFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\booking.csv",lineBooking);
                System.out.println("Thêm thành công");
                break;
            default:
                System.out.println("1. tiep tuc them booking" +
                        "\n2. quay lai menu" +
                        "\n3. Thoat");
                String choiceAddBooking;
                do {
                    choiceAddBooking = scanner.nextLine();
                } while (!CheckChoose(choiceAddBooking, 3));
                switch (choiceAddBooking) {
                    case "1":
                       addNewBooking();
                        break;
                    case "2":
                        displayMainMenu();
                        break;
                    case "3":
                        break;
                }
        }
        showNewBooking();
    }
    public List<Customer> showCustomer(){
        List<String>listLine=FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\customer.csv");
        List<Customer>customerList=new ArrayList<>();
        for (String s:listLine){
            String[]lineList=s.split(",");
            Customer customer=new Customer();
            customer.setFullName(lineList[0]);
            customer.setDateOfBirth(lineList[1]);
            customer.setGender(lineList[2]);
            customer.setIdCard(lineList[3]);
            customer.setPhoneNumber(lineList[4]);
            customer.setEmail(lineList[5]);
            customer.setTypeOFCustomer(lineList[6]);
            customer.setAddress(lineList[7]);
            customerList.add(customer);
        }
        for (int i=0;i<customerList.size();i++){
            System.out.println(i+1+":  "+customerList.get(i).showInFor());
        }
        return customerList;
    }
    public void showVilla() {
        List<String> listLine = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\villa.csv");
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
    public void showNewBooking(){
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\booking.csv");

        for(String S:listLine1){
            System.out.println(S);
        }
    }
    public  void showHouse() {
            List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\house.csv");
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
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\room.csv");
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
    public  void showAllVillaNotDup(){
        List<String> listLine = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\villa.csv");
        List<Villa> villaList = new ArrayList<>();
        for (String s : listLine) {
            String[] lineSplit = s.split(",");
            Villa villa = new Villa(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]), Integer.parseInt(lineSplit[5]));
            villaList.add(villa);
        }
        Set<Villa> setOfVilla = new TreeSet<>();
        for(Villa villa:villaList){
            setOfVilla.add(villa);
        }
        for (Villa s:setOfVilla){
            System.out.println(s.getServiceName());
        }
    }
    public  void showAllHouseNotDup(){
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\house.csv");
        List<House> houseList = new ArrayList<>();
        for (String s : listLine1) {
            String[] lineSplit = s.split(",");
            House house = new House(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3], Integer.parseInt(lineSplit[4]));
            houseList.add(house);
        }
        Set<House>setOfHouse=new TreeSet<>();
        for (House house:houseList){
            setOfHouse.add(house);
        }
        for (House f:setOfHouse){
            System.out.println(f.getServiceName());
        }
    }
    public  void showAllRoomNotDup(){
        List<String> listLine1 = FileUtils.readerFile("D:\\NewCodeGym\\C1220G2_LeVanHuynhDuc_Module2\\casestudy\\src\\file\\room.csv");
        List<Room> roomList = new ArrayList<>();
        for (String s : listLine1) {
            String[] lineSplit = s.split(",");
            Room room = new Room(lineSplit[0], lineSplit[1], lineSplit[2]);
            roomList.add(room);
        }
        Set<Room>setOfRoom=new TreeSet<>();
        for(Room room:roomList){
            setOfRoom.add(room);
        }
        for (Room s:setOfRoom){
            System.out.println(s.getServiceName());
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
                    showAllVillaNotDup();
                    break;
                case "5":
                    showAllHouseNotDup();
                    break;
                case "6":
                    showAllRoomNotDup();
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


