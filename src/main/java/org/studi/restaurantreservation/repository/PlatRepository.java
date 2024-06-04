package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studi.restaurantreservation.pojo.Plat;

import java.util.List;


public interface PlatRepository extends JpaRepository<Plat, Long> {

    //List<Plat> findAllByPriceLessThanEquals(float price);
}
