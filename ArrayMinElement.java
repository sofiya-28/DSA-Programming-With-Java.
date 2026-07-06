import java.util.Scanner;

public class ArrayMinElement {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        //array size
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //no of element in array
        System.out.println("Enter the element of Array");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
            System.out.println(arr[i]);
        }
        // find maximum  num 
        int min =arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
            
        }
         System.out.println(min);

    sc.close();
    }
    
}
