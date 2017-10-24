package net.lustenauer.jpademo;

import net.lustenauer.jpademo.data.School;
import net.lustenauer.jpademo.data.Student;
import net.lustenauer.jpademo.repository.SchoolRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Patric Hollenstein on 24.10.17.
 *
 * @author Patric Hollenstein
 */


@Controller
public class MyController {
    private final Logger logger = LoggerFactory.getLogger(MyController.class);

    final SchoolRepository schoolRepository;

    @Autowired
    public MyController(SchoolRepository schoolRepository) {
        logger.info("MyController()");

        this.schoolRepository = schoolRepository;

        School school = new School();
        Student student1 = new Student();
        Student student2 = new Student();


        school.setName("My school");

        student1.setName("Student 1");
        student2.setName("Student 2");


        student1.setSchool(school);
        student2.setSchool(school);

        school.getStudents().add(student1);
        school.getStudents().add(student2);

        schoolRepository.saveAndFlush(school);


        List<School> schools = schoolRepository.findAll();


        logger.info(schools.get(0).getStudents().get(0).getName());
        logger.info(schools.get(0).getStudents().get(1).getName());
    }
}
