package model.entity;

import model.enums.StatusBomba;
import model.exceptions.AppException;

public class Bomba {

    private final long id;
    private static long idContador = 1;
    private Combustivel combustivel;
    private StatusBomba statusBomba;

    public Bomba(Combustivel combustivel, StatusBomba statusBomba) {
        setCombustivel(combustivel);
        setStatusBomba(statusBomba);
        id = idContador++;
    }

    // |----------| Getters e Setters |----------|

    public long getId() {
        return id;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        if(combustivel == null) {
            throw new AppException("ERRO: Combustível não pode ser nulo.");
        }
        this.combustivel = combustivel;
    }

    public StatusBomba getStatusBomba() {
        return statusBomba;
    }

    public void setStatusBomba(StatusBomba statusBomba) {
        if(statusBomba == null) {
            throw new AppException("ERRO: Status da bomba não pode ser nulo.");
        }
        this.statusBomba = statusBomba;
    }

    public boolean isLivre() {
        return statusBomba == StatusBomba.LIVRE;
    }

    public void setManutencao() {
        setStatusBomba(StatusBomba.MANUTENCAO);
    }

    public void setLivre() {
        setStatusBomba(StatusBomba.LIVRE);
    }

    public void setEmUso() {
        setStatusBomba(StatusBomba.EM_USO);
    }

}
