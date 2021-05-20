package com.nava;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    @Test
    public void estruturaDeUmTeste() {

        // para fazer um teste são necessarios de tres elementos

        // 1º cenario

        int numero1 = 10, numero2 = 5;

        // 2º execução

        int resultado = numero1 + numero2;

        // 3º Verificação
        //as verificações são feitas através de acertivas e o JUnit já tem acertivas próprias para utilização
        //primeirro parametro oq vc espera e o segundo oq esta sendo comparado oq vc esta mandando
        Assert.assertEquals(15, resultado);

    }

}

