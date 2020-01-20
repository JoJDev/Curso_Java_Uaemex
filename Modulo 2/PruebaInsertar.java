public class PruebaInsertar{
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		ProcesosBD inv = new ProcesosBD();

		alumno.setCuenta(1621057);
		alumno.setPaterno("Ortega");
		alumno.setMaterno("Sahagun");
		alumno.setNombre("Jose");
		alumno.setDireccion("Girasoles 18");
		alumno.setTelefono(55221144);
		alumno.setLicenciatura("Ico");
		alumno.setSemestre(7);

		try{
			inv.setAlumno(alumno);
			inv.insertarAlumno();

			System.out.println("Datos guardados con exito");
		}
		catch(Exception ex ){
			System.out.println("No se pudieron guardar los datos");
		}

	}
}