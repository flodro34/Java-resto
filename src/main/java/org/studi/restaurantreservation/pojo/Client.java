package org.studi.restaurantreservation.pojo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String nom;

    private String prenom;

    @ManyToOne
    @JoinColumn(name="tableId")
    private TableRestaurant tableRestaurant;


}
