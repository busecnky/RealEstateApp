package com.busecnky.service;


import com.busecnky.repository.ICountryRepository;
import com.busecnky.repository.entity.Country;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends ServiceManager<Country, Long> {

    private final ICountryRepository countryRepository;

    public CountryService(ICountryRepository countryRepository){
        super(countryRepository);
        this.countryRepository = countryRepository;
    }
}
