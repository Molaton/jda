import java.io.*;

public class juego{
  final static int MAXI=11;
  final static int MAXJ=11;
  final static String barco=" X ";
  public static void main(String[] args) throws IOException, InterruptedException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  String tablero[][], tablero2[][], nombre_jugador1;
	  String os= System.getProperty("os.name");
	  String fila[]= {"A","B","C","D","E","F","G","H","I","J"};
	  int posicion;
	  int i;
	  int j;

	  tablero = new String[MAXI][MAXJ];
	  tablero2 = new String[MAXI][MAXJ];

	  //Pide el nombre de los jugadores
	  System.out.print("Introduce el nombre del jugador: ");
	  nombre_jugador1 = reader.readLine();

	  //Inicializo el tablero a 0
	  for (i=0;i<MAXI;i++){
		  for (j=0;j<MAXJ;j++){
			  if (i==0 && j<10) {
				  tablero[0][j]="["+j+"]";
				  tablero2[0][j]="["+j+"]";
			  } else if (j==10 && i>0){
				  tablero[i][10]="["+fila[i-1]+"]";
				  tablero2[i][10]="["+fila[i-1]+"]";
			  } else if (j<10){
				  tablero[i][j]="| |";
				  tablero2[i][j]="| |";
			  } else {
				  tablero[i][j]="   ";
				  tablero2[i][j]="   ";
			  }
		  }
	  }

      if (os.contains("Windows")) {
		      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
          Runtime.getRuntime().exec("clear");
        }

		  //Imprimo el tablero
		  for (i=0;i<MAXI;i++){
			  for (j=0;j<MAXJ;j++){
					  System.out.print(tablero[i][j]);
			  }
			  System.out.print("     ");
			  for (j=0;j<MAXJ;j++){
					  System.out.print(tablero2[i][j]);
			  }
			  System.out.println();
		  }
      System.out.print("🚢🚣🚢🚤⛴");
 }
}
