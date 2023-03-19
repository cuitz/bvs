package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckStrategy;
import cc.cuitz.bvs.mapper.CheckStrategyMapper;
import cc.cuitz.bvs.service.CheckStrategyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 核查策略表(CheckStrategy)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("checkStrategyService")
public class CheckStrategyServiceImpl extends ServiceImpl<CheckStrategyMapper, CheckStrategy> implements CheckStrategyService {

}
