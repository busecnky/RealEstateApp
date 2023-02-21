package com.busecnky.service;


import com.busecnky.repository.ICityRepository;
import com.busecnky.repository.entity.City;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CityService extends ServiceManager<City, Long> {

    private final ICityRepository cityRepository;

    public CityService(ICityRepository cityRepository){
        super(cityRepository);
        this.cityRepository = cityRepository;
    }
}
