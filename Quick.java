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

    if (data.length == 1)
    return 0;
//[1,9,2,3,5,6]
int random = (int)(Math.random() * (data.length - 1));
// picks 3
int holder = data [0];
data [0] = data [random];
data [random] = holder;
System.out.println(data [random] + "random");
//[3,9,2,1,5,6]

return helper (data, start, end);
}
public static int helper (int [] data, int start, int end){
    String d = "";
    for (int x = 0; x < data.length; x ++){
        d = d + ", " + data [x];
    }
    System.out.println(d);
    System.out.println("s" + start);
        System.out.println("e" + end);
    while (start != end){
    //[3,9,2,1,5,6] s1 e5
        // [3,6,2,1,5,9] s1 e4
            // [3,5,2,1,6,9] s1 e3
                // [3,1,2,5,6,9] s2 e3
                    // [3,1,2,5,6,9]
                        // System.out.println("help");
    if (data [start] >= data [0]){
        int holder = data [start];
        data [start] = data [end];
        data [end] = holder;
        end --;
    }

    // [3,6,2,1,5,9] s1 e4
        // [3,5,2,1,6,9] s1 e3
            // [3,1,2,5,6,9] s1 e3
                // [3,1,2,5,6,9] s2 e3
                    // [3,1,2,5,6,9]
        if (data [start] < data [0]){
            start ++;

    }
}
    // [3,6,2,1,5,9] s1 e4
        // [3,5,2,1,6,9] s1 e3
            // [3,1,2,5,6,9] s2 e3
                // [3,1,2,5,6,9] s3 e3
        if (data [0] > data[start]){
            int holder = data [0];
            data [0] = data [start];
            data [start] = holder;
            d = "";
            for (int x = 0; x < data.length; x ++){
                d = d + ", " + data [x];
            }
            System.out.println(d);
            return start;
        }
        else{

            int holder = data [0];
            if (start -1 >= 0){
            data [0] = data [start - 1];
            data [start - 1] = holder;
            d = "";
            for (int x = 0; x < data.length; x ++){
                d = d + ", " + data [x];
            }
            System.out.println(d);
        }
        else{
            return 0;
        }
            return start-1;
        }
    }
        // [3,6,2,1,5,9] s1 e4
            // [3,5,2,1,6,9] s1 e3
                // [3,1,2,5,6,9] s2 e3
                    // [2,1,3,5,6,9] s2

    /*return the value that is the kth smallest value of the array.
 */
 // public static int quickselect(int []data, int k){
 //     // helper? with start and end
 //     int a = partition (data, 1, data.length -1);
 //     // when a = k, you are done.
 //     if (k < a){
 //         //make a new array?
 //
 //     }
 //
 // }

}
