package Animals_HW5;

public class Wolf extends WildAnimals{

    public Wolf(boolean predator) {
        this.setIspredator(predator);
    }

    @Override
    public void setIspredator(boolean ispredator) {
        super.setIspredator(ispredator);
    }

    @Override
    public boolean isIspredator() {
        return super.isIspredator();
    }
}
