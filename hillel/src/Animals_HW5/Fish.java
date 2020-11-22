package Animals_HW5;

public class Fish extends HomeAnimals{
    public Fish(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String voice(){
        return "Hello, ....";
    }
}
