package com.gymratnote.api.users.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double weightGoal;
    private String fitnessGoal;
}
