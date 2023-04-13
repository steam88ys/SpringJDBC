package kr.hs.study.dao;

import kr.hs.study.dto.TestBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class Mapper implements RowMapper<TestBean1> {

    @Override
    public TestBean1 mapRow(ResultSet rs, int rowNum) throws SQLException {
        // rs: select 결과가 들어가는 곳
        TestBean1 t = new TestBean1();
        t.setData1(rs.getInt("data1"));
        t.setData2(rs.getString("data2"));

        return t;
    }
}
