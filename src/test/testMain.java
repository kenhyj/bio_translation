package test;
import static org.junit.Assert.*;

import com.company.DNA;
import com.company.Main;
import com.company.RNA;
import org.junit.Test;
import org.junit.Before;

public class testMain {
    @Before
    public void runBefore() {
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

    @Test
    public void testConstr(){
    }

    @Test
    /* testing if the single nucleotide are returned properly*/
    public void testDNA2RNA(){
    }
}
