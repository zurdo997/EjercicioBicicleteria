package ejerciciobicicleteria;

import java.util.Scanner;

public class EjercicioBicicleteria {

    public static void main(String[] args) {
        Bicicleteria nuevaBicicleteria = new Bicicleteria();
        Bicicleta nuevaBici;
        Scanner teclado = new Scanner(System.in);
        String nroDeSerie, modelo;
        int año;
        float precio;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese numero de serie: ");
            nroDeSerie = teclado.next();

            System.out.print("Ingrese modelo: ");
            modelo = teclado.next();

            System.out.print("Ingrese año: ");
            año = teclado.nextInt();

            System.out.print("Ingrese su precio: ");
            precio = teclado.nextFloat();

            nuevaBici = new Bicicleta(nroDeSerie, modelo, año);
            nuevaBici.setPrecio(precio);

            nuevaBicicleteria.addBicicleta(nuevaBici);
            
        }
        System.out.println("---------------------------------------------------------");
        nuevaBicicleteria.mostrarTodo();
        nuevaBicicleteria.ordenarPorAño();
        System.out.println("---------------------------------------------------------");
        nuevaBicicleteria.mostrarTodo();
    }

}
