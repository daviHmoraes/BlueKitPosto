package model.entity;

import model.exceptions.AppException;

public class Cliente {

    private final int id;
    private static int idContador = 1;
    private String nome;
    private String cpf;
    private Veiculo veiculo;

    public Cliente(String nome, String cpf, Veiculo veiculo) {
        setNome(nome);
        setCpf(cpf);
        setVeiculo(veiculo);
        id = idContador++;
    }

    // |-----------| Getters Setters |-----------|

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new AppException("ERRO: Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf == null || cpf.isBlank() || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new AppException("ERRO: Tamanho inválido, use formato 000.000.000-00.");
        }
        this.cpf = cpf;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        if(veiculo == null) {
            throw new AppException("ERRO: Veiculo não pode ser vazio.");
        }
        this.veiculo = veiculo;
    }
}
