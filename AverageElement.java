public class AverageElement {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        double average =sum/3;
        System.out.println(sum);
        System.out.println(average);
    }
    
}
