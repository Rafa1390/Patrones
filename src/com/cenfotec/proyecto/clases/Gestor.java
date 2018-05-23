package com.cenfotec.proyecto.clases;

import java.util.ArrayList;

public class Gestor {
	
	private static ArrayList<Proceso> listaProceso = new ArrayList<Proceso>();
	
	public Tarea crearTarea(String pTitTarea, String pGrupo, ArrayList<String> pListaIndicaciones)throws java.io.IOException{
		Tarea tarea = new Tarea();
		
		tarea.setTitulo(pTitTarea);
		tarea.setGrupoResponsable(pGrupo);
		tarea.setIndicaciones(pListaIndicaciones);
		
		return tarea;
	}
	
	public void crearProceso(String pNomProceso, ArrayList<Tarea> pListaTareas) {
		Proceso proceso = new Proceso();
		
		proceso.setNomProceso(pNomProceso);
		proceso.setTareas(pListaTareas);
		
		listaProceso.add(proceso);
	}
}
