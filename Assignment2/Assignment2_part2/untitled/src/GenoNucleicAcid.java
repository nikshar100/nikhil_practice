import java.util.*;
public class GenoNucleicAcid {
    public NucleicAcid GenoNucleicAcid() {
        Scanner in = new Scanner(System.in);
        System.out.printf("\n\nEnter the name of the nucleic acid: ");
        String name = in.next();
        System.out.printf("\nEnter the chemical formula of the nucleic acid: ");
        String chemicalFormula = in.next();
        System.out.printf("\nEnter the molar mass of the nucleic acid: ");
        float molarMass = in.nextFloat();
        System.out.printf("\nEnter the density of the nucleic acid: ");
        float density = in.nextFloat();

        return new NucleicAcid(name, chemicalFormula, molarMass, density);

    }

    public static void main(String[] args) {
        GenoNucleicAcid input = new GenoNucleicAcid();
        NucleicAcid genoNucleicAcid1 = input.GenoNucleicAcid();
        NucleicAcid genoNucleicAcid2 = input.GenoNucleicAcid();
        NucleicAcid genoNucleicAcid3 = input.GenoNucleicAcid();
        NucleicAcid genoNucleicAcid4 = input.GenoNucleicAcid();
        NucleicAcid genoNucleicAcid5 = input.GenoNucleicAcid();

        genoNucleicAcid1.print();
        genoNucleicAcid2.print();
        genoNucleicAcid3.print();
        genoNucleicAcid4.print();
        genoNucleicAcid5.print();

    }


}
