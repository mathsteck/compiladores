import java.util.*;

public class Dado {
    /* comum a todas as categorias */
    private String identificador;
    private Integer nivel;
    private String categoria;
    private Integer tipo;

    /* comum entre as categorias: variavel, parametro procedimento e funcao */
    private Integer endereco;

    /* existe na categoria: tipo */
    private Integer nbytes;

    /* existe na categoria: constante */
    private String valor;

    /* existe na categoria: parametro */
    private String classe_transf;

    /* existe nas categorias: funcao e procedimento */
    private Integer nparametros;

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

    public String getClasse_transf() {
        return classe_transf;
    }

    public void setClasse_transf(String classe_transf) {
        this.classe_transf = classe_transf;
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

    public Integer getNbytes() {
        return nbytes;
    }

    public void setNbytes(Integer nbytes) {
        this.nbytes = nbytes;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getNparametros() {
        return nparametros;
    }

    public void setNparametros(Integer nparametros) {
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

