public class LargestElement {
    public static void main(String[] args) {
        int[] arr={20,30,40,60,50,10};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max =arr[i];
        }
        System.out.println(max);
    }
    
}
