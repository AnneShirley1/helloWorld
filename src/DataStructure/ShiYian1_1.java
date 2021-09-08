package DataStructure;

public class ShiYian1_1 {
    public static void main(String[] args) {
        int[] arr={100,110,115,556,196,195,194,193,192,191,190,181};
        System.out.println("排序数：");
        for(int num:arr){
            System.out.println(num+" ");
        }
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("排序后的数：");
        for(int num:arr){
            System.out.println(num+"");
        }
    }
}