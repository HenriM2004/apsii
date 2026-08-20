package br.edu.unipe.apsii;

public class FuncionarioCLT extends Funcionario {

    private String nome;
    private String matricula;
    private double salarioBase;
    private String dataAdmissao;
    private String valeTransporte;
    private String valeAlimentacao;

    public FuncionarioCLT(String nome, String matricula, double salarioBase,
                          String dataAdmissao, String valeTransporte, String valeAlimentacao) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
        this. valeTransporte = valeTransporte;
        this.valeAlimentacao = valeAlimentacao;
    }
    @Override
    public String imprimirDetalhes(){
        return super.imprimirDetalhes() + "\nNúmero de Cilindradas: " + this.numCilindros;

        @Override
        public String toString() { double
                liquido = calcularSalario() - calcularDesconto();
            return String.format( "%s [%s] - Salário: R$ %.2f | Desconto:
                    R$ %.2f | Líquido: R$ %.2f", nome, matricula,
            calcularSalario(), calcularDesconto(), liquido );


}
