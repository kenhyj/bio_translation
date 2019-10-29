package com.company;

import exceptions.InvalidInputString;

public class DNA implements IDNA {
    private String seq; // make sure all of the seq is capitalized

    public DNA(String sequence) {
        String s = sequence.toUpperCase();
        // s = s.trim();
        s = s.replaceAll("\\s+","");
        s = s.replace("?","");
        s = s.replace("-","");
        //https://stackoverflow.com/questions/8923398/regex-doesnt-work-in-string-matches
        if (s.matches(".*[^ATCG]+.*")) { // [^AUTCG]
            // throw an exception
            // suppose you input Z, no nucleotide called Z exists
            // suppose you input AUGTZ,
            throw new InvalidInputString("DNA have ATCG don't put anything else!");
        }
        else {
            this.seq = s;
        }
    }

    public String getSequence(){
        return this.seq;
    }

    public String getComplement(String sequence){
        String retDNA = "";
        for (int i = 0; i < sequence.length(); i++){
            char c = sequence.charAt(i);
            String cstring = Character.toString(c);
            String dna = this.singleDna2cdna(cstring);
            retDNA += dna;
        }
        return retDNA;
    }



    /*  DNA -> complement DNA (only one nucleotide at a time) */
    private String singleDna2cdna (String dna) {
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
                throw new InvalidInputString("DNA have ATCG, don't put anything else!");
        }
    }

    /* REQUIRES: dnaStrand is capitalized and have nonempty spaces and does not contain anything other than ATCG
     * */
    public String dna2rna(String dnaStrand) {
        String retRNA = "";
        for (int i = 0; i < dnaStrand.length(); i++){
            char c = dnaStrand.charAt(i);
            String cstring = Character.toString(c);
            String rna = this.singleDna2rna(cstring);
            retRNA += rna;
        }
        return retRNA;
    }

    // DNA -> RNA (one nucleotide at a time)
    private String singleDna2rna(String dna) {
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
