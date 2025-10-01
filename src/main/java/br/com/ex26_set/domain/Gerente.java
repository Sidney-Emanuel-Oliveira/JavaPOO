package br.com.ex26_set.domain;

public class Gerente extends Funcionario{


    private double bonusPerformance;
    private double comissao;


    public Gerente(String nome, String matricula, double bonusPerformance, double comissao,
                   double salarioBase){
        super(nome, matricula, salarioBase);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }

    public Gerente(String carlos, String ger001, int bonusPerformance) {
        super();
    }


    public double getBonusPerformance(){
        return bonusPerformance;
    }
    public void setBonusPerformance(double bonusPerformance){
        this.bonusPerformance = bonusPerformance;
    }
    public double getComissao(){
        return comissao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario(){
        return salarioBase + bonusPerformance * comissao;
    }
}
