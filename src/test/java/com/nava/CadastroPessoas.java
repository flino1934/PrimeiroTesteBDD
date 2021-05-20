package com.nava;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas() {
        this.pessoas = pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;//vai retornar a lista de pessoa
    }

    public void adicionar(Pessoa pessoa) {

        if (pessoa.getNome() == null){
            throw new PessoaSemNomeExceptions();
        }

        this.pessoas.add(pessoa);//esta adicionando uma pessoa a lista
        // Por enquanto não há nenhuma propriedade na classe pessoa
    }

    public void remover(Pessoa pessoa) {

        if (pessoas.isEmpty()){
            throw new CadastroVazioExceptions();
        }

        this.pessoas.remove(pessoa);
    }
}
