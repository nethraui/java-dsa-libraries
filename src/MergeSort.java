//Find the index and length of first longest consecutive character sequence ? String s ="aabbbbccddbbbb" O/P :- [2,4]

public class MergeSort {

    public static void merge(Comparable[] a, Comparable aux[], int lo, int mid, int hi){
        for(int k = lo; k <= hi; k++){
            aux[k] = a[k];
        }
           
        int i = lo, j = mid+1;
        for(int k = lo; k <= hi; k++){
            if(i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(aux[j].compareTo(aux[i]) >= 0) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }


    public static void sort(Comparable a[], Comparable aux[], int lo, int hi){
        if(hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        if(a[mid+1].compareTo(a[mid])>=0){
            System.out.print("returned");
            return;
        }
        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable a[]){
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }
    public static void main(String[] args) throws Exception {
        //String s = "MERGESORTEXAMPLE";

        //String[] s = { "M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        String[] s = { "E", "R"};
        
        sort(s);

        for(String str: s){
            System.out.print(str);
        }
    }

}
