package com.company;

import exceptions.InvalidInputString;

public class DNA extends Nucleotide{
    public DNA(String sequence) {
        super(sequence);
    }
    /* all the letters should be capitalized.
the input characters will be capitalized on its own
DNA -> complement DNA (only one nucleotide at a time) */
    public String singleDna2cdna (String dna) {
        switch (dna) {
            case "A":
                return "T";
//            break;

            case "T":
                return "A";
//            break;
            case "C":
                return "G";
//            break;
            case "G":
                return "C";
//            break;
            default:
                throw new InvalidInputString("DNA have ATCG, " +
                        "RNA have AUCG, don't put anything else!");
        }
    }

    // DNA -> RNA (one nucleotide at a time)
    public String singleDna2mrna(String dna) {
        switch (dna) {
            case "A":
                return "U";
//            break;
            case "U":
                return "A";
//            break;
            case "C":
                return "G";
//            break;
            case "G":
                return "C";
//            break;
            default:
                throw new InvalidInputString("DNA have ATCG, " +
                        "RNA have AUCG, don't put anything else!");
        }
    }

}
