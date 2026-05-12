public class HumanGenome {
    private String genomeName;
    private int numGenes;
    private int numChromosomes;
    private int numCells;

    public HumanGenome(String genomeName, int numGenes, int numChromosomes, int numCells) {
        this.genomeName = genomeName;
        this.numGenes = numGenes;
        this.numChromosomes = numChromosomes;
        this.numCells = numCells;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public int getNumGenes() {
        return numGenes;
    }

    public void setNumGenes(int numGenes) {
        this.numGenes = numGenes;
    }

    public int getNumChromosomes() {
        return numChromosomes;
    }

    public void setNumChromosomes(int numChromosomes) {
        this.numChromosomes = numChromosomes;
    }

    public int getNumCells() {
        return numCells;
    }

    public void setNumCells(int numCells) {
        this.numCells = numCells;
    }

    public void print() {
        System.out.printf("" +
                "Genome Name: " + genomeName +
                "\nNumber of genes: " + numGenes +
                "\nNumber of chromosomes: " + numChromosomes +
                "\nNumber of cells: " + numCells);
    }
}
