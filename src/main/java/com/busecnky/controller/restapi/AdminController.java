package com.busecnky.controller.restapi;

import com.busecnky.dto.request.AdminSaveRequestDto;
import com.busecnky.dto.response.AdminFindAllResponseDto;
import com.busecnky.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.busecnky.constant.EndPoints.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody AdminSaveRequestDto dto){
        adminService.save(dto);
        return ResponseEntity.ok().build();
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List<AdminFindAllResponseDto>>  findAllResponseDtos(){
        return ResponseEntity.ok(adminService.findAllResponseDtos());
    }
    
}
