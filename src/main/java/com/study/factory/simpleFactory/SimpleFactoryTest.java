package com.study.factory.simpleFactory;

import com.study.factory.JavaCourse;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 *//*
 @author: gaoruiqiang
 @DESCRIPTION:
 @create:2020/1/3
*/
public class SimpleFactoryTest {

    public static void main(String[] args) {

        //第一层 父类指向子类引用
    /*  Course course = new JavaCourse();
        course.record();*/

        //第二层 简单工厂,将创建细节隐藏
/*        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create("python").record();*/

        //第三层,使用反射,参数是字符串,还需要强制转型,还可以优化
/*        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create("com.study.factory.JavaCourse").record();*/

        //第四层,可控制性提升
        CourseFactory courseFactory = new CourseFactory();
        courseFactory.create(JavaCourse.class).record();
    }
}
