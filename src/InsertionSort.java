public class InsertionSort extends Sort {

    public static void sort(Comparable[] a){
        int N = a.length;

        for (int i = 1; i < N; i++){
            // insert a[i] among a[i-1], a[i-2], a[i-3]...
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exch(a, j, j-1);
            }
        }
    }
}
