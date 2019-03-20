package com.gupao.factory.factorymethod;


import com.gupao.factory.ICourse;
import com.gupao.factory.JavaCourse;

/**
 *  某一品牌的工厂，专门负责生产的工厂
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
