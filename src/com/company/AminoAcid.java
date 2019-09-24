package com.company;

public class AminoAcid {
    String seq;

    /*
    * constructor for Amino Acid class
    * to not confuse the DNA/RNA sequence with Amino acids, the sequence will be lower case
    * Amino Acid is not a Nucleotide so extends is not approrpiate here.
    * */
    public AminoAcid(String sequence) {
        String s = sequence.toLowerCase();
//        s = s.trim();
        s = s.replaceAll("\\s+","");
        s = s.replace("?","");
        s = s.replace("-","");
    }
    /*
    * based on one amino acid, it will return a list of possible codons
    * */
    public String amino2codon () {
        return "not yet implemented";
    }
}
