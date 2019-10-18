package bai_tap.dep_pin;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    public SwitchButton (boolean status) {
        this.status = status;
        this.lamp = new ElectricLamp(status);
    }
    public void SwitchOn() {
        this.lamp.turnOff();
        this.status =true;
    }
    public void SwitchOff() {
        this.lamp.turnOff();
        this.status =false;
    }
    @Override
    public String toString() {
        String status = (this.status? "turn on": "turn offf") + "the lamp";
        return  "The Switch " + status + this.lamp.toString();
    }
}
