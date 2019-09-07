package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    // all the letters should be capitalized.
    // the input characters will be capitalized on its own

    // DNA -> complement DNA (only one nucleotide at a time)
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

    // RNA -> DNA (only one nucleotide at a time)
    String rna2dna(String rna){
        switch (rna) {
            case "A":
                return "T";
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
                return null;
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



