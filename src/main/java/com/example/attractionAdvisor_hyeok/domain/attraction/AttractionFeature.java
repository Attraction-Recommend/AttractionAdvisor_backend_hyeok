package com.example.attractionAdvisor_hyeok.domain.attraction;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "attraction_features")
public class AttractionFeature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "attraction_id",nullable = false)
    private Attraction attraction;

    @Column(nullable = false)
    private  String featureName;

    @Column(nullable = false)
    private String featureValue;
}
