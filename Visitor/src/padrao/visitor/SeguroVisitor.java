package padrao.visitor;

public class SeguroVisitor implements Visitor{
    public String exibir(Seguro seguro) {
        return seguro.aceitar(this);
    }

    @Override
    public String exibirSeguroResidencial(SeguroResidencia residencia) {
        return "Residencia{" +
                "codigo=" + residencia.getCodigo() +
                ", nome=" + residencia.getNome() + '}';
    }

    @Override
    public String exibirSeguroEmpresarial(SeguroEmpresa empresa) {
        return "Empresa{" +
                "codigo=" + empresa.getCodigo() +
                ", nome=" + empresa.getNome() + '}';
    }

    @Override
    public String exibirSeguroPessoal(SeguroPessoa pessoa) {
        return "Pessoa{" +
                "codigo=" + pessoa.getCodigo() +
                ", nome=" + pessoa.getNome() + '}';
    }
}
