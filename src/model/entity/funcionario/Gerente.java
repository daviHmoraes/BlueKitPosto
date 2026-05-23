package model.entity.funcionario;

import model.enums.Cargo;
import model.enums.Turno;

public class Gerente extends Funcionario {

    private Cargo cargo;

    public Gerente(String nome, String cpf, Turno turno, String senha) {
        super(nome, cpf, turno, senha);
    }

    // |----------| Getter |----------|

    @Override
    public Cargo getCargo() {
        return Cargo.GERENTE;
    }

}
