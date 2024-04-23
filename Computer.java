package br.com.juliogomes;


    /**
     * Representar um objeto literal da vida real.
     * @author: Julio Gomes
     * @version: 1.0
     * @since: Abr/2024
     */
public class Computer {

    private String motherboard;
    private String processor;
    private String ramMemory;
    private String SSD;
    private String GPU;

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(String ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public Computer(String motherboard, String processor, String ramMemory, String SSD, String GPU) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.SSD = SSD;
        this.GPU = GPU;
    }
}
