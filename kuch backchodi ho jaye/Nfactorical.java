import java.util.Scanner;
class Nfactorical{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
		scan.close();

		System.out.print("0 1 ");
		
		for(int i=1; i<=n; i++){
			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}
	}
}