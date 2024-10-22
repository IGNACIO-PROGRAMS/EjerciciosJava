import java.util.ArrayList;
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
		//ej223();
		//ej224();
		//ej225();
		//ej226();
		//ej227();
		//ej228();
		//ej228paso4();
		//ej229();
		ej229B();
		//ej22A();
		//ej22B();
		//ej22C();
		//ej22D();
		//ej22E();
		//ej230(); YA HECHO
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
	public int arraymaximo (int x []) {
		int maximo = x[0];  // Create a 'max age' variable and assign the first array element of ages to it
	    /*for (int i3 : x) {  // Loop through the elements of the ages array to find the max age    
	      if (maximo < i3) {  // Check if the current age is mas grande than the current 'lowest age'
	        maximo = i3;  // If the mayor age is found, update 'lowest age' with that element
	      }
	    }*/
	    for (int i=0; i<x.length;i++) {
	    	if (maximo < (x[i])) {  
		        maximo = (x[i]);  
		      }  
	    }
	    return maximo;
	}	
	public int arrayminimo (int x []) {
		int minimo = x[0];  // Create a 'lowest age' variable and assign the first array element of ages to it
	    
		/*for (int i2 : x) {  // Loop through the elements of the ages array to find the lowest age    
	      if (minimo > i2) {  // Check if the current age is smaller than the current 'lowest age'
	        minimo = i2;  // If the smaller age is found, update 'lowest age' with that element
	      }
	    }*/
		for (int i=0; i<x.length;i++) {
	    	if (minimo > (x[i])) {  
		        minimo = (x[i]);  
		      }  
	    }
	    return minimo;
	}	
	public double arraymedia (int x []) {
		double media, sum = 0;
	    int length = x.length; // Get the length of the array
	    /*for (int i : x) {  // Loop through the elements of the array
	      sum += i;
	    }*/
	    for (int i=0; i<x.length;i++) {
	    	 sum = sum+(x[i]);     
	    }
	    media = sum / length;  // Calculate the average by dividing the sum by the length
	    return media;
	}
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
		
		double media = arraymedia (numeros);
		/*double media, sum = 0;
	    int length = numeros.length; // Get the length of the array
	    for (int i : numeros) {  // Loop through the elements of the array
	      sum += i;
	    }
	    media = sum / length;  // Calculate the average by dividing the sum by the length*/
	    
	    int minimo = arrayminimo (numeros);	 
	    /*int minimo = numeros[0];  // Create a 'lowest age' variable and assign the first array element of ages to it
	    for (int i2 : numeros) {  // Loop through the elements of the ages array to find the lowest age    
	      if (minimo > i2) {  // Check if the current age is smaller than the current 'lowest age'
	        minimo = i2;  // If the smaller age is found, update 'lowest age' with that element
	      }
	    }*/
	    int maximo = arraymaximo (numeros);	    
	    /*int maximo = numeros[0];  // Create a 'max age' variable and assign the first array element of ages to it
	    for (int i3 : numeros) {  // Loop through the elements of the ages array to find the max age    
	      if (maximo < i3) {  // Check if the current age is mas grande than the current 'lowest age'
	        maximo = i3;  // If the mayor age is found, update 'lowest age' with that element
	      }
	    }*/
	    
		System.out.println("El valor máximo almacenado en el array es de: "+maximo);
		System.out.println("El valor minimo almacenado en el array es de: "+minimo);
		System.out.println("La media de los valores almacenados en el array es de: "+media);
	}  //CIERRA EL EJ 220
	public String unoequisdos () {
		double aleatorio = Math.random();
		String unoequisdos = "";
		if (aleatorio>=0 & aleatorio<=0.7) {unoequisdos = "1";}
		else if (aleatorio>0.7 & aleatorio<=0.9) {unoequisdos = "X";}
		else if (aleatorio>0.9) {unoequisdos = "2";}
		return unoequisdos;
	}
	public void ej221() { /*Diseñar una función que , genere un número aleatorio y en función de su valor, retorne un
							carácter de acuerdo a la siguiente regla:
							 Si el número está entre 0 y 0,7 , devuelve un ‘1’
							 Si el número está entre 0,7 y 0,9, devuelve una ‘X’
							 Si el número es > 0,9, devuelve un ‘2’*/
		
		System.out.println("  Ejercicio numero 221:");
		System.out.println("  Voy a generar un caracter aleatorio :).");
		String respuesta = "y";
		
		
		do {
		/*double aleatorio = Math.random();	
		if (aleatorio>=0 & aleatorio<=0.7) {System.out.println("Caracter generado: 1");}
		else if (aleatorio>0.7 & aleatorio<=0.9) {System.out.println("Caracter generado: X");}
		else if (aleatorio>0.9) {System.out.println("Caracter generado: 2");}*/
		String aleatorio = unoequisdos ();
		System.out.println("Caracter generado: "+aleatorio);
		System.out.println("Quieres repetir? Y/N");
		respuesta = sc.next();
		} while (respuesta.equals("y") || respuesta.equals("Y"));
		
	}  //CIERRA EL EJ 221	
	public void arrayprint (int x []) {
		System.out.print ("{");
	    for (int i=0; i<x.length;i++) {
	        System.out.print (x[i]); 
	        if (i<x.length-1) {
	            System.out.print (";"); 
	        }
	    }
	    System.out.print ("}");
	}	
	public void arrayprintmasuno (int x []) {
		System.out.print ("{");
	    for (int i=0; i<x.length;i++) {
	        System.out.print (x[i]+1); 
	        if (i<x.length-1) {
	            System.out.print (";"); 
	        }
	    }
	    System.out.print ("}");
	}	
	public void ej222() { /*Diseña 2 funciones que acepten como parámetro un array de enteros y:
							a) Muestren los valores del array separados por el símbolo ‘ ; ’
							b) Incrementa en 1 los valores del array y los muestra*/
		
		System.out.println("  Ejercicio numero 222:");
		System.out.println("Vas a darme un array de enteros y te voy a mostrar un listado y sumarle uno a todos.");

		int arraySize; //Variable para el tamaño de la array
				
		System.out.println("Dime el tamaño de la array:");
		arraySize=sc.nextInt(); // Guardamos el tamaño de la array
		int array[]= new int[arraySize]; //Definimos la array con la variable del tamaño
		System.out.println("Dime los enteros del array");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();  //Guardamos cada valor en su posicion
		}
		
		System.out.println("Los datos del array son:");
		arrayprint(array);
		System.out.println("");
		System.out.println("Y los datos mas uno son:");
		arrayprintmasuno(array);
		System.out.println("");
		/*for (int agh : array) {
			  System.out.println(agh+1);
			}*/
		
	}  //CIERRA EL EJ 222	
	public void arraypares (int x []) {
		System.out.print ("{");
	    for (int i=0; i<x.length;i++) {
	        int par = ((x[i]) % 2);
	        
	    	if (par == 0) {
	        	System.out.print (x[i]); 
	        	if (i<x.length-1) {
	        		System.out.print (";"); 
	        	}
	        }
	    }
	    System.out.print ("}");
	}	
	public void ej223() { /*Dado un array de enteros, mostrar por pantalla sólo los valores pares.*/
		
		System.out.println("  Ejercicio numero 223:");
		System.out.println("Vas a darme un array de enteros y te voy a mostrar los valores pares.");

		int arraySize; //Variable para el tamaño de la array
				
		System.out.println("Dime el tamaño de la array:");
		arraySize=sc.nextInt(); // Guardamos el tamaño de la array
		int array[]= new int[arraySize]; //Definimos la array con la variable del tamaño
		System.out.println("Dime los enteros del array");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();  //Guardamos cada valor en su posicion
		}
		System.out.println("Los datos del array pares son:");
		arraypares(array);
		System.out.println("");
		
	}  //CIERRA EL EJ 223
	public void ej224() { /*Pedir una cadena e invertir el orden de las palabras que contiene. Mostrar el resultado en
							pantalla.*/
		
		System.out.println("  Ejercicio numero 224:");
		System.out.println("  Dime una palabra o frase: ");
		
		String cadena = sc.nextLine(); // sc.next(); guarda hasta que hay un espacio, sc.nextLine(); guarda hasta un enter.
		String cadenainvertida = "";
		for(int i = cadena.length()-1; i>=0; i--)
	    {cadenainvertida = cadenainvertida + cadena.charAt(i);}
		System.out.println (cadenainvertida);
				
	}  //CIERRA EL EJ 224
	public void ej225() { /*Digito de control en DNI: El algoritmo de cálculo del dígito de control es el siguiente:Se divide el
							número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante
							la siguiente tabla:
							RESTO 0  1  2  3  4  5  6  7  8  9  10  11
							LETRA T  R  W  A  G  M  Y  F  P  D  X   B
							RESTO 12  13  14  15  16  17  18  19  20  21  22
							LETRA N   J   Z   S   Q   V   H   L   C   K   E
							Por ejemplo, si el número del DNI es 12345678, dividido entre 23 da de resto 14, luego la letra
							sería la Z: 12345678Z.*/
		
		System.out.println("  Ejercicio numero 225:");
		System.out.println("  Dime un dni sin letra y te digo cual le corresponde: ");
		int dni = sc.nextInt();
		int resto = dni % 23;
		char tuletra = ' ';
		char letradni [][] = {{0,'T'},{1,'R'},{2,'W'},{3,'A'},{4,'G'},{5,'M'},{6,'Y'},{7,'F'},{8,'P'},{9,'D'},{10,'X'},{11,'B'},{12,'N'},{13,'J'},{14,'Z'},
				{15,'S'},{16,'Q'},{17,'V'},{18,'H'},{19,'L'},{20,'C'},{21,'K'},{22,'E'}}; // aqui hay que usar la ' en vez de la "
		for (int i=0; i<letradni.length;i++) {
	        if (letradni[i][0]==resto) {
	            tuletra = letradni [i][1]; 
	        }
	    }
		
		System.out.println("Tu letra es: "+tuletra);
		
	}  //CIERRA EL EJ 225
	public void ej226() { /*Realiza un programa que genere un pronós􀆟co de resultados de forma automá􀆟ca. El resultado
							se mostrará por pantalla:
							Par􀆟do Resultado
							1 [1,X,2]
							…
							15 [1,X,2]
							U􀆟liza la función que diseñaste en el ejercicio 221*/
		
		System.out.println("  Ejercicio numero 226:");
		System.out.println("  Pronostico de resultados de quiniela: ");
		int vueltas = 1;
		do {
			String a = unoequisdos ();
			//String b = unoequisdos ();
			//String c = unoequisdos ();
			//System.out.println(vueltas+" ["+a+","+b+","+c+"]");
			System.out.println(vueltas+" [1,X,2]= "+" ["+a+"]");
			vueltas++;
		}
		while (vueltas <=15);
	}  //CIERRA EL EJ 226
	public void ej227() { /*Quiniela
							Genera 3 pronós􀆟cos, almacenando todos los valores en un array. Imprime los resultados como
							si fuese una quiniela de 3 apuestas. U􀆟liza los resultados del ejercicio 226*/
		
		System.out.println("  Ejercicio numero 227:");
		System.out.println("  Vamos a hacer una quiniela de tres resultados: ");
		String quiniela[][]= new String[15][3];
		int vueltas = 0;
		for (int i = 0; i < quiniela.length; i++) {
			String a = unoequisdos ();
			String b = unoequisdos ();
			String c = unoequisdos ();
			quiniela[i][0]= a; 
			quiniela[i][1]= b;
			quiniela[i][2]= c;
		}
		
		
		do {
			System.out.print((vueltas+1));
			if ((vueltas+1)<10) {System.out.print((" "));};
			System.out.println(" [1,X,2]= "+" ["+quiniela[vueltas][0]+"]"+"["+quiniela[vueltas][1]+"]"+"["+quiniela[vueltas][2]+"]");
			vueltas++;
		}
		while (vueltas <=14);		
	}  //CIERRA EL EJ 227	
	public String decimalabinario(int numero){
		   ArrayList<String> binario = new ArrayList<String>();
		   int resto;
		   String binarioString = "";

		   do{
		      resto = numero%2;
		      numero = numero/2;
		      binario.add(0, Integer.toString(resto));
		   }while(numero >= 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

		   binario.add(0, Integer.toString(numero)); //Cogeremos el ultimo cociente

		   //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
		   for(int i = 0; i < binario.size(); i++){
		       binarioString += binario.get(i);
		   }
		   return binarioString;
		 }	
	public int binarioadecimal(String binario){
		String AGH = "";
		//int longitud=Integer.toString(binario).length();
		String arraybinario[]= new String[binario.length()];  //Cuando es string ponemos .lenght() Cuando es array ponemos .length
		for(int i=0; i<arraybinario.length;i++) {
			AGH = Character.toString(binario.charAt(i)); //Uso AGH que es tipo string para ir guardando un char del string que tiene el binario
			arraybinario[i]=AGH;
		} // meto en arraybinario el string binario
		int decimal = 0;
	    for(int i=arraybinario.length-1; i>=0;i--) {
		decimal=decimal + (Integer.parseInt(arraybinario[i])*(int)Math.pow(2, arraybinario.length-i-1));	//Integer.parseInt para convertir el maldito string en int y por algun extraño motivo una potencia de 2 se cree que es un double y taambien hay que pasarlo a int
		}
	    return decimal;
	}	
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
	System.out.println("  Empecemos con: Dime un binario: ");
	/*Este ejercicio es un puto infierno porque si tienes un string 1 no es un int 1 es un 49 y te hace un lio, tienes que estar todo el maldito rato convirtiendo strings chars e ints*/
	
	String binario = sc.next();
	String AGH = "";
	//int longitud=Integer.toString(binario).length();
	String arraybinario[]= new String[binario.length()];  //Cuando es string ponemos .lenght() Cuando es array ponemos .length
	for(int i=0; i<arraybinario.length;i++) {
		AGH = Character.toString(binario.charAt(i));
		arraybinario[i]=AGH;
	}
	System.out.println ("El array binario es: ");
	System.out.print ("{");
    for (int i=0; i<arraybinario.length;i++) {
        System.out.print (arraybinario[i]); 
        if (i<arraybinario.length-1) {
            System.out.print (","); 
        }
    }
    System.out.println ("}");
    int decimal = 0;
    for(int i=arraybinario.length-1; i>=0;i--) {
	decimal=decimal + (Integer.parseInt(arraybinario[i])*(int)Math.pow(2, arraybinario.length-i-1));	//Integer.parseInt para convertir el maldito string en int y por algun extraño motivo una potencia de 2 se cree que es un double y taambien hay que pasarlo a int
	}
    System.out.println ("El decimal es: "+decimal);
    System.out.println("  Ahora compliquemoslo mas: Dime un decimal: ");
    decimal = sc.nextInt();
    
  
    ArrayList<String> binariofromdecimal = new ArrayList<String>(); //SUPTMDR que no funciona si no pones import java.util.ArrayList antes de class;
    int resto;
    String binariorespuesta = "";

    do{
       resto = decimal%2;
       decimal = decimal/2;
       binariofromdecimal.add(0, Integer.toString(resto));
    }while(decimal >= 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

    binariofromdecimal.add(0, Integer.toString(decimal)); //Cogeremos el ultimo cociente

    //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
    for(int i = 0; i < binariofromdecimal.size(); i++){
        binariorespuesta += binariofromdecimal.get(i);
    }
    System.out.println ("El binario es: "+binariorespuesta);
    
    
	}  //CIERRA EL EJ 228	
	public void ej228paso4() {

			System.out.println("  Ejercicio numero 228 paso 4, con menu:");
			System.out.println("Elige una opcion:");
			System.out.println("1.- Convertir binario a decimal");
			System.out.println("2.- Convertir decimal a binario");
			System.out.println("0.- Salir del programa");
			int menu= sc.nextInt();
			int decimal = 0;
			int decimalrespuesta = 0;
			String binariorespuesta = "";
			String binario = "";
			switch(menu) {
				case 0:
					System.out.println("Saliendo del programa");
					break;  
				case 1:
					System.out.println("Dime un binario:");
					binario= sc.next();
					decimalrespuesta=binarioadecimal(binario);
					System.out.println ("El decimal es: "+decimalrespuesta);
					break;
				case 2:
					System.out.println("Dime un decimal:");
					decimal = sc.nextInt();
					binariorespuesta=decimalabinario(decimal);
					System.out.println ("El binario es: "+binariorespuesta);
					break;
				default:
					System.out.println("Opcion incorrecta. Saliendo del programa.");
					break; 
			}
	}  //CIERRA EL EJ 228paso4
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
	
	System.out.println("  Ejercicio numero 229 Estacion meteorologica:");
	int temperaturas [] = new int[24];
	Boolean salir = false;
	int posicionminima = 0;
	int posicionmaxima = 0;
	do {
		System.out.println("Elige una opcion:");
		System.out.println("1.- Intro datos del dia manual");
		System.out.println("2.- Intro datos del dia Auto");
		System.out.println("3.- Muestra Datos");
		System.out.println("4.- Muestra maximos y minimos");
		System.out.println("5.- Muestra Temperatura Media");
		System.out.println("6.- Salir del programa");
		int menu= sc.nextInt();
		switch(menu) {
		case 1:
			for(int i=0; i<temperaturas.length;i++) {
				System.out.println("Dime la temperatura a las "+i+" horas");
				temperaturas [i] = sc.nextInt();
			}
			break;  
		case 2:
			for(int i=0; i<temperaturas.length;i++) {
				temperaturas [i] = (int) (Math.random()*40);
			}
			break;
		case 3:
			arrayprint (temperaturas);
			System.out.println("");
			break;
		case 4:
			
			int minimo = temperaturas[0];  // Create a 'lowest age' variable and assign the first array element of ages to it
		    for (int i=0; i<temperaturas.length;i++) {
		    	if (minimo > (temperaturas[i])) {  
			        minimo = (temperaturas[i]);
			        posicionminima=i;
			    }  
		    }
		    System.out.println("La temperatura minima es: "+minimo+" Y ocurre a las: "+posicionminima+" Horas.");		    
		    
		    int maximo = temperaturas[0];		    
		    for (int i=0; i<temperaturas.length;i++) {
		    	if (maximo < (temperaturas[i])) {  
			        maximo = (temperaturas[i]);
			        posicionmaxima=i;
			      }  
		    }
		    System.out.println("La temperatura maxima es: "+maximo+" Y ocurre a las: "+posicionmaxima+" Horas.");
		    
		    break;
		case 5:
			System.out.println("La temperatura media es: " + arraymedia (temperaturas));
			break;
		case 6:
			salir=true;
			break;	
		default:
			System.out.println("Opcion incorrecta");
			break; 
		}
	} while (salir==false);
	}  //CIERRA EL EJ 229
	public void ej229B() { /*Conversor Decimal Hexadecimal
							Escribir un programa , que permita introducir un número decimal entre 0 y 65536 y calcule el
							número hexadecimal asociado. Como segunda opción permitirá introducir un número
							hexadecimal de hasta 4 digitos y obtendrá su correspondiente decimal.
							Notas para la implementación
							- Si el número hexadecimal posee menos de 4 digitos, se rellenan los faltantes con 0.*/
		System.out.println("  Ejercicio numero 229B:");
		System.out.println("  Vamos ha hacer un conversor Hexadecimal:");
		System.out.println("Elige una opcion:");
		System.out.println("1.- Convertir decimal a hexadecimal");
		System.out.println("2.- Convertir hexadecimal a decimal");
		System.out.println("0.- Salir del programa");
		int menu= sc.nextInt();
		int decimal;
		String hexadecimal;
		String hexadecimalrespuesta="";
		int decimalrespuesta;
		switch(menu) {
		case 0:
			System.out.println("Saliendo del programa");
			break;
		case 1:
			System.out.println("Dime un decimal:");
			decimal = sc.nextInt();
			String[] hexa = new String[4];
			int resto;
			int contador = 3;
			do{
			      resto = decimal%16;
			      decimal = decimal/16;
			      hexa [contador]= Integer.toString(resto);
			      if (hexa[contador].equals("10")) {hexa [contador]="A";};
					if (hexa[contador].equals("11")) {hexa [contador]="B";};
					if (hexa[contador].equals("12")) {hexa [contador]="C";};
					if (hexa[contador].equals("13")) {hexa [contador]="D";};
					if (hexa[contador].equals("14")) {hexa [contador]="E";};
					if (hexa[contador].equals("15")) {hexa [contador]="F";};
				 contador--;	
			   }while(decimal >= 16); //Haremos el bucle hasta que el cociente no se pueda dividir mas

			hexa [contador]= Integer.toString(decimal); //Cogeremos el ultimo cociente
			if (hexa[contador].equals("10")) {hexa [contador]="A";};
			if (hexa[contador].equals("11")) {hexa [contador]="B";};
			if (hexa[contador].equals("12")) {hexa [contador]="C";};
			if (hexa[contador].equals("13")) {hexa [contador]="D";};
			if (hexa[contador].equals("14")) {hexa [contador]="E";};
			if (hexa[contador].equals("15")) {hexa [contador]="F";};
			
			System.out.print ("El hexadecimal es: "+hexadecimalrespuesta);
			for (int i=0; i<hexa.length;i++) {
		        System.out.print (hexa[i]); 
		    }
		    System.out.println ("");
			break;
		case 2:
			System.out.println("Dime un hexadecimal:");
			hexadecimal = sc.next();
			String AGH = "";
			//int longitud=Integer.toString(binario).length();
			String arrayhexadecimal[]= new String[hexadecimal.length()];  //Cuando es string ponemos .lenght() Cuando es array ponemos .length
			for(int i=0; i<arrayhexadecimal.length;i++) {
				AGH = Character.toString(hexadecimal.charAt(i)); //Uso AGH que es tipo string para ir guardando un char del string que tiene el binario
				if (AGH.equals("A")) {AGH="10";};
				if (AGH.equals("B")) {AGH="11";};
				if (AGH.equals("C")) {AGH="12";};
				if (AGH.equals("D")) {AGH="13";};
				if (AGH.equals("E")) {AGH="14";};
				if (AGH.equals("F")) {AGH="15";};
				arrayhexadecimal[i]=AGH;
			} // meto en arrayhexadecimal el string hexadecimal
			decimalrespuesta = 0;
		    for(int i=arrayhexadecimal.length-1; i>=0;i--) {
			decimalrespuesta=decimalrespuesta + (Integer.parseInt(arrayhexadecimal[i])*(int)Math.pow(16, arrayhexadecimal.length-i-1));	//Integer.parseInt para convertir el maldito string en int y por algun extraño motivo una potencia de 2 se cree que es un double y taambien hay que pasarlo a int
			}						
			System.out.println ("El decimal es: "+decimalrespuesta);
			break;
		default:
			System.out.println("Opcion incorrecta. Saliendo del programa.");
			break;
		}	
			
			
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
	
	public void ej230() { /*Triángulo rectángulo.
							Confecciona un programa que dibuje la siguiente figura en pantalla, de la forma más compacta
							posible. Se pedirá el ancho de la base antes de pintar la figura. Controlar que la anchura de la base
							sea mayor o igual que 3 y menor que 50.
							*
							**
							***
							…
							************* <- Longitud de la base*/
		System.out.println("  Ejercicio numero 230:");
		System.out.println("  Vamos a dibujar un triangulo rectangulo.");
		int base;
		do {
		System.out.println("Dime el tamaño de la base(3>=base<50): ");		
		base = sc.nextInt ();
		if (base<3 || base>=50) {
			System.out.println("Tamaño erroneo");	
		}
		} while (base<3 || base>=50);
		
		int altura;
		for (int h=1; h<=base; h++) {
			altura=h;	
				for (int i=0; i<altura; i++) {
					System.out.print("*");
					}
				System.out.println("");				
		}				
	}  //CIERRA EL EJ 230	
	public void ej232() { /*Rectángulo
							Confecciona una función que solicite ancho y alto de un rectángulo y lo dibuje en pantalla.
							El ancho se cuenta como el número de espacios entre lados verticales + 2. Se le debe añadir los
							delimitadores del rectángulo. Siempre ancho > 0 y < 77
							El alto se cuenta como las líneas útiles entre lados horizontales. Alto >=0 y <=22
							Ejemplo:
							Rectángulo de 1 caracteres de alto x 10 de ancho
							**************
							* 1234567890 *
							**************
							Rectángulo de 2 caracteres de alto x 5 ancho
							*********
							* 12345 *
							*       *
							*********
							Rectángulo de 0 caracteres de alto x 5 ancho
							*********
							*/
		System.out.println("  Ejercicio numero 232:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 232		
	public void ej233() { /*Ventana en modo texto
							Confecciona un programa que dibuje una ventana en modo texto:
							******************
							* Nombre ventana *
							******************
							*                * -- numero de líneas útiles de la venta
							******************
							El programa pedirá el número de líneas útiles y el nombre de la ventana.
							El número de líneas útiles debe ser >= 1 y < 23
							La anchura de la ventana será igual a la longitud del nombre + 2 (espacios) +2 (delimitadores de
							la ventana).*/
		System.out.println("  Ejercicio numero 233:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 233		
	public void ej234() { /*Ventana desplazada en horizontal
							Modifica el programa 231 para que se solicite un desplazamiento a contar desde el prompt del
							sistema. El desplazamiento no podrá ser negativo y deberá ser menor de 80 - anchura de la
							ventana.*/
		System.out.println("  Ejercicio numero 234:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 234	
	public void ej235() { /*Se desea generar una función que permita calcular el coste del envío en función del peso del
							paquete.
							El peso se expresa en Kg, con resolución de gramos y el coste en euros.
							La tabla de precios es la siguiente:
							PAÍS           COSTE
							Portugal       0,25 €
							Francia        0,37 €
							Italia         0,40 €
							Reino Unido    0,45 €
							Alemania       0,58 €
							Grecia         0,58 €
							Canadá         1,23 €
							Estados Unidos 1,33 €
							México         1,45 €
							Colombia       2,03 €
							Chile          3,01 €
							Argentina      2,99 €
							La función pedirá el peso del paquete, el país
							y presentará un texto diciendo:
							El coste del paquete es de: xxxxx €
							Datos para validar el ejercicio:
							 Portugal, 10 Kg - Coste: 2,5 €
							 Canadá, 100 Kg  Coste 123,00 €
							 Chile, 2,3 Kg.  6,92 €
							Si no se elige un país de la lista, se deberá mostrar mensaje de error.*/
		System.out.println("  Ejercicio numero 235:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 235	
	public void ej236() { /*Menú simple para elección de funciones
							Se debe crear un programa que solicite un número entre 1 y 5.
							Las opciones del menú serán las siguientes:
							1, “Ejecuta opción 1”
							2, “Ejecuta opción 2”
							….. …… ….. ….
							5, “Ejecuta opción 5”
							0, “Terminar aplicación”
							Para cada una de las opciones deberá existir una función que al menos imprima en pantalla la
							opción elegida. Si se pulsa 1 se debería visualizar por pantalla “Ejecuta opción 1”.
							Si el usuario no inserta ninguno de los posibles valores se deberá mostrar un mensaje de error.*/
		System.out.println("  Ejercicio numero 236:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 236	
	
	
}  //CLASS CIERRA
