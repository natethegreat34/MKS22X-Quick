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
    int hi = end;
    int lo = start;
    int mi = (end + start)/2;
    int random = 0;
    // start + 1 is where I start
    if (data.length == 1){
        return 0;
    }
    // find median of first, last, and middle term
    if (data [lo] >= data [hi] && data [lo] >= data [mi]){
            if (data [mi] >= data [lo]){
                random = mi;
            }
            else{
                random = lo;
            }
        }
    if(data [hi] >= data [lo] && data [hi] >= data [mi]){
            if (data [mi] >= data [lo]){
                random = mi;
            }
            else{
                random = lo;
            }
        }
    if (data [mi] >= data [hi] && data [mi] >= data [lo]){
            if (data [hi] >= data [lo]){
                random = hi;
            }
            else{
                random = lo;
            }
        }
        // switches median with first term
    int holder = data [start];
    data [start] = data [random];
    data [random] = holder;
    return helper (data, start, end);
}

public static int helper (int [] data, int start, int end){
    // pivot is named and we begin partition
    int o = start;
    start ++;
    // start at start
    while (start < end){
        // if value picked is greater than pivot switch with the number at the end index
        if (data [start] > data [o]){
            int holder = data [start];
            data [start] = data [end];
            data [end] = holder;
            end --;
        }
        // if value picked is less than pivot just increase the start and keep going
        if (data [start] < data [o]){
            start ++;
            }
        else if (data [start] == data [o]){
            // if equal, 50 50 chance of going in front or behind pivot
            int r = (int)(Math.random() * (2));
            // System.out.println("r" + r);
            if (r == 1){
                int holder = data [start];
                data [start] = data [end];
                data [end] = holder;
                end --;
            }
            else{
                start ++;
            }
        }
    }
    // places the pivot back
    if (data [o] >= data[start]){
        int holder = data [o];
        data [o] = data [start];
        data [start] = holder;
        return start;
    }
    if (data[o]<data[start]){
      int holder = data[start-1];
      data[start-1]=data[o];
      data[o]= holder;
    }
    return start-1;
}

 public static int quickselect(int[] data, int k){
     int start = 0;
     int end = data.length - 1;
     while (start != end){
         int s = start;
         int e = end;
        int p = partition(data, start, end);
        // how to adjust approach based on results from pratition
        if (k == p){
         return data [k];
        }
        if (k > p){
            start = p + 1;
            end = e;
        }
        if (k < p){
            end = p - 1;
            start = s;
        }
  }
  return data [k];
}

 public static void quicksort(int []data){
     qh (data, 0, data.length-1);
 }
 public static void qh(int []data, int lo, int hi){
     // ends when low = hi
     if (lo < hi){
     int pivot = partition(data, lo, hi);
     // when a = k, you are done.
     qh(data, pivot + 1, hi);
     qh(data, lo, pivot - 1);
    }

}

 }
