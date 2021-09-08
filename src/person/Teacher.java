package person;

import javax.xml.crypto.Data;

/**
 * 老师类
 */
public class Teacher {
    private String name;
    private String sex;
    private int age;
    private Data birthday;
    private String school;

    public Teacher() {
    }

    public Teacher(int age, String school) {
        this.age = age;
        this.school = school;
    }

    public Teacher(String name, String sex, int age, Data birthday, String school) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", school='" + school + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
