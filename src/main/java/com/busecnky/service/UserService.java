package com.busecnky.service;


import com.busecnky.repository.IUserRepository;
import com.busecnky.repository.entity.User;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceManager<User, Long> {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        super(userRepository);
        this.userRepository = userRepository;
    }
}
