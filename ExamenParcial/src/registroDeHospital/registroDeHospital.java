package registroDeHospital;
import Persona.Doctor;
import Persona.Enfermera;
import Persona.Paciente;
import Persona.Persona;
import java.util.Scanner;
import java.util.ArrayList;

public class registroDeHospital {
public static ArrayList<Persona> listapersonas = new ArrayList<Persona>();
    
    public static void main(String[] args) {

                               
        int opcion;
                      
        Scanner scan = new Scanner (System.in);
        
        do{
            System.out.println("1. Registrar Doctor");
            System.out.println("2. Registrar Enfermero/a");
            System.out.println("3. Registrar Paciente");
            System.out.println("4. Mostrar Lista");
            System.out.println("5. Salir\n");
            System.out.println("INGRESE UNA OPCION");
            opcion= scan.nextInt();
            switch (opcion) {
                case 1:
                    registrarDoctor();
                    break;
                case 2:
                    registrarEnfermer();
                case 3:
                    registrarPaciente();
                    break;
                case 4:
                   mostrarLista();
            }
        }while (opcion !=5);

    }
          public static void registrarPaciente(){

          int opcion2=0;
            do{

            String ID, nombre, correo, direccion, telefono, cumple,tipoSangre, altura, peso;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese fecha de cumpleanos");
            cumple=scan.nextLine();
            System.out.println("Ingrese Tipo de sangre el letras");
            tipoSangre=scan.nextLine();
            System.out.println("Ingrese peso en libras");
            peso=scan.nextLine();
            System.out.println("Ingrese altura en metros");
            altura=scan.nextLine();

           Paciente paciente = new Paciente(cumple, Integer.parseInt(peso), Integer.parseInt(altura), tipoSangre, Integer.parseInt(ID), nombre, correo, direccion,telefono);
           
            listapersonas.add(paciente);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion2 =scan.nextInt();
            
            }while(opcion2!=2);
             
        }
          
          public static void registrarEnfermer(){
          int opcion2=0;
            do{

            String ID, nombre, correo, direccion, telefono,especialidad;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese Especialidad");
            especialidad=scan.nextLine();

            Enfermera enfermer = new Enfermera (especialidad, Integer.parseInt(ID), nombre, correo, direccion, telefono);        
                    
            listapersonas.add(enfermer);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion2 =scan.nextInt();
            
            }while(opcion2 != 2);
             
        }
          
        public static void registrarDoctor(){
          int opcion2=0;
            do{

            String ID, nombre, correo, direccion, telefono, especialidad;

            Scanner scan = new Scanner (System.in);
            System.out.println("Ingrese ID");
            ID=scan.nextLine();
            System.out.println("Ingrese Nombre");
            nombre=scan.nextLine();
            System.out.println("Ingrese Correo");
            correo=scan.nextLine();
            System.out.println("Ingrese Direccion");
            direccion=scan.nextLine();
            System.out.println("Ingrese Telefono");
            telefono=scan.nextLine();
            System.out.println("Ingrese Especialidad");
            especialidad=scan.nextLine();
            
         Doctor doctor = new Doctor (especialidad, Integer.parseInt(ID), nombre, correo, direccion, telefono);  

            listapersonas.add(doctor);
            System.out.println("1. Desea iniciar un nuevo registro");
            System.out.println("2. Regresar al menu anterior");
                System.out.println("ELIJA UNA OPCION (1-2)");
            opcion2 =scan.nextInt();
            
            }while(opcion2!=2);
             
        }
        

        public static void mostrarLista(){
            
            if (listapersonas.size()>0){
                
                
                for (Persona persona : listapersonas){
                    System.out.println(persona);
                }
                
            }else{
                System.out.println("NO SE ENCUENTRAN PERSONAS REGISTRADAS");
            }
        }


}

