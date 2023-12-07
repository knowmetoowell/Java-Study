package net.developia.spring03.mapper;

import net.developia.spring03.domain.Criteria;
import net.developia.spring03.domain.ReplyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReplyMapper {
    public int insert(ReplyVO vo);

    public ReplyVO read(Long bno);

    public int delete(Long rno);

    public int update(ReplyVO reply);
    public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno);
}
