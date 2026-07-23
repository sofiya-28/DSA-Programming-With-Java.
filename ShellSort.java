import java.util.Scanner;
public class ShellSort {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Enter size of array
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        // create array 
        int[] arr= new int[n];

        // enter element in array
        System.out.println("enter the Elements in Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        //shell sort
        for(int gap=n/2;gap>0;gap=gap/2){
            for(int i=gap;i<n;i++){
                int temp=arr[i];
                int j;
                for(j=i;j>=gap && arr[j-gap]>temp; j=j-gap){
                    arr[j]=arr[j-gap];
                }
                arr[j]=temp;
                
            }
        }
        System.out.println("sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");

        }
    sc.close();
    }
    
}

