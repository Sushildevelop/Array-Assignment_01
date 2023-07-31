package Practice.Array.Assignment_1;

public class Minimumelement {
    public static void main(String[] args) {
        int arr[]={2,-3,5,8,1,0,-4};
        int min=arr[0];
        for (int ar:arr){
            if (ar<min){
                min=ar;
            }

        }
        System.out.println(min);
    }
}
