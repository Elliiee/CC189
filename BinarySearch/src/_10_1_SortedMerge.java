public class _10_1_SortedMerge {
    public void sortedMerge(int[] a, int[] b, int lastA, int lastB){
        int indexA = lastA - 1;
        int indexB = lastB - 1;
        int indexMerged = lastA + lastB - 1;

        while (lastB >= 0){
            if (indexA >= 0 && a[indexA] > a[indexB]){
                a[indexMerged] = a[indexA];
                indexA--;
            } else {
                a[indexMerged] = a[indexB];
                indexB--;
            }
            indexMerged--;
        }
    }

    public static void main(String[] args){
        int[] a = new int[30];
        for (int i = 0; i < 10; i ++){
            a[i] = i;
        }
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        _10_1_SortedMerge sm = new _10_1_SortedMerge();
        sm.sortedMerge(a, b, 10, 10);
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] +" ");
        }

    }
}
