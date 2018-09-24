package br.com.senaijandira.funcionarios.viewmodel;

import android.arch.persistence.room.Embedded;

import br.com.senaijandira.funcionarios.model.Funcionario;

//JUNTAR DADOS DE VÁRIAS TABELAS
public class FuncionarioCargo {

    @Embedded
    private Funcionario funcionario;

    private String cargo;


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
