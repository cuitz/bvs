package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.mapper.CheckItemMapper;
import cc.cuitz.bvs.service.CheckItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 检查项表(CheckItem)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 00:13:11
 */
@Service("checkItemService")
public class CheckItemServiceImpl extends ServiceImpl<CheckItemMapper, CheckItem> implements CheckItemService {

}
