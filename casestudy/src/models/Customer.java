package models;

import javax.xml.ws.Service;

public class Customer {
    private String fullName;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeOFCustomer;
    private String address;
    private Services services;



    public Customer(String fullName, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOFCustomer, String address, Services services) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOFCustomer = typeOFCustomer;
        this.address = address;
        this.services = services;
    }


    public <services> Customer(String fullName, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOFCustomer, String address , services services) {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOFCustomer() {
        return typeOFCustomer;
    }

    public void setTypeOFCustomer(String typeOFCustomer) {
        this.typeOFCustomer = typeOFCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInFor(){
        return "Tên khách hàng:"+ this.getFullName()+" "+
                "Ngày tháng Năm sinh:"+this.getDateOfBirth()+" "+
                "Gioi Tính:"+this.getGender()+" "+
                "Số CMND:"+this.getIdCard()+" "+
                "Số Điện Thoại:"+this.getPhoneNumber()+" "+
                "Email:"+this.getEmail()+" "+
                "Kiểm Khách hàng:"+this.getTypeOFCustomer()+" "+
                "Địa chỉ:"+this.getAddress();
    }

    public Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOFCustomer='" + typeOFCustomer + '\'' +
                ", address='" + address + '\'' +
                ", services=" + services +
                '}';
    }
}
