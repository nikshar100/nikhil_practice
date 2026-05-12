import java.util.ArrayList;
import java.util.List;

public class DevicePort {
    private Customer customer;
    private Device device;
    private List<DID> deviceDID = new ArrayList<>();

    public DevicePort(Customer customer, Device device, DID did) {
       if (deviceDID.size() >= device.getNumPortsAvail()) {
           throw new IllegalArgumentException("Cannot add a port, there are already " + device.getNumPortsAvail() + " port provisioned.");
       }
       deviceDID.add(0 , did);
       this.customer = customer;
       this.device = device;
       }
}
