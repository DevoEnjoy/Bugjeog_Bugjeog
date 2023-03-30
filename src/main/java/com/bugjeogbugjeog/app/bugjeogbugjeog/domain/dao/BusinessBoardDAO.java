package com.bugjeogbugjeog.app.bugjeogbugjeog.domain.dao;

import com.bugjeogbugjeog.app.bugjeogbugjeog.domain.dto.BoardBusinessDTO;
import com.bugjeogbugjeog.app.bugjeogbugjeog.domain.vo.BoardBusinessVO;
import com.bugjeogbugjeog.app.bugjeogbugjeog.mapper.BusinessBoardImgMapper;
import com.bugjeogbugjeog.app.bugjeogbugjeog.mapper.BusinessBoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class BusinessBoardDAO {
    private final BusinessBoardMapper businessBoardMapper;


    //    추가
    public Long save(BoardBusinessVO boardBusinessVO){ return businessBoardMapper.insert(boardBusinessVO); }

    //    삭제
    public void deleteById(Long boardBusinessId){ businessBoardMapper.delete(boardBusinessId);}

    //    조회(이미지 정보까지)
    public BoardBusinessDTO findById(Long boardBusinessId){ return businessBoardMapper.select(boardBusinessId);}

    public List<BoardBusinessDTO> findByBusinessId(Long businessId){ return businessBoardMapper.selectAllByBusinessId(businessId);}

    //    목록(대표 이미지 하나)
    public List<BoardBusinessDTO> findAll(){ return businessBoardMapper.selectAllList(); }

    //    목록(대표 이미지 하나)
    public List<BoardBusinessDTO> findAll(Map<String, Object> searchMap){ return businessBoardMapper.selectAllListBySearch(searchMap); }

}
