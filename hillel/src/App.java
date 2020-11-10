import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);

    public void averageSumOfArr(){
        String nameofCurrMethod = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName();
        System.out.print("Name of current method: "
                + nameofCurrMethod);
        System.out.println("Provide total n. of elements");
        int size = scanner.nextInt();
        if (size < 2){
            throw new IllegalArgumentException("Size of Arr should be grater or equal to 2");
        }
        int summ = 0;
        float average;
        int[] arr = new int[size];
        System.out.println("Provide numbers to calculate average value");
        for (int i=0; i<size; i++){
            arr[i] +=scanner.nextInt();
            summ+=arr[i];
        }
        average = (float) summ/size;
        System.out.println("Avarege is: " + average);
    }
    public void averageSumOfTwo(){
        String nameofCurrMethod = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName();
        System.out.println("Name of current method: "
                + nameofCurrMethod);
        int size = 2;
        int[] arr = new int[size];
        int summ = 0;
        float average;
        System.out.println("Provide numbers to calculate average value");
        for (int i=0;i<size; i++){
            arr[i]+=scanner.nextInt();
            summ+=arr[i];
        }
        average =(float) summ/size;
        System.out.println("Avarege is: " + average);
    }
    public void deposit() {
        String nameofCurrMethod = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName();
        System.out.println("Name of current method: "
                + nameofCurrMethod);
        System.out.println("Provide amount of deposit");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should not be negative");
        }
        System.out.println("Provide annual percentage");
        double percentage = scanner.nextDouble()/100;
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage should be grater than 0");
        }
        System.out.println("Provide total years of deposit");
        int years = scanner.nextInt();
        if (years < 0) {
            throw new IllegalArgumentException();
        }
        double percentageAmountPerYear = amount * percentage;
        for (int i = 1; i < years+1; i++){
            System.out.printf("%s; ", "Amount in year "+ i +": " + (amount + (percentageAmountPerYear*i)));
            System.out.printf("%s %n","Year percentage: " + (percentageAmountPerYear*i));
        }
    }

    public static void main(String[] args) {
        App app =new App();
        app.averageSumOfArr();
        app.averageSumOfTwo();
        app.deposit();
    }
}
