class csi_source_file{
    public static void main(String[] args) {
        // float num1 = 777f;
        // float num2 = 2f;
        // System.out.println(num1/num2);
        Sum obj = new Sum();
        System.out.println(obj.add(3, 2));
    }
}
class Sum{
    int add(int a,int b){
        return(a+b);
    }
}