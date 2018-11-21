package sia.knights;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * spring jdbc模板
 */
public class jdbcDemo {
    public Employee getEmployeeById(long id){
        String sql = "select id, name, address from employee where id=?";
        JdbcTemplate jdbc = new JdbcTemplate();
        return jdbc.queryForObject(sql, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setAddress(resultSet.getString("address"));
                return employee;
            }
        });

    }
}
