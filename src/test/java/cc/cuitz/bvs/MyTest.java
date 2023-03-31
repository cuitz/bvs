package cc.cuitz.bvs;

import cc.cuitz.bvs.entity.Report;
import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.service.ReportService;
import cc.cuitz.bvs.service.SysDictDataService;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MyTest {

    @Resource
    private SysDictDataService sysDictDataService;

    @Resource
    private ReportService reportService;

    @Test
    void test() {
        Page<SysDictData> page = sysDictDataService.page(Page.of(1, 1), null);
        System.out.println(JSONUtil.toJsonStr(page));
    }

    @Test
    void test2() {
        Report report = new Report();
        report.setTaskResultId(11);
        report.setName("test");
        report.setStatus("0");
        List<Integer> fileTypes = new ArrayList<>();
        fileTypes.add(1);
        fileTypes.add(2);
        report.setFileType(fileTypes);
        report.setDownloadNumber(0);
        report.setCreator("test");
        report.setCreateTime(DateUtil.date());
        reportService.save(report);
    }
}
