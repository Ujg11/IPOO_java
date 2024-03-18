
public class Panell_solucio {
	private boolean[][] digit;
	
	private static boolean[][][] NUMEROS=dibuixaTots();
	private final static int TOT=5;

	
	public Panell_solucio(){
		digit=new boolean[TOT][TOT];
		buit(digit);
	}
	
	public Panell_solucio(int num){
		 digit=NUMEROS[num];
	}
	
	public Panell_solucio (Panell_solucio p){
		digit=new boolean[TOT][TOT];
		for (int i=0;i<TOT;i++){
			for (int j=0;j<TOT;j++){
				digit[i][j]=p.getDigit(i, j);
			}
		}
	}
	
	private static boolean[][][] dibuixaTots(){
		boolean[][][] tots=new boolean[3][][];
		tots[0]=dibuixa_X();
		tots[1]=dibuixa_1();
		tots[2]=dibuixa_2();
		return tots;
	}
		
	private static boolean[][] buit(boolean[][] num){
		for (int i=0;i<TOT;i++){
			for (int j=0;j<TOT;j++){
				num[i][j]=false;
			}
		}
		return num;
	}
	
	private static boolean[][] dibuixa_1(){
		boolean[][] num_1=new boolean[TOT][TOT];
		num_1=buit(num_1);
		for (int i=0;i<TOT;i++){
			num_1[i][2]=true;
		}
		num_1[1][1]=true;
		return num_1;
	}
	
	private static boolean[][] dibuixa_2(){

		boolean[][] num_2=new boolean[TOT][TOT];
		num_2=buit(num_2);
		for (int i=0;i<TOT;i=i+2){
			for (int j=1;j<TOT-1;j++){
				num_2[i][j]=true;
			}

		}
		num_2[1][3]=true;
		num_2[3][1]=true;		
		return num_2;
	}
	
	private static boolean[][] dibuixa_X(){
		boolean[][] num_X=new boolean[TOT][TOT];
		num_X=buit(num_X);
		for (int i=0;i<TOT;i++){
			num_X[i][i]=true;
			num_X[i][TOT-1-i]=true;
		}
		return num_X;
		
	}
	public boolean getDigit(int f, int c){
		return digit[f][c];
	}
	
	public char[][] canvi(int fin){
		char[][] canvis=new char[TOT][TOT];
		for (int i=0;i<TOT;i++){
			for (int j=0;j<TOT;j++){
				if (getDigit(i,j)==NUMEROS[fin][i][j]) canvis[i][j]='-';
				else if (getDigit(i,j)) canvis[i][j]='A';
					 else canvis[i][j]='E';
			}
		}
		digit=NUMEROS[fin];
		return canvis;
	}
	
	@Override
	public String toString() {
		String cadena="";
		for (int i=0; i<TOT;i++){
			for (int j=0;j<TOT;j++){
				char caracter;
				if (getDigit(i,j)) caracter='*';
				else caracter='-';
				cadena=cadena+caracter;
			}
			cadena=cadena+"\n";
				
		}
		//return "Digit [digit=" + Arrays.toString(digit) + "]";
		return cadena;
	}
	

	

}
