public class Thermostat {
    private int maximumTemp;
    private int minimumTemp;
    private int targetTemp;
    private int currentTemp;
    private String mode;
    private final int serialNumber;

    public Thermostat(int targetTemp, int currentTemp, String mode, int serialNumber, int maximumTemp, int minimumTemp){

        if (targetTemp < 50 || targetTemp > 90) {
            throw new IllegalArgumentException("Temperature cannot go less than 50F or more than 90F");
        }

        this.targetTemp = targetTemp;
        this.currentTemp = currentTemp;
        this.serialNumber = serialNumber;
        this.maximumTemp = maximumTemp;
        this.minimumTemp = minimumTemp;
        this.mode = mode;
    }

    public void setTemperature(int targetTemp) {
        if (targetTemp < minimumTemp || targetTemp > maximumTemp) {
            System.out.println("Warning: temperature configured beyond safety limits.");
        }
        this.targetTemp = targetTemp;
    }

    public void setMode(String mode) {
        if (!mode.equals("HEAT") && !mode.equals("COOL") && !mode.equals("OFF")) {
            throw new IllegalArgumentException("Error: Invalid mode.");
        }
        this.mode = mode;
    }

    public void setMaximumTemp(int maximumTemp) {
        this.maximumTemp = maximumTemp;
    }

    public void setMinimumTemp(int minimumTemp) {
        this.minimumTemp = minimumTemp;
    }

    public int getMaximumTemp() {
        return maximumTemp;
    }

    public int getMinimumTemp() {
        return minimumTemp;
    }

    public int getTargetTemp() {
        return targetTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public String getMode() {
        return mode;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


}
