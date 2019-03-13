public class Quick{
/*Choose a random pivot element between the start and end index inclusive,
 Then modify the array such that:
 *1. Only the indices from start to end inclusive are considered in range
 *2. A random index from start to end inclusive is chosen, the corresponding
 *   element is designated the pivot element.
 *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
 *4. all elements in range that are larger than the pivot element are placed after the pivot element.
 *@return the index of the final position of the pivot element.
 */
public static int partition (int [] data, int start, int end){
    // start + 1 is where I start
    if (data.length == 1){
        return 0;
    }
    int random = (int)(Math.random() * (data.length - 1));
    int holder = data [start];
    data [start] = data [random];
    data [random] = holder;
    return helper (data, start, end);
}

public static int helper (int [] data, int start, int end){
    int o = start;
    start ++;
    // start at start
    while (start != end){
        if (data [start] >= data [o]){
            int holder = data [start];
            data [start] = data [end];
            data [end] = holder;
            end --;
        }
        else{
            if (data [start] < data [o]){
            start ++;
            }
        }
    }
    if (data [o] > data[start]){
        int holder = data [o];
        data [o] = data [start];
        data [start] = holder;
        return start;
    }
    else{
        int holder = data [o];
        if (start -1 >= o){
            data [o] = data [start - 1];
            data [start - 1] = holder;
            return start - 1;
        }
        else{
            return o;
        }
    }
}
 public static int quickselect(int[] data, int k){
     int start = 0;
     int end = data.length;
     while (start != end){
        int p = partition(data, start, end);
        if (k - 1 == p){
         return data [k - 1];
        }
        if (k - 1 > p){
            start = p + 1;
        }
        if (k - 1 < p){
            end = p - 1;
        }
  }
  return data [k - 1];
}

 // public static int quicksort(int []data, int lo, int hi){
 //     // helper? with start and end
 //     if (lo >= hi){
 //         return;
 //     }
 //     int pivot = partition(data, lo, hi);
 //     // when a = k, you are done.
 //     quicksort(data, pivot + 1, hi);
 //     quicksort(data, 0, pivot);
 //
 //     }

 }
