package model.entity;

import model.exceptions.AppException;

public class Fornecedor {

    private final int id;
    private static int idContador = 1;
    private String razaoSocial;
    private String cnpj;
    private Combustivel combustivelFornecido;

    public Fornecedor(String razaoSocial, String cnpj, Combustivel combustivelFornecido) {
        setRazaoSocial(razaoSocial);
        setCnpj(cnpj);
        setCombustivelFornecido(combustivelFornecido);
        id = idContador++;
    }

    // |----------| Getters e Setters |----------|

    public int getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial == null || razaoSocial.isBlank()) {
            throw new AppException("ERRO: Razão social não pode ser vazia.");
        }
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj == null || cnpj.isBlank() || !cnpj.matches("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}")) {
            throw new AppException("ERRO: Use formato 00.000.000/0000-00.");
        }
        this.cnpj = cnpj;
    }

    public Combustivel getCombustivelFornecido() {
        return combustivelFornecido;
    }

    public void setCombustivelFornecido(Combustivel combustivelFornecido) {
        if(combustivelFornecido == null) {
            throw new AppException("ERRO: Combustível não pode ser vazio.");
        }
        this.combustivelFornecido = combustivelFornecido;
    }
}
