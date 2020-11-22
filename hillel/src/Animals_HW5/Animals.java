package Animals_HW5;

public class Animals {
    private int id;
    private byte age;
    private String color;
    private int weight;

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public byte getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String voice(){
        return "Hello, I'm default animal";
    }
}
