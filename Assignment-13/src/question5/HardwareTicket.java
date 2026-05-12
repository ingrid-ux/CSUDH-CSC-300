package question5;

class HardwareTicket extends TroubleTicket {

    private String device;
    private String model;
    private String serialNumber;

    public HardwareTicket(String customerName, int ticketID, String description, int due, String device, String model, String serialNumber) {
        super(customerName, ticketID, description, due);
        setDevice(device);
        setModel(model);
        setSerialNumber(serialNumber);
    }

    public String getDevice() { return device; }
    public String getModel() { return model; }
    public String getSerialNumber() { return serialNumber; }

    public void setDevice(String device) { this.device = device; }
    public void setModel(String model) { this.model = model; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    @Override
    public String toString() {
        return String.format("%s%n" +
                "DEVICE: %s%n" +
                "MODEL: %s%n" +
                "SERIAL NUMBER: %s%n"
                ,super.toString(),device,model,serialNumber);

    }
}