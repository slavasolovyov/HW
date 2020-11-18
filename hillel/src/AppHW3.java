import java.sql.SQLOutput;
import java.util.*;

public class AppHW3 {
    Scanner scanner =new Scanner(System.in);
    public void evenFor(){
        int[] arr =new int[100];
        List<Integer> list = new ArrayList<>();
        int counter = 1;
        double summ = 0;
        System.out.println("Result for task #1 Start");
        for(int i=1;i<=100;i++){
            if (i%2==0){
                continue;
            }
            arr[i] = i;
            list.add(i);
            System.out.println("->> "+i);
        }
        System.out.println("Result for task #1 End");
        System.out.println("Result for task #8: " + list.toString());
        Arrays.sort(arr);

        for(int i=1; i<arr.length;i++){
            if (arr[0] == arr[i]){
                counter++;
            }
        }
        for (int i: arr){
            summ += arr[i];
        }
        System.out.print("Result for task #9 ->> Min value is: "+arr[0] +" times "+ counter +"\n");
        System.out.println("Result for task #10 ->> Max value is: "+arr[arr.length-1]);
        System.out.println("Result for task #12 Average of all element:  " + summ/arr.length);
    }
    public void replaceElement(){
        int maxIndex =0;
        int minIndex =0;
        int[] arr = new int[]{4, 8, 0, 6, -5};
        System.out.println("Result for task #11 given array: " + Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
            int t;
            if(maxIndex!=minIndex){
                t = arr[minIndex];
                arr[minIndex] = arr[maxIndex];
                arr[maxIndex] = t;
            }

        System.out.println("Result for task #11 after swap: " + Arrays.toString(arr));
    }
    public void evenWhile(){
        int i = 0;
        System.out.println("Result for task #3 Start");
        while(i!=100){
            if(i%2==0){
                i++;
                continue;
            }
            System.out.println("->> "+i);
            i++;
        }System.out.println("Result for task #3 End");
    }
    public void offsetloop(){
        int count = 0;
        System.out.println("Result for task #6 Start");
        for (int i=0; i>=-100; i = i -5){
            if (count<10){
                System.out.println("->> "+i);
                count++;
            }
        }System.out.println("Result for task #6 End");
    }
    public int nFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
       return n*nFact(n-1);
    }
    public void numberPow(double n, double pow){
        double result = 1;
        for (int i = 1; i<=pow; i++){
            result*=n;
        }
        System.out.println("Result for task #6 ->> "+result);
    }
    public void multiplicationTab(){
        System.out.println("Provide multiplication table vaule");
        int n = Math.abs(scanner.nextInt());
        if (n==0){
            throw new IllegalArgumentException("Provide value grater than 0");
        }
        for (int i = 0; i<=10; i++){
            System.out.println("result: "+ n +" * "+ i + " = " + (n*i));
        }scanner.close();
    }
    public void chessDesk(){
        System.out.println("====================");
        for (int i = 0; i < 8; i++) {
            System.out.print("= ");
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j%2!=0) {
                        System.out.print("B ");
                    }else System.out.print("W ");
                }
                System.out.print("="+"\n");
            }
            if(i % 2 != 0){
                for (int j = 0; j < 8; j++) {
                    if (j%2!=0) {
                        System.out.print("W ");
                    }else System.out.print("B ");
                }
                System.out.print("="+"\n");
            }
        }
        System.out.println("====================");
    }


    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        AppHW3 app = new AppHW3();
        app.evenFor();
        System.out.println("Provide value for n Factorial");
        int n = scanner.nextInt();
        System.out.println(app.nFact(n));
        app.evenWhile();
        app.numberPow(3, 4);
        app.offsetloop();
        app.multiplicationTab();
        app.replaceElement();
        app.chessDesk();

    }
}
