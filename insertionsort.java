import java.util.Scanner;
public class insertionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // enter size of array
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
        //Create Array
        int[] arr=new int[n];

        // Elemnet in the Array
        System.out.println("Enter th eelement in the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // insertion sort 
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+i]= arr[j];
                j--;

            }
            arr[j+1]=key;

        }
        System.out.println("sorted Array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");

        }
    sc.close();
    }
    
}
