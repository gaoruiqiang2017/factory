package com.study.factory.abstractFactory;

/**
 * 抽象工厂是用户的主入口
 * 在Spring 中应用得最为广泛的一种设计模式
 * 易于扩展
 */
public interface CourseFactory {

    Note createNote();

    Video createVideo();
}
