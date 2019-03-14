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
    int mi = (end - start + 1)/2;
    int random = 0;
    // start + 1 is where I start
    if (data.length == 1){
        return 0;
    }
    // int random = (int)(Math.random() * (data.length - 1));
    if (data [lo] >= data [hi]){
        if (data [lo] > data [mi]){
            if (data [mi] > data [lo]){
                random = mi;
            }
            else{
                random = lo;
            }
        }
    }
    else if(data [hi] > data [lo]){
        if (data [hi] > data [mi]){
            if (data [mi] > data [lo]){
                random = mi;
            }
            else{
                random = lo;
            }
        }
    }
    else if(data [mi] >= data [hi]){
        if (data [mi] > data [lo]){
            if (data [hi] > data [lo]){
                random = hi;
            }
            else{
                random = lo;
            }
        }
    }
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
//         String d = "";
// for (int x = 0; x < data.length; x ++){
//     d = d + ", " + data [x];
// }
// System.out.println(d);
        if (data [start] > data [o]){
            int holder = data [start];
            data [start] = data [end];
            data [end] = holder;
            end --;
        }
        else if (data [start] < data [o]){
            start ++;
            }
        else if (data [start] == data [o]){
            int r = (int)(Math.random() * (2));
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
     if (k > 0){
     int start = 0;
     int end = data.length - 1;
     while (start != end){
         int s = start;
         int e = end;
        int p = partition(data, start, end);
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
  int min = 0;
  for (int y = 0; y < data.length; y ++){
      if (data [min] > data [y]){
          min = y;
      }
  }
  return min;
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
