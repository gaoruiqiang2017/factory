package com.study.factory;

/**
 * @Author gaoruiqiang
 * @Description
 * @Date:03
 */
public class JavaCourse implements Course {
    @Override
    public void record() {
        System.out.print("录制JAVA课程");
    }
}
