package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckItem;
import cc.cuitz.bvs.mapper.CheckItemMapper;
import cc.cuitz.bvs.service.ICheckItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 检查项表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class CheckItemServiceImpl extends ServiceImpl<CheckItemMapper, CheckItem> implements ICheckItemService {

}
