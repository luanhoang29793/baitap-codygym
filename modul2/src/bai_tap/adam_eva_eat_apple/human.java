package bai_tap.adam_eva_eat_apple;

public class human {
    private String name;
    private boolean gender;
    private int weight;
    public human (String name, boolean gender, int weight) {
        this.name =name;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void eat() {
        this.weight = weight -1;
        System.out.println("can nag " + name + " " + this. weight);
    }
    @Override
    public String toString() {
        String isGender = this.isGender() ? "is male" : "is female";
    return this.name + " weight: " + weight +isGender;
    }
    public String say (String messeger) {
        return name + " say: " + messeger;
    }
}
