package XunLian;
    /**
     * 编写程序实现分母为0和数组下标越界的异常及处理，
     * 使用常见的两种检测、捕捉处理的方法，
     * 最后熟练掌握JAVA系统中现成的异常类的操作以及自定义异常等操作。
     */
    public class ShiYian7 {
        public static void main(String args[]) {
            int i;
            int[] a = {1, 2, 3,};
            for (i = 0; i < 4; i++)
            {
                try
                //由try语句来捕获产生的异常类实例化对象，
                // 而后与每一个try语句后的每一个catch进行比较，
                // 如果有合适的捕获类型，则使用当前的catch语句进行异常的处理，
                // 如果不匹配，则继续向下匹配其他的catch
                {
                    System.out.print("a[" + i + "]" + "=" + a[i]);
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("数组越界");
                }
                finally
                        //成功捕获异常，那么就继续执行finally之后的代码
                {
                    System.out.println("finally i=" + i);
                }
            }
        }
    }

