package com.gymratnote.api.workout.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "training_splits")
public class TrainingSplit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String splitType;
    private String dayOfWeek;
    private String bodyParts;

    // Constructor, Getters, and Setters
}
