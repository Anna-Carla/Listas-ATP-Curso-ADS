import java.util.*;
 public class atv9 {
    public static final int yearToday = 2008;
 public static void main(String [] args) {

  Scanner sc = new Scanner(System.in);
  int day, month, year;
  int verificador = 0;
  
System.out.print("Dia: ");
  day = sc.nextInt();
System.out.print("Mês: ");
  month = sc.nextInt();
System.out.print("Ano: ");
  year = sc.nextInt();
  sc.close();

if (month < 13 && month > 0) { // VERIFICADOR DE MESES
    verificador +=1;
if (year <= yearToday)  {   //verifica anos
    verificador +=1;
if (day > 0 )   {   //verifica dias maiores q 0
    verificador +=1;

    if (month == 4 || month == 6 || month == 9 || month == 11)   { //30 dias
        if (day <= 30) {
            verificador += 1;
        } else {
            verificador -= -1;
        }  
    } else if (month == 2)  {   // fevereiro
        if (day == 29) {
            if((year%400==0) || (year%4==0 && year%100 !=0)) {
                verificador += 1;
            } else {
               verificador -= -1;
            }
        } else if (day <=28) {
            verificador += 1;
        }
    } else {    // 31 dias
        if (day <=31)  {
            verificador += 1;
        } else {
            verificador -= 1;
        } 
    }
  } else 
        verificador -= 1;
  } else 
        verificador -= 1;
  } else 
        verificador -= 1;

    if (verificador == 4)   {
        System.out.print("DATA VALIDA ");
    } else {
        System.out.print("DATA INVALIDA ");
    }
}
}