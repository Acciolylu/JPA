package ifba.edu.br.basicas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToMany;


@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany (mappedBy = "produto",cascade = CascadeType.ALL)
    private List<Venda> vendas = new ArrayList<>();
    
    private String descricao;
    private int estoque;
    private Double valor;
    
    public Produto() {
    }

    public Produto(int id, List<Venda> vendas, String descricao, int estoque, Double valor) {
        this.id = id;
        this.vendas = vendas;
        this.descricao = descricao;
        this.estoque = estoque;
        this.valor = valor;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", vendas=" + vendas + ", descricao=" + descricao + ", estoque=" + estoque
                + ", valor=" + valor + "]";
    }

    
    
}
