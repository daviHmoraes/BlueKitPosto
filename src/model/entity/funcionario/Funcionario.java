package model.entity.funcionario;

import model.enums.Cargo;
import model.enums.Turno;
import model.exceptions.AppException;

public abstract class Funcionario {

    private final long id;
    private static long idContador = 1;
    private String nome;
    private String cpf;
    private Turno turno;
    private String senha;

    public Funcionario(String nome, String cpf, Turno turno, String senha) {
        setNome(nome);
        setCpf(cpf);
        setTurno(turno);
        setSenha(senha);
        id = idContador++;
    }

    // |----------| Getters e Setters |----------|

    public long getId() {
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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        if(turno == null) {
            throw new AppException("ERRO: Turno não pode ser vazio.");
        }
        this.turno = turno;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha == null || senha.isBlank()) {
            throw new AppException("ERRO: Senha não pode ser vazia.");
        }
        if(!senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*([\\d\\W])).{8,}$")) {
            throw new AppException(
                    "ERRO: A senha deve possuir no mínimo 8 caracteres, "
                            + "uma letra maiúscula, uma letra minúscula "
                            + "e pelo menos um número ou caractere especial."
            );
        }
        this.senha = senha;
    }

    public abstract Cargo getCargo();
}
