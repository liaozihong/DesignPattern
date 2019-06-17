package com.dashuai.learning.templatemodel;

import com.dashuai.learning.templatemodel.impl.Student;
import com.dashuai.learning.templatemodel.impl.Teacher;

/**
 * Template model application
 * <p/>
 * Created in 2019.06.17
 * <p/>
 *
 * @author Liaozihong
 */
public class TemplateModelApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.prepareGoteSchool();
        teacher.prepareGoteSchool();
    }

}
