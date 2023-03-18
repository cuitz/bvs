package cc.cuitz.bvs;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collections;

public class Generator {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/bvs", "root", "root")
                .globalConfig(builder -> builder.disableOpenDir()
                        .outputDir(userDir + "/src/main/java")
                        .disableOpenDir()
                        .author("cuitongzhe")
                        // .enableSwagger()
                        .dateType(DateType.ONLY_DATE))
                .packageConfig(builder -> builder.parent("cc.cuitz.bvs")
                        .pathInfo(Collections.singletonMap(OutputFile.xml, userDir + "/src/main/resources/mapper")))
                // "check_item","check_point","check_script","check_strategy","report","sys_dict_data","sys_dict_type","sys_log","sys_menu","sys_role","sys_role_menu","sys_user","sys_user_role","task","task_result","task_result_item","task_result_point","task_target"
                .strategyConfig(builder -> builder.addInclude("check_item")
                        .enableSkipView()
                        // entity
                        .entityBuilder()
                        .enableFileOverride()
                        .disableSerialVersionUID()
                        .enableColumnConstant()
                        .enableLombok()
                        .enableRemoveIsPrefix()
                        .enableTableFieldAnnotation()
                        .enableActiveRecord()
                        .naming(NamingStrategy.underline_to_camel)
                        // controller
                        .controllerBuilder()
                        .enableFileOverride()
                        .formatFileName("%sController")
                        .enableRestStyle()
                        // mapper
                        .mapperBuilder()
                        // .enableBaseColumnList()
                        // .enableBaseResultMap()
                        .mapperAnnotation(Mapper.class)
                        .enableFileOverride()
                        // service
                        .serviceBuilder()
                        .enableFileOverride()
                ).execute();

    }
}
