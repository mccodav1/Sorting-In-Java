public abstract class Sort {
    //implement in subclasses
    /*public void sort(Comparable[] a){
        //TODO implement in subclasses
    }*/


    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static void show(Comparable[] a) {
        for(int i=0; i < a.length; i++){
            System.out.println(a[i] + " ");
        System.out.println();
        }
    }

    public static boolean isSorted(Comparable a[]) {
        for (int i = 1; i < a.length; i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //String[] a = {"S", "O", "R", "T", "E", "X"};
        //sort(a);
        //assert isSorted(a);
        //show(a);
        //System.out.println("");
        //String[] b = {"S", "O", "R", "T", "E", "X"};
        //SelectionSort.sort(b);
        //assert isSorted(b);
        //show(b);
        String[] c = {"S", "O", "R", "T", "E", "X"};
        show(c);
        InsertionSort.sort(c);
        show(c);

    }
}
