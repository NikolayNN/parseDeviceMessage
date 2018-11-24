package dao;

import common.Message;
import dao.interfaces.DeviceDao;
import dao.interfaces.MessageDao;
import jdbc.JdbcDaoTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MessageDaoDb extends JdbcDaoTemplate implements MessageDao {

    private DeviceDao deviceDao;

    @Override
    public Message create(Message message) {
        String sql =
                "INSERT INTO message " +
                        "(device_id , " +
                        "date, " +
                        "latitude, " +
                        "longitude, " +
                        "speed, " +
                        "course, " +
                        "height, " +
                        "sats, " +
                        "params) " +
                        "VALUES (" +
                        "(SELECT id from device " +
                        "WHERE imei=?)," +   //0
                        "?," +//1
                        "?," +//2
                        "?," +//3
                        "?," +//4
                        "?," +//5
                        "?," +//6
                        "?," +//7
                        "?" +//8
                        ")";

        List<Object> deviceOptions = new ArrayList<>();
        deviceOptions.add(message.getDevice().getImei());
        deviceOptions.add(message.getDate());
        deviceOptions.add(message.getLatitude());
        deviceOptions.add(message.getLongitude());
        deviceOptions.add(message.getSpeed());
        deviceOptions.add(message.getCourse());
        deviceOptions.add(message.getHeight());
        deviceOptions.add(message.getSats());
        deviceOptions.add(message.getParams());
        try {
            deviceDao = new DeviceDaoDb();
            if (deviceDao.findByImei(message.getDevice().getImei()) != null)
                queryUpdate(sql,deviceOptions);
            else {
                deviceDao.create(message.getDevice());
                System.out.println("Device was create with ime = " + message.getDevice().getImei());
                queryUpdate(sql,deviceOptions);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return message;
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Message> findAll() {
        return null;
    }

    @Override
    public Message findOne(int id) {
        return null;
    }

    @Override
    public Message update(Message message) {
        return null;
    }
}
