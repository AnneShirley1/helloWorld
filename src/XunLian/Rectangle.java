package XunLian;
/**
 (1) 创建一个Rectangle类，添加width和height两个成员变量．
 (2) 在Rectangle中添加两种方法分别计算矩形的周长和面积．
 (3) 编程利用Rectangle输出一个矩形的周长和面积．
 */
public class Rectangle {
    float width, height;
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getZhouChang() {
        return (this.width + this.height) * 2;
    }

    public float getArea() {
        return this.width * this.height;
    }
    public static void main (String[]args){
        float w = 3,h=4;
        Rectangle rectangle=new Rectangle( w, h);
        System.out.println("周长为："+rectangle.getZhouChang());
        System.out.println("面积为："+rectangle.getArea());
    }
}
