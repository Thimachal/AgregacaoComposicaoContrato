public class Vendor {
    private String name;
    private Boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void printCad(){
        System.out.println("O fornecedor: " + this.getName() + " é cadastrado no Datasul e tem novo contrato conosco");
    }
}
