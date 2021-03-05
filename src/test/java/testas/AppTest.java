package testas;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void kitasTestas()
    {
	double a=10.40008;
	double b=10.40004;
	
	double tikslumas = 0.00001;
	    
        assertEquals( "nesutampa a ir b reiksmes", a, b, tikslumas );
    } 

    @Test
    public void treciasTestas()
    {
	String a="labas jUnit pasauli";
	    
	CsvArray csv_array = new CsvArray ( "sudoku.csv", "," );
	String b= csv_array.labasJunit();
	
	    
        assertEquals( "nesutampa a ir b eilutes", a, b );
    }    
  
    @Test
    public void masyvuTestas()
    {
	int[] a={ 1, 2, 3, 4, 5, 6, 7, 8 };
	    
	CsvArray csv_array = new CsvArray ( "sudoku.csv", "," );
	int[] b= csv_array.skaiciukai( 6 );
	    
        assertArrayEquals( "nesutampa a ir b", a, b );
    }     
    
}
