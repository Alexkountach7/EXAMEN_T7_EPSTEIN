package org.example;

import java.util.*;

public class EpsteinApp {
    List<Famoso> listaEpstein = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static void main() {

    }

    public  void procesardatos() {
        EntradaDatos.generarDatos();
        Queue<Famoso> datos_cola = EntradaDatos.getDatosActuales();

        while (!datos_cola.isEmpty()){
                Famoso famoso = datos_cola.poll();
                listaEpstein.add(famoso);
                System.out.println("procesan");
        }
    }


    public void nuevofamoso(){
        System.out.println("insetanto famosos");
        System.out.println("nombre:");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion=sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();
        System.out.println("famoso insertado");

        Famoso famoso_ = new Famoso(nombre,pais,profesion,edad);
        if (listaEpstein.contains(famoso_)){
            System.out.println("el famoso ha acudido a la fiesta de epstenin");
        }else {
            System.out.println("el famoso no ha acudido");
        }

    }

    public void buscarfamoso() {
        System.out.println("insetanto famosos");
        System.out.println("nombre:");
        String nombre = sc.nextLine();
        System.out.println("pais");
        String pais = sc.nextLine();
        System.out.println("profesion");
        String profesion=sc.nextLine();
        System.out.println("edad");
        int edad = sc.nextInt();
        System.out.println("famoso insertado");


        if (listaEpstein.contains(new Famoso(nombre,pais,profesion,edad))){
            System.out.println("el famoso ha acudido a la fiesta de epstenin");
        }else {
            System.out.println("el famoso no ha acudido");
        }



    }

    public void eliminarmenores(){
        Iterator<Famoso> it = listaEpstein.iterator();
        while (it.hasNext()){
            Famoso famoso = it.next();
            if (famoso.getEdad()<18) {
                it.remove();

            }

        }
        System.out.println(listaEpstein+ "fulminado");


    }

    public Estadistica generarestadistica(){
        System.out.println("generando estadisticas");
        System.out.println("estadisticas generadas");

        return 0;
    }


}

