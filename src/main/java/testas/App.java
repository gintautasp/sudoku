package testas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
	    
	CsvArray csv_array = new CsvArray( "testas.csv", ";" );
	csv_array.showConfig(); 
    }
}
