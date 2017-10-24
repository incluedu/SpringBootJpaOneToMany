package net.lustenauer.jpademo.data;

import javax.persistence.*;

/**
 * Created by Patric Hollenstein on 24.10.17.
 *
 * @author Patric Hollenstein
 */

@Entity
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "STUDENT_ID")
    private int id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private School school;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
