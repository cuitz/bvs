package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.CheckScript;
import cc.cuitz.bvs.mapper.CheckScriptMapper;
import cc.cuitz.bvs.service.CheckScriptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 检查脚本表(CheckScript)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-19 17:56:34
 */
@Service("checkScriptService")
public class CheckScriptServiceImpl extends ServiceImpl<CheckScriptMapper, CheckScript> implements CheckScriptService {

}
