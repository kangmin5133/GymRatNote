package com.gymratnote.api.users.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "trainer_clients")
public class TrainerClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private User trainer;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
