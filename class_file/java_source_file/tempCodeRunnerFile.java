import java.util.Scanner;

class temCodeRunnerFile{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,11,8,9};
        Scanner scan = new Scanner(System.in);
        int tar = 0;
        System.out.println("Enter your num to see odd and eve\n");
        tar = scan.nextInt();
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
        }

        for(int i=0 ; i<arr.length;i++){
            if(tar%2==0){
                System.out.println(arr[i] + "even");
                break;
            }

        }
        scan.close();
    }
}