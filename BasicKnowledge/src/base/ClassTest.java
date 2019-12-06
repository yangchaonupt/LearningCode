package base;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangchao
 * @date 2019/12/3 9:11
 */
public class ClassTest {
    public static void main(String[] args) {
        Student s1 = new Student(18,"yc");
        Student s2 = new Student(18,"hyf");
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(JSON.toJSONString(studentList));

    }
}
