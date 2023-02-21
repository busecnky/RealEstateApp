package com.busecnky.mapper;

import com.busecnky.dto.request.AdminSaveRequestDto;
import com.busecnky.dto.response.AdminFindAllResponseDto;
import com.busecnky.repository.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAdminMapper {

    IAdminMapper INSTANCE = Mappers.getMapper(IAdminMapper.class);

    Admin toAdmin(final AdminSaveRequestDto dto);

    AdminFindAllResponseDto adminFindAllResponseDtoFromAdmin(final Admin admin);
}
