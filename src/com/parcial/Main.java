package com.parcial;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("nombre1", 1);
        Estudiante estudiante2 = new Estudiante("nombre2", 2);
        Estudiante estudiante3 = new Estudiante("nombre3", 1);
        Estudiante estudiante4 = new Estudiante("nombre4", 2);
        Estudiante estudiante5 = new Estudiante("nombre5", 3);
        Estudiante estudiante6 = new Estudiante("nombre6", 3);
        Estudiante estudiante7 = new Estudiante("nombre7", 4);

        //Lista que recibe el conductor antes de iniciar el trayecto
        ListaDeEstudiantes listaDeEstudiantes = new ListaDeEstudiantes();
        listaDeEstudiantes.agregarEstudiante(estudiante1);
        listaDeEstudiantes.agregarEstudiante(estudiante2);
        listaDeEstudiantes.agregarEstudiante(estudiante3);
        listaDeEstudiantes.agregarEstudiante(estudiante4);
        listaDeEstudiantes.agregarEstudiante(estudiante5);
        listaDeEstudiantes.agregarEstudiante(estudiante6);
        listaDeEstudiantes.agregarEstudiante(estudiante7);

        //Inicia el trayecto, sera de 4 paradas antes de llegar al colegio
        ListaRecorrido listaRecorrido = new ListaRecorrido();

        //En la primera parada
        Registro registro1 = new Registro(estudiante1, 1);
        Registro registro2 = new Registro(estudiante3, 1);
        listaRecorrido.agregarRegistro(registro1);
        listaRecorrido.agregarRegistro(registro2);

        //En la segunda parada
        Registro registro3 = new Registro(estudiante2, 2);
        Registro registro4 = new Registro(estudiante4, 2);
        listaRecorrido.agregarRegistro(registro3);
        listaRecorrido.agregarRegistro(registro4);

        //En la tercera parada
        Registro registro5 = new Registro(estudiante5, 3);
        //Registro registro6 = new Registro(estudiante6, 3);
        listaRecorrido.agregarRegistro(registro5);
        //listaRecorrido.agregarRegistro(registro6);

        //Se sube en la parada equivocada
        Registro registro7 = new Registro(estudiante7, 3);
        listaRecorrido.agregarRegistro(registro7);

        //En la cuarta parada


        //Al llegar al colegio se llenan las listas para reportar

        //Lista de estudiantes recogidos
        System.out.println(listaRecorrido.toString());

        //Lista de estudiantes no recogidos
        ListaEstudiantesNoRecogidos estudiantesNoRecogidos = new ListaEstudiantesNoRecogidos();
        listaDeEstudiantes.getLista().forEach(estudiante -> estudiantesNoRecogidos.agregar(estudiante));
        System.out.println(estudiantesNoRecogidos.toString());

        //Lista de estudiantes recogidos en la parada correcta
        ListaEstudiantesRecogidosEnlaParadaCorrecta estudiantesRecogidosEnlaParadaCorrecta = new ListaEstudiantesRecogidosEnlaParadaCorrecta();
        listaRecorrido.getRegistros()
                .forEach(registro -> estudiantesRecogidosEnlaParadaCorrecta.agregar(registro.getEstudiante(), registro.getParada()));
        System.out.println(estudiantesRecogidosEnlaParadaCorrecta);

        //Lista de estudiantes recogidos en la parada incorrecta
        ListaEstudiatesRecogidosEnlaParadaIncorrecta estudiatesRecogidosEnlaParadaIncorrecta = new ListaEstudiatesRecogidosEnlaParadaIncorrecta();
        listaRecorrido.getRegistros()
                .forEach(registro -> estudiatesRecogidosEnlaParadaIncorrecta.agregar(registro.getEstudiante(), registro.getParada()));
        System.out.println(estudiatesRecogidosEnlaParadaIncorrecta);
    }
}
