package study;

public class jieko {
    interface CompurerAverage {//接口CompurerAverage

        public double average(double a, double b);
    }

    static class A implements CompurerAverage {
        public double average(double a, double b) {
            double aver = 0;
            aver = (a + b) / 2;//算术均值
            return aver;
        }
    }

    static class B implements CompurerAverage {
        public double average(double a, double b) {
            double aver = 0;
            aver = Math.sqrt(a * b);//平方根
            return aver;
        }
    }

    static class Example6_4 {
        public static void main(String args[]) {
            CompurerAverage computer;//接口对象 computer
            double a = 11.23, b = 22.78;
            computer = new A(); //创建了一个对象， 赋值给computer
            double result = computer.average(a, b);//A类中的算术均值
            System.out.printf("%5.2f和%5.2f的算术平均值:%5.2f\n", a, b, result);

            computer = new B();  //创建了一个对象， 赋值给computer
            result = computer.average(a, b);//B类中的平方根
            System.out.printf("%5.2f和%5.2f的几何平均值:%5.2f", a, b, result);
        }
    }
    //接口CompurerAverage
}
    class A implements jieko.CompurerAverage {
        public double average(double a,double b) {
            double aver=0;
            aver=(a+b)/2;//算术均值
            return aver;
        }
    }
    class B implements jieko.CompurerAverage {
        public double average(double a,double b) {
            double aver=0;
            aver=Math.sqrt(a*b);//平方根
            return aver;
        }
    }
    class Example6_4 {
        public static void main(String args[]) {
            jieko.CompurerAverage computer;//接口对象 computer
            double a=11.23,b=22.78;
            computer = new A(); //创建了一个对象， 赋值给computer
            double result = computer.average(a,b);//A类中的算术均值
            System.out.printf("%5.2f和%5.2f的算术平均值:%5.2f\n",a,b,result);

            computer = new B();  //创建了一个对象， 赋值给computer
            result= computer.average(a,b);//B类中的平方根
            System.out.printf("%5.2f和%5.2f的几何平均值:%5.2f",a,b,result);
        }
    }


