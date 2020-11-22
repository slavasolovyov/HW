package Animals_HW5;

public class Croco extends WildAnimals{
    public Croco(boolean predator) {
        this.setPredator(predator);
    }
    @Override
    public void setPredator(boolean predator) {
        super.setPredator(predator);
    }

    @Override
    public boolean isPredator() {
        return super.isPredator();
    }
}
