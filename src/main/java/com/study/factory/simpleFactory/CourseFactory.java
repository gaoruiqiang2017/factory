package com.study.factory.simpleFactory;

import com.study.factory.Course;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 */
public class CourseFactory {

    //如果增加类型就需要修改代码,不符合开闭原则
/*
    public Course create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourseFactory();
        } else {
            return null;
        }
    }
*/

    //是使用反射
/*    public Course create(String name) {
        try {
            if (null != name && !"".equals(name)) {
                return (Course) Class.forName(name).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    //参数直接就是类
    public Course create(Class<? extends Course> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}