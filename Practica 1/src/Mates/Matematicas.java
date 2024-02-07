package Mates;

import java.lang.Math;
import java.util.random.*;


public class Matematicas{
        private int rango = 1;
        public static double generarNumeroPiIterativo(double numeroDeDardos){
                double memoria = numeroDeDardos;
                double dardosDentro = 0;
                while(0 <= memoria){
                        double x = Math.random();
                        double y = Math.random();
                        if( x * x + y * y <= 1){
                                dardosDentro = dardosDentro + 1;
                        }
                        memoria = memoria - 1;

                }
                return (4*dardosDentro/numeroDeDardos);
        }

}