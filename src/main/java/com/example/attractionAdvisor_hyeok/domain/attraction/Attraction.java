package com.example.attractionAdvisor_hyeok.domain.attraction;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="attractions")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name="TRAVEL_ID")
    private  String travelId;
    @Column(name= "POI_ID")
    private String poiId;
    @Column(name= "POI_NM")
    private String poiNm;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    protected void onUpdate(){
        updatedAt = LocalDateTime.now();
    }
}
