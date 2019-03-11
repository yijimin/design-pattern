package com.gupao.factory.factorymethod;


import com.gupao.factory.ICourse;
import com.gupao.factory.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
