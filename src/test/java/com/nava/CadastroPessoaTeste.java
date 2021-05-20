package com.nava;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class CadastroPessoaTeste {

    @Test
    public void deveCriarOCadastroDePessoas(){

        //cenario e execução
        CadastroPessoas cadastro = new CadastroPessoas();

        //verificação
        Assertions.assertThat(cadastro.getPessoas()).isEmpty();//vai verificar se a lista de pessoas está vazia, a lista de pessoas vem de CadastroPessoas
    }

    @Test
    public void deveAdicionarUmaPessoa(){

        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe Lino");

        //execução
        cadastroPessoas.adicionar(pessoa);//vai adicionar uma pessoa a lista

        //Verificação
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()//vai verificar se não esta vazio
                .hasSize(1)//vai falar que só tem uma pessoa
                .contains(pessoa);// e o elemento é pessoa
    }

    @Test(expected = PessoaSemNomeExceptions.class)
    public void naoDeveAdicionarPessoaComNomeVazio(){

        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        //Execução e verificação NESSE CASO
        cadastroPessoas.adicionar(pessoa);//chama o metodo e adiciona

    }

    @Test
    public void deveRemoverUmaPessoa(){
        //ceneraio
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Felipe Lino ");
        cadastroPessoas.adicionar(pessoa);

        //execução
        cadastroPessoas.remover(pessoa);

        //verificação
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();

    }

    @Test(expected = CadastroVazioExceptions.class)
    public void deveLancarUmErroAoTentArRemoverUmaPessoaInesistente(){
        //cenario
        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        Pessoa pessoa = new Pessoa();

        cadastroPessoas.remover(pessoa);
    }

}
