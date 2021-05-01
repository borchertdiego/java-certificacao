package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
	
	//  O formato que a data vai ter
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
	//  Declarando a data a partir de um formato UTC
		Date d = Date.from(Instant.parse("1997-12-23T17:49:33Z"));
	
		System.out.println(sdf.format(d));
	
	//  Utilizando a classe Calendar para manipular a data
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); /* Adiciona 4 horas no dia pois o UTC vem com 4 horas a menos */
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minute = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); /* Adicionando um mês a mais pois o mês começa em 0 */
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(minute);
		System.out.println(month);
		System.out.println(year);
		
		SimpleDateFormat formatDmy = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatGmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		formatGmt.setTimeZone(TimeZone.getTimeZone("GMT")); /* Fazendo a formatação usar o timezone do Brasil */

	//	Converte uma string para o formato 
		Date y1 = formatDmy.parse("25/06/2018");
	//  Pega a data do sistema
		Date y2 = new Date(System.currentTimeMillis());
		Date y3 = new Date(0L);
	//  Pega uma data do formato UTC
		Date y4 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	//  Converte uma data do tipo UTC para o tipo do brasil
		Date y5 = formatGmt.parse("2018-06-25T15:42:07Z");

		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		System.out.println(y4);
		System.out.println(y5);
	} 
}