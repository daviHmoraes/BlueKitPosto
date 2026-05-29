package model.entity;

import model.entity.funcionario.Funcionario;
import model.enums.FormaPagamento;
import model.exceptions.AppException;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {

    private final long id;
    private static long idContador = 1;
    private final LocalDateTime dataHora;
    private Bomba bomba;
    private Funcionario funcionario;
    private BigDecimal litrosAbastecidos;
    private BigDecimal valorTotal;
    private FormaPagamento formaPagamento;

    public Venda(Bomba bomba, Funcionario funcionario, BigDecimal litrosAbastecidos, FormaPagamento formaPagamento) {
        dataHora = LocalDateTime.now();
        setBomba(bomba);
        setFuncionario(funcionario);
        setLitrosAbastecidos(litrosAbastecidos);
        setValorTotal();
        setFormaPagamento(formaPagamento);
        id = idContador++;
    }

    // |----------| Getters e Setters |----------|


    public long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Bomba getBomba() {
        return bomba;
    }

    private void setBomba(Bomba bomba) {
        if(bomba == null) {
            throw new AppException("ERRO: Bomba não pode ser vazia.");
        }
        this.bomba = bomba;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    private void setFuncionario(Funcionario funcionario) {
        if(funcionario == null ) {
            throw new AppException("ERRO: Funcionario não pode ser vazio.");
        }
        this.funcionario = funcionario;
    }

    public BigDecimal getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    private void setLitrosAbastecidos(BigDecimal litrosAbastecidos) {
        if(litrosAbastecidos == null || litrosAbastecidos.signum() <= 0) {
            throw new AppException("ERRO: Litros abastecidos devem ser maiores que zero.");
        }
        this.litrosAbastecidos = litrosAbastecidos;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal() {
        this.valorTotal = litrosAbastecidos.multiply(bomba.getCombustivel().getPreco());
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    private void setFormaPagamento(FormaPagamento formaPagamento) {
        if(formaPagamento == null) {
            throw new AppException("ERRO: Forma de pagamento não pode ser vazia.");
        }
        this.formaPagamento = formaPagamento;
    }
}
