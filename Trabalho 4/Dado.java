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

    /* Array de argumentos de uma função */
    private ArrayList<Dado> args;


    public Dado(String identificador, Integer nivel) {
        this.identificador = identificador;
        this.nivel = nivel;
        this.args = new ArrayList<Dado>();
    }

    public Dado()
    {
        this.args = new ArrayList<Dado>();
    }

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

    public Dado getArgs(Integer chave) {
        return this.args.get(chave);
    }

    public ArrayList<Dado> getArgs() {
        return this.args;
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

    public void setArgs(Dado valor) {
        this.args.add(valor);
    }
}

