
	package testas;

	public class CsvArray {
	
		public String file;
		
		public String delim;

		public CsvArray( String csv_file_name, String delim_char ) {
			
			
			delim = delim_char;
			file = csv_file_name;
		}
		
		public void showConfig() {
		
			System.out.println ( "csv file : " + file + "\ndelimiter : " + delim ); 
		}
		
		public String labasJunit() {
		
			return "Labas jUnit pasauli"; 
		}
		
		public int[] skaiciukai( int paskutine) {
		
			int[] skaiciai = { 1, 2, 3, 4, 5, 6, 7, 1 };
			
			skaiciai [ skaiciai.length - 1 ] = skaiciai [ skaiciai.length - 1 ] + paskutine;
			
			return skaiciai;
		}
	}