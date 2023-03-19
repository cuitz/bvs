package cc.cuitz.bvs;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.service.SysDictDataService;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MyTest {

    @Resource
    private SysDictDataService sysDictDataService;

    @Test
    void test() {
        Page<SysDictData> page = sysDictDataService.page(Page.of(1, 1), null);
        System.out.println(JSONUtil.toJsonStr(page));
    }
}
