package com.br.juliogomes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculando media...");
        Notas notas = new Notas(7.0, 8.0,6.0,5.0);
        double mediaFinal = notas.calcularMedia();
        System.out.println("Sua media foi: " + mediaFinal);
        }
    }