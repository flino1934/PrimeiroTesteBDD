package com.nava;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTestes {

    @Test
    public void primeiroTesteMockito(){
        List<String> lista = Mockito.mock(ArrayList.class);//esta criando uma instaciação de arrayList mocado
        List<String> lista2 = new ArrayList<>();//estamos instanciando uma lista normal sem mocar ela diferente da primeira lista nã poderemos mecher nela livremente

        //apartir de agora eeu consigo manipular o comportamento do obj
        Mockito.when( lista.size()).thenReturn(20);//esta simulando como se alista tivesse 20 elementos
        Mockito.when( lista.size()).thenReturn(20);//esta simulando como se alista tivesse 20 elementos

        int size = lista.size();

        Assertions.assertThat(size).isEqualTo(20);

    }

}
