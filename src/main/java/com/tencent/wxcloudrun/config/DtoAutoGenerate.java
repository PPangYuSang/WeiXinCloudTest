package com.tencent.wxcloudrun.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author pangyusang
 * @Date 2022/7/21 3:06 下午
 **/
@Component
public class DtoAutoGenerate {
    /**
     * mp根据数据库表自动生成实体类文件
     * */
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://sh-cynosdbmysql-grp-hcr3vuzi.sql.tencentcdb.com:29136/springboot_demo?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf8&autoReconnect=true&useSSL=false", "root", "P6JJf6e5")
                .globalConfig(builder -> {
                    builder.author("PangYu") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            /*.outputDir("D://")*/; // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("pangyu") // 设置父包名
                        .entity("dto")
                            /*.pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://"))*/; // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("User_Info") // 设置需要生成的表名
                        .entityBuilder().enableLombok(); // 启动lombok
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
