import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
        Scanner st  =new Scanner(System.in);
        System.out.println("Enter your choice");
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= st.nextInt();
        }
        
    st.close();
    }
    
}
