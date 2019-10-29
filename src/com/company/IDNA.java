package com.company;

public interface IDNA extends INucleotide{
    /* this converts a single DNA strand into its complement for those who are unfamiliar with biology of the DNA
    * DNA consists of 4 building blocks A, T, C, G
    * A's complement is T and vise versa. C's complement is G and vise versa*/
    String dna2rna(String dnaStrand);
}
