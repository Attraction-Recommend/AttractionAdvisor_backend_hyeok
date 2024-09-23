package com.example.attractionAdvisor_hyeok.domain.attraction;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,unique = true)
    private  String name;

    private  String description;
}
