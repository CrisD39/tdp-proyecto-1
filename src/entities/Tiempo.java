package entities;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Tiempo 
{
	private Calendar fecha = new GregorianCalendar();
	private	String anho = Integer.toString(fecha.get(Calendar.YEAR));
	private String mes = Integer.toString(fecha.get(Calendar.MONTH)+1); //Por alguna razon la libreria devuelve el mes anterior en vez del mes actual
	private String dia = Integer.toString(fecha.get(Calendar.DATE));
	private String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
	private String min = Integer.toString(fecha.get(Calendar.MINUTE));
	private String segundo = Integer.toString(fecha.get(Calendar.SECOND));
	
	public String GetDia()
	{
		return dia + "/" + mes + "/" + anho;
	}
	public String GetHora()
	{
		return hora +":"+ min +":"+segundo;
	}
}
