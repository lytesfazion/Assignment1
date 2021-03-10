public class InsertionSort {

    public static double[] sort (double[] array){
        for (int i = 1; i < array.length; i++){
            double temp = array[i];
            int j = i -1;
            while (j >=0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }
}

