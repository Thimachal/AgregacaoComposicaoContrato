public class MyCompany {
    private Integer filial;
    private String name;

    public Integer getFilial() {
        return filial;
    }

    public void setFilial(Integer filial) {
        this.filial = filial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNewContract(){
        System.out.println("A unidade: ---" + this.getName() + "--- está com novo contrato ativo");
    }
}
