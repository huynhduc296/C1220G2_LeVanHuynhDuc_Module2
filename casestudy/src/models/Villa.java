package models;

public class Villa extends Services implements Comparable<Villa> {
    private String standardRoom;
    private String otherAmenities;
    private int acreagePool;
    private int floors;

    public Villa() {
    }

    public Villa(String standardRoom, String otherAmenities, int acreagePool, int floors) {
        this.standardRoom = standardRoom;
        this.otherAmenities = otherAmenities;
        this.acreagePool = acreagePool;
        this.floors = floors;
    }

    public Villa(String id, String serviceName, String standard, String otherAmenities,int acreagePool, int floors) {
        this.setOtherAmenities(otherAmenities);
        this.setAcreagePool(acreagePool);
        this.setFloors(floors);
        this.setId(id);
        this.setServiceName(serviceName);
        this.setStandardRoom(standard);
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public int getAcreagePool() {
        return acreagePool;
    }

    public void setAcreagePool(int acreagePool) {
        this.acreagePool = acreagePool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String showInfor() {
        return "ID :"+this.getId()+
                "Tên dịch vụ :"+this.getServiceName()+
                "Tiêu chuẩn phòng :"+this.getStandardRoom()+
                "Tiện nghi khác :"+this.getOtherAmenities()+
                "Diện tích hồ bơi :"+this.getAcreagePool()+
                "Số tầng :"+this.getFloors();
    }

    @Override
    public int compareTo(Villa o) {
        return getServiceName().compareTo(o.getServiceName());
    }
}
