package Collection_HW7;

import java.util.Arrays;

public class ArrayListCustom {
   private String [] arr;

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public ArrayListCustom() {
        this.arr = new String[2];
    }

    public int size(){
        return arr.length;
    }

    public String[] grow(){
        return Arrays.copyOf(arr, arr.length +1);
    }

    public void add(String object){
        if (arr[arr.length-1] != null){
            arr = grow();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                arr[i] = object;
                break;
            }
        }
    }

    public void add (String object,int index){
        if (arr[arr.length -1] != null){
            arr = grow();
        }
        System.arraycopy(arr, index,
                arr, index + 1,
                arr.length - index - 1);
        arr[index] = object;
    }

    public String[] remove(int index){
        String[] arr1 = new String[size()-1];
        int count = 0;
        if(arr[index]!=null){
            for (int i = 0; i<=arr1.length; i++){
                if (i != index){
                    arr1[i-count] = arr[i];
                }else count ++;
            }
        }
        return arr=arr1;
    }
    public String[] remove(String object){
        String[] arr1 = new String[size()-1];
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i].equals(object)){
                 count++;
            }else arr1[i-count] = arr[i];
        }
        return arr=arr1;
    }

    public static void main(String[] args) {
        ArrayListCustom arrayListCustom = new ArrayListCustom();

        int size = arrayListCustom.size();
        System.out.println(arrayListCustom.size());


        arrayListCustom.add("add", 0);
        arrayListCustom.add("add1", 1);
        arrayListCustom.add("add2", 2);
        arrayListCustom.add("add3", 2);
        arrayListCustom.add("add4", 2);



        System.out.println(arrayListCustom.toString());
        System.out.println(arrayListCustom.size());
        arrayListCustom.remove(0);
        System.out.println(arrayListCustom.toString());
        System.out.println(arrayListCustom.size());
        System.out.println();
        arrayListCustom.remove("add1");
        System.out.println(arrayListCustom.toString());
        System.out.println(arrayListCustom.size());
    }
}
