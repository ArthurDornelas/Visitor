package padrao.visitor;

public interface Visitor {
    String exibirSeguroResidencial(SeguroResidencia residencia);
    String exibirSeguroEmpresarial(SeguroEmpresa empresa);
    String exibirSeguroPessoal(SeguroPessoa pessoa);
}
