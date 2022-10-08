package classroom_08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Classroom_08 {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        System.out.println("Dia da Semana: " + hoje.getDayOfWeek());
        System.out.println("Dia da Semana: " + hoje.getDayOfWeek().ordinal());
        System.out.println("Dia do ano: " + hoje.getDayOfYear());
        System.out.println("Dia do mês: " + hoje.getDayOfMonth());
        System.out.println("Mês atual: " + hoje.getMonth());
        System.out.println("Valor do mês: " + hoje.getMonthValue());
        System.out.println("Mês por extenso: " + hoje.getMonth().name());
        System.out.println("Ano atual: " + hoje.getYear());

        LocalDate data = LocalDate.of(1993, 02, 03);

        System.out.println("Se hoje é antes da data: " + hoje.isBefore(data));
        System.out.println("Se hoje é depois da data: " + hoje.isAfter(data));
        System.out.println("Se hoje é igual data: " + hoje.isEqual(data));
        System.out.println("Se hoje é ano bissexto: " + hoje.isLeapYear());
        System.out.println("Se a data é ano bissesto: " + hoje.isLeapYear());

        Period periodo = Period.between(data, hoje);

        System.out.println("Dias: " + periodo.getDays() + ", " + "Meses: " + periodo.getMonths() + ", " + "Anos: " + periodo.getYears());

        System.out.println("Total de meses: " + periodo.toTotalMonths()+ "\n");

        System.out.println("40 dias depois de hoje: " + hoje.plusDays(40));
        System.out.println("40 dias depois de hoje: " + hoje.minusDays(40) + "\n");

        System.out.println("7 semanas depois de hoje: " + hoje.plusWeeks(7));
        System.out.println("7 semanas depois de hoje: " + hoje.minusWeeks(7) + "\n");

        System.out.println("6 meses depois de hoje: " + hoje.plusMonths(6));
        System.out.println("6 meses depois de hoje: " + hoje.minusMonths(6) + "\n");

        System.out.println("40 anos depois de hoje: " + hoje.plusYears(40));
        
        LocalDateTime dataHora= LocalDateTime.now();
        System.out.println(dataHora);
        
        DateTimeFormatter dataBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        System.out.println("Data formatada: " + hoje.format(dataBarra));
        
        

    }

}
