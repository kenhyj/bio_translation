package com.company;

import exceptions.InvalidInputString;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Nucleotide {
    private String seq; // make sure all of the seq is capitalized

    // constructor
    /* @param the sequence is the sequence of nucleotide (either deoxyribonucleic acid aka DNA
    * or ribonucleic acid aka RNA)
    * It will convert the string into uppercase and remove any whitespaces
    * */
    public Nucleotide(String sequence){
        String s = sequence.toUpperCase();
//        s = s.trim();
        s = s.replaceAll("\\s+","");
        s = s.replace("?","");
        s = s.replace("-","");
        //https://stackoverflow.com/questions/8923398/regex-doesnt-work-in-string-matches
        if (s.matches(".*[^AUTCG]+.*")) { // [^AUTCG]
          // throw an exception
          // suppose you input Z, no nucleotide called Z exists
          // suppose you input AUGTZ,
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


    // RNA -> AA chain
    public String rna2aa(String rna) {
        return "empty";
    }

// DNA -> AA chain
// 2 ways to implement this
// 1) DNA -> RNA then RNA-> AA chain
// 2) DNA -> AA chain. // may be faster, but harder to implement and update.




}
