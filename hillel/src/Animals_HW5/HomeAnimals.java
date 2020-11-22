package Animals_HW5;

public class HomeAnimals extends Animals{
    private String name;
    private boolean isVaccinated;

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String voice() {
        if (getName() != null){
           if (getClass().getName().equals("Animals_HW5.Cat")){
                return "Hello, " + "my name is " + getName() + " Meow";
           }
           if (getClass().getName().equals("Animals_HW5.Dog") ||
                   getClass().getName().equals("Animals_HW5.GuideDog")){
               return "Hello, " + "my name is " + getName() + " Woof";
           }
        }return "Hello, ";
    }
}
