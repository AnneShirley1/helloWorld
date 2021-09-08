package XunLian;

/**
 * .编写一个Java程序，在程序中定义一个接口Shape，
 * 定义一个类Cylinder实现接口Shape，在Cylinder类中实现Shape接口中的抽象方法。
 */
public class ShiYian6_1 {
    interface Shape {
        float area();
    }
    static class Cylinder implements Shape {
        private float bottom;
        private float height;
        public Cylinder(float i, float i1) {
        }
        public float area() {
            return bottom * height;
        }
    }
    static class MyInterface {
        public static void main(String[] args) {
           float bottom=2;float height=3;
            Cylinder a = new Cylinder( 2,  3);
            System.out.println("面积："+a);
        }
    }
}
