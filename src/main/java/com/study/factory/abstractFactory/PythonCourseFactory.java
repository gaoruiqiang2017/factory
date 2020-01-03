package com.study.factory.abstractFactory;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 *//*
 @author: gaoruiqiang
 @DESCRIPTION:
 @create:2020/1/3
*/
public class PythonCourseFactory implements  CourseFactory {
    @Override
    public Note createNote() {
        return new PythonNote();
    }

    @Override
    public Video createVideo() {
        return new PythonVideo();
    }
}
