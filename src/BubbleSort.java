import java.util.Random;

public class BubbleSort {

    public static double[] sort(double[] array){

        for(int i = 0; i< array.length ; i++){
            for(int j = 1; j < array.length; j++){//this is to compare every two items of this array
                if (array[j] < array[j-1] ){
                    double temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

//    public static double[] add_element(double[] myarray, double element){
//
//        double newArray[] = new double[myarray.length + 1];
//
//        //copy original array into new array
//        for(int i = 0; i < myarray.length; i++){
//            newArray[i] = myarray[i];
//        }
//        //add element to the new array
//        newArray[myarray.length] = (int) element; //so it adds element to the end of list
//
//        return newArray;
//    }

    //
//    public static void main(String args[]){
//
//        int[] arrayLengths = {50000,100000,150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
//        Random rand = new Random(); //creating to call later
//
//        double[] randArrayLen = new double[10]; //going to be my massive array with other arrays in it;)
//        double[] arr = new double[10];
//        for(int i = 0; i < arrayLengths.length; i++){ //for each item in array lengths
//            //50,000
//            arr[i] = rand.nextGaussian(); //generate an array of random double instance
//            add_element(randArrayLen,arr[i]);
//            //add arr into massive randArrayLen
//
//        }
    //}
}
