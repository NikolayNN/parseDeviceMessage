package reader;

import common.Device;
import common.Message;
import util.CoordinateUtil;
import util.DateUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessageReader {

    private final String path;

    public MessageReader(String path) {
        this.path = path;
    }


    public List<Message> read() throws IOException {

        List<Message> messages = new ArrayList<Message>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = null;

            while ((line=br.readLine())!=null){
                String data[] = line.split(";");
                Device device = new Device();
                Message message = new Message();
                device.setImei(Long.parseLong(data[0]));

                message.setDevice(device);
                message.setDate(DateUtil.getUnix(data[1],data[2]));
                message.setLatitude(CoordinateUtil.coordinateConversion(data[3]));
                message.setLongitude(CoordinateUtil.coordinateConversion(data[5]));
                message.setSpeed(Integer.valueOf(data[7]));
                message.setCourse(Integer.valueOf(data[8]));
                message.setHeight(Integer.valueOf(data[9]));
                message.setSats(Integer.valueOf(data[10]));
                message.setParams(data[11]);
                messages.add(message);
            }
        }
        return messages;
    }

}
