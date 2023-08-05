public class Main {
    public static void main(String[] args) {
        MyCompany myCompany0101 = createMycompany(0110,"Thimachal Matriz");
        Vendor vendor01 = createVendor("Cia de Programation", true);

        Documents documents = new Documents();
        documents.setMyCompany(myCompany0101);
        documents.setVendor(vendor01);
        documents.setCertificate(true);
        documents.setNumberContract(1l);

        myCompany0101.printNewContract();
        documents.printRegisterDate();
        System.out.println(documents);
    }

    private static MyCompany createMycompany(Integer filial, String name) {
        MyCompany myCompany = new MyCompany();
        myCompany.setFilial(filial);
        myCompany.setName(name);
        return myCompany;
    }

    private static Vendor createVendor(String name, Boolean active) {
        Vendor vendor = new Vendor();
        vendor.setName(name);
        vendor.setActive(active);
        return vendor;
    }
}