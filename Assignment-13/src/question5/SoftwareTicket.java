package question5;

enum Domain {WEB_HOSTED, PHONE_HOSTED}

class SoftwareTicket extends TroubleTicket {

    private String application;
    private String version;
    private Domain domainType;

    public SoftwareTicket(String customerName, int ticketID, String description, int due,
                          String application, String version, Domain domainType) {

        super(customerName, ticketID, description, due);
        setApplication(application);
        setVersion(version);
        setDomainType(domainType);
    }

    public String getApplication() { return application; }
    public String getVersion() { return version; }
    public Domain getDomainType() { return domainType; }

    public void setApplication(String application) { this.application = application; }
    public void setVersion(String version) { this.version = version; }
    public void setDomainType(Domain domainType) { this.domainType = domainType; }

    @Override
    public String toString() {
        return String.format("%s%n"+
                "APPLICATION: %s%n" +
                "VERSION: %s%n" +
                "DOMAIN: %s%n", super.toString(), application, version, domainType);

    }
}