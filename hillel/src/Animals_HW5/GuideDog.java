package Animals_HW5;


public class GuideDog extends Dog{

    private boolean isTrained;

    public GuideDog(String name) {
        setName(name);
    }
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public void bringMeHome(){
        if (isTrained){
            System.out.println("You at home");
        }else System.out.println("You are some where else");
    }
}
