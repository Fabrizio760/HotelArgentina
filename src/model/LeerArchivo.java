package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LeerArchivo {

	private String comment;
	private List<String> columns;
	private List<String> outputColumns;
	private List<String> lineasErroneas;
	private String filterValue;
	private String filterColumn = null;
	private String separator = ";";

//	public LeerArchivo(String comment, List<String> columns, String filterValue, String filterColumn,
//			List<String> outputColumns, String separator) {
//		this.comment = comment;
//		this.columns = columns;
//		this.filterValue = filterValue;
//		this.filterColumn = filterColumn;
//		this.outputColumns = outputColumns;
//		this.separator = separator;
//		this.lineasErroneas = new ArrayList<>();
//		if (!this.columns.contains(this.filterColumn)) {
//			throw new IllegalStateException("El filtro elegido no esta dentro de la lista de columnas");
//		}
//	}

	public void leerReservas() {

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("./resources/reserva.csv");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			Reserva reserva = new Reserva();
			while ((linea = br.readLine()) != null) {
				List<String> listaReservas = new ArrayList<>();

				listaReserva(linea);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/*
	 * public List<String> parseLine(String linea) throws LineaInvalidaException {
	 * List<String> output = null; this.columns = Arrays.asList(new String[] { "id",
	 * "origen", "cantidadHuespedes", "checkIn", "checkOut", "amenities",
	 * "pagoAbonado" }); String[] lineaArr = linea.split(this.separator); // if
	 * (lineaArr.length == this.columns.size()) { // cantidad de lineas // //int
	 * nroColFiltro = this.columns.indexOf(this.filterColumn); // // coincida el
	 * filtro // output = new ArrayList<>(); // for (int i = 0; i <
	 * this.columns.size(); i++) { // String column = this.columns.get(i); // //
	 * String value = lineaArr[i]; // output.add(value); // } // // } else { //
	 * throw new LineaInvalidaException(linea); // }
	 * 
	 * for(int i=0; i<7;i++) { System.out.println(lineaArr[i]); }
	 * 
	 * return output; }
	 */

	public String[] listaReserva(String linea) {
		
		//crear una lista de las reservas 
		List<Reserva> reservas = new ArrayList<>();
		//System.out.println(linea);
		 
		String[] parts = linea.split(";");  
		
		System.out.println(Arrays.asList(parts));
		System.out.println(Arrays.asList(parts).size());
	for (int i=0; i<4; i++) {
		
		
		reservas.add(new Reserva(Integer.parseInt(parts[0]), parts[1],Integer.parseInt(parts[2]), parts[3],parts[4],Integer.parseInt(parts[5]), Double.parseDouble(parts[6])));
		//System.out.println(reservas.get(i));
	
	}
		
for (int i=0; i<reservas.size(); i++) {
		
		//System.out.println(reservas.get(i));
	
	}
		
	
		return parts;
		 
	}
}