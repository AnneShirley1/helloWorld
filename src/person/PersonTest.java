package person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * 测试类
 */
public class PersonTest {
    public static void main(String[] args) throws ParseException {
        Student highSchoolStudent = new Student();
        System.out.println(highSchoolStudent.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Student student1 = new Student();
        student1.setName("陈虹");

        System.out.println("****"+student1.toString());

        PersonTest p = new PersonTest();
        p.hh();
    }

    public void hh(){
        System.out.println(123);
    }
}
