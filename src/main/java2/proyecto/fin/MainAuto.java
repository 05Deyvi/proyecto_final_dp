package proyecto.fin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainAuto extends Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate today = LocalDate.now();
		LocalDate fechaEntrega = LocalDate.of(2021, 03, 12);
		LocalDate fecha = LocalDate.of(2021, 05, 05);

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);
		String opcion;

		List<Auto> listaAuto = new ArrayList<Auto>();
		List<Cliente> listaCliente = new ArrayList<Cliente>();

		Auto autos = new Auto();
		Cliente cliente = new Cliente();

		{
			System.out.println("Bienvenidos al sistema de METROCARD");
			System.out.println("************************************");
			System.out.println("1.Cliente");
			System.out.println("2. Empleado ");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();
			switch (opcion) {
			case "1":
				String opcionCliente;
				System.out.println("a.Consultar Autos");
				System.out.println("b. Reservar Autos");
				opcionCliente = teclado.nextLine();
				switch (opcionCliente) {
				case "a":

					System.out.println("ingrese el siguiente dato para la busqueda");
					System.out.println("ingrese el modelo o marca del auto");
					String busqueda = teclado.nextLine();
					boolean comparar = false;
					for (int i = 0; i < listaAuto.size(); i++) {
						Auto autoComparacion = listaAuto.get(i);
						String autoEncontrado = autoComparacion.getModelo();
						boolean buscar1 = autoComparacion.getModelo().contains(busqueda);
						boolean buscar2 = autoComparacion.getMarca().contains(busqueda);
						if (buscar1 == true || buscar2 == true) {
							System.out.println(" USTED HA BUSCADO ");
							System.out.println(listaAuto.get(i));
							System.out.println(listaAuto.toString());

						} else {

						}

					}
					break;
				case "b":
					
						System.out.println("ingrese la placa del auto");
					String placa = teclado.nextLine();
					System.out.println("ingrese el numero de cedula");
					String cedula = teclado.nextLine();

					boolean comparacion = false;

					for (int i = 0; i < listaAuto.size(); i++) {
						Auto autoComparacion = listaAuto.get(i);
						cliente.setCedula(cedula);
						cliente.setAuto(autoComparacion);

						String autoEncontrado = autoComparacion.getPlaca();
						boolean resultado = placa.equals((autoEncontrado));

						if (resultado == true) {
							String estadoNuevo = autoComparacion.getEstado();
							System.out.println();
							System.out.println(" reservar ");
							System.out.println(listaAuto.get(i));

							if (estadoNuevo.equals("DISPONIBLE")) {
								listaAuto.get(i).setEstado("Reservado");
								System.out.println("Auto reservado exitosamente,retirar en los patios de autos");
								System.out.println("*************************************************");
								listaAuto.get(i).setFecha(fechaEntrega);
								System.out.println();
								System.out.println("el auto sera entregado el dia: " + fechaEntrega);
								System.out.println(listaAuto.get(i));
								cliente.add(cliente);

							} else {
								System.out.println("El auto estara a disposicion el dia " + fechaEntrega);
							}

							System.out.println(listaAuto.get(i));
						} else {

						}
					}

					break;

				default:
					System.out.println("no ha elegido ninguna opcion valida ");
					System.out.println("vuelva a ingresar una opcion");
				}
				break;
			case "2":
				String opcionEmpleado;
				System.out.println("a. Ingresar un auto");
				System.out.println("b. Alquilarun auto");
				System.out.println("c. Aplazar fecha de entrega");
				opcionEmpleado = teclado.nextLine();
				switch (opcionEmpleado) {
				case "a":
					
					
					String opcionAuto;
					
					System.out.println("ingrese la placa del auto");
					String placa = teclado.nextLine();
					System.out.println("ingrese el modelo del auto");
					String modelo = teclado.nextLine();
					System.out.println("ingrese la marca del auto");
					String marca = teclado.nextLine();
					System.out.println("ingrese el año de fabricacion del auto");
					String anioFabricacion = teclado.nextLine();
					System.out.println("ingrese el pais de fabricacion del auto");
					String paisFabricacion = teclado.nextLine();
					System.out.println("ingrese el cilindranje");
					String cilindraje = teclado.nextLine();
					System.out.println("ingrese el precio del auto");
					int avaluo = teclado.nextInt();
					autos.setPlaca(placa);
					autos.setModelo(modelo);
					autos.setMarca(marca);
					autos.setAnioFabricacion(anioFabricacion);
					autos.setPaisFabricacion(paisFabricacion);
					autos.setCilindraje(cilindraje);
					autos.setAvaluo(avaluo);
					autos.setEstado("DISPONIBLE");

					listaAuto.add(autos);
					System.out.println("el auto es:");
					System.out.println("1. automovil");
					System.out.println("2. camioneta");
					opcionAuto = teclado.nextLine();

					switch (opcionAuto) {
					case "1":
						System.out.println("ingrese el numero de puertas");
						String puerta = teclado.nextLine();
						break;

					case "2":
						System.out.println("ingrese el peso que soporta");
						String peso = teclado.nextLine();
						break;
					default:
						System.out.println("ingrese bien lo que es el auto");
						break;
					}

					System.out.println(listaAuto);

					break;
					
				case "b":
					System.out.println("ingrese la placa ");
					String placa3 = teclado.nextLine();
					boolean comparacion = false;

					for (int i = 0; i < listaAuto.size(); i++) {
						Auto autoComparacion = listaAuto.get(i);
						String autoEncontrado = autoComparacion.getPlaca();
						boolean resultado3 = placa3.equals((autoEncontrado));
						if (resultado3 == true) {
							String estadoNuevo = autoComparacion.getEstado();
							if (estadoNuevo.equals("reservado")) {
								System.out.println("Escoja la opcion: ");
								System.out.println("Alquilar");
								System.out.println("No alquilar");
								String opcionAlqui = teclado.nextLine();
								switch (opcionAlqui) {
								case "1":
									listaAuto.get(i).setEstado("Alquilado");
									System.out.println("El auto fue alquilado exitosamente");
									System.out.println("Fecha de entrega del vehiculo: "+listaAuto.get(i)+fechaEntrega);
									
									break;
								case "2":
									System.out.println("el auto no fue alquilado");
									break;
								default:
									break;
								}
							}
						}
					}
					break;
				case "c":
					System.out.println("ingrese la placa de su auto ");
					String placa4 = teclado.nextLine();
					System.out.println("ingrese la cedula para verificar si es su auto");
					String cedula2 = teclado.nextLine();

					break;

				default:
					System.out.println("");
					break;

				}
				break;
			case "3":
				System.out.println("cerrando sistema");
				break;
			default:
				System.out.println("no ha elegido ninguna opcion valida");
				break;
			}

		}
		while (!opcion.equals(3));
			

	}
}
