package entities;

import jakarta.persistence.*;

@Entity
@Table(name="users_courses")

public class UsersCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private Long courseID;
    @Column(nullable=false)
    private Long userID;
    @Column
    private int mark;

    public UsersCourses() {
    }
    public UsersCourses(int mark) {
        this.mark = mark;
    }
    public Long getCourseID() {
        return courseID;
    }
    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }
    public Long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}
