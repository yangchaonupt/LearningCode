package base;

/**
 * 测试在函数中修改参数之后的返回值
 */
public class MethodChangeParameter {
    public static void main(String[] args) {
        System.out.println("test1=================");
        int a = 10;
        System.out.println(a);
        changeInt(a);
        System.out.println(a);
        System.out.println("test2=================");
        Student student =new Student();
        changeClass1(student);
        System.out.println(student.getName()+"+"+student.getAge());
        System.out.println("test3=================");
        Student student3 =new Student();
        changeClass2(student3);
        System.out.println(student3.getName()+"+"+student3.getAge());
    }

    public static void changeInt(int a) {
        a=20;
    }
    public static void changeClass1(Student student) {
        student.setName("yangchao");
        student.setAge(23);
    }

    public static void changeClass2(Student student) {
        Student student2=new Student(24,"小杨");
        student=student2;
    }

}
