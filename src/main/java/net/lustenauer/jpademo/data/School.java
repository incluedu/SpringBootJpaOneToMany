package net.lustenauer.jpademo.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patric Hollenstein on 24.10.17.
 *
 * @author Patric Hollenstein
 */
@Entity
public class School {

    @Id
    @GeneratedValue
    @Column(name = "SCHOOL_ID")
    private int id;

    @Column (name = "SCHOOL_NAME")
    private String name;

    @OneToMany (mappedBy = "school", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
