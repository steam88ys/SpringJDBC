package kr.hs.study.dao;

import kr.hs.study.dto.TestBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestDAO {

    @Autowired
    private JdbcTemplate jdbc;

    // 저장
    public void insert(TestBean1 bean) {
        String sql="insert into test values(?,?)";
        jdbc.update(sql, bean.getData1(), bean.getData2());
    }
}
