package Animals_HW5;

public class Lion extends WildAnimals{

    public Lion(boolean predator) {
        this.setPredator(predator);
    }
    @Override
    public void setPredator(boolean predator) {
        super.setPredator(predator);
    }@Override
    public boolean isPredator() {
        return super.isPredator();
    }
}
