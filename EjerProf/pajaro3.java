//EJEMPLO MODIFICADOR ACCESIBILIDAD

public class pajaro3
{
		public static final int PATAS=2;
		private static int numPajaros;
		private String color;
		private String nombre;
		private double peso;
		private double altura;
		
		pajaro3(String color,String n, double p,double a)
		{
			this.color=color;
			nombre=n;
			peso=p;
			altura=a;
			numPajaros++;
		}
		//THIS
		
		pajaro3(){
			color="blanco";
			nombre="";
			peso=0;
			altura=0;
			numPajaros++;
		}
				
		public boolean sobrepeso()
		{
			boolean p;
			if(peso*altura>10)
				p=true;
			else
				p=false;
				
			
			return p;
			
		}
		
		
		public void setColor(String color)
		{
			this.color=color;
		}
		public void setPeso(double p){
			peso=p;
		}
		public double getPeso(){
			return peso;
		}
		public String getColor()
		{
			return color;
		}
		public int getNumPajaros()
		{
			return numPajaros;
		}
		
		public String toString(){
			String temp="";
			temp=temp+"color= "+color+", nombre= "+nombre+", peso="+peso+", altura="+altura;
			return temp;
		}
}

