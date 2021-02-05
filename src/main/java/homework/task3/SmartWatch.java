package homework.task3;

public class SmartWatch extends Electronic{

    final String strapColor;
    boolean isWiFi;

    public SmartWatch(String producer, int batteryCapacity, String strapColor) {
        super(producer, batteryCapacity);
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
        this.strapColor = strapColor;
    }
    @Override
    public int maxWorkTime(int consumptionPerHour){
        return batteryCapacity/consumptionPerHour;
    }

    @Override
    public int getCameraSize() {return 0;}

    public String getProducer() {
        return producer;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getStrapColor() {
        return strapColor;
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    @Override
    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }

    @Override
    public String sendSMS(String sms){
        if (isWiFi){
            return "Your smartwatch is Sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
