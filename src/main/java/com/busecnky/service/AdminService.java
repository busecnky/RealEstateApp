package com.busecnky.service;


import com.busecnky.dto.request.AdminSaveRequestDto;
import com.busecnky.dto.response.AdminFindAllResponseDto;
import com.busecnky.mapper.IAdminMapper;
import com.busecnky.repository.IAdminRepository;
import com.busecnky.repository.entity.Admin;
import com.busecnky.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService extends ServiceManager<Admin, Long> {

    private final IAdminRepository adminRepository;

    public AdminService(IAdminRepository adminRepository){
        super(adminRepository);
        this.adminRepository = adminRepository;
    }

    public void save(AdminSaveRequestDto dto){
        Admin admin = IAdminMapper.INSTANCE.toAdmin(dto);
        if(admin.getUsername()==null||admin.getPassword()==null) return;
        adminRepository.save(admin);

    }

    public List<AdminFindAllResponseDto> findAllResponseDtos(){
        List<AdminFindAllResponseDto> result = new ArrayList<>();
        findAll().forEach(x->{
            result.add(IAdminMapper.INSTANCE.adminFindAllResponseDtoFromAdmin(x));
        });
        return result;
    }

}
