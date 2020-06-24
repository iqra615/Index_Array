package come.codewithiqra;

public class Main {


    public static int findIndex(int[] array, int t)
    {
        if (array==null) return -1;
        int length =array.length;
        int i=0;
        while (i< length){
            if (array[i] == t) return i;
            else  i=i+1;
        }
        return -1;
    }
    public static void main(String args[])
    {

        int[] array = {22,44,66,43,23,66,86,46};
        System.out.println("Index Position of 23: " + findIndex(array,23));
        System.out.println("Index Position of 46:" + findIndex(array , 46));

    }
}
