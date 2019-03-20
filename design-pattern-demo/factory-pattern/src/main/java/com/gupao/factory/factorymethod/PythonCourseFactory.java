package com.gupao.factory.factorymethod;


import com.gupao.factory.ICourse;
import com.gupao.factory.PythonCourse;

/**
 *
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
