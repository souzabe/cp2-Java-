package org.locadora;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Jeep Renegade", 150);

        int dias = 10;
        int diasAtraso = 2;

        double custo = carro.calcularCusto(dias);
        double multa = carro.calcularMulta(diasAtraso);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Custo total para " + dias + " dias: R$ " + custo);
        System.out.println("Multa por " + diasAtraso + " dias de atraso: R$ " + multa);
    }
}

