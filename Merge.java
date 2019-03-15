rpublic class Merge{
    /*sort the array from least to greatest value. This is a wrapper function*/
    public static void mergesort(int[]data){
        int lo = 0;
        int hi = data.length -1;
        mergesort(data,lo,hi);
      if (lo < hi){
        int [] left;
        for (int y = lo; y < (hi+lo)/2; y ++){
            left [y] = data [y];
        }
        int [] right;
        for (int y = (hi+lo)/2; y < hi + 1; y ++){
            right [y] = data [y];
        }
        mergesort (left);
        mergesort (right);
    }
    merge (left, right, data);
}
    private static void merge(int[] left, int [] right, int [] original){
        int l = 0;
        int r = 0;
        for (;i < original.length; i ++){
            if (l < left.length && r < right.length){
                 if (left [l] <= left [r]){
                    original [i] = left [l];
                    l ++;
                }
                if (left [r] < left [l]){
                    original [i] = left [r];
                    r ++;
                }
            }
            if (l >= left.length && r < right.length){
                original [i] = left [r];
                r ++;
            }
            if (r >= right.length && l < left.length){
                original [i] = left [l];
                l ++;
            }
        }
    }
}
