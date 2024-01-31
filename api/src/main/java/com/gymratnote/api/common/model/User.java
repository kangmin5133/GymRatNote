package com.gymratnote.api.common.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    @Column(name = "accountType", nullable = false, unique = false)
    private String accountType;

    // 생성자, getter 및 setter
}
