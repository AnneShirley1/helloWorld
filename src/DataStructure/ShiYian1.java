package DataStructure;

/**
 * 编程实现4种常用内部排序算法：直接插入排序、冒泡排序、快速排序和简单选择排序。
 （1）对每种排序方法，记录其数据比较次数和数据移动次数。
 （2）要求待排序数据不少于100，数据分布在一个较大的范围内，若1000。
 （3）待排序序列考虑三种数据分布：数据序列随机分布、数据序列递增有序、数据序列递减有序。
 */
public class ShiYian1 {
    public static void main(String[] args) {
        int[] values = { 100,110,115,556,196,195,194,193,192,191,190,181};
        sort(values);
        for (int i = 0; i < values.length; ++i)
        {
            System.out.println(values[i]);
        }
    }
    public static void sort(int[] values)
    {
        int temp;
        int j = 0;
        for (int i = 1; i < values.length; i++)
        {
            if(values[i]<values[i-1])//此处的判断很重要，这里体现了插入排序比冒泡排序和选择排序快的原因。
                 {
                     temp = values[i];
                     //数据往后移动
                  for (j=i-1; j>=0 && temp<values[j]; j--)
                  {
                      values[j+1] =values[j];
                  }
                  //将数据插入到j+1位置
                     values[j+1] =temp;
                  System.out.print("第" + (i + 1) + "次：");
                  for (int k = 0; k < values.length; k++)
                  {
                      System.out.print(values[k]+",");
                  }
                  System.out.println("");
                 }
        }
    }
}

