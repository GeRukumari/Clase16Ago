package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercicio_1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field_1.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST,10);
            
            giraRobot(2);
            mueveRobot(1);
            giraRobot(3);
            mueveRobot(3);
            giraRobot(3);
            mueveRobot(3);
            giraRobot(3);
            mueveRobot(3);
            giraRobot(3);       
            mueveRobot(2);
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

