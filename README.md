import java.util.Scanner;
class maxk{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int [n];
  int sum=0;
for (int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
    int max=Integer.MIN_VALUE;
   for( int i=0;i<n;i++){
   if(max<arr[i]){
    max=arr[i];
    }
   }
   System.out.println("max value ="+max);
}
}
