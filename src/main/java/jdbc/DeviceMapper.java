package jdbc;

import common.Device;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeviceMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Device device = new Device();

        device.setId(rs.getInt("id"));
        device.setImei(rs.getLong("imei"));
        device.setName(rs.getString("name"));

        return device;
    }
}
