import java.util.Arrays;

public class QuickSort {

    public static void quickSort(double[] arr, int low, int high){
        //time
        if (low < high){
            int mid = partion(arr,low,high);
            quickSort(arr,low,mid-1);
            quickSort(arr,mid+1,high);
        }

    }
    public static int partion(double[]arr, int low, int high){
        int i = low + 1;
        int j = high;
        double pivot = arr[low];
        while(i <= j){
            while( (arr[i] <= pivot) && i <= high){
                i++;
            }
            while ( arr[j] > pivot && j > low){
                j--;
            }

            if (i >= j){
                break;
            }
            //swap arr[i] , arr[j]
            swap(arr,i,j);
//            double temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;

        }
        swap(arr,low,j);
        //swap arr[j] , arr[pivot]
//        double temp = arr[j];
//        arr[j] = arr[pivot];
//        arr[pivot] = temp;

        return j;
    }
    public static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        double[] array = {4,2,3,4,5,6};
        //QuickSort f = new QuickSort();

        quickSort(array, 0 , array.length-1);
        System.out.println(Arrays.toString(array));
    }
}

//    public static void main(String args[]){
//        int[] arr;
//        arr = new int[]{10,16,8,12,15,6,3,9,5};
//        int low = 0;
//        int high = arr.length-1;
//
//        quicksort(arr, low,high);
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//}
//    public int[] quickSort(double[] arr, int low, int high){
//        //time
//        if (low < high){
//            int mid = partion(arr,low,high);
//            quickSort(arr,low,mid);
//            quickSort(arr,mid,high);
//        }
//        return
//    }
//    int partion(double[]arr, int low, int high){
//        int i = low  + 1;
//        int j = high;
//        int pivot = low;
//        while(i <= j){
//            while( (arr[i] <= arr[pivot]) && i <= j){
//                i++;
//            }
//            while (arr[j] >= arr[pivot] && i <=j){
//                j--;
//            }
//            if (i<j){
//                //swap arr[i] , arr[j]
//            }
//        }//swap arr[j] , arr[pivot]
//
//        return j;


