package model.entity;

import model.exceptions.AppException;

public class Veiculo {

    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        setModelo(modelo);
        setPlaca(placa);
    }

    // |-----------| Getters Setters |-----------|

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if(placa == null) {
            throw new AppException("ERRO: A placa não pode ser vazia.");
        }
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null) {
            throw new AppException("ERRO: O modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }
}
