package br.com.ex26_set.domain;

public abstract class Funcionario {


    protected String nome;
    protected  String matricula;
    protected Double salarioBase;
    protected double calcularSalario;


    public Funcionario(String nome, String matricula, Double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public Funcionario() {

    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public Double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase){
        this.salarioBase = salarioBase;
    }


    // Método abstrato para ser implementado nas subclasses
    public abstract double calcularSalario();


    // Método abstrato deve ser implementado pelas subclasses
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario final: " + calcularSalario);
    }
}
