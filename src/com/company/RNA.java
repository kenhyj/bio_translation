package com.company;

import exceptions.InvalidInputString;

public class RNA implements IRNA {
    private String seq; // make sure all of the seq is capitalized

    public RNA(String sequence) {
        String s = sequence.toUpperCase();
//        s = s.trim();
        s = s.replaceAll("\\s+","");
        s = s.replace("?","");
        s = s.replace("-","");
        //https://stackoverflow.com/questions/8923398/regex-doesnt-work-in-string-matches
        if (s.matches(".*[^AUCG]+.*")) { // [^AUTCG]
            // throw an exception
            // suppose you input Z, no nucleotide called Z exists
            // suppose you input AUGTZ,
            throw new InvalidInputString("RNA have AUCG, don't put anything else!");
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
            String dna = this.singleRna2crna(cstring);
            retDNA += dna;
        }
        return retDNA;
    }

    /*  DNA -> complement DNA (only one nucleotide at a time) */
    private String singleRna2crna (String rna) {
        switch (rna) {
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
                throw new InvalidInputString("RNA have AUCG, don't put anything else!");
        }
    }
}
