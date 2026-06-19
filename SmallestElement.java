public class SmallestElement { 
    public static void main(String[] args) {
        int[] arr= {40,30,90,80,70};
        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];

        }
        System.out.println(min);
    }
    
}
