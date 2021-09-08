package DataStructure;

import java.util.Arrays;

public class ShiYian1_2{
        public static void main(String[] args){
            Integer[] arr = {100,110,115,556,196,195,194,193,192,191,190,181};
            quickSort(arr,0,arr.length-1);
            System.out.println(Arrays.toString(arr));
        }

        //排序方法-假设从小到大排序
        public static void quickSort(Integer[] arr,int low,int high){
            if(low < high){
                int part=partition(arr,low,high);
                //递归调用
                quickSort(arr,low,part-1);
                quickSort(arr,part+1,high);
            }
        }

        //划分方法
        private static int partition(Integer[] arr,int low,int high){
            //使用 r[low]作为枢轴元素
            int pivot = arr[low];
            //从两端交替向内扫描
            while(low < high){
                while(low<high && arr[high] >= pivot) {high--;}
                //将比 pivot 小的元素移向低端
                arr[low] = arr[high];
                while(low<high && arr[low] <= pivot){low++;}
                //将比 pivot 大的元素移向高端
                arr[high] = arr[low];
            }
            //设置枢轴
            arr[low]=pivot;
            //返回枢轴元素位置
            return low;
        }
    }

