package com.macro.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 应用启动入口
 * Created by macro on 2018/4/26.
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan({"com.macro.mall.dao", "com.wcgj.wcq.common.base.dao"})
@ComponentScan(basePackages = {
        "com.macro.mall",
        "com.wcgj.wcq.common.exception",
        "com.wcgj.wcq.common.config",
        "com.wcgj.wcq.common.filter",
        "com.wcgj.wcq.common.base",

})
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
