/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacolecciones;
import java.util.Scanner;
import java.util.ArrayList;
public class ProgramaColecciones {
    
    public static void main(String[] args) {
        // TODO code application logic here        
        //Persona p1 = new Persona("40703678","Edu");
        //Persona p2= new Persona("45219990","Lucy");
        //ArrayList<Persona> lista1 = new ArrayList <Persona>();
        //lista1.add(p1);
        //lista1.add(p2);
        //System.out.println(Clista1);
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista1 = new ArrayList<>();

        try {
            System.out.print("¿Cuántas personas deseas ingresar?: ");
            int n = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            for (int i = 0; i < n; i++) {             
                System.out.println("\nPersona " + (i + 1));
                System.out.print("DNI: ");
                String dni = sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                Persona p = new Persona(dni, nombre);
                lista1.add(p);
            }
            System.out.println("\nLista de personas:");
            for (Persona p : lista1) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Error: ingresaste datos incorrectos");
        }
    }  
}
