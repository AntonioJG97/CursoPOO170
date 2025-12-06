package com.mx.curso.unidad3.practica2;

public class ReportePacientes {
    public static void main(String[] args) {

        // Arreglo de códigos de especialidad de 10 pacientes
        String[] codigos = {"C", "P", "N", "X", "C", "A", "P", "N", "Z", "C"};

        System.out.println("REPORTE DE PACIENTES POR ÁREA");

        // Recorrer el arreglo
        for (int i = 0; i < codigos.length; i++) {

            String codigo = codigos[i];
            String area;

            // Clasificación con switch
            switch (codigo) {
                case "C":
                    area = "Cardiología";
                    break;
                case "P":
                    area = "Pediatría";
                    break;
                case "N":
                    area = "Neurología";
                    break;
                default:
                    area = "General";
            }

            // Imprimir reporte
            System.out.println("Paciente " + (i + 1) + " | Código: " + codigo + "  Área: " + area);
        }
    }
}

