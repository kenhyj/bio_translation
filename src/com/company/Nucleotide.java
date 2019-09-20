package com.company;

import exceptions.InvalidInputString;

import java.util.InputMismatchException;

public class Nucleotide {
    private String seq; // make sure all of the seq is capitalized


    // constructor
    /* @param the sequence is the sequence of nucleotide (either deoxyribonucleic acid aka DNA
    * or ribonucleic acid aka RNA)
    * */
    public Nucleotide(String sequence){
        String s = sequence.toUpperCase();
        // Todo:
        //https://stackoverflow.com/questions/8923398/regex-doesnt-work-in-string-matches
        if (s.matches("[^AUTCG]]")) { // [^AUTCG]
          // throw an exception
          // suppose you input Z, no nucleotide called Z exists
          // suppopse you input AUGTZ,
          throw new InvalidInputString("DNA have ATCG, RNA have AUCG, don't put anything else!");
        }
        else {
          this.seq = s;
        }
    }

    /* getter for Nucleotide.seq */
    public String getSequence(){
      return this.seq;
    }

    /* all the letters should be capitalized.
    the input characters will be capitalized on its own
    DNA -> complement DNA (only one nucleotide at a time) */
    String dna2cdna (String dna) {
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
                return null; // i think we should throw an exception here
        }
    }

    // DNA -> RNA (one nucleotide at a time)
    String dna2mrna(String dna) {
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
                return null; // exception should be better here
        }
    }

    // RNA -> AA chain
    String rna2aa(String rna) {
        return null;
    }

// DNA -> AA chain
// 2 ways to implement this
// 1) DNA -> RNA then RNA-> AA chain
// 2) DNA -> AA chain. // may be faster, but harder to implement and update.



/* amino acid table
    U               A              C              G
U   U   A   C   G   U  A   C   G   U  A   C   G   U   A   C   G

A   U   A   C   G   U  A   C   G   U  A   C   G   U   A   C   G

C   U   A   C   G   U  A   C   G   U  A   C   G   U   A   C   G

G   U   A   C   G   U  A   C   G   U  A   C   G   U   A   C   G


alanine = ala = A
arginine = arg = R
asparagine = asn = N
aspartic acid = asp = D
cysteine = cys = C
glutamic acid = =

 */
}
