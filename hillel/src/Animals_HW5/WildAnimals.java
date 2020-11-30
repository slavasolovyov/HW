package Animals_HW5;

public class WildAnimals extends Animals{
   private boolean ispredator;

    public void setIspredator(boolean ispredator) {
        this.ispredator = ispredator;
    }

    public boolean isIspredator() {
        return ispredator;
    }

    @Override
    public String voice() {
        if (isIspredator()){
            return "Hello, I am a wild animal and I am angry";
        }
        else return "Hello, I am a wild animal";
    }
}
