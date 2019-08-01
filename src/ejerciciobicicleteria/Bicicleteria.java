package ejerciciobicicleteria;

import java.util.ArrayList;

public class Bicicleteria {

    private ArrayList<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
        bicicletas = new ArrayList<>();
        cantidadDeVentas = 0;
        ganancias = 0;
    }

    public void addBicicleta(Bicicleta nuevaBici) {
        bicicletas.add(nuevaBici);
    }

    public void venderBicicleta(Bicicleta bicicleta) {
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias += bicicleta.getPrecio();
    }

    public Bicicleta buscarBicicleta(String nroDeSerie) {
        for (int i = 0; i < bicicletas.size(); i++) {
            if (bicicletas.get(i).getNroDeSerie().equals(nroDeSerie)) {
                return bicicletas.get(i);
            }
        }
        return null;
    }

    public ArrayList<Bicicleta> ordenarPorAño() {
        Bicicleta aux;
        boolean bandera = true;
        for (int j = 0; j < bicicletas.size() && bandera == true; j++) {
            bandera = false;
            for (int i = 0; i < bicicletas.size()-1-j; i++) {
                if (bicicletas.get(i).getAño() < bicicletas.get(i + 1).getAño()) {
                    aux = bicicletas.get(i + 1);
                    bicicletas.set(i + 1, bicicletas.get(i));
                    bicicletas.set(i, aux);
                    bandera = true;
                }
            }
        }
        return bicicletas;
    }
    
    public void mostrarTodo() {
        for (int i = 0; i < bicicletas.size(); i++) {
            System.out.println(bicicletas.get(i).toString());
        }
    }
}
