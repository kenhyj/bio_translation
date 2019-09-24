package com.company;

import exceptions.InvalidInputString;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Nucleotide {
    private String seq; // make sure all of the seq is capitalized
    /* amino acid table
     */

    //public Map<String, String> codontable;
    /*
    * UUU UUC                                                                       = Phe f
    * UUA UUG           CUU CUC CUA CUG                                             = Leu
    *                                    AUU AUC AUA                                = Ile
    *                                    AUG                                        = Met / start
    *                                                     GUU GUC GUA GUG           = Val
    * UCU UCC UCA UCG                    AGU AGC                                    = Ser
    *                   CCU CCC CCA CCG                                             = Pro
    *                                    ACU ACC ACA ACG                            = Thr
    *                                                     GCU GCC GCA GCG           = Ala
    * UAU UAC                                                                       = Tyr
    *                   CAU CAC                                                     = His
    *                   CAA CAG                                                     = Gln
    *                                    AAU AAC                                    = Asn
    *                                    AAA AAG                                    = Lys
    *                                                     GAU GAC                   = Asp
    *                                                     GAA GAG                   = Glu
    * UGC UGU                                                                       = Cys c
    * UGG                                                                           = Trp
    *                   CGU CGC CGA CGG  AGA AGG                                    = Arg
    *                                                     GGU GGC GGA GGG           = Gly
    * UGA UAA UAG                                                                   = Stop
    * */

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
