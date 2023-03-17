package cc.cuitz.bvs;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.service.ICheckItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyTest {

    @Autowired
    private ICheckItemService checkItemService;

    @Test
    void test() {
        List<CheckItem> list = checkItemService.list();
        System.out.println(list);
    }
}
