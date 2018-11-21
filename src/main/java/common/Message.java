package common;

public class Message {


    private int id;
    private Device device;
    private long date;
    private Double longitude;
    private Double latitude;
    private int speed;
    private int course;
    private int height;
    private int sats;
    private String params;

    public Message() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSats() {
        return sats;
    }

    public void setSats(int sats) {
        this.sats = sats;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", device=" + device.toString() +
                ", date=" + date +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", speed=" + speed +
                ", course=" + course +
                ", height=" + height +
                ", sats=" + sats +
                ", params='" + params + '\'' +
                '}';
    }
}
