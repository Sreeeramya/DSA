public class Largest_bar {
    public static void main(String[] args) {
        int arr[]={2,1,5,5,2,3};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                min=Math.min(min,arr[j]);
                max=Math.max(max,min*(j-i+1));
            }
        }

        System.out.println(max);
    }
}
