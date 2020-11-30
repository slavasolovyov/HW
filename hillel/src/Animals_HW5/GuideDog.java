package Animals_HW5;


public class GuideDog extends Dog{

    private boolean trained;

    public GuideDog(String name) {
        setName(name);
    }
    public boolean isTrained() {
        return trained;
    }

    public boolean getTrained(){
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void bringMeHome(){
        if (getTrained()){
            System.out.println("You at home");
        }else System.out.println("You are some where else");
    }
}
