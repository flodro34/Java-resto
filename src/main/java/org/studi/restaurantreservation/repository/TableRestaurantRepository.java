package org.studi.restaurantreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.studi.restaurantreservation.pojo.TableRestaurant;

public interface TableRestaurantRepository extends JpaRepository<TableRestaurant, Long> {
}
