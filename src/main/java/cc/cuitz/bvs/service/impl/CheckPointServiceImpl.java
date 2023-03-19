package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckPoint;
import cc.cuitz.bvs.mapper.CheckPointMapper;
import cc.cuitz.bvs.service.CheckPointService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 检查点表(CheckPoint)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("checkPointService")
public class CheckPointServiceImpl extends ServiceImpl<CheckPointMapper, CheckPoint> implements CheckPointService {

}
