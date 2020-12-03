package Collection_HW8;

import java.util.Arrays;

public class ArrayListCustom implements ListCustom{
    private Object [] arr;
    private int size = 0;

    public ArrayListCustom() {
        this.arr = new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public Object[] grow(){
        return Arrays.copyOf(arr, arr.length +1);
    }

    @Override
    public Object get(int index){
        if (size() >= index){
            return arr[index];
        }else {
            throw new NullPointerException("Element not found");

        }
    }

    @Override
    public boolean add(Object object){
        if (size() == 0 || arr[arr.length -1] != null){
            arr = grow();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                arr[i] = object;
                size++;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean add (Object object,int index){
        if (size() == 0 || arr[arr.length -1] != null){
            arr = grow();
        }
        System.arraycopy(arr, index,
                arr, index + 1,
                arr.length - index - 1);
        arr[index] = object;
        size++;
        return true;
    }

    @Override
    public boolean remove(int index){
        Object[] arr1 = new Object[size()-1];
        int offset = 0;
        if(arr[index]!=null){
            for (int i = 0; i<=arr1.length; i++){
                if (i != index){
                    arr1[i-offset] = arr[i];
                }else {
                    offset ++;
                    size--;
                }
            }
        }
        arr=arr1;
        return offset > 0;
    }

    @Override
    public boolean remove(Object object){
        Object[] arr1 = new Object[size()-1];
        int offset = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i].equals(object)){
                offset++;
                size++;
            }else arr1[i-offset] = arr[i];
        }
        arr=arr1;
        return offset > 0;
    }

    @Override
    public boolean contain(Object object) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(object)) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListCustom that = (ArrayListCustom) o;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public boolean clear() {
        for(int i = 0; i < size(); i++){
            if (arr[i] != null){
               arr[i] = null;
            }
        }
        size = 0;
        return true;
    }

    public static void main(String[] args) {
        ListCustom arrayListCustom = new ArrayListCustom();
        ListCustom otherArr = new ArrayListCustom();
        otherArr.add("1");
        otherArr.add("2");
        otherArr.add("3");
        System.out.println(otherArr.size());
        System.out.println("=====================");
        arrayListCustom.add("1");
        arrayListCustom.add("2");
        arrayListCustom.add("3");
        System.out.println(arrayListCustom.size());

        System.out.println("=====================");
        System.out.println("Equals "+arrayListCustom.equals(otherArr));

        System.out.println("Clear "+arrayListCustom.clear());



    }
}
