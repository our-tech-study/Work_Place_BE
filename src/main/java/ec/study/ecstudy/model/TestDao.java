package ec.study.ecstudy.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(new TestDataSource().get());

    public String getValue()
    {
        return jdbcTemplate.queryForObject("SELECT name FROM ec_test1;", String.class);
    }
}
