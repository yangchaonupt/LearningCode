package base;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yangchao
 * @date 2019/9/20 18:28
 */
public class TimeTest {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1547L);
        list.add(15569L);
        list.add(1563L);
        list.add(159874L);
        list.add(13581L);
        list.add(1545L);
        List<Long> rest= list.stream().filter(p -> p%10>=3&&p%10<=5).collect(Collectors.toList());
        System.out.println(rest);
        List<Student> list1 = new ArrayList<>();
        Student s1= new Student(1,"1Q");
        Student s2= new Student(2,"2W");
        Student s3= new Student(3,"3E");
        Student s4= new Student(4,"4R");
        Student s5= new Student(5,"5T");
        Student s6= new Student(6,"6Y");
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);
        list1.add(s5);
        list1.add(s6);
        list1= list1.stream().filter(p -> p.getAge()%10>=1&&p.getAge()%10<=3).collect(Collectors.toList());
        list1.stream().forEach(p -> {
            System.out.println(p.getAge()+"  "+p.getName());
        });




    }
}
