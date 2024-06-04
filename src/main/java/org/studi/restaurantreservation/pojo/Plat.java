package org.studi.restaurantreservation.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int platId;

    private String libelle;

    private String description;

    private float price;
}
