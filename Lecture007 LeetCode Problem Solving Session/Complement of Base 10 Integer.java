import java.util.Scanner;
class Myleet_2 {
    public static void main(String[] args){
             int n=0;
             Scanner sc = new Scanner(System.in);
             n=sc.nextInt();
             int i=0;
             int ans=0;
             int mask=0;
             while(n!=0){
                 int bit = n&1;
                 ans = (int)(bit*Math.pow(10,i)) + ans;
                 n=n>>1;
                 i++;
             }
        int k=ans;
        int shift=0;
             while(k!=0){
                k=k&1;
                 shift++;        
    }
    System.out.println(k);

}
}