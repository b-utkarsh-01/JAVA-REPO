import java.util.Arrays;
class Object{
    public static void main(String arg[]){
        // printing 1D Array using Arrays.toString();
        // int arr1[] = {1,2,3,4};
        // System.out.println(Arrays.toString(arr1));


        // printing 2D Array using Arrays.toString();
        int arr[][] = {
                        {1,2,3,4},
                        {5,6},
                        {7,8,9,10,11}
                    };
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // Printing array using Iteration

        // for(int row=0; row<arr.length;row++){
        //     for(int col=0; col<arr[row].length;col++){
        //         System.out.print(arr[row][col]);
        //     }
        //     System.out.println();
        // }
        // //printing array using for each loop
        for(int i[]:arr){
            for(int j:i){
                System.out.println(Arrays.toString(arr));
            }
        }
        // // Another way to print multidimensional array using Arrays.deepToString();
        // System.out.println(Arrays.deepToString(arr));
        
    }
}