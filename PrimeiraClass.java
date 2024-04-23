package br.com.juliogomes;

public class PrimeiraClass {

    public static void main(String args[]) {
        System.out.println("Montando meu PC:");
        Computer computer = new Computer("Gygabite B440", "Intel i5 12400k", "2x 8GB", "SSD NVME 1TB", "RTX 4090ti");
        System.out.println("Seu computador tem os seguintes componentes: Placa Mae: " + computer.getMotherboard() + " Processador: " + computer.getProcessor() + " Memoria RAM: " + computer.getRamMemory() + " HD: " + computer.getSSD() + " Placa Grafica: " + computer.getGPU() );
    }
}