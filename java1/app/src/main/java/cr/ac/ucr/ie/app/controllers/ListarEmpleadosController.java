package cr.ac.ucr.ie.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cr.ac.ucr.ie.app.domain.Departamento;
import cr.ac.ucr.ie.app.domain.Empleado;

@RestController
public class ListarEmpleadosController 
{
	private Departamento dep = new Departamento(1, "Lenguajes");
	
	@RequestMapping("/")
	public List<Empleado> listar() 
	{
		return dep.listarEmpleados();
	}
	
}