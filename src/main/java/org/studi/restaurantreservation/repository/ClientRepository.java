package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studi.restaurantreservation.pojo.Client;

public interface ClientRepository extends JpaRepository <Client, Long>{
}
