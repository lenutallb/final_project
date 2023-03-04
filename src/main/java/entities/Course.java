package entities;

import jakarta.persistence.*;
import models.Courses;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")

public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable=false, unique=true)
        private Courses name;

        public Course() { }

    public Course(Courses name) {
        this.name = name;
    }

        public Long getId() {
        return this.id;
    }

        public Courses getName() {
        return this.name;
    }

        public void setName(Courses name) {
        this.name = name;
    }

        @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
        // users mapped by courses
        @JoinTable(
                name="users_courses",
                joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
                inverseJoinColumns={@JoinColumn(name="COURSE_ID", referencedColumnName="ID")})
        private List<User> usersByCourse = new ArrayList<>();


    }
