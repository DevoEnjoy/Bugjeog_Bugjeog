package com.bugjeogbugjeog.app.bugjeogbugjeog.mapper;

import com.bugjeogbugjeog.app.bugjeogbugjeog.domain.dto.InterestingCompanyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InterestingCompanyMapper {
    //         관심업체 리스트
    public List<InterestingCompanyDTO> selectInterestingCompany();

}
