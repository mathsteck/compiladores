import java.util.*;

public class Dado {
    /* comum a todas as categorias */
    private Integer nivel;

    private Integer tipo;

    /* comum entre as categorias: variavel, parametro procedimento e funcao */
    private Integer endereco;

    /* existe na categoria: tipo */
    private Integer nbytes;

    /* existe nas categorias: funcao e procedimento */
    private Integer nparametros;

    private String identificador;
    private String categoria;

    /* existe na categoria: constante */
    private String valor;

    /* existe na categoria: parametro */
    private String classeTransf;


    public Dado(String identificador, Integer nivel) {
        this.identificador = identificador;
        this.nivel = nivel;
    }

    public Dado() {}

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getClasseTransf() {
        return classeTransf;
    }

    public void setClasse_transf(String classeTransf) {
        this.classeTransf = classeTransf;
    }

    public Integer getEndereco() {
        return endereco;
    }

    public void setEndereco(Integer endereco) {
        this.endereco = endereco;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getNBytes() {
        return nbytes;
    }

    public void setNBytes(Integer nbytes) {
        this.nbytes = nbytes;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getNParametros() {
        return nparametros;
    }

    public void setNParametros(Integer nparametros) {
        this.nparametros = nparametros;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

