package com.kjtang.uums.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by kaijun on 2018/3/17.
 * Mybatis配置
 */
@Configuration
public class MyBatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/**/mapper/*.xml"));
        return sqlSessionFactoryBean;
    }

    @Configuration
    @AutoConfigureAfter(MyBatisConfig.class)
    public static class MyBatisMapperScannerConfigurer {

        @Bean
        public MapperScannerConfigurer mapperScannerConfigurer() {
            MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
            mapperScannerConfigurer.setBasePackage("com.kjtang.uums.*.dao");
            mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
            return mapperScannerConfigurer;
        }

    }

}
