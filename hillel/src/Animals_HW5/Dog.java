package Animals_HW5;

public class Dog extends HomeAnimals{

    public Dog() {
    }

    public Dog(String name) {
        this.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isVaccinated() {
        return super.isVaccinated();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setVaccinated(boolean vaccinated) {
        super.setVaccinated(vaccinated);
    }
}
