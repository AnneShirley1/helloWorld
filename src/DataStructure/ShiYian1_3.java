package DataStructure;

public class ShiYian1_3 {
        public static void main(String[] args) {
            int[] array = {100,110,115,556,196,195,194,193,192,191,190,181};
            System.out.println("原数组：");
            for (int i : array) {
                System.out.print(i+" ");
            }
            System.out.println();
            selectSort(array);
            System.out.println("排序后：");
            for (int i : array) {
                System.out.print(i+" ");
            }
        }

        public static void selectSort(int[] arr){
            for(int i = 0; i < arr.length-1; i++){
                int min = i;
                for(int j = i+1; j <arr.length ;j++){
                    if(arr[j]<arr[min]){
                        min = j;
                    }
                }
                if(min!=i){
                    swap(arr, i, min);
                }
            }
        }
        //完成数组两元素间交换
        public static void swap(int[] arr,int a,int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

