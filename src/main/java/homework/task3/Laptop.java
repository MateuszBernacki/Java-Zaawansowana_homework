package homework.task3;

public class Laptop extends Electronic {

    final String dvdDrive;
    final int powerSupply;
    boolean isWiFi;

    public Laptop(int batteryCapacity, String dvdDrive, int powerSupply, String producer) {
        super(producer, batteryCapacity);
        this.batteryCapacity = batteryCapacity;
        this.dvdDrive = dvdDrive;
        this.powerSupply = powerSupply;
        this.producer = producer;
    }
    @Override
    public int maxWorkTime(int consumptionPerHour){
        return batteryCapacity/consumptionPerHour;
    }

    @Override
    public int getCameraSize() {
        return 0;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getDvdDrive() {
        return dvdDrive;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public String getProducer() {
        return producer;
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
            return "Your laptop is sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
