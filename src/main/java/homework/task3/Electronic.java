package homework.task3;

abstract public class Electronic {
    int batteryCapacity;
    String producer;

    protected Electronic(String producer, int batteryCapacity) {
        this.batteryCapacity = this.batteryCapacity;
        this.producer = this.producer;
    }

    public abstract void setWiFi(boolean wiFi);

    public abstract String sendSMS(String sms);

    public abstract int maxWorkTime(int consumptionPerHour);
    public abstract int getCameraSize();

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getProducer() {
        return producer;
    }
}
