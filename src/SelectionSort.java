public class SelectionSort extends Sort {

    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i=0; i<N; i++)
        {
            /// Exchange a[i] with smallest entry in a[i+1]...a[N-1]
            int min = i;
            for (int j = i+1; j < N; j++)
                if (less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }
}
