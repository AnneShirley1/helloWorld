package XunLian;

public class ShiYian5_1 {
    private int a;
    private int b;

    public ShiYian5_1() {
        this.a = 0;
        this.b = 0;
    }

    public ShiYian5_1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ShiYian5_1(ShiYian5_1 z){
        this.a=z.geta();
        this.b=z.getb();
    }

    public int geta() {
        return a;
    }

    public int getb() {
        return b;
    }
    //复数+复数
    public ShiYian5_1 add1(ShiYian5_1 Number1, ShiYian5_1 Number2) {
        this.a = Number1.a+Number2.a;
        this.b = Number1.b+Number2.b;
        return this;
    }
    //复数-复数
    public ShiYian5_1 sub1(ShiYian5_1 Number1, ShiYian5_1 Number2) {
        this.a = Number1.a-Number2.a;
        this.b = Number1.b-Number2.b;
        return this;
    }
    //复数+实数
    public ShiYian5_1 add2(int d){
        return new ShiYian5_1(geta()+d,getb());
    }

    //复数-实数
    public ShiYian5_1 sub3(int d){
        return new ShiYian5_1(geta()-d,getb());
    }

    //复数+虚数
    public ShiYian5_1 add3(int d){
        return new ShiYian5_1(geta(),getb()+d);
    }

    //复数-虚数
    public ShiYian5_1 sub2(int d){
        return new ShiYian5_1(geta(),getb()-d);
    }

    //复数*复数
    public ShiYian5_1 mul1(ShiYian5_1 z){
        return new ShiYian5_1(geta()*z.geta()-getb()*z.getb(),
                getb()*z.geta()+geta()*z.getb());
    }

    //复数*实数
    public ShiYian5_1 mul2(int d){
        return new ShiYian5_1(geta()*d,getb()*d);
    }
    
    public static void main(String[]aegs){
        ShiYian5_1 Number1=new ShiYian5_1(1,2);
        ShiYian5_1 Number2=new ShiYian5_1(3,4);
        ShiYian5_1 sum=new ShiYian5_1();
        ShiYian5_1 diff=new ShiYian5_1();
        System.out.println("两个复数为"+Number1.a+"+"+Number1.b+"i"
                +" "+Number2.a+"+"+Number2.b+"i");
        sum.add1(Number1,Number2);
        System.out.println("复数和为："+sum.a+"+"+sum.b+"i");
        diff.sub1(Number1,Number2);
        System.out.println("复数差为："+diff.a+"+"+diff.b+"i");
    }

}

