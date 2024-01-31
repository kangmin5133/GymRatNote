package com.gymratnote.api.diet.model;
import com.gymratnote.api.common.model.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "diet_plans")
public class DietPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String mealType;
    private Integer calories;
    private String nutrients;
    private Integer proteins;
}
