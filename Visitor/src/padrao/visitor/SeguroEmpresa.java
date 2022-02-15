package padrao.visitor;

public class SeguroEmpresa implements Seguro{
    private int codigo;
    private String nome;

    public SeguroEmpresa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSeguroEmpresarial(this);
    }
}
