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
      Nucleotide nucleotideDA = new DNA("A");
      assertEquals("A", nucleotideDA.getSequence() );
      Nucleotide nucleotideDT = new DNA("T");
      assertEquals("T", nucleotideDT.getSequence() );
      Nucleotide nucleotideDC = new DNA("C");
      assertEquals("C", nucleotideDC.getSequence() );
      Nucleotide nucleotideDG = new DNA("G");
      assertEquals("G", nucleotideDG.getSequence() );

      Nucleotide nucleotideDa = new DNA("a");
      assertEquals("A", nucleotideDa.getSequence() );
      Nucleotide nucleotideDt = new DNA("t");
      assertEquals("T", nucleotideDt.getSequence() );
      Nucleotide nucleotideDc = new DNA("c");
      assertEquals("C", nucleotideDc.getSequence() );
      Nucleotide nucleotideDg = new DNA("g");
      assertEquals("G", nucleotideDg.getSequence() );

      Nucleotide nucleotideRA = new RNA("A");
      assertEquals("A", nucleotideRA.getSequence() );
      Nucleotide nucleotideRU = new RNA("U");
      assertEquals("U", nucleotideRU.getSequence() );
      Nucleotide nucleotideRC = new RNA("C");
      assertEquals("C", nucleotideRC.getSequence() );
      Nucleotide nucleotideRG = new RNA("G");
      assertEquals("G", nucleotideRG.getSequence() );

      Nucleotide nucleotideRa = new RNA("a");
      assertEquals("A", nucleotideRa.getSequence() );
      Nucleotide nucleotideRu = new RNA("u");
      assertEquals("U", nucleotideRu.getSequence() );
      Nucleotide nucleotideRc = new RNA("c");
      assertEquals("C", nucleotideRc.getSequence() );
      Nucleotide nucleotideRg = new RNA("g");
      assertEquals("G", nucleotideRg.getSequence() );
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
    public void testDNA2RNA(){
      DNA dA = new DNA("A");
      DNA dT = new DNA("T");
      DNA dC = new DNA("C");
      DNA dG = new DNA("G");
      DNA da = new DNA("a");
      DNA dt = new DNA("t");
      DNA dc = new DNA("c");
      DNA dg = new DNA("g");

      RNA rA = new RNA("A");
      RNA rT = new RNA("T");
      RNA rC = new RNA("C");
      RNA rG = new RNA("G");
      RNA ra = new RNA("a");
      RNA rt = new RNA("t");
      RNA rc = new RNA("c");
      RNA rg = new RNA("g");
    }
}
