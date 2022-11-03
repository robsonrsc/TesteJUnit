package org.example;

public class TransferenciaEntreContas {

    public  void  transferenciaEntreContas (Conta contaOrigem, Conta contaDestino, int valor){


        if (valor <= 0){
        throw new IllegalArgumentException("Valor deve ser maior que R$ 0.00 ");
        }
    }
}
