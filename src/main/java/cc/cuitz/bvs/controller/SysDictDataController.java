package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysDictData;
import cc.cuitz.bvs.mapper.SysDictDataMapper;
import cc.cuitz.bvs.service.ISysDictDataService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 字典数据表 前端控制器
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@RestController
@RequestMapping("/sysDictData")
public class SysDictDataController {
    @Autowired
    private SysDictDataMapper sysDictDataMapper;

    @Autowired
    private ISysDictDataService sysDictDataService;

    @GetMapping("/findAll")
    public PageInfo<SysDictData> find() {
        PageHelper.startPage(1, 2);
        List<SysDictData> data = sysDictDataMapper.selectList(null);
        return PageInfo.of(data);
    }

    @PostMapping("/findPage")
    public PageInfo<SysDictData> findPage(Page<SysDictData> page) {
        return sysDictDataService.findPage(page);
    }

}
