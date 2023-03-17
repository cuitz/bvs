package cc.cuitz.bvs;

import cc.cuitz.bvs.entity.SysDictType;
import cc.cuitz.bvs.mapper.SysDictMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author cuitongzhe
 * @date 2023/3/17
 */
@SpringBootTest
public class SampleTest {
    @Autowired
    private SysDictMapper sysDictMapper;

    @Test
    void testList() {
        List<SysDictType> sysDictTypes = sysDictMapper.selectList(null);
        System.out.println(sysDictTypes);
    }

}
