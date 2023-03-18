package cc.cuitz.bvs;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.mapper.SysDictDataMapper;
import cn.hutool.json.JSONUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyTest {
    @Autowired
    private SysDictDataMapper sysDictDataMapper;

    @Test
    void test() {
        PageHelper.startPage(1, 3);
        List<SysDictData> sysDictData = sysDictDataMapper.selectList(null);
        PageInfo<SysDictData> pageInfo = PageInfo.of(sysDictData);
        System.out.println(JSONUtil.toJsonStr(pageInfo));
    }
}
