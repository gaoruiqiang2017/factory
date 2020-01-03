package com.study.factory.factoryMethod;

import com.study.factory.Course;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 *//*
 @author: gaoruiqiang
 @DESCRIPTION:
 @create:2020/1/3
*/
public class FactoryMethodTest {

/*    工厂方法适用于以下场景：
            1、创建对象需要大量重复的代码。
            2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
            3、一个类通过其子类来指定创建哪个对象。
    工厂方法也有缺点：
            1、类的个数容易过多，增加复杂度。
            2、增加了系统的抽象性和理解难度。*/

    public static void main(String[] args) {
        //工厂模式,每种语言都有自己的工厂来创建实例,创建的逻辑可以不同
        CourseFactory courseFactory = new JavaCourseFactory();
        Course course = courseFactory.create();
        course.record();

        CourseFactory python = new PythonCourseFactory();
        python.create().record();
    }
}
