//EJEMPLO MODIFICADOR ACCESIBILIDAD

public class pajaro3
{
		public static final int PATAS=2;
		public static int numPajaros;
		
		private String color;
		private String nombre;
		private double peso;
		private double altura;
		
		private Pluma[] plumas;
		
		pajaro3(String color,String n, double p,double a,int numPlumas)
		{
			
			this.color=color;
			this.nombre=n;
			peso=p;
			altura=a;
			plumas=new Pluma[numPlumas];
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
		
		
		public void setColor(String c)
		{
			color=c;
		}
		public String getColor()
		{
			return color;
		}
		
		public void setPlumas(Pluma [] v){
			plumas=v;
		}
		
		public Pluma [] getPlumas(){
			return plumas;
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

