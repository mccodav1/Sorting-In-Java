public class ShellSort extends Sort {
    public static void ShellSort(Comparable[] a){
        int N = a.length;
        int h = 1;

        while (h<N/3) h = 3*h + 1;  // 1, 4, 13, 40, 121, 364, 1093...

        while (h>=1) {
            //h-sort the array
            for(int i = h; i < N; i++) {
                //insert a[i] among a[i-h], a[i-2*h], ...
                for (int j=i; j >= h && less(a[j], a[j-h]); j-=h){
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }

    }

}
