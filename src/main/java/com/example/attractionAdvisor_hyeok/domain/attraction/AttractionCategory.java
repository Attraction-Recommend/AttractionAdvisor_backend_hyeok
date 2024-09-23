package com.example.attractionAdvisor_hyeok.domain.attraction;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Entity
@Table(name = "attraction_categories")
public class AttractionCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(nullable = false,unique = true)
    private  String name;

    private  String description;
}
