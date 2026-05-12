import java.util.*;
public class GenomeInput {
    private HumanGenome humanGenome;

    public HumanGenome GenomeInput () {
        Scanner in = new Scanner(System.in);

        System.out.printf("What is the name of the genome?");
        String genomeName = in.nextLine();
        System.out.printf("\nHow many genes exist in the genome?");
        int numGenes = in.nextInt();
        System.out.printf("\nHow many chromosomes are there in the genome?");
        int numChromosomes = in.nextInt();
        System.out.printf("How many celles are in the body?");
        int numCells = in.nextInt();

        return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
    }

    public static void main(String[] args) {
        GenomeInput input = new GenomeInput();

        HumanGenome humanGenome1 = input.GenomeInput();
        HumanGenome humanGenome2 = input.GenomeInput();
        HumanGenome humanGenome3 = input.GenomeInput();

        humanGenome1.print();
        humanGenome2.print();
        humanGenome3.print();


    }
}
