package com.busecnky.service;


import com.busecnky.repository.IHouseRepository;
import com.busecnky.repository.entity.House;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HouseService extends ServiceManager<House, Long> {

    private final IHouseRepository houseRepository;

    public HouseService(IHouseRepository houseRepository){
        super(houseRepository);
        this.houseRepository = houseRepository;
    }
}
