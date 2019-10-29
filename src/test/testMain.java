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
      assertEquals("T", DT.getSequence() );
        DNA DC = new DNA("C");
      assertEquals("C", DC.getSequence() );
        DNA nucleotideDG = new DNA("G");
      assertEquals("G", nucleotideDG.getSequence() );

        DNA Da = new DNA("a");
      assertEquals("A", Da.getSequence() );
        DNA Dt = new DNA("t");
      assertEquals("T", Dt.getSequence() );
        DNA Dc = new DNA("c");
      assertEquals("C", Dc.getSequence() );
        DNA Dg = new DNA("g");
      assertEquals("G", Dg.getSequence() );

      RNA RA = new RNA("A");
      assertEquals("A", RA.getSequence() );
        RNA RU = new RNA("U");
      assertEquals("U", RU.getSequence() );
        RNA RC = new RNA("C");
      assertEquals("C", RC.getSequence() );
        RNA RG = new RNA("G");
      assertEquals("G", RG.getSequence() );

        RNA Ra = new RNA("a");
      assertEquals("A", Ra.getSequence() );
        RNA Ru = new RNA("u");
      assertEquals("U", Ru.getSequence() );
        RNA Rc = new RNA("c");
      assertEquals("C", Rc.getSequence() );
        RNA Rg = new RNA("g");
      assertEquals("G", Rg.getSequence() );

        DNA DDspace = new DNA("a  t");
        assertEquals("AT", DDspace.getSequence() );

        RNA RRspace = new RNA("a  u");
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

    /*
    @Test
    // testing if the single nucleotide are returned properly
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
    // testing if the single nucleotide are returned properly
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
    */
}
