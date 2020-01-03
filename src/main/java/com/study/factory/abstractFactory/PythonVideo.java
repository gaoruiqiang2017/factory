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
public class PythonVideo implements Video {
    @Override
    public void record() {
        System.out.println("python 视频");
    }
}
