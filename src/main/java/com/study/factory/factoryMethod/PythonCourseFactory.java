package com.study.factory.factoryMethod;

import com.study.factory.Course;
import com.study.factory.PythonCourse;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 *//*
 @author: gaoruiqiang
 @DESCRIPTION:
 @create:2020/1/3
*/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
