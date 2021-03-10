import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//    Requirement 1: Implement a ​randomised​ version of quicksort.
//    In randomised quicksort, the algorithm selects a random element of the array as a pivot.
//    The average running time of randomized quicksort isO(n lg n) on large arrays.

//    While the quicksort algorithm normally does not return a value (i.e. it is a void function),
//    the signature for this assignment must return the index of the pivot value so that it may be integrated with the other requirements for this assignment.
//    In other words, your implementation of randomised quicksort must have the following signature:
//          public int quicksort (double [] arr, int left, int right);

//    If the input to quicksort is the following 8-item array: [ 5, 2, 9, 12, 6, 8, 3, 7 ],
//    the algorithm begins by randomly selecting one of these items to be the pivot.

//      *sTUCK HERE*
//    Assuming the value 6 (at index 4) is selected as the pivot, the quicksort algorithm proceeds as we discussed.
//    The resulting array may be as follows: [ 5, 2, 3,6, 7, 8, 9, 12 ].
//    The algorithm returns the value 3 (the index of the pivot after the partition algorithm has been executed),
//    indicating that the left sub array is [ 5, 2, 3 ] and the right subarray is [ 7, 8, 9, 12 ].

public class RandomQuickSort {

    public int quicksort(double[] arr, int left, int right) {
        Random rand = new Random();

        int RandomPivotIndex = rand.nextInt(arr.length);
        int RandomPivot = (int) arr[RandomPivotIndex];

        if (left < right) {
            int mid = partion(arr,left,right);
            //int pivot = randomPivot(arr);

            quicksort(arr, left, mid - 1);
            quicksort(arr, mid + 1, right);
        }

        int partion(double[] array, int low, int high){
            int i = low + 1;
            int j = high;
            int pivot = RandomPivot;
            while (i <= j) {
                while ((arr[i] <= arr[RandomPivot]) && i <= j) {
                    i++;
                }
                while (arr[j] >= arr[RandomPivot] && i <= j) {
                    j--;
                }
                if (i < j) {
                    //swap arr[i] , arr[j]
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            //swap arr[j] , arr[pivot]
            double temp = arr[j];
            arr[j] = arr[RandomPivot];
            arr[RandomPivot] = temp;

            return j;


            //return index of pivot
        }
//
    return 0;} //Change later. This is just to get rid of error.

        public static void main (String[]args){
            int[] array = {5, 2, 9, 12, 6, 8, 3, 7};

            RandomQuickSort function = new RandomQuickSort();
            //function.randomPivot(array); //getting a random pivot

        }

    }

