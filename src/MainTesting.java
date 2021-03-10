import java.util.Arrays;
import java.util.Random;
import java.lang.*;
public class MainTesting {

    public static double[] add_element(double[] myarray, double element){

        double newArray[] = new double[myarray.length + 1];
        //copy original array into new array
        for(int i = 0; i < myarray.length; i++){
            newArray[i] = myarray[i];
        }
        //add element to the new array
        newArray[myarray.length] = (int) element; //so it adds element to the end of list

        return newArray;
    }
    double [] generateArray(int length){ //genertates a randomized array from zero through the length passed.
        Random rand = new Random();
        double[] newarr = new double[length];
        for(int i = 0; i < length; i++){
            //newarr[i] = rand.nextInt();
            newarr[i] = rand.nextInt(length); //used a bound (length) in order to only get positive elements below length
        }
        return newarr;
    }
    public static void main(String args[]){
        MainTesting f = new MainTesting();
        int[] arrayLengths = {50000,100000,150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};//these are an array lengths?

        Random rand = new Random();
        double[] randArrayLen = new double[10];

        double[] arr = new double[10]; //get rid of
        //trash the array inside the array idea

        for(int i = 0; i < arrayLengths.length; i++) {
            //50,000; so rand array of values from 0-50000?

            randArrayLen = f.generateArray(arrayLengths[i]); //Passing an element from arraylengths thru generateArray to create an array of rand ints form 0-length element

            //arr[i] = rand.nextGaussian(); //generate an array of random double instance
//            System.out.println("arr[i] " + arr[i]);
//            add_element(randArrayLen, arr[i]);
//            System.out.println("arrlength " + arr.length);

            //double[][] arrays = new double[arrayLengths[9]][];//an array of arrays? //with size of the the length thats been passed.
            //arrays[i] = rand.doubles(); //only thing that had a double type, lets see what happens.
            //add arr into massive randArrayLen

            /**
             * calling bubble sort and finding "runtime" using currentTimeMillis
             */

            System.out.println("Bubble Sort Stats:");
            long BubbleStartTime = System.currentTimeMillis();
            BubbleSort.sort(randArrayLen);
            long BubbleEndTime = System.currentTimeMillis();
            //​System.out.print("This array: ");
            System.out.print(Arrays.toString(randArrayLen));
            System.out.print(" requries ");
            long BubbleTotalTime = BubbleEndTime - BubbleStartTime;
            System.out.print(BubbleTotalTime);
            System.out.println(" time.");

            /**
             * calling Selection sort and finding "runtime" using currentTimeMillis
             */
            System.out.println("Selection Sort Stats:");
            long SelectionStartTime = System.currentTimeMillis();
            SelectionSort.sort(randArrayLen);
            long SelectionEndTime = System.currentTimeMillis();
            System.out.print(Arrays.toString(randArrayLen));
            System.out.print(" requries ");
            long SelectionTotalTime = SelectionEndTime - SelectionStartTime;
            System.out.print(SelectionTotalTime);
            System.out.println(" time.");

            /**
             * calling Insertion sort and finding "runtime" using currentTimeMillis
             * My computer can't handle it all  happening at once so I'm gonna try each sort one by one.
             */
            System.out.println("Insertion Sort Stats:");
            long InsertionStartTime = System.currentTimeMillis();
            InsertionSort.sort(randArrayLen);
            long InsertionEndTime = System.currentTimeMillis();
            System.out.print(Arrays.toString(randArrayLen));
            System.out.print(" requries ");
            long InsertionTotalTime = InsertionEndTime - InsertionStartTime;
            System.out.print(InsertionTotalTime);
            System.out.print(" time.");

            /**
             * calling Quick sort and finding "runtime" using currentTimeMillis
             * QuickSort.quicksort if giving me thee longest error so I'm commenting it out
             */
            System.out.println("Quick Sort Stats:");
            long QuickStartTime = System.currentTimeMillis();

            //QuickSort quickFunction = new QuickSort();

            //have to pass double array, low and high.
            // low = the first item in the array BUT it must be type casted to type int. The original is a type double
            // high = arrar[the length of array - 1] aka the last item (also type casted to int)

            QuickSort.quickSort(randArrayLen, 0, randArrayLen.length - 1);

            //quickFunction.quickSort(randArrayLen, 0, randArrayLen.length - 1); //

            long QuickEndTime = System.currentTimeMillis();
            System.out.print(Arrays.toString(randArrayLen));
            System.out.print(" requries ");
            long QuickTotalTime = QuickEndTime - QuickStartTime;
            System.out.print(QuickTotalTime);
            System.out.println(" time.");

            /**
             * merge sort
             * MergeSort.merge & MergeSort.mergeSort is giving me the same out of bounds error aas quick sort
             */
            System.out.println("Merge Sort Stats:");
            long MergeStartTime = System.currentTimeMillis();

            MergeSort mergeFunction = new MergeSort();
            //pass array, low, and high
            //Have to type cast again
            mergeFunction.mergeSort(randArrayLen, (int) randArrayLen[0], (int) randArrayLen[randArrayLen.length - 1]);

            long MergeEndTime = System.currentTimeMillis();
            System.out.print(Arrays.toString(randArrayLen));
            System.out.print(" requries ");
            long MergeTotalTime = MergeEndTime - MergeStartTime;
            System.out.print(MergeTotalTime);
            System.out.println(" time.");

        }




    }
}


//Use a minimum of ten (10) arrays lengths: every 50,000 to 500,000 — i.e. 50,000, 100,000, 150,000, etc. to 500,000.
//●For each of the array lengths listed above,
//          generate an array of random double instances.
//          Send a copy of this array to each of the five general-purpose sorting algorithms.
// ●Array sizes: Collect the time down to milliseconds required to sort each array using a Javasystem
//          call such as ​currentTimeMilis()​.



//BubbleSort bubfunction = new BubbleSort();
//bubfunction.sort();

//    public static void main(String args[]){
//
//    int[] arrayLengths = {50000,100000,150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
//    Random rand = new Random(); //creating to call later
//
//    double[] randArrayLen = new double[10]; //going to be my massive array with other arrays in it;)
//    double[] arr = new double[10];
//    for(int i = 0; i < arrayLengths.length; i++){ //for each item in array lengths
//        //50,000
//        arr[i] = rand.nextGaussian(); //generate an array of random double instance
//        add_element(randArrayLen,arr[i]);
//        //add arr into massive randArrayLen
//    }
//}
