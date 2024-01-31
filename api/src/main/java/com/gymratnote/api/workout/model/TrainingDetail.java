package com.gymratnote.api.workout.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Data
@Table(name = "training_details")
public class TrainingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    private Double weight;
    private Integer reps;
    private Integer sets;
    private Date trainingDate;

    // Constructor, Getters, and Setters
}
