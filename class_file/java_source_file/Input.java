class Input{
	public static void main(String[] args) {
		// int n1=0,n2=1,result=0;
		// Scanner scan = new Scanner (System.in);
		// int n = scan.nextInt();
		// int arr[] = new int[n];

		// System.out.print(n1+" " +" ");

		// for(int i=0;i<=arr.length;i++){
		// 	result += n1 + n2;
		// 	n1=result;
		// 	result=n2;
		// 	n2=n1;
		// 	System.out.print(" "+result);
		// }
		//  scan.close();
		System.out.println(recursion(5));
	}
	static int recursion(int i){
		if(i<=1){
			return 0;
		}
		else{
			return i * recursion(i);
		}
	}
}