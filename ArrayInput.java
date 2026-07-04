import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // array size input
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        //create array
        int[] arr=new int[n];
        // input element in Array
        System.out.println("Enter the Element in Array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        // print Element
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        //sum
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
            System.out.println(sum+ " ");
        }
    sc.close();
    
    }
    
}
