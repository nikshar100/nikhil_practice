Part 1:

Class Diagram:

+-------------------------------+
|         HumanGenome           |
+-------------------------------+
| - genomeName: String          |
| - numGenes: int               |
| - numChromosomes: int         |
| - numCells: int               |
+-------------------------------+
| + HumanGenome()               |
| + HumanGenome(String, int,    |
|     int, int)                 |
| + getGenomeName(): String     |
| + setGenomeName(String): void |
| + getNumGenes(): int          |
| + setNumGenes(int): void      |
| + getNumChromosomes(): int    |
| + setNumChromosomes(int): void|
| + getNumCells(): int          |
| + setNumCells(int): void      |
| + print(): void               |
+-------------------------------+

+-------------------------------+
|         GenomeInput           |
+-------------------------------+
| - humanGenome: HumanGenome    |
+-------------------------------+
| + GenomeInput(): HumanGenome  |
| + main(String[]): void        |
+-------------------------------+

Test case output:
/Library/Java/JavaVirtualMachines/temurin-25.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63713 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nikhil.sharma/Desktop/kickups/Assignment2/out/production/Assignment2_part1 GenomeInput


What is the name of the genome? Human Bob

How many genes exist in the genome? 20000

How many chromosomes are there in the genome? 46

How many cells are there (trillions)? 76


What is the name of the genome? Human Sally

How many genes exist in the genome? 20000

How many chromosomes are there in the genome? 46

How many cells are there (trillions)? 120


What is the name of the genome? Human Sri

How many genes exist in the genome? 20000

How many chromosomes are there in the genome? 46

How many cells are there (trillions)? 75


Genome Name: Human Bob
Number of genes: 20000
Number of chromosomes: 46
Number of cells: 76

Genome Name: Human Sally
Number of genes: 20000
Number of chromosomes: 46
Number of cells: 120

Genome Name: Human Sri
Number of genes: 20000
Number of chromosomes: 46
Number of cells: 75
Process finished with exit code 0




Part 2:

Class Diagram:

+-------------------------------------------+
|              NucleicAcid                   |
+-------------------------------------------+
| - name: String                            |
| - chemicalFormula: String                 |
| - molarMass: float                        |
| - density: float                          |
+-------------------------------------------+
| + NucleicAcid()                           |
| + NucleicAcid(String, String,             |
|     float, float)                         |
| + getName(): String                       |
| + setName(String): void                   |
| + getChemicalFormula(): String            |
| + setChemicalFormula(String): void        |
| + getMolarMass(): float                   |
| + setMolarMass(float): void               |
| + getDensity(): float                     |
| + setDensity(float): void                 |
| + print(): void                           |
+-------------------------------------------+

+-------------------------------------------+
|           GenoNucleicAcid                 |
+-------------------------------------------+
|                                           |
+-------------------------------------------+
| + GenoNucleicAcid(): NucleicAcid          |
| + main(String[]): void                    |
+-------------------------------------------+

Test case output:

/Library/Java/JavaVirtualMachines/temurin-25.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=63539 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/nikhil.sharma/Desktop/kickups/Assignment2/out/production/Assignment2_part2 GenoNucleicAcid


Enter the name of the nucleic acid: Cytosine

Enter the chemical formula of the nucleic acid: C4H5N3O

Enter the molar mass of the nucleic acid: 111.10

Enter the density of the nucleic acid: 1.55


Enter the name of the nucleic acid: Adenine

Enter the chemical formula of the nucleic acid: C5H5N5

Enter the molar mass of the nucleic acid: 135.13

Enter the density of the nucleic acid: 1.6


Enter the name of the nucleic acid: Guanine

Enter the chemical formula of the nucleic acid: C5H5N5O

Enter the molar mass of the nucleic acid: 151.13

Enter the density of the nucleic acid: 2.200


Enter the name of the nucleic acid: Thymine

Enter the chemical formula of the nucleic acid: C5H6N2O2

Enter the molar mass of the nucleic acid: 126.115

Enter the density of the nucleic acid: 1.223


Enter the name of the nucleic acid: Uracil

Enter the chemical formula of the nucleic acid: C4H4N2O2

Enter the molar mass of the nucleic acid: 112.08676

Enter the density of the nucleic acid: 1.32


Nucleic Acid Name: Cytosine
Nucleic Acid Chemical Formula: C4H5N3O
Nucleic Acid Molar Mass: 111.0999984741211
Nucleic Acid Density: 1.5499999523162842

Nucleic Acid Name: Adenine
Nucleic Acid Chemical Formula: C5H5N5
Nucleic Acid Molar Mass: 135.1300048828125
Nucleic Acid Density: 1.600000023841858

Nucleic Acid Name: Guanine
Nucleic Acid Chemical Formula: C5H5N5O
Nucleic Acid Molar Mass: 151.1300048828125
Nucleic Acid Density: 2.200000047683716

Nucleic Acid Name: Thymine
Nucleic Acid Chemical Formula: C5H6N2O2
Nucleic Acid Molar Mass: 126.11499786376953
Nucleic Acid Density: 1.2230000495910645

Nucleic Acid Name: Uracil
Nucleic Acid Chemical Formula: C4H4N2O2
Nucleic Acid Molar Mass: 112.08676147460938
Nucleic Acid Density: 1.3200000524520874
Process finished with exit code 0
