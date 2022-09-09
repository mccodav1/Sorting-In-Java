import java.util.Random;
public class MergeSort extends Sort{

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];    // empty identical array for merging
        sort(a, aux, 0, a.length-1);

        assert isSorted(a); // enable -ea in VM configuration
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if(hi<=lo) return;  // indicates start and end pointers are same, or end is before start (0 or 1 elem)
        int mid = lo + (hi - lo) / 2;   // why not (lo+hi)/2? integer overflow.

        sort(a, aux, lo, mid);          // sort first half
        sort(a, aux, mid+1, hi);     // sort second half
        merge(a, aux, lo, mid, hi);     // merge together
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        assert isSorted(a, lo, mid);
        assert isSorted(a, lo, mid);

        int i = lo, j = mid+1;

        for(int k = lo; k <=hi; k++) {
            aux[k] = a[k];
        }

        //merge back to all
        for (int k = lo; k<= hi; k++){
            if      (i>mid)                 a[k] = aux[j++];    // we've used up all 'first half' elems, fill
            else if (j>hi)                  a[k] = aux[i++];    // we've used up all 'second half' elems, fill
            else if (less(aux[j], aux[i]))  a[k]=aux[j++];      // move the lesser one 'up' to a from aux
            else                            a[k]=aux[i++];
        }

        assert isSorted(a, lo, hi);
    }

    public static boolean isSorted(Comparable a[], int lo, int hi) {
        for (int i = lo+1; i <= hi; i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
}
