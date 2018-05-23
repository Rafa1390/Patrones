package com.cenfotec.proyecto.ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import com.cenfotec.proyecto.clases.Gestor;
import com.cenfotec.proyecto.clases.Tarea;

public class UI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	
	public static void main(String[] args)throws java.io.IOException {
		int opc;
		boolean noSalir = true;
		String[] listaMenu = {
							"<---- Menú manejo de procesos ---->",
							" ",
							"1.  Crear proceso",
							"2.  Ejecutar proceso",
							"3.  Salir",
							};

		do{
			mostrarMenu(listaMenu);
			opc = leerOpcion();
			noSalir = ejecutarMenu(opc);
		}while (noSalir);
	}
	
	static void mostrarMenu(String[] plista){
		
		out.println();
		
		for(int i=0;i<plista.length;i++){
			out.println(plista[i]);
		}
		out.println();
	}
	
	static int leerOpcion()throws java.io.IOException{
		
		int opcion;

		out.print("Seleccione su opción: ");
		opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;
	}
	
	static boolean ejecutarMenu(int popcion)throws java.io.IOException{
		boolean noSalir = true;
		
		switch(popcion){
		

		case 1:
			crearProceso();
			break;

		case 2:

			ejecutarProceso();
			break;

		case 3:

			noSalir = false;
			break;

		default:

			out.println("Opcion invalida");
			out.println();
			break;
		}
		
		return noSalir;
	}
	
	/*Se crea un proceso*/
	static void crearProceso()throws java.io.IOException{
		String nomProceso;
		int cantTareas;
		ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
		Gestor gestor = new Gestor();
		
		out.println("Indique el nombre del proceso que desea realizar");
		nomProceso = in.readLine();
		
		out.println("Indique la cantidad de tareas que desea asignarle al proceso");
		cantTareas = Integer.parseInt(in.readLine());
		
		listaTareas = contruirTarea(cantTareas);
		
		gestor.crearProceso(nomProceso, listaTareas);
	}
	
	/*Se crean las partes de una tarea y retorna una lista de tareas*/
	static ArrayList<Tarea> contruirTarea(int pCantTareas)throws java.io.IOException{
		String titTarea, grupo;
		int resInd;
		ArrayList<String> listaIndicaciones = new ArrayList<String>();
		Tarea tarea = new Tarea();
		Gestor gestor = new Gestor();
		ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
		
		for(int i = 0; i < pCantTareas; i++) {
			
			out.println("Indique el título de la tarea " + (i+1));
			titTarea = in.readLine();
			
			out.println("Indique el grupo responsable de la tarea " + (i+1));
			grupo = in.readLine();
			
			do {
				out.println("¿Desea ingresar un formulario o una pregunta a la tarea " + (i+1) + " ?");
				out.println("Digite 1 para formulario ó 2 para pregunta");
				resInd = Integer.parseInt(in.readLine());
				
				if(!(resInd > 2 || resInd < 0)) {
					
					listaIndicaciones = crearIndicaciones(resInd, i);
				} else {
					out.println("Opción incorrecta, por favor digite 1 para formulario ó 2 para pregunta");
				}
			}while(resInd > 2 || resInd < 0);
			
			tarea = gestor.crearTarea(titTarea, grupo, listaIndicaciones);
			listaTareas.add(tarea);
		}
		
		return listaTareas;
	}
	
	/*Se crean las indicaciones para la tarea y se devuelve un arreglo de estas*/
	static ArrayList<String> crearIndicaciones(int pRestIndi, int pI)throws java.io.IOException{
		int cantDatos;
		String indiDato, resPregunta;
		ArrayList<String> listaIndicaciones = new ArrayList<String>();
		
		if(pRestIndi == 1) {
			out.println("Indique la cantidad de datos que desea agregar al formulario");
			cantDatos = Integer.parseInt(in.readLine());
			
			for(int j = 0; j < cantDatos; j++) {
				out.println("Digite la indicación del dato " + (j+1));
				indiDato = in.readLine();
				
				listaIndicaciones.add(indiDato);
			}
		} else {
			out.println("Digite la pregunta de la tarea " + (pI+1));
			resPregunta = in.readLine();
			
			listaIndicaciones.add(resPregunta);
		}
		
		return listaIndicaciones;
	}
	
	static void ejecutarProceso()throws java.io.IOException{
		
	}
}