package model.entity;

import model.enums.TipoCombustivel;
import model.exceptions.AppException;

import java.math.BigDecimal;

public class Combustivel {

    private final long id;
    private static long idContador = 1;
    private TipoCombustivel tipo;
    private BigDecimal preco;
    private BigDecimal litrosEstoque;

    public Combustivel(TipoCombustivel tipo, BigDecimal preco, BigDecimal litrosEstoque) {
        setTipo(tipo);
        setPreco(preco);
        setLitrosEstoque(litrosEstoque);
        id = idContador++;
    }

    // |----------| Getters e Setters |----------|

    public long getId() {
        return id;
    }

    public TipoCombustivel getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustivel tipo) {
        if (tipo == null) {
            throw new AppException("ERRO: Tipo não pode ser nulo.");
        }
        this.tipo = tipo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        if(preco == null || preco.signum() <= 0) {
            throw new AppException("ERRO: Preço não pode ser menor ou igual a zero.");
        }
        this.preco = preco;
    }

    public BigDecimal getLitrosEstoque() {
        return litrosEstoque;
    }

    public void setLitrosEstoque(BigDecimal litrosEstoque) {
        if(litrosEstoque == null || litrosEstoque.signum() < 0) {
            throw new AppException("ERRO: Litros no estoque não pode ser menor que zero.");
        }
        this.litrosEstoque = litrosEstoque;
    }
}
