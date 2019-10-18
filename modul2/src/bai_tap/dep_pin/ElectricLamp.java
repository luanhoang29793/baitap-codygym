package bai_tap.dep_pin;

public class ElectricLamp {
    private boolean status;
    public ElectricLamp(boolean status) {
        this.status = false;
    }

    public boolean turnOn() {
        return status = true;
    }

    public boolean turnOff() {
        return status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
    @Override
    public String toString() {
        String status = this.status? "is on" : "is off";
        return "this Lamp " + status;
    }
}
