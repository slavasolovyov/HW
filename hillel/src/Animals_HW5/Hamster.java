package Animals_HW5;

public class Hamster extends HomeAnimals{
    public Hamster(String name) {
        setName(name);
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

    @Override
    public String voice() {
        if (getName() != null){
            return "Hello, " + "my name is " + getName();
        }
        else return "Hello";
    }
}
