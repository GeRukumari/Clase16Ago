package unal.poo.practica;

import becker.robots.*;
import static unal.poo.practica.Ejercicio_1.estudiante;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio_2
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_2.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.EAST,10);
            giraRobot(2);
            mueveRobot(1);
            giraRobot(1);
            mueveRobot(1);
            giraRobot(1);
            mueveRobot(1);
            estudiante.canPickThing();
            estudiante.pickThing();
            giraRobot(2);
            mueveRobot(1);
            giraRobot(3);
            mueveRobot(1);
            giraRobot(3);
            mueveRobot(1);
            
                   
	}
        
        public static void mueveRobot(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();

        }
        public static void giraRobot(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.turnLeft();

        }
        
}

