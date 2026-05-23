package model.entity.funcionario;

import model.enums.Cargo;
import model.enums.Turno;

public class Caixa extends Funcionario {

    private Cargo cargo;

    public Caixa(String nome, String cpf, Turno turno, String senha) {
        super(nome, cpf, turno, senha);
    }

    // |----------| Getter |----------|

    @Override
    public Cargo getCargo() {
        return Cargo.CAIXA;
    }

}
