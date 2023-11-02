package hu.unideb.method.methodproject.entities;

import hu.unideb.method.methodproject.enums.ExerciseEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "EXERCISE")
    private ExerciseEnum exercise;

    @Column(name = "TIME")
    private int time;

    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExerciseEnum getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseEnum exercise) {
        this.exercise = exercise;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
