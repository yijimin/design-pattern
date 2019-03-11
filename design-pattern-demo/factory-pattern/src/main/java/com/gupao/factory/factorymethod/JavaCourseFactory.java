package com.gupao.factory.factorymethod;


import com.gupao.factory.ICourse;
import com.gupao.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
