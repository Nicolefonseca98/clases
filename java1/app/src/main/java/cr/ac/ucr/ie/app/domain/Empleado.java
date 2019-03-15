package cr.ac.ucr.ie.app.domain;

public class Empleado
{	
	private int id;
	private String nombre;
	private String apellidos;
	
	public Empleado(int id, String nombre, String apellidos)
	{
		this(id, nombre);
		if(apellidos != null && apellidos.trim().equals("")) throw new RuntimeException("El apellidos es requerido");		

		this.apellidos = apellidos;
	}
	
	public Empleado(int id, String nombre)
	{
		if(id <= 0) throw new RuntimeException("El id debe ser mayor a 0.");
		if(nombre != null && nombre.trim().equals("")) throw new RuntimeException("El nombre es requerido");
		
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
