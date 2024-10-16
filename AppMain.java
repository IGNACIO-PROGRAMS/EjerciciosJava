import java.util.Scanner;

public class AppMain { //CLASS ABRE

	public static void main(String[] args) {
		AppMain a = new AppMain();
		a.run();
		
	}
	/**
	 * Método donde colocar todos los ejercicios
	 */
	Scanner sc = new Scanner (System.in); //Al final poniendolo aqui si funciona en todos los demas
	public void run() {  //AQUI SE SELECCIONA EL EJERCICIO
	
		System.out.println("Inicio de la aplicación");
		/*  Insertar aquí las llamadas a los ejercicios que se vayan implementando */
		//ej000(); // poner en comentarios los que se van haciendo y sin coments el ejercicio en curso
		//ej201();
		//ej202();
		//ej210();
		//ej211();
		//ej212();
		//ej213();
		//ej214();
		//ej215();
		//ej216();
		//ej217();
		//ej218();
		//ej220();
		//ej221();
		//ej222();
		ej223();
		//ej224();
		//ej225();
		//ej226();
		//ej227();
		//ej228();
		//ej229();
		//ej229B();
		//ej22A();
		//ej22B();
		//ej22C();
		//ej22D();
		//ej22E();
		//ej230();
		//ej232();
		//ej233();
		//ej234();
		//ej235();
		//ej236();
		
		System.out.println("Fin de la aplicación");
		
	}
	
	//------------------- Lista de ejercicios resueltos
	
	public void ej000() { /*ESTE ES DE EJEMPLO*/
		
		System.out.println("  Ejercicio numero 000:");
		System.out.println("  Buena suerte con el resto!!");
	}	
	public void ej201() { /*Averiguar tipo de triángulo, pidiendo los 3 lados : a, b, c.
							Triángulo Equilátero : Los 3 lados iguales
							Triángulo rectángulo : a^2 + b^2 = c^2 (se deben comprobar las 3 combinaciones)
							Tirángulo isósceles : iguales 2 a dos (se deben comprobar todas las operaciones)
							Si no se cumplen las anteriores se imprimirá “triángulo escaleno”.*/
		//Scanner sc = new Scanner (System.in);
		System.out.println("  Ejercicio numero 201:");
		System.out.println("  Vamos a averiguar el tipo de triangulo pidiendo los tres lados.");
		System.out.println("Dime cuanto mide el lado a: ");
		float a = sc.nextFloat();
		System.out.println("Dime cuanto mide el lado b: ");
		float b = sc.nextFloat();
		System.out.println("Dime cuanto mide el lado c: ");
		float c = sc.nextFloat();

		if (a==b && a==c && b==c) {  //EQUILATERO
			System.out.println("El triangulo es equilatero");
		}
		else if ((a*a==(b*b)+(c*c)) || (b*b==(a*a)+(c*c)) || (c*c==(b*b)+(a*a))) {  //RECTANGULO
			System.out.println("El triangulo es rectangulo");
		}
		else if (a==b || a==c || b==c) {  //ISOSCELES
			System.out.println("El triangulo es isosceles");
		}
		else  {  //ESCALENO
			System.out.println("El triangulo es escaleno");
		} 
	} // FIN EJ 201
	public void ej202() { /*El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto
							debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma
							de cobrar es la siguiente:
							 si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
							 de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros,
							 si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el
							número de alumnos.
							Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
							pagar cada alumno por el viaje.*/
		//Scanner sc = new Scanner (System.in);
		System.out.println("  Ejercicio numero 202:");
		System.out.println("  Vamos a calcular cuanto cuesta un viaje segun el numero de alumnos.");
		System.out.println("Dime cuantos alumnos van de viaje: ");
		int numeroalumnos = sc.nextInt();
		int preciototal = 0;
		if (numeroalumnos>=100) {  //65 por alumno
			preciototal = numeroalumnos * 65;
			System.out.println("Debes cobrar 65 Euros a cada alumno y pagar a la compañia de viajes: "+preciototal+" euros");
		}
		else if (numeroalumnos<99 && numeroalumnos>=50) {  //70 por alumno
			preciototal = numeroalumnos * 70;
			System.out.println("Debes cobrar 70 Euros a cada alumno y pagar a la compañia de viajes: "+preciototal+" euros");
		}
		else if (numeroalumnos<49 && numeroalumnos>=30) {  //95 por alumno
			preciototal = numeroalumnos * 95;
			System.out.println("Debes cobrar 95 Euros a cada alumno y pagar a la compañia de viajes: "+preciototal+" euros");
		}
		else if (numeroalumnos<30) {  //4000 en total
			preciototal = 4000/numeroalumnos;
			System.out.println("Debes cobrar "+ preciototal +" Euros a cada alumno y pagar a la compañia de viajes: 4000 euros");
		}
	} //FIN EJ 202
	public void ej210() { /*Se quiere realizar un programa que aplique un descuento a un precio dependiendo de su valor.
							Si el precio supera un importe mínimo se aplica el descuento, sino no se aplica. El descuento
							será del 8% y la compra mínima 100€.*/
		//Scanner sc = new Scanner (System.in);
		System.out.println("  Ejercicio numero 210:");
		System.out.println("  Vamos a aplicar un descuento dependiendo del precio.");
		System.out.println("Dime el precio: ");
		float precio = sc.nextFloat();
		float preciocondescuento = 0;
		if (precio>=100) {  //descuento del 8%
			preciocondescuento = (float) (precio * 0.92);
			System.out.println("Tienes un descuento del 8%, tu precio final es de: " + preciocondescuento+" euros");
		}
		else if (precio<100) {  //No hay descuento
			
			System.out.println("No tienes descuento, tu precio final es de: " + precio +" Euros.");
		}
		
	} //FIN EJ 211	
	public void ej211() { /*Se quiere realizar un programa que transforme notas numéricas en una escala de texto. Se
							introducirá una nota entre 0 y 10 y el programa mostrará la escala de calificación
							correspondiente:
							NOTA NUMÉRICA CALIFICACIÓN TEXTO
							>=9 y <=10 Sobresaliente
							>=6.5 y < 9 Notable
							>=5 y < 6.5 Suficiente
							<5 Insuficiente*/
		
		System.out.println("  Ejercicio numero 211:");
		System.out.println("  Vamos a poner pasar notas numericas a texto.");
		System.out.println("Dime la nota: ");
		double nota = sc.nextDouble();
		if ((nota <= 10) && (nota >= 9)) {  
			System.out.println("La nota es de Sobresaliente");
		}
		else if ((nota < 9) && (nota >= 6.5)) {  
			System.out.println("La nota es de Notable");
		}
		else if ((nota < 6.5) && (nota >= 5)) {  
			System.out.println("La nota es de Suficiente");
		}
		else if ((nota > 10) || (nota < 0)) {  
			System.out.println("Esa nota no existe");
		}
				else  {  
			System.out.println("La nota es de Insuficiente");
		}
	} //CIERRA EJ 211
	public void ej212() { /*Modificar el programa 210 para que:
							Por un lado, que exista un valor máximo de descuento, de modo que, si por algún motivo
							corresponde realizar un descuento por encima de dicho valor, sólo se aplique el máximo
							establecido. Por otra parte, estaría bien corregir un comportamiento algo raro que ahora mismo
							tiene el programa: que es capaz de aceptar precios negativos. En este caso, dado que es
							evidente que el usuario se ha equivocado, estaría bien avisarle con algún mensaje*/
		
		System.out.println("  Ejercicio numero 212:");
		System.out.println("  Vamos a aplicar un descuento dependiendo del precio. Pero hay un descuento máximo.");
		System.out.println("Dime el precio: ");
		double precio = sc.nextDouble();
		double preciocondescuento = 0;
		System.out.println("Dime el maximo de descuento en euros: ");
		double descuentomax = sc.nextDouble();
		double preciocondescuentomax = descuentomax/0.08;
		
		if (precio>=preciocondescuentomax) {  //descuento max
			preciocondescuento = precio - descuentomax;
			System.out.println("Has alcanzado el descuento maximo, tu precio final es de: " + preciocondescuento+" euros");
		}
		else if ((precio>=100) && (precio<=preciocondescuentomax)) {  //descuento del 8%
			preciocondescuento = precio * 0.92;
			System.out.println("Tienes un descuento del 8%, tu precio final es de: " + preciocondescuento+" euros");
		}
		else if ((precio<100) && (precio>0)) {  //No hay descuento
			
			System.out.println("No tienes descuento, tu precio final es de: " + precio +" Euros.");
		}
		else  {  //Precio negativo
			
			System.out.println("El precio que has introducido es negativo, es un error");
		}
	} //CIERRA EL EJ 212
	public void ej213() { /*Realizar un programa en el que, a partir de dos números enteros, pida qué operación se quiere
							realizar entre ellos: sumar, restar, multiplicar o dividir. Una vez elegida, efectúa el cálculo y lo
							muestra en pantalla.*/
		
		System.out.println("  Ejercicio numero 213:");
		System.out.println("  Dame dos numeros enteros y dime si los quieres sumar, restar, multiplicar o dividir.");
		System.out.println("Dime el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Dime el segundo numero: ");
		int numero2 = sc.nextInt();
		System.out.println("Dime si los quieres sumar, restar, multiplicar o dividir: ");
		String operacion;
		operacion = sc.next();
		System.out.println(operacion);
		if (operacion.equals("sumar")) {  //suma
			int resultado = numero1 + numero2;
			System.out.println("El resultado es: "+resultado);
		}
		else if (operacion.equals("restar")) {  //resta
			int resultado = numero1 - numero2;
			System.out.println("El resultado es: "+resultado);
		}
		else if (operacion.equals("multiplicar")) {  //multiplicar
			int resultado = numero1 * numero2;
			System.out.println("El resultado es: "+resultado);
		}
		else if (operacion.equals("dividir")) {  //dividir
			double resultado = ((double) numero1 / (double) numero2);
			System.out.println("El resultado es: "+resultado);
		}
		else {
			System.out.println("La operación introducida no existe.");
		}
	} //CIERRA EL EJ 213
	public void ej214() { /*Calcular cuántos días tiene un mes. A grandes rasgos, el programa haría lo siguiente:
							a. Si es 2, hay que decir que el número de días es 28 o 29.
							b. Si es 4, 6, 9 o 11, hay que decir que el número de días es 30.
							c. Si es 1, 3, 5, 7, 8, 10 o 12, hay que decir que el número de días es 31.
							d. Si es otro, hay que decir que se ha introducido un número de mes incorrecto.*/
		
		System.out.println("  Ejercicio numero 214:");
		System.out.println("  Vamos a calcular cuantos días tiene un mes.");
		System.out.println("Dime el numero del mes: ");
		int mes = sc.nextInt();
		if (mes==2) {System.out.println("El número de días es 28 o 29.");}
		else if (mes==1 || mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) {System.out.println("El número de días es 31.");}
		else if (mes==4 || mes==6|| mes==9|| mes==11) {System.out.println("El número de días es 30.");}
		else {System.out.println(" ha introducido un número de mes incorrecto.");}
	}  //CIERRA EL EJ 214
	public void ej215() { /*Escriba en un programa llamado Termostato que, en función del valor de una temperatura,
							muestre un mensaje por pantalla indicando si es necesario encender el aire acondicionado. Por
							ejemplo, si la temperatura vale 25, el mensaje que se muestre debería ser “Activa el aire
							acondicionado.”; si la temperatura es de 18 grados el mensaje debería ser “Para el aire
							acondicionado.”. Se considera que el aire debe activarse a partir de los 21 grados.*/

		System.out.println("  Ejercicio numero 215:");
		System.out.println("  Vamos a hecer un termostato.");
		System.out.println("Dime la temperatura en grados Celsius: ");
		int temperatura = sc.nextInt();
		if (temperatura>=21) {System.out.println("Activa el aire acondicionado");}
		else if (temperatura<21) {System.out.println("Para el aire acondicionado.");}

	}  //CIERRA EL EJ 215
	public void ej216() { /*El objetivo de esta actividad es generar un programa que realiza diferentes acciones a partir de
							un dato leído por el teclado.
							Es necesario que prevea que el horario de trabajo es de 9 a 14 y de 16 a 19 h. Hay que tener en
							cuenta que las 14 es la hora de comer, y por tanto es tiempo libre.*/
		
		System.out.println("  Ejercicio numero 216:");
		System.out.println("  Programa que decide una accion segun la hora que sea en el lugar de trabajo");
		System.out.println("Dime que hora es (en formato Hora:Minutos): ");
		String horaminutos = sc.next();
		String[] fragmentos = horaminutos.split(":");
		int hora = Integer.parseInt(fragmentos[0]);
		int minutos = Integer.parseInt(fragmentos[1]);
	    // System.out.println(hora);
	    // System.out.println(minutos);  Para comprobar que lo hacia bien.
		if (hora>=9 && hora<14) {System.out.println("Es hora de trabajar, es por la mañana.");}
		else if (hora>=14 && hora<16) {System.out.println("Tiempo libre, hora de comer.");}
		else if (hora>=16 && hora<19) {System.out.println("Es hora de trabajar, es por la tarde.");}
		else {System.out.println("No es hora de trabajar. Disfruta.");}
		
	}  //CIERRA EL EJ 216
	public void ej217() { /*Adivinar un número entre 1 y 100.
							Se genera un número aleatorio entre 1 y 100 y el usuario debe de adivinar el número. El
							programa deberá dar pistas indicando si es mayor, menor o por el contrario ha acertado.
							Se debe llevar la cuenta del número de intentos que ha utilizado el usuario durante el juego.
							Incluir la posibilidad de abandonar el juego si el usuario introduce el número 999.
							Incluir mensajes de bienvenida, instrucciones y reglas y de comunicación del resultado.	*/
		
		System.out.println("  Ejercicio numero 217:");
		int respuesta = (int) (Math.random()*100+1);
		//System.out.println("BIENVENIDO, VAMOS A JUGAR A UN JUEGO");
		System.out.println("Voy a pensar un número del uno al cien y tienes que adivinarlo.");
	
		int contador = 0;
		boolean salir = false;
		
		System.out.println("Dime un número: ");
		int numero = sc.nextInt();
		contador=contador+1;
				
		do {
			
			if (numero<respuesta) {
				System.out.println("La respuesta es mayor, dime otro: ");
				numero = sc.nextInt();
				contador=contador+1;
			}
			else if (numero>respuesta) {
				System.out.println("La respuesta es menor, dime otro: ");
				numero = sc.nextInt();
				contador=contador+1;
			}	
			else /*(numero==respuesta)*/ {
				System.out.println("Has acertado! FIN DEL JUEGO ");
				System.out.println("Has tardado "+contador+" intentos.");
				salir=true;
			}	
				
		} while (salir==false);
	}  //CIERRA EL EJ 217
	public void ej218() { /*Genera una nueva versión del programa 217, para que sea la máquina la que adivine el número.*/
		
		System.out.println("  Ejercicio numero 218:");
		System.out.println("Tienes que pensar un número del uno al cien y yo lo voy a adivinar");
		int nmax = 100;
		int nmin = 0;
		int contador = 1;
		int numero = ((nmax-nmin)/2)+nmin;
		boolean salir = false;
		String respuesta;
		
		do {
			System.out.println("El numero es el "+numero+"? Dime \"si\",si el número es \"mayor\" o si es \"menor\".");
			respuesta = sc.next();
			if (respuesta.equals("si")) {
				System.out.println("He acertado."); salir=true;
				System.out.println("He tardado "+contador+" intentos.");
			}
			else if (respuesta.equals("mayor")) {
				nmin = numero;
				numero = ((nmax-nmin)/2)+nmin;
				contador=contador+1;
			}
			else if (respuesta.equals("menor")) {
				nmax = numero;
				numero = ((nmax-nmin)/2)+nmin;
				contador=contador+1;
			}
			else {System.out.println("Por favor responde sólo con: \"si\", \"mayor\" o \"menor\".");}
		} while (salir==false);	
	}  //CIERRA EL EJ 218
	public void ej220() { /*Diseñar 3 funciones que devuelvan:
							a) Valor máximo almacenado en un array de enteros.
							b) Valor mínimo almacenado en un array de enternos.
							c) Media aritmé􀆟ca de los valores almacenados en el array.*/
		
		/* for (int i = 0; i < cars.length; i++) {
		      System.out.println(cars[i]);
		    } */
		
		System.out.println("  Ejercicio numero 220:");
		System.out.println("  Introduce un array de cinco enteros:");
		System.out.println("Dime el primer valor:");
		int a = sc.nextInt();
		System.out.println("Dime el segundo valor:");
		int b = sc.nextInt();
		System.out.println("Dime el tercero valor:");
		int c = sc.nextInt();
		System.out.println("Dime el cuarto valor:");
		int d = sc.nextInt();
		System.out.println("Dime el quinto valor:");
		int e = sc.nextInt();
		int[] numeros = {a, b, c, d, e};
		
		float media, sum = 0;
	    int length = numeros.length; // Get the length of the array
	    for (int i : numeros) {  // Loop through the elements of the array
	      sum += i;
	    }
	    media = sum / length;  // Calculate the average by dividing the sum by the length
			 
	    int minimo = numeros[0];  // Create a 'lowest age' variable and assign the first array element of ages to it
	    for (int i2 : numeros) {  // Loop through the elements of the ages array to find the lowest age    
	      if (minimo > i2) {  // Check if the current age is smaller than the current 'lowest age'
	        minimo = i2;  // If the smaller age is found, update 'lowest age' with that element
	      }
	    }
	    
	    int maximo = numeros[0];  // Create a 'max age' variable and assign the first array element of ages to it
	    for (int i3 : numeros) {  // Loop through the elements of the ages array to find the max age    
	      if (maximo < i3) {  // Check if the current age is mas grande than the current 'lowest age'
	        maximo = i3;  // If the mayor age is found, update 'lowest age' with that element
	      }
	    }
	    
		System.out.println("El valor máximo almacenado en el array es de: "+maximo);
		System.out.println("El valor minimo almacenado en el array es de: "+minimo);
		System.out.println("La media de los valores almacenados en el array es de: "+media);
	}  //CIERRA EL EJ 220
	public void ej221() { /*Diseñar una función que , genere un número aleatorio y en función de su valor, retorne un
							carácter de acuerdo a la siguiente regla:
							 Si el número está entre 0 y 0,7 , devuelve un ‘1’
							 Si el número está entre 0,7 y 0,9, devuelve una ‘X’
							 Si el número es > 0,9, devuelve un ‘2’*/
		
		System.out.println("  Ejercicio numero 221:");
		System.out.println("  Voy a generar un caracter aleatorio :).");
		double aleatorio = Math.random();
		
		String respuesta = "y";
		do {
			
		if (aleatorio>=0 & aleatorio<=0.7) {System.out.println("Caracter generado: 1");}
		else if (aleatorio>0.7 & aleatorio<=0.9) {System.out.println("Caracter generado: X");}
		else if (aleatorio>0.9) {System.out.println("Caracter generado: X");}
		System.out.println("Quieres repetir? Y/N");
		respuesta = sc.next();
		aleatorio = Math.random();
		} while (respuesta.equals("y") || respuesta.equals("Y"));
		
	}  //CIERRA EL EJ 221
	public void ej222() { /*Diseña 2 funciones que acepten como parámetro un array de enteros y:
							a) Muestren los valores del array separados por el símbolo ‘ ; ’
							b) Incrementa en 1 los valores del array y los muestra*/
		
		System.out.println("  Ejercicio numero 222:");
		System.out.println("Vas a darme un array de enteros y te voy a mostrar un listado y sumarle uno a todos :).");

		int arraySize; //Variable para el tamaño de la array
				
		System.out.println("Dime el tamaño de la array:");
		arraySize=sc.nextInt(); // Guardamos el tamaño de la array
		
		int array[]= new int[arraySize]; //Definimos la array con la variable del tamaño
		
		System.out.println("Dime los enteros del array");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();  //Guardamos cada valor en su posicion
		}
		
		System.out.println("Los datos del array son:");
		for (int agh : array) {
			  System.out.println(agh);
			}
		System.out.println("Y los datos mas uno son:");
		for (int agh : array) {
			  System.out.println(agh+1);
			}
		
	}  //CIERRA EL EJ 222
	public void ej223() { /*Dado un array de enteros, mostrar por pantalla sólo los valores pares.*/
		
		System.out.println("  Ejercicio numero 223:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 223
	public void ej224() { /*Pedir una cadena e inver􀆟r el orden de las palabras que con􀆟ene. Mostrar el resultado en
							pantalla.*/
		
		System.out.println("  Ejercicio numero 224:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 224
	public void ej225() { /*Digito de control en DNI: El algoritmo de cálculo del dígito de control es el siguiente:Se divide el
							número entre 23 y el resto se sus􀆟tuye por una letra que se determina por inspección mediante
							la siguiente tabla:
							RESTO 0  1  2  3  4  5  6  7  8  9  10  11
							LETRA T  R  W  A  G  M  Y  F  P  D  X   B
							RESTO 12  13  14  15  16  17  18  19  20  21  22
							LETRA N   J   Z   S   Q   V   H   L   C   K   E
							Por ejemplo, si el número del DNI es 12345678, dividido entre 23 da de resto 14, luego la letra
							sería la Z: 12345678Z.*/
		
		System.out.println("  Ejercicio numero 225:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 225
	public void ej226() { /*Realiza un programa que genere un pronós􀆟co de resultados de forma automá􀆟ca. El resultado
							se mostrará por pantalla:
							Par􀆟do Resultado
							1 [1,X,2]
							…
							15 [1,X,2]
							U􀆟liza la función que diseñaste en el ejercicio 221*/
		
		System.out.println("  Ejercicio numero 226:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 226
	public void ej227() { /*Quiniela
							Genera 3 pronós􀆟cos, almacenando todos los valores en un array. Imprime los resultados como
							si fuese una quiniela de 3 apuestas. U􀆟liza los resultados del ejercicio 226*/
		
		System.out.println("  Ejercicio numero 227:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 227
	public void ej228() { /*Conversor Binario Decimal
							Escribir un programa , que permita introducir un número binario de cualquier longitud y calcule
							el número decimal asociado y viceversa.
							Pasos a seguir
							Paso 1: Se definirá un array en el código y se invocará a una función, presentando su valor.
							Paso 2: La introducción será desde teclado, leyendo un String, aprovechando la función
							codificada en la primera versión.
							Paso 3: Añadir una función adicional para que realice la conversión inversa: dado un número
							decimal, calcular su correspondiente en binario.
							Paso 4: Hacer un pequeño menú con dos opciones:
							1.- Conver􀆟r binario a decimal
							2.- Conver􀆟r decimal a binario
							0.- Salir del programa*/
	
	System.out.println("  Ejercicio numero 228:");
	System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 228
	public void ej229() { /*Estación meteorológica
							En una estación meteorológica registramos la temperatura (en grados cen􀆡grados) en cada hora
							durante el día. Almacenamos el resultado en un vector de 24 componentes.
							Diseña un programa que muestre un menú con las siguientes acciones:
							1. Rellenar el vector de forma manual. Esta funcionalidad permite al usuario rellenar
							manualmente cada uno de los 24 elementos.
							2. Rellenar el vector de forma aleatoria. Los 24 elementos del vector se rellenan de forma
							aleatoria, con valores entre 0 y 40.
							3. Mostrar datos. Muestra los datos almacenados en el vector.
							4. Obtener máximos y mínimos. Muestra las temperaturas máxima y mínima del día, así
							como la hora en la que se dan.
							5. Temperatura media. Calcula la temperatura media del día.
							6. Salir. Sale del programa.
							Ayuda. Para generar un número aleatorio en Java, se debe u􀆟lizar la siguiente sentencia: int
							numero = (int) (Math.random() * limite) ; Donde “limite” representa el límite superior del rango,
							en este caso, 41.*/
	
	System.out.println("  Ejercicio numero 229:");
	System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 229
	public void ej229B() { /*Conversor Decimal Hexadecimal
							Escribir un programa , que permita introducir un número decimal entre 0 y 65536 y calcule el
							número hexadecimal asociado. Como segunda opción permitirá introducir un número
							hexadecimal de hasta 4 digitos y obtendrá su correspondiente decimal.
							Notas para la implementación
							- Si el número hexadecimal posee menos de 4 digitos, se rellenan los faltantes con 0.*/
		System.out.println("  Ejercicio numero 229B:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 229B
	public void ej22A() { /*Coste telefónico
							La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es
							por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro por
							minuto, los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
							décimo minuto, 50 céntimos.
							Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana,
							15 %, y en turno de tarde, 10 %.
							Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que
							realiza una llamada.*/
		System.out.println("  Ejercicio numero 22A:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 22A
	public void ej22B() { /*Compañía de paquetería
							Una compañía de transporte internacional tiene servicio que se tarifica por zonas geográficas :
							América del Norte, América Central, América del Sur, Europa y Asia.
							El coste del servicio de transporte se basa en el peso del paquete (medido en gramos) y
							y la zona a la que va dirigido. La tabla de tarifas responde al siguiente esquema:
							PrecioTotal = Precio_peso + Precio_Destino
							Precio_peso = 0,05€/Gr. ; Precio_destino = % región * Precio_Peso
							La tabla de porcentajes por región es :
							Europa 7%, America del Norte 12%, América Central 15%, América del Sur 18%, Asia 20%
							Se deberá pedir el peso y el destino y presentar posteriormente el resultado.
							No se hacen envíos si el paquete pesa menos de 750Gr.*/
		System.out.println("  Ejercicio numero 22B:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 22B	
	public void ej22C() { /*Tipo de cadena
							Se pedirá una cadena de texto y el programa deberá indicar los siguientes mensajes:
							Cadena alfanumérica, si la cadena contiene números y letras
							Cadena numérica, si la cadena sólo contiene número entre 0 y el 1
							Cadena texto, si la cadena sólo contiene caracteres.
							Investiga el código de caracteres ASCCI /UTF-8 para entender su forma de codificar y ordenar los
							símbolos.
							NOTA1: Utilizar la conversión de tipos predefinida de java
							NOTA2: No se puede utilizar ninguna librería de java con funciones que resuelvan el problema
							planteado.*/
		System.out.println("  Ejercicio numero 22C:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 22C	
	public void ej22D() { /*Acceso con contraseña
							Se dispondrá de un array de pares usuario/contraseña predefinido.
							Se pedirá al usuario que introduzca un nombre y una contraseña.
							Se buscará en el array comprobando ambos valores
							Si es correcto, se mostrará el mensaje ‘Acceso Autorizado’ y se terminará el programa
							Sino es correcto se mostrará el mensaje ‘Usuario o Contraseña incorrectos’ y se le concederán
							dos intentos adiccionales.*/
		System.out.println("  Ejercicio numero 22D:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 22D	
	public void ej22E() { /*Probabilidades
							Genera un programa que genere 10 tiradas de un dado.
							Deberá mostrar los resultados de la tiradas y la suma total de valores pares y la suma total de
							valores impares*/
		System.out.println("  Ejercicio numero 22E:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 22E	
	public void ej230() { /**/
		System.out.println("  Ejercicio numero 230:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 230	
	public void ej232() { /**/
		System.out.println("  Ejercicio numero 232:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 232		
	public void ej233() { /**/
		System.out.println("  Ejercicio numero 233:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 233		
	public void ej234() { /**/
		System.out.println("  Ejercicio numero 234:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 234	
	public void ej235() { /**/
		System.out.println("  Ejercicio numero 235:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 235	
	public void ej236() { /**/
		System.out.println("  Ejercicio numero 236:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 236	
	
	
}  //CLASS CIERRA
