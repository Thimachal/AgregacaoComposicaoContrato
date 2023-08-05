import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Documents {

    private Vendor vendor;
    private MyCompany myCompany;

    private Long numberContract;

    private Boolean certificate;

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public MyCompany getMyCompany() {
        return myCompany;
    }

    public void setMyCompany(MyCompany myCompany) {
        this.myCompany = myCompany;
    }

    public Long getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Long numberContract) {
        this.numberContract = numberContract;
    }

    public Boolean getCertificate() {
        return certificate;
    }

    public void setCertificate(Boolean certificate) {
        this.certificate = certificate;
    }

    public void printRegisterDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Contrato registrado em: " + dateFormat.format(date));
    }

    @Override
    public String toString() {
        return "Contrato gerado com sucesso! " +
                "Fornecedor: " + vendor.getName() +
                ", Unidade: " + myCompany.getName() +
                ", número do contrato= " + numberContract +
                ", contrato=" + certificate;
    }
}
