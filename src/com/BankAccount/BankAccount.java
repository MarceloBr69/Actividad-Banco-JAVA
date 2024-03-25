package com.BankAccount;
import java.util.Scanner;
import java.util.Random;

public class BankAccount {
	//Valores
	private String número_de_cuenta; 
	private double saldo_cuenta_corriente;
	private double saldo_cuenta_ahorros;
	private static int cuentas_creadas = 0;
	private static int cantidad_dinero;
	
	
	//Constructor
	public BankAccount(String número_de_cuenta, double saldo_cuenta_corriente, double saldo_cuenta_ahorros, int cuentas_creadas, int cantidad_dinero ) {
		this.número_de_cuenta = número_de_cuenta;
		this.saldo_cuenta_corriente = saldo_cuenta_corriente;
		this.saldo_cuenta_ahorros =saldo_cuenta_ahorros;
		this.cuentas_creadas = cuentas_creadas;
		this.cantidad_dinero =cantidad_dinero;
		
		generarNumeroCuenta();
		System.out.println("Su número de cuenta es: "+ generarNumeroCuenta()); 
		cuentas_creadas ++;
	}
	
	
	 public BankAccount(int i, int saldo_cuenta_corriente2, int saldo_cuenta_ahorros2, int cuentas_creadas2,
			int cantidad_dinero2) {
		// TODO Auto-generated constructor stub
	}


	private String generarNumeroCuenta() {
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 10; i++) {
	            sb.append(random.nextInt(10));
	        }
	        return número_de_cuenta.toString();
	    }

	
	
	//Metodo de recarga.
	public void Saldo() {
		Scanner ssc = new Scanner(System.in);
		Scanner snm = new Scanner(System.in);
		
		System.out.println("Escoge el tipo de cuenta para depositar:");
		String mensaje = ssc.nextLine();
		switch (mensaje) {
			case "Cuenta corriente":
				System.out.println("Selecciona el monto.");
				int mensaje2 = ssc.nextInt();
				System.out.println("Has depositado: ");
				System.out.println(mensaje2);
				
				saldo_cuenta_corriente += mensaje2;
				System.out.println("Depósito concretado");
				break;

				
				
				
				
			case "Cuenta de ahorros":
				System.out.println("Selecciona el monto.");
				int mensaje3 = ssc.nextInt();
				System.out.println("Has depositado: ");
				System.out.println(mensaje3);
				
				saldo_cuenta_ahorros += mensaje3; 
				System.out.println("Depósito concretado");
				break;
		}	
	}
	
	//Metodo para "retirar" dinero
	public void Retirar() {
		Scanner ssc = new Scanner(System.in);
		System.out.println("Quieres retirar dinero? (Yes,No)");
		String pregunta = ssc.nextLine();
		switch(pregunta) {
			case "Yes":
				System.out.println("Cuál cuenta deseas sacar?");
				Scanner ssc2 = new Scanner(System.in);
				String pregunta2 = ssc2.nextLine();
				switch(pregunta2) {
					case "Cuenta corriente": 
						System.out.println("Cuanto desea retirar?");
						Scanner ssc3 = new Scanner(System.in);
						int retiro_cuenta_corriente = ssc3.nextInt();
						if(saldo_cuenta_corriente<=0) {
							System.out.println("ud posee fondos insuficientes");
							break;
						}
						else {
							System.out.println("ud ha retirado: " + retiro_cuenta_corriente);			
							saldo_cuenta_corriente -= retiro_cuenta_corriente;
							break;
							
						}
					case "Cuenta de ahorros":
						System.out.println("Cuanto desea retirar?");
						Scanner ssc4 = new Scanner(System.in);
						int retiro_cuenta_de_ahorros = ssc4.nextInt();
						if(saldo_cuenta_corriente<0) {
							System.out.println("Su saldo es menor a 0, por lo tanto, no puede retirar montos");
							break;
						}
						else {
							System.out.println("ud ha retirado: " + retiro_cuenta_de_ahorros);			
							saldo_cuenta_ahorros -= retiro_cuenta_de_ahorros;
							break;
						}
				}
			case "No":
				break;
		}
	}
	public void Status() {
		Scanner Scc = new Scanner(System.in);
		System.out.println("Usted desea revisar su saldo?");
		String respuesta = Scc.nextLine();
		switch(respuesta) {
			case "Yes":
				System.out.println("Tu saldo de cuenta corriente es: " + saldo_cuenta_corriente);
				System.out.println("Tu saldo de cuenta de ahorro es: " + saldo_cuenta_ahorros);
				break;
		
			case "No":
				System.out.println("Que tenga linda noche");
				break;
		}
	}
	
	
	
	
	
	
	//Getters And Setters
	public String getNúmero_de_cuenta() {
		return (String) número_de_cuenta;
	}


	public void setNúmero_de_cuenta(String número_de_cuenta) {
		this.número_de_cuenta = (String) número_de_cuenta;
	}


	public double getSaldo_cuenta_corriente() {
		return saldo_cuenta_corriente;
	}


	public void setSaldo_cuenta_corriente(double saldo_cuenta_corriente) {
		this.saldo_cuenta_corriente = saldo_cuenta_corriente;
	}


	public double getSaldo_cuenta_ahorros() {
		return saldo_cuenta_ahorros;
	}


	public void setSaldo_cuenta_ahorros(double saldo_cuenta_ahorros) {
		this.saldo_cuenta_ahorros = saldo_cuenta_ahorros;
	}


	public static int getCuentas_creadas() {
		return cuentas_creadas;
	}


	public static void setCuentas_creadas(int cuentas_creadas) {
		BankAccount.cuentas_creadas = cuentas_creadas;
	}


	public static int getCantidad_dinero() {
		return cantidad_dinero;
	}


	public static void setCantidad_dinero(int cantidad_dinero) {
		BankAccount.cantidad_dinero = cantidad_dinero;
	}




}
