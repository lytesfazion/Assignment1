public class MergeSort {

    public void mergeSort(double[]array, int lowIndex, int highIndex){
        if(highIndex-lowIndex>1){
            mergeSort(array,lowIndex,highIndex/2); //calling merge sort on the bottom half aka send the left half
            mergeSort(array,highIndex/2+ 1,highIndex); //calling merge sort on the top half aka sends the right half
            merge(array,lowIndex,highIndex/2 + 1,highIndex);
        }
    }
    public static double[] merge(double[] arr,int low, int mid, int high){
        //int length = high - low +1;
        int indexlow = low;
        int indexhigh = mid;
        int index = low;
        double[] Barr = new double[0];

        while (indexlow < mid || indexhigh < high){
            if (indexlow >= mid){
                Barr[index] = arr[indexhigh];
                index ++;
                indexhigh++;
            }
            else if(indexhigh > high){
                Barr[index] = arr[indexlow];
                index = index + 1;
                indexlow++;
            }
            else if(arr[indexlow] <= arr[indexhigh]){
                Barr[index] = arr[indexlow];
                index++;
                indexlow++;
            }
            else {
                Barr[index] = arr[indexhigh];
                index++;
                indexhigh++;
            }
        }
        for (int i = low; i <= high; i++){
            arr[i] = Barr[i];

        }
        return arr;
    }

}

//    int[] mErge(int[] arr, int[] low, int[] high, int left, int right) {
//        int indexlow = 0, indexhigh = 0, k = 0;
//        while (indexlow < left && indexhigh < right) {
//            if (low[indexlow] <= high[indexhigh]) {
//                arr[k++] = low[indexlow++];
//            }
//            else {
//                arr[k++] = high[indexhigh++];
//            }
//        }
//        while (indexlow < left) {
//            arr[k++] = low[indexlow++];
//        }
//        while (indexhigh < right) {
//            arr[k++] = high[indexhigh++];
//        }
//    }


//        if (lowIndex == highIndex){ // aka if there is only one item in the list //this is our base case
//            return;
//        }
//        int middleIndex = (lowIndex + highIndex)/2;
//
//        mergeSort(array,lowIndex,middleIndex); //calling merge sort on the bottom half aka send the left half
//        mergeSort(array,middleIndex + 1,highIndex); //calling merge sort on the top half aka sends the right half
//        merge(array,lowIndex,middleIndex + 1,highIndex);