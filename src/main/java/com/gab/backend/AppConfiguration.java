package com.gab.backend;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration

import javax.sql.DataSource;

@Configuration
@MapperScan(value = "com.gab.backend" , sqlSessionFactoryRef = "backendSessioFactory")
public class AppConfiguration {
    @Bean(name = "backendSessionFactory", destroyMethod = "")
    public SqlSessionFactoryBean backendSessionFactory(@Named(databaseConfiguration.MIDDLEWARE_DATASOURCE)
                                                       final DataSource anotherDataSource)throws Exception{
        final SqlSessionFActoryBean slqSessionFActoryBean = new SqlSession
    }
}
