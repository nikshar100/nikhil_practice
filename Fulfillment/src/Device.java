public class Device {
    private String serialNumber;
    private String macAddr;
    private DeviceType deviceType;
    private boolean activated;
    private Customer customer;
    private int numPortsAvail;

    public Device(String serialNumber, String macAddr, DeviceType deviceType, boolean activated, Customer customer) {
        if (serialNumber == null) {
            throw new IllegalArgumentException("Must provide serial number for device fulfillment.");
        }
        this.serialNumber = serialNumber;

        if (macAddr == null || !macAddr.contains(":")) {
            throw new IllegalArgumentException("MacAddr not properly formatted or not provided.");
        }
        this.macAddr = macAddr;
        this.deviceType = deviceType;
        this.activated = activated;
        this.customer = customer;

        if (this.deviceType == DeviceType.GOULD || this.deviceType == DeviceType.PUDDING || this.deviceType == DeviceType.PUDDING_AIR) {
            this.numPortsAvail = 1;
        }
        else if (this.deviceType == DeviceType.AIRDIAL || this.deviceType == DeviceType.SUNDIAL) {
            this.numPortsAvail = 4;
        }



}

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNumPortsAvail() {
        return numPortsAvail;
    }

    public void setNumPortsAvail(int numPortsAvail) {
        this.numPortsAvail = numPortsAvail;
    }
}

