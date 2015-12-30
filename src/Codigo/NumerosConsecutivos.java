package Codigo;
import java.util.Scanner;

public class NumerosConsecutivos {

	public static void main(String[] args) {
		Scanner Kebyn = new Scanner(System.in);//Iniciando el Escaner
		String TempNum = "0";//Un String Temporal Numeral iniciado en 0
		int numeros[] = new int[5];//Un vector de 5 Numeros
		int posicionCadNum = 0;//Un int que da la posicion del vector
		String CadenaNum = Kebyn.nextLine();//Recibe la cadena de numeros separados por -
		
		for(int i = 0; i <= (CadenaNum.length() - 1); i++){//Un for que recorra caracter por caracter de la cadena de Numeros
			if(!(CadenaNum.charAt(i) == 45)){//si no es guion entonces
				TempNum += CadenaNum.charAt(i);//Que agrege el numero a la variable TempNum
			}else{//si es guion
				numeros[posicionCadNum] = Integer.parseInt(TempNum); //Que agrege el numero guardado en la variable TempNum en el Areglo numero
				posicionCadNum++;//Sume un numero a la variable posicionCadNum
				TempNum = "";
			}
		}numeros[posicionCadNum] = Integer.parseInt(TempNum);
		
		if( ((numeros[0] + 1) == numeros[1]) && ((numeros[0] + 2) == numeros[2]) && ((numeros[0] + 3) == numeros[3]) && ((numeros[0] + 4) == numeros[4])){
			System.out.println("Si son numeros Enteros consecutivos");
			System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " +numeros[3] + " " + numeros[4]);
		}else{
			System.out.println("No son numeros Enteros Consecutivos");
			System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2] + " " +numeros[3] + " " + numeros[4]);
		}

	}

}
