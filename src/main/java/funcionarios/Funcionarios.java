package funcionarios;

public class Funcionarios {
    private int funcionario_id;
    private String primeiroNome;
    private String ultimoNome;
    private double pagamentoHora;
    private String hireDate;


    public Funcionarios( String primeiroNome, String ultimoNome, double pagamentoHora, String hireDate) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.pagamentoHora = pagamentoHora;
        this.hireDate = hireDate;
    }

    public int getFuncionario_id() {return funcionario_id; }
    public String getPrimeiroNome() {return primeiroNome; }
    public String getUltimoNome() { return ultimoNome; }
    public double getPagamentoHora() { return pagamentoHora; }
    public String getHireDate() {return hireDate; }


    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    @Override
    public String toString() {
        return "[" + funcionario_id + "] " + primeiroNome + " " + ultimoNome +
                " | R$" + pagamentoHora + "/h | Contratado em: " + hireDate;
    }
}

