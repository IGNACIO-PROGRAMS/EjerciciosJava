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
		ej216();
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
		//ej229();
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
		System.out.println("Dime que hora es: ");
		String HoraMinutos = sc.next();

	    int hourMinuts = Integer.parseInt(HoraMinutos);

	    System.out.println(hourMinuts);
		
		
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
		System.out.println("Voy a pensar un número del uno al cien y tienes que adivinarlo");
	
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
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 218
	public void ej220() { /*Diseñar 3 funciones que devuelvan:
							a) Valor máximo almacenado en un array de enteros.
							b) Valor mínimo almacenado en un array de enternos.
							c) Media aritmé􀆟ca de los valores almacenados en el array.*/
		
		System.out.println("  Ejercicio numero 220:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 220
	public void ej221() { /*Diseñar una función que , genere un número aleatorio y en función de su valor, retorne un
							carácter de acuerdo a la siguiente regla:
							 Si el número está entre 0 y 0,7 , devuelve un ‘1’
							 Si el número está entre 0,7 y 0,9, devuelve una ‘X’
							 Si el número es > 0,9, devuelve un ‘2’*/
		
		System.out.println("  Ejercicio numero 221:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 221
	public void ej222() { /*Diseña 2 funciones que acepten como parámetro un array de enteros y:
							a) Muestren los valores del array separados por el símbolo ‘ ; ’
							b) Incrementa en 1 los valores del array y los muestra*/
		
		System.out.println("  Ejercicio numero 222:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 222
	public void ej223() { /*Dado un array de enteros, mostrar por pantalla sólo los valores pares.*/
		
		System.out.println("  Ejercicio numero 223:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 223
	public void ej224() { /**/
		
		System.out.println("  Ejercicio numero 224:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 224
	public void ej225() { /**/
		
		System.out.println("  Ejercicio numero 225:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 225
	public void ej226() { /**/
		
		System.out.println("  Ejercicio numero 226:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 226
	public void ej227() { /**/
		
		System.out.println("  Ejercicio numero 227:");
		System.out.println("  Buena suerte con el resto!!");
	}  //CIERRA EL EJ 227
	public void ej228() { /**/
	
	System.out.println("  Ejercicio numero 228:");
	System.out.println("  Buena suerte con el resto!!");
}  //CIERRA EL EJ 228
	public void ej229() { /**/
	
	System.out.println("  Ejercicio numero 229:");
	System.out.println("  Buena suerte con el resto!!");
}  //CIERRA EL EJ 229
}  //CLASS CIERRA
