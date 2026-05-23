package model.entity.funcionario;

import model.enums.Cargo;
import model.enums.Turno;

public class Frentista extends Funcionario {

    private Cargo cargo;

    public Frentista(String nome, String cpf, Turno turno, String senha) {
        super(nome, cpf, turno, senha);
    }

    // |----------| Getter |----------|

    @Override
    public Cargo getCargo() {
        return Cargo.FRENTISTA;
    }

}
