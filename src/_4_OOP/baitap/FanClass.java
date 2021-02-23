package _4_OOP.baitap;

public class FanClass {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed=Slow;
    private boolean isOn=false;
    private double radius=5;
    private String color="blue";
    public int getSlow(){
        return this.Slow;
    }
    public int getMedium(){
        return this.Medium;
    }
    public int getFast(){
        return this.Fast;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int newSpeed){
        this.speed=newSpeed;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public Boolean getIsOn(){
        return this.isOn;
    }
    public void setIsOn(boolean status){
        this.isOn=status;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public String display(){
        if(isOn==true){
            return "Fan is on, this radius is"+radius+" this color is "+color+ " this speed is "+speed;
        }
        else {
            return "Fan is off this color is "+color+"this radius is "+radius;
        }
    }

}

