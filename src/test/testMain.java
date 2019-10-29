package test;
import static org.junit.Assert.*;

import com.company.DNA;
import com.company.Main;
import com.company.Nucleotide;
import com.company.RNA;
import exceptions.InvalidInputString;
import org.junit.Test;
import org.junit.Before;

public class testMain {
    @Before
    public void runBefore() {
    }

    @Test
    public void testConstr(){
      DNA nucleotideDA = new DNA("A");
      assertEquals("A", nucleotideDA.getSequence() );
        DNA DT = new DNA("T");
      assertEquals("T", nucleotideDT.getSequence() );
        DNA DC = new DNA("C");
      assertEquals("C", nucleotideDC.getSequence() );
        DNA nucleotideDG = new DNA("G");
      assertEquals("G", nucleotideDG.getSequence() );

        DNA nucleotideDa = new DNA("a");
      assertEquals("A", nucleotideDa.getSequence() );
        DNA nucleotideDt = new DNA("t");
      assertEquals("T", nucleotideDt.getSequence() );
        DNA Dc = new DNA("c");
      assertEquals("C", nucleotideDc.getSequence() );
        DNA Dg = new DNA("g");
      assertEquals("G", nucleotideDg.getSequence() );

      RNA nucleotideRA = new RNA("A");
      assertEquals("A", nucleotideRA.getSequence() );
        RNA nucleotideRU = new RNA("U");
      assertEquals("U", nucleotideRU.getSequence() );
        RNA nucleotideRC = new RNA("C");
      assertEquals("C", nucleotideRC.getSequence() );
        RNA nucleotideRG = new RNA("G");
      assertEquals("G", nucleotideRG.getSequence() );

        RNA nucleotideRa = new RNA("a");
      assertEquals("A", nucleotideRa.getSequence() );
        RNA nucleotideRu = new RNA("u");
      assertEquals("U", nucleotideRu.getSequence() );
        RNA nucleotideRc = new RNA("c");
      assertEquals("C", nucleotideRc.getSequence() );
        RNA nucleotideRg = new RNA("g");
      assertEquals("G", nucleotideRg.getSequence() );

        DNA DDspace = new DNA("a  t");
        assertEquals("AT", DDspace.getSequence() );

        DNA RRspace = new RNA("a  u");
        assertEquals("AU", RRspace.getSequence() );
    }

    @Test
    public void testConstrExceptionZ(){
        try {
            DNA nucleotideDZ  = new DNA("Z");
            fail ("You cannot have nucleotides outside of AUTCG") ;
        } catch (InvalidInputString iis) {
            //expected
            System.out.println("You caught the string input exception. Nice.");
        }
    }
    @Test
    public void testConstrExceptionZZ(){
        try {
            DNA nucleotideDZ  = new DNA("ZZ");
            fail ("You cannot have nucleotides outside of AUTCG") ;
        } catch (InvalidInputString iis) {
            //expected
            System.out.println("You caught the string input exception. Nice.");
        }
    }
    @Test
    public void testConstrExceptionZA(){
        try {
            DNA nucleotideDZ  = new DNA("ZA");
            fail ("You cannot have nucleotides outside of AUTCG") ;
        } catch (InvalidInputString iis) {
            //expected
            System.out.println("You caught the string input exception. Nice.");
        }
    }
    @Test
    public void testConstrExceptionAZ(){
        try {
            DNA nucleotideDZ  = new DNA("AZ");
            fail ("You cannot have nucleotides outside of AUTCG") ;
        } catch (InvalidInputString iis) {
            //expected
            System.out.println("You caught the string input exception. Nice.");
        }
    }

    @Test
    /* testing if the single nucleotide are returned properly*/
    public void testSingleDNA2cDNA(){
      DNA dA = new DNA("A");
      assertEquals("T", dA.singleDna2cdna(dA.getSequence() ));
      DNA dT = new DNA("T");
      assertEquals("A", dT.singleDna2cdna(dT.getSequence() ));
      DNA dC = new DNA("C");
      assertEquals("G", dC.singleDna2cdna(dC.getSequence() ));
      DNA dG = new DNA("G");
      assertEquals("C", dG.singleDna2cdna(dG.getSequence() ));
    }

    @Test
    /* testing if the single nucleotide are returned properly*/
    public void testSingleDNA2RNA(){
        DNA dA = new DNA("A");
        assertEquals("U", dA.singleDna2rna(dA.getSequence() ));
        DNA dT = new DNA("U");
        assertEquals("A", dT.singleDna2rna(dT.getSequence() ));
        DNA dC = new DNA("C");
        assertEquals("G", dC.singleDna2rna(dC.getSequence() ));
        DNA dG = new DNA("G");
        assertEquals("C", dG.singleDna2rna(dG.getSequence() ));
    }


}
