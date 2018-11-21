package common;

public class Device {

    private int id;
    private Long imei;
    private String name;


    public Device() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", imei=" + imei +
                ", name='" + name + '\'' +
                '}';
    }
}
