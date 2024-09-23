package com.example.attractionAdvisor_hyeok.domain.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_preferences")

public class UserPreference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Integer preferenceLevel;
}
