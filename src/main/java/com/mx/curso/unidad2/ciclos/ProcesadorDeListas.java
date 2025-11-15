package com.mx.curso.unidad2.ciclos;

public class ProcesadorDeListas {

    static void main(String[] args) {

        String [] frutas = {"Manzana","Platano","Sandia","Naranja","Uva"};

        for (int i = 0;i<frutas.length;i++){
            System.out.println("Nombre de la fruta: " + frutas[i]);
        }

        //buscar un elemento especifico utilizando un while
         int indice = 0;

        while(indice< frutas.length){
            if(frutas[indice].equals("Uva")){
                System.out.println("Fruta encontrada: "+frutas[indice]);
                break;
            }
            indice++;
        }
    }
}
