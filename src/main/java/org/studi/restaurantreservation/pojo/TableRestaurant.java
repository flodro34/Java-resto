package org.studi.restaurantreservation.pojo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
public class TableRestaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tableId;

    //1 table dispose d'une liste de cleint
    @OneToMany(mappedBy = "tableRestaurant")
    private Set<Client> clientSet = new HashSet<>();
}
