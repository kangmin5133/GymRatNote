package com.gymratnote.api.users.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "trainer_profiles")
public class TrainerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String qualifications;
    private String expertise;

    // Constructor, Getters, and Setters
}
