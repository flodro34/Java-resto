package org.studi.restaurantreservation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.repository.PlatRepository;
import org.studi.restaurantreservation.service.PlatService;

import java.util.List;

@Service
public class PlatServiceImpl implements PlatService {

    @Autowired
    private PlatRepository platRepository;

    @Override
    public List<Plat> getAllPlats() {
        return platRepository.findAll();
    }

    @Override
    public void updatePlatById(Long id, Plat plat) {
        //1. récup
       Plat oldPlat = getPlatById(id);

        if (oldPlat != null) {
            //2. modif
            oldPlat.setLibelle(plat.getLibelle());
            oldPlat.setDescription(plat.getDescription());
            oldPlat.setPrice(plat.getPrice());

            //3.insertion en bdd ( le remettre )
            platRepository.save(oldPlat);
        }

    }

    @Override
    public void deletePlatById(Long id) {
        this.platRepository.deleteById(id);

    }

    @Override
    public void createPlat(Plat plat) {
        this.platRepository.save(plat);

    }

    @Override
    public Plat getPlatById(Long id) {
        return this.platRepository.findById(id).orElse(null);
    }
}
