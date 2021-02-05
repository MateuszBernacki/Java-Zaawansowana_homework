package homework.task3;

public class CellPhone extends Electronic{

    final String simCard;
    final int cameraSize;
    boolean isWiFi;

    public CellPhone(int batteryCapacity, String producer, String simCard, int cameraSize) {
        super(producer, batteryCapacity);
        this.simCard = simCard;
        this.cameraSize = cameraSize;
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public int maxWorkTime(int consumptionPerHour) {
        return batteryCapacity / consumptionPerHour;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getProducer() {
        return producer;
    }

    public String getSimCard() {
        return simCard;
    }

    public int getCameraSize() {
        return cameraSize;
    }
    @Override
    public String sendSMS(String sms) {
        if (simCard != null) {
            return "Your cellphone is sending " + sms;
        } else {
            return "Cant send. No sim card";
        }
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    @Override
    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "simCard='" + simCard + '\'' +
                ", cameraSize=" + cameraSize +
                ", isWiFi=" + isWiFi +
                ", batteryCapacity=" + batteryCapacity +
                ", producer='" + producer + '\'' +
                '}';
    }
}
