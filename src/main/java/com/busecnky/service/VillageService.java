package com.busecnky.service;


import com.busecnky.repository.IVillageRepository;
import com.busecnky.repository.entity.Village;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class VillageService extends ServiceManager<Village, Long> {

    private final IVillageRepository villageRepository;

    public VillageService(IVillageRepository villageRepository){
        super(villageRepository);
        this.villageRepository = villageRepository;
    }
}
