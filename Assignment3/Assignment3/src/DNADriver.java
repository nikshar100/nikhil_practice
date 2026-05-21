public class DNADriver {
    public static void main(String[] args) {
        DNA dna1 = new DNA("AGCCTAGGATCAG");
        dna1.print();
        dna1.highestMolarMass();
        dna1.totalDensity();

        DNA dna2 = new DNA("AGCCTAGGATCTAGGATCAG");
        dna2.print();
        dna2.highestMolarMass();
        dna2.totalDensity();

        DNA dna3 = new DNA("AGCCTATAGGATCAG");
        dna3.print();
        dna3.highestMolarMass();
        dna3.totalDensity();

        DNA dna4 = new DNA("AAAGCCTAGGATAGGATCAG");
        dna4.print();
        dna4.highestMolarMass();
        dna4.totalDensity();

        DNA dna5 = new DNA("AAAGCCTCTGAGGATAGGATCAG");
        dna5.print();
        dna5.highestMolarMass();
        dna5.totalDensity();

    }
    }