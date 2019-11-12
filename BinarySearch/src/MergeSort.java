public class MergeSort {
    public void merge(int[] array, int[] helper, int low, int middle, int high){
        for (int i = low; i <= high; i++){
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high){
            if (helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            }
            else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++)
            array[current + 1] = helper[helperLeft + i];
    }
}
