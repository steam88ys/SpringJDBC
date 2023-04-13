package kr.hs.study.dao;

import kr.hs.study.dto.TestBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestDAO {

    @Autowired
    private JdbcTemplate jdbc;

    @Autowired
    private Mapper mapper;

    // 저장
    public void insert(TestBean1 bean) {
        String sql="insert into test values(?,?)";
        jdbc.update(sql, bean.getData1(), bean.getData2());
    }

    // 수정
    public void update(TestBean1 bean) {
        String sql = "update test set data2=? where data1=?";
        jdbc.update(sql, bean.getData2(), bean.getData1());
    }

    // 삭제
    public void delete(TestBean1 bean) {
        String sql = "delete from test where data1=?";
        jdbc.update(sql, bean.getData1());
    }

    // 리스트
    public List<TestBean1> list() {
        String sql = "select * from test";
        List<TestBean1> list = jdbc.query(sql, mapper);
        return list;
    }

}
