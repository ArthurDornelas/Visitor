package test;

import org.junit.jupiter.api.Test;
import padrao.visitor.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroVisitorTest {
    @Test
    void deveExibirSeguroResidencia() {
        SeguroResidencia seguro = new SeguroResidencia(1, "Residencia");

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Residencia{codigo=1, nome=Residencia}", visitor.exibir(seguro));
    }

    @Test
    void eveExibirSeguroEmpreserial() {
        SeguroEmpresa seguro = new SeguroEmpresa(2, "Empresa");

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Empresa{codigo=2, nome=Empresa}", visitor.exibir(seguro));
    }

    @Test
    void deveExibirSeguroPessoal() {
        SeguroPessoa seguro = new SeguroPessoa(3, "Pessoa");

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Pessoa{codigo=3, nome=Pessoa}", visitor.exibir(seguro));
    }

}
