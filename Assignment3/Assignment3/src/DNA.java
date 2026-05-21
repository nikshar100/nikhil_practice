public class DNA {
    private NucleicAcid[] LtoRHelix;
    private NucleicAcid[] RtoLHelix;

    public DNA() {
        LtoRHelix = null;
        RtoLHelix = null;
    }

    public DNA(String strand){
        LtoRHelixPopulate(strand);
    }

    public void LtoRHelixPopulate(String strand) {
        LtoRHelix = new NucleicAcid[strand.length()];
        RtoLHelix = new NucleicAcid[strand.length()];
        for (int checkType = 0; checkType < strand.length(); checkType++) {
            if (strand.charAt(checkType) == 'A') {
                LtoRHelix[checkType] = new NucleicAcid("Adenine", "C5H5N5", 135.13, 1.6);
                RtoLHelix[checkType] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115, 1.223);
            }
            else if (strand.charAt(checkType) == 'T') {
                LtoRHelix[checkType] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115, 1.223);
                RtoLHelix[checkType] = new NucleicAcid("Adenine", "C5H5N5", 135.13, 1.6);
            }
            else if (strand.charAt(checkType) == 'C') {
                LtoRHelix[checkType] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10, 1.55);
                RtoLHelix[checkType] = new NucleicAcid("Guanine", "C5H5N5O", 151.13, 2.200);
            }
            else if (strand.charAt(checkType) == 'G') {
                LtoRHelix[checkType] = new NucleicAcid("Guanine", "C5H5N5O", 151.13, 2.200);
                RtoLHelix[checkType] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10, 1.55);
            }
        }
    }

    public void print() {
        for (int checkProperty = 0; checkProperty < LtoRHelix.length; checkProperty++) {
            System.out.printf("\n\nLtoRHelix at %d: %s", checkProperty, LtoRHelix[checkProperty].getName());
            System.out.printf("\nRtoLHelix at %d: %s", checkProperty, RtoLHelix[checkProperty].getName());
        }
    }

    public void highestMolarMass() {
        int highestIndexL = 0;
        double highestMassL = 0;
        for (int checkProperty = 0; checkProperty < LtoRHelix.length; checkProperty++) {
            if (LtoRHelix[checkProperty].getMolarMass() > highestMassL) {
                highestIndexL = checkProperty;
                highestMassL = LtoRHelix[checkProperty].getMolarMass();
            }
        }
        int highestIndexR = 0;
        double highestMassR = 0;
        for (int checkProperty = 0; checkProperty < RtoLHelix.length; checkProperty++) {
            if (RtoLHelix[checkProperty].getMolarMass() > highestMassR) {
                highestIndexR = checkProperty;
                highestMassR = RtoLHelix[checkProperty].getMolarMass();
            }
        }

        System.out.printf("The highest molar mass of LtoRHelix is at index %d with a mass of %f", highestIndexL, highestMassL);
        System.out.printf("The highest molar mass of RtoLHelix is at index %d with a mass of %f", highestIndexR, highestMassR);
    }

    public void totalDensity() {
        double totalDensityL = 0;
        for (int checkProperty = 0; checkProperty < LtoRHelix.length; checkProperty++) {
            totalDensityL += LtoRHelix[checkProperty].getDensity();
        }
        double totalDensityR = 0;
        for (int checkProperty = 0; checkProperty < RtoLHelix.length; checkProperty++) {
            totalDensityR += RtoLHelix[checkProperty].getDensity();
        }

        System.out.printf("\nTotal density of LtoRHelix: %f", totalDensityL);
        System.out.printf("\nTotal density of RtoLHelix: %f", totalDensityR);
    }

}
