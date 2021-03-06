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
public class AbstractFactoryTest {

/*    这段抽象工厂代码完整地描述了两个产品族Java 课程和Python 课程，也描述了两个产品等级
    视频和手记。抽象工厂非常完美清晰地描述这样一层复杂的关系。但是，不知道大家有
    没有发现，如果我们再继续扩展产品等级，将源码Source 也加入到课程中，那么我们的
    代码从抽象工厂，到具体工厂要全部调整，很显然不符合开闭原则。因此抽象工厂也是
    有缺点的：
            1、规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂
    的接口。
            2、增加了系统的抽象性和理解难度。
    但在实际应用中，我们千万不能犯强迫症甚至有洁癖。在实际需求中产品等级结构升级
    是非常正常的一件事情。我们可以根据实际情况，只要不是频繁升级，可以不遵循开闭
    原则。代码每半年升级一次或者每年升级一次又有何不可呢？*/

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createNote().edit();
        courseFactory.createVideo().record();

        CourseFactory factory = new PythonCourseFactory();
        factory.createVideo().record();
        factory.createNote().edit();
    }

}
