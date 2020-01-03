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
public class JavaCourseFactory implements  CourseFactory {
    @Override
    public Note createNote() {
        return new JavaNote();
    }

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }
}
