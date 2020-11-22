package Animals_HW5;

public class WildAnimals extends Animals{
   private boolean isPredator;

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String voice() {
        if (isPredator()){
            return "Hello, I am a wild animal and I am angry";
        }
        else return "Hello, I am a wild animal";
    }
}
