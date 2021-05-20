package com.nava;

public class PessoaSemNomeExceptions extends RuntimeException {

    public PessoaSemNomeExceptions() {

        super("A pessoa Não tem nome carai");
    }
}
