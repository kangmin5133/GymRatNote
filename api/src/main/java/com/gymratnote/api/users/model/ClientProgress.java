package com.gymratnote.api.users.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "client_progress")
public class ClientProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double weight;
    private Double bodyFat;
    private String progressNotes;
}
