package selectSort;

import java.util.Arrays;

public class SelectSort {

   /*  static int[] sortArray(int[] array){

        for (int i=0;i<array.length -1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minIndex] >array[j]){
                    minIndex=j;
                }
            }
            if(i !=minIndex){
                int temp = array[minIndex];
                array[minIndex]= array[i];
                array[i]=temp;
            }
        }
        return array;
    }*/

    public static void main(String[] args) {
        int[] array={1,3,5,8,4,20,7};
        for (int i=0;i<array.length -1;i++){
            int minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if (array[minIndex] >array[j]){
                    minIndex=j;
                }
            }
            if(i !=minIndex){
                int temp = array[minIndex];
                array[minIndex]= array[i];
                array[i]=temp;
             }
        }

        for (int i = 0; i <array.length   ; i++) {
            System.out.println("数组:"+ array[i]);
        }
    }

}
