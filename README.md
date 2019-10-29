# bio_translation
cDNA <- DNA <-> mRNA -> AA
Input two DNA sequence and return type of mutation.

Challenge: given AA, return possible list of DNA, mRNA

<b>High Level Design Brainstorm:</b><br>
While DNA and RNA IsA Nucleotide, the Liskov  Substitution Principle does not allow DNA or RNA to be child class of Nucleotide class.
<br>The preconditions are violated. 
<br>Nucleic acids can have AUTCG nucleic acid. 
<br>DNA consists of subset: ATCG
<br>RNA consists of subset: AUCG 


<b>Low Level Design Brainstorm</b>:<br>
<br><b>Amino acid table</b>

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


