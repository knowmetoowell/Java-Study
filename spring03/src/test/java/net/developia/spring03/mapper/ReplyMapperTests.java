package net.developia.spring03.mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import net.developia.spring03.domain.Criteria;
import net.developia.spring03.domain.ReplyVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//Java Config
//@ContextConfiguration(classes = { org.zerock.config.RootConfig.class })
@Log4j
public class ReplyMapperTests {
    @Setter(onMethod_ = @Autowired)
    private ReplyMapper mapper;

    private Long[] bnoArr = {
            1394251L,
            1394252L,
            1394253L,
            1394254L,
            1394255L};

    @Test
    public void testCreate() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            ReplyVO vo = new ReplyVO();
            vo.setBno(bnoArr[i % 5]);
            vo.setReply("댓글 테스트" + i);
            vo.setReplyer("replyer" + i);

            mapper.insert(vo);
        });
    }

    @Test
    public void testRead() {
        Long targerRno = 5L;
        ReplyVO vo = mapper.read(targerRno);
        log.info(vo);
    }

    @Test
    public void testDelete() {
        Long targetRno = 1L;
        mapper.delete(targetRno);
    }

    @Test
    public void testUpdate() {
        Long targetRno = 10L;
        ReplyVO vo = mapper.read(targetRno);

        vo.setReply("updateReply");
        int count = mapper.update(vo);
        log.info("Update Count:" + count);

    }

    @Test
    public void testList() {
        Criteria cri = new Criteria();

        List<ReplyVO> replies = mapper.getListWithPaging(cri,  bnoArr[0]);

        replies.forEach(log::info);
    }

    @Test
    public void testMapper() {
        log.info(mapper);
    }
}