package padrao.visitor;

public class SeguroPessoa implements Seguro{
    private int codigo;
    private String nome;

    public SeguroPessoa(int codigo, String nome) {
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
        return visitor.exibirSeguroPessoal(this);
    }
}
