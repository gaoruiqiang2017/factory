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
public class PythonNote implements Note {
    @Override
    public void edit() {
        System.out.println("python 笔记");
    }
}
