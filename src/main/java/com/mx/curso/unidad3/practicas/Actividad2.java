package com.mx.curso.unidad3.practicas;

public class Actividad2 {

    static void main(String[] args) {

        int cantidades [] = {2,0,85,12,43,6,3,123,49,9};

        for(int i=0;i< cantidades.length;i++){

            switch (cantidades[i]){

                case 0:
                    System.out.println("Disponibles: "+cantidades[i]+" - Clasificacion: "+"Descontinuado");
                    break;
                case 1,2,3,4,5,6,7,8,9:
                    System.out.println("Disponibles: "+cantidades[i]+" - Clasificacion: "+"Urgente");
                    break;
                default:
                    if(cantidades[i]>=10 && cantidades[i]<=50){
                        System.out.println("Disponibles: "+cantidades[i]+" - Clasificacion: "+"Bajo stock");
                    }else{
                        System.out.println("Disponibles: "+cantidades[i]+" - Clasificacion: "+"En stock");
                    }
                    break;

            }

        }

    }

}
