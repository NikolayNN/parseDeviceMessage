package dao.interfaces;

import common.Message;

import java.util.List;

public interface MessageDao {

    Message create(Message message);

    void remove(String id);

    List<Message> findAll();

    Message findOne(int id);

    Message update(Message message);


}
