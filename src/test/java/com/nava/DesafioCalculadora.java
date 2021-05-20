package com.nava;

import org.assertj.core.api.Assertions;
import org.junit.Test;




public class DesafioCalculadora {

    @Test
    public void deveSomar2Numeros(){

        //1º Cenario
        Calculadora calculadora = new Calculadora();
        int num1 = 10,num2 = 5;

        //2º Execução
        int resultado = calculadora.somar(num1,num2);//esta passando o metodo da calculadora

        // 3º Verificação
        //as verificações são feitas através de acertivas e o JUnit já tem acertivas próprias para utilização
        //primeirro parametro oq vc espera e o segundo oq esta sendo comparado oq vc esta mandando
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test
    public void naoDeveSomarNumerosNegativos(){

        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = -10,num2 = 5;

        //2º Execução
        calculadora.somar(num1,num2);//esta passando o metodo da calculadora
    }

    @Test
    public void naoDeveTerZero(){

        //cenario
        Calculadora calculadora = new Calculadora();
        int num1 = 10,num2 = 0;

        //2º Execução
        calculadora.dividir(num1,num2);//esta passando o metodo da calculadora


    }

}

class Calculadora{

    int somar(int num1,int num2){
        if (num1 < 0 || num2 < 0){
            throw new RuntimeException("Não é permitdo soma com numero negativos");
        }
        return num1+num2;
    }
    int dividir(int num1,int num2){

        if (num2 <= 0){
            throw new RuntimeException("Não pode dividir por numero negativo o numero tem que ser maior que 0");
        }else if(num1 <= 0){
            throw new RuntimeException("O dividendo não pode ser numero negativo numero tem que ser maior que 0");
        }

        return num1/num2;

    }

}
