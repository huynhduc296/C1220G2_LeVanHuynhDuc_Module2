package models;

public class Room extends Services implements Comparable<Room>{
     private String freeService;

    public String getFreeService() {
        return freeService;
    }
    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(){

    }
    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String freeService) {
        this.setId(id);
        this.setServiceName(serviceName);
        this.setFreeService(freeService);
    }

    @Override
    public String showInfor() {
        return "ID:"+this.getId()+
                "Tên dịch vụ : "+this.getServiceName()+
                "Dịch vụ miễn phí : "+this.getFreeService();
    }

    @Override
    public int compareTo(Room o) {
        return getServiceName().compareTo(o.getServiceName());
    }
}
