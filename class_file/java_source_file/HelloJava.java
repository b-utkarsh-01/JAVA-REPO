import java.util.Scanner;
import javax.swing.JOptionPane;

class HelloJava{
	public static void main(String arr[]){
		Scanner scan  = new Scanner(System.in);
		System.out.println("element size of an arraya for 1st metrix:-(row,coloum)");
		int row1 = scan.nextInt();
		int commonCol1 = scan.nextInt();

		int arr1[][] = new int[row1][commonCol1];
		System.out.println("enter element in array for 1st metrix:-");
		//input element in array 1
		for(int a=0; a<row1; a++){
			for(int b=0 ;b<commonCol1;b++){
				arr1[a][b] = scan.nextInt();
			}
			System.out.println();
		}
		//output of array 1
		for(int a=0; a<row1; a++){
			for(int b=0 ;b<commonCol1;b++){
				System.out.print(arr1[a][b] + "  ");
			}
			System.out.println();
		}
		//----------------------------------------------------------
		System.out.println("element size of an arraya for 2nd metrix:-(row,coloum)");
		int RowCommonD2 = scan.nextInt();
		int col2 = scan.nextInt();

		int arr2[][] = new int[RowCommonD2][col2];
		System.out.println("enter element in array for 2nd metrix:-");
		// input element in array 2
		for(int e=0;e<RowCommonD2;e++){
			for(int f=0;f<col2;f++){
				arr2[e][f]=scan.nextInt();
			}
		}
		//output element arr2
		for (int i=0;i< RowCommonD2;++i){
			for(int j=0;j<col2;j++){
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		/*-----------------------------------------------------------*/
		int arr3[][] = new int[row1][col2];
		if(commonCol1==RowCommonD2){
		System.out.println("\n\t\t\tThe multiplication of matrix is:-");
			for(int i=0;i<row1;i++){
				for(int j=0;j<col2;j++){
					// coomon dimention will be the condition of K
					for(int k=0; k<commonCol1; k++){
							arr3[i][j] += arr1[i][k] * arr2[k][j];
					}
				}
			}
		}
		else{
			JOptionPane.showMessageDialog(null,"The multiplication of matrix\n" + "          " + "is Not Posible");
			scan.close();
			return;
		}
		//--------------------------------------------------------------------
		//using foreach loop to print arr3
		for(int []out:arr3){
			for(int out2:out){
				System.out.print(" "+out2 +" ");
			}
			System.out.println();
		}

		// for(int i=0;i<row1;i++){
		// 	for(int j=0;j<col2;j++){
		// 		System.out.print(" "+arr3[i][j] +" ");
		// 	}
		// 	System.out.println();
		// }

		scan.close();
	}
}