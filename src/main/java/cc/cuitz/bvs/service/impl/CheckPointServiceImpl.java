package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckPoint;
import cc.cuitz.bvs.mapper.CheckPointMapper;
import cc.cuitz.bvs.service.ICheckPointService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 检查点表 服务实现类
 * </p>
 *
 * @author cuitongzhe
 * @since 2023-03-18
 */
@Service
public class CheckPointServiceImpl extends ServiceImpl<CheckPointMapper, CheckPoint> implements ICheckPointService {

}
