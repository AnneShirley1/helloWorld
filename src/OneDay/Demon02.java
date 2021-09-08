package OneDay;

//类变量，实例变量，局部变量
public class Demon02 {

        //类变量在方法外部，类里面，带有关键词static
    static double salary=2500;
       //实例变量，实例变量在方法外部，类里面，不需要初始化,
        // 如果实例变量不自行初始化，就会采用这个类型的默认值
    String name1 ;
    int age;

    public static void main(String[] args) {

        //局部变量，局部变量方法里面，必须声明和初始化,局部变量写了就可以直接用
        int i=21;
        System.out.println(i);

        Demon02 demon02= new Demon02();
        System.out.println(demon02.age);
        System.out.println(salary);

    }
    //其他方法
    public void add(){

    }
}
