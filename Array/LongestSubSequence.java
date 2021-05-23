package Array;
import java.util.*;
class LongestsubSequence
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int max = 0;
    int count = 1;
    
    for(int i = 0;i<n;i++){
       arr[i] = sc.nextInt();
    }
    
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1] && count>max){
            max = count;
            count = 1;
        }else if(arr[i]<arr[i+1]){
            count++;
        }
    }
    System.out.println(max); 
  }
}