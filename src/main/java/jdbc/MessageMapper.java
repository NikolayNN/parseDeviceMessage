package jdbc;

import common.Device;
import common.Message;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Message message = new Message();
        Device device = new Device();

        device.setId(rs.getInt("id"));
        device.setImei(rs.getLong("imei"));
        device.setName(rs.getString("name"));

        message.setDevice(device);
        message.setDate(rs.getInt("date"));
        message.setLatitude(rs.getDouble("latitude"));
        message.setLongitude(rs.getDouble("longitude"));
        message.setSpeed(rs.getInt("speed"));
        message.setCourse(rs.getInt("course"));
        message.setHeight(rs.getInt("height"));
        message.setSats(rs.getInt("sats"));
        message.setParams(rs.getString("params"));
        return message;
    }
}
