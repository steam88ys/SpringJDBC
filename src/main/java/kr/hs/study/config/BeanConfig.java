package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration // 자바로 설정한 설정파일
@ComponentScan(basePackages = {"kr.hs.study.beans","kr.hs.study.dao"})
public class BeanConfig {


        //Datasource DB접속정보
        @Bean
        public BasicDataSource source() {
            BasicDataSource source = new BasicDataSource();
            source.setDriverClassName("oracle.jdbc.OracleDriver");
            source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
            source.setUsername("scott"); //username
            source.setPassword("tiger"); //password

            return source;
        }

        // 데이터베이스에 접속해서 쿼리를 전달하는 빈을 등록한다.
        @Bean
        public JdbcTemplate db(BasicDataSource source) {
            JdbcTemplate db = new JdbcTemplate(source);
            return db;
        }
    }
