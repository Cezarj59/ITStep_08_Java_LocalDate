package homework_08;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework_08 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        LocalDate primeiraData, segundaData;
        System.out.println("Encontrando a diferença de dias entre duas datas utilizando o LocalDate.\n");
        System.out.print("\t\t\t\t Atenção!!! \n\t\tDigite a data com o seguinte formato dd/MM/aaaa.\n");
        System.out.print("\nDigite a primeira data: ");
        String dataOne = read.nextLine();
        System.out.print("\nDigite a segunda data: ");
        String dataTwo = read.nextLine();
        primeiraData = LocalDate.of(Integer.parseInt(dataOne.split("/")[2]),
                Integer.parseInt(dataOne.split("/")[1]),
                Integer.parseInt(dataOne.split("/")[0]));
        
        
        segundaData = LocalDate.of(Integer.parseInt(dataTwo.split("/")[2]),
                Integer.parseInt(dataTwo.split("/")[1]),
                Integer.parseInt(dataTwo.split("/")[0]));
        
        
        System.out.println("\nDia do ano da primeira data: " + primeiraData.getDayOfYear());
        System.out.println("Dia do ano da segunda data: " + segundaData.getDayOfYear());
        
        
        if (primeiraData.isAfter(segundaData)) {
            LocalDate aux = primeiraData;
            primeiraData = segundaData;
            segundaData = aux;
        }
        
        int dias = segundaData.getDayOfYear() - primeiraData.getDayOfYear();
        
        if (dias < 0) {
            dias *= -1; // só para garantir dias positivos;
        }
        
        for (int ano = primeiraData.getYear(); ano < segundaData.getYear(); ano++) {
            dias += 365;
            LocalDate dia = LocalDate.of(ano, 01, 01);
            if (dia.isLeapYear()) {//verificando se o ano é bissexto
                dias++; //adicionando o dia 29/02 na contagem
            }
        }
        System.out.println("\nDiferença de dias entre as datas: " + dias);
    }
}
