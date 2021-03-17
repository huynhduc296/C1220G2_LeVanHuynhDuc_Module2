package models;

public class House extends Services{
    private String standardRoom;
    private String otherAmenities;
    private int floors;

    public House(){

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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public House(String standardRoom, String otherAmenities, int floors) {
        this.standardRoom = standardRoom;
        this.otherAmenities = otherAmenities;
        this.floors = floors;
    }

    public House(String id, String serviceName, String standardRoom, String otherAmenities, int floors) {
            this.setId(id);
            this.setServiceName(serviceName);
            this.setStandardRoom(standardRoom);
            this.setOtherAmenities(otherAmenities);
            this.setFloors(floors);
    }

    @Override
    public String showInfor() {
        return "ID :"+this.getId()+
                "Tên dịch vụ : "+this.getServiceName()+
                "Tiêu chuẩn phòng :"+this.getStandardRoom()+
                "Tiện nghi khác : "+this.getOtherAmenities()+
                "Số tầng : "+this.getFloors();
    }
}
