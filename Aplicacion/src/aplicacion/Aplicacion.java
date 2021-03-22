package aplicacion;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author victor
 */

public class Aplicacion {

    public static void main(String[] args)throws IOException, InterruptedException {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion = 0, R = 0;
        int Opc=0, o=0;

        
        do{
            System.out.print("-----Ecosistema de Dispositivos-----");
            System.out.print("\n1. Crear dispositivos y administarlos");
            System.out.print("\n2. Acciones con dispositivos");
            System.out.print("\n3. Acciones externas de dispositivos");
            System.out.print("\n4. Cargas masivas");
            System.out.print("\n5. Long");
            System.out.print("\n6. Salir");
            System.out.print("\nSeleccione la opción a ejecutar:");
            opcion = entrada.nextInt(); 
            switch(opcion){
                case 1:
                       do{
                    FileWriter fichero = new FileWriter ("Aplicación_Texto.txt");    

                    System.out.print("-----Crear dispositivo-----");
                        System.out.print("\n1. Computadora portátil");
                        System.out.print("\n2. Tablet");
                        System.out.print("\n3. SmartWatch");
                        System.out.print("\n4. Smartphone");
                        System.out.print("\n5. Auticulares inalámbricos");
                        System.out.print("\n6. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                        
                        R = entrada.nextInt();
                        
                        if (R > 0&& R<5){
                            if (R==1){
                                System.out.println("-----Creación y administración de Computadora portátil-----");
                                crearDispositivo1();
                            }
                            else if (R==2){
                                System.out.println("-----Creación y administración de Dispositivo Tablet-----");
                                crearDispositivo1();
                             }
                            else if (R==3){
                                System.out.println("-----Creación y administraciónde Dispositivo SmartWatch-----");
                                crearDispositivo1();
                        }
                            else if (R==4) {
                                System.out.println("-----Creación y administración de Dispositivo SmartPhone-----");
                                crearDispositivo2();         
                        }
                    }
                        else {
                                System.out.println("-----Creación y administración de nuevos Auriculares-----");
                                crearDispositivo3();
                                }                            
                    break;
                    }while(opcion!=6);
                    
                case 2:
                    String v = new String(" ");
                    
                        System.out.print("-----Acciones con dispositivos-----");
                        System.out.print("\n1. Computadora portátil");
                        System.out.print("\n2. Tablet");
                        System.out.print("\n3. SmartWatch");
                        System.out.print("\n4. Smartphone");
                        System.out.print("\n5. Auticulares inalámbricos");
                        System.out.print("\n6. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
        Opc = entrada.nextInt();
        do{
            switch(Opc){
                case 1:
                     System.out.print("-----Dispositivo computadora-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    o = entrada.nextInt();
                    do{
                    switch(o){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int L=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            v = entrada.next();
                            if(v!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                L = entrada.nextInt();
                                if(L==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int F=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            F = entrada.nextInt();
                            if(F==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(v+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                            
                        case 4:
                            int w=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            w = entrada.nextInt();
                            if( w==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                               }
                            }
                            break;
                    }
                    break;
                    }while(o!=5);
                    
                case 2:
                     System.out.print("-----Dispositivo tablet-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    o = entrada.nextInt();
                    do{
                        
                    switch(o){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int L=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            v = entrada.next();
                            if(v!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                L = entrada.nextInt();
                                if(L==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int F=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            F = entrada.nextInt();
                            if(F==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(v+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                        case 4:
                            int w=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            w = entrada.nextInt();
                            if( w==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                                }
                            }
                            break;
                    } break;
                    } while(o!=5);

                case 3:
                        System.out.print("-----Dispositivo SmartWatch-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    o = entrada.nextInt();
                    do{
                        switch(o){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int L=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            v = entrada.next();
                            if(v!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                L = entrada.nextInt();
                                if(L==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                    }
                    break;
       
                    }while(o!=3);
                    
              case 4:
  
                   System.out.print("-----Dispositivo SmartPhone-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    o = entrada.nextInt();
                    do{  
                        switch(o){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int L=0;
                            System.out.print("\nCopiar texto");
                            System.out.print("Ingrese un texto de cualquier tipo: ");
                            v = entrada.next();
                            if(v!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                L = entrada.nextInt();
                                if(L==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int F=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            F = entrada.nextInt();
                            if(F==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(v+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                        case 4:
                            int w=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            w = entrada.nextInt();
                            if( w==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                                }
                            }
                            break;
                    }
                    break;  
                    }while (o!=5);
                  
                case 5:
                        System.out.print("-----Dispositivo Auriculares-----");
                        System.out.print("\n1. Tomar Fotografía");
                        System.out.print("\n2. Copiar texto");
                        System.out.print("\n3. Pegar texto");
                        System.out.print("\n4. Compartir documento");
                        System.out.print("\n5. Volver atrás");
                        System.out.print("\nSeleccione la opción a ejecutar:");
                    o = entrada.nextInt();
                    do{
                        switch(o){
                        case 1:
                            System.out.print("\nTomar Fotografía");
                            break;
                        case 2:
                            int L=0;
                            System.out.println("----Copiar texto----");
                            System.out.println("Ingrese un texto de cualquier tipo: ");
                            v = entrada.next();
                            if(v!=" "){
                                System.out.println("¿Desea Copiar el texto ingresado?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                                L = entrada.nextInt();
                                if(L==1){
                                    System.out.println("Texto copiado");
                                }  
                            }
                            else{
                                System.out.print("No hay texto");
                            }
                            break;
                        case 3: 
                            int F=0;
                             System.out.println("Pegar texto*\n\n\n");
                             System.out.println("¿Desea Pegar el Dexto Aquí?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            F = entrada.nextInt();
                            if(F==1){
                                System.out.print("Texto pegado");
                                System.out.print("Su texto es el siguiente.....................**\n\n\n\n");
                                System.out.print(v+"\n\n");
                            }
                            else{
                                System.out.print("No se deseo pegar el texto***\n");
                            }
                            
                            break;
                        case 4:
                            int w=0;
                            String a;
                            System.out.println("Compartir documentos");
                            System.out.println("¿Desea compartir documentos?");
                                System.out.println("1.SI");
                                System.out.println("2.NO");
                                System.out.print("\nSeleccione la opción a ejecutar:");
                            w = entrada.nextInt();
                            if( w==1){
                                System.out.print("Ingrese el nombre del documento: ");
                                a = entrada.next();
                                if(a==a){
                                    System.out.print("Documento encontrado.......\n");
                                }
                                else{
                                    System.out.println("No se encontro el documento..\n");
                                }
                            }
                            break;
                    }
                    break; 
                    }while(o!=5);
                    
                    }
                    }while(Opc!=6);    
            }
            }while(opcion!=6);   
    }  
    
public static void crearDispositivo1() throws IOException{
    int opcion1;
    Scanner entrada = new Scanner(System.in);
        String a = null,b = null,c ="";
        String d = "Activo";
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
 
do{
            archivo = new File("Aplicacion_Texto.txt");
            if (!archivo.exists()){
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico:");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                    
                }catch (IOException ex){
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE,null, ex);
                    
                }                
            }
            else {
                try{
                    archivo.createNewFile();
                    System.out.println("Correo electrénico: ");
                    a = entrada.next();
                    System.out.println("Nombre del dispositivo: ");
                    b = entrada.next();
                    System.out.println("Visible par conexión: ");
                    c = entrada.next();
                    
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    System.out.println("Correo electrénico: "+a);
                    linea.println(a);
                    System.out.println("Nombre del dispositivo: "+b);
                    linea.println(b);
                    System.out.println("Visible par conexión: "+c);
                    linea.println(c);
                    System.out.println("Estado por defecto: "+d);
                    linea.println(d);
                    linea.close();
                    escribir.close();
                }catch (IOException ex){
                    Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE,null, ex);
                    
                }   
            }

                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Salir");
                System.out.println("Ingrese su opción:");
                                int q = entrada.nextInt();
                                if (q==1){
                                    System.out.println("--CORREO ELECTRONICO--");
                                    eliminarCorreo(a);    
                                }
                                else if(q==2){
                                    System.out.println("--NOMBRE--");
                                    eliminarNombre(b);
                                }
                                else if(q==3){
                                    System.out.println("--VISIBLE--");
                                    eliminarVisibilidad(c); 
                                }
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion1 = entrada.nextInt();
        }while(opcion1!=1);
}

public static void crearDispositivo2(){
    int opcion2;
    Scanner entrada = new Scanner (System.in);
    String a,b,c ="";
    String d = "activo";
    int l =0;
    long f=0;
    
    do{
    System.out.println("Correo electrénico: ");
    a = entrada.next(); 
    System.out.println("Nombre del dispositivo: ");
    b = entrada.next();
    System.out.println("Visible para conexión:");
    c = entrada.next();
    System.out.println("Número de telefono"
            + "\nNota: ingresar 8 digitos");
    f = entrada.nextInt();   
    
    System.out.println("Correo electrénico: "+ a);
    System.out.println("Nombre del dispositivo:"+ b);
    System.out.println("Visible para conexión:"+ c);
    System.out.println("Nota: el dispositivo estara"+ d +"por defecto");
    System.out.println("Número de telefono:"+ f);
   
                System.out.println("¿Desea ELiminar algun dato ingresado?");
                System.out.println("1. correo");
                System.out.println("2. Nombre de dispositivo");
                System.out.println("3. Visible");
                System.out.println("4. Número de telefóno");
                System.out.println("5. Salir");
                System.out.println("Ingrese su opción:");
                                int q = entrada.nextInt();
                                if (q==1){
                                    System.out.println("--CORREO ELECTRONICO--");
                                    eliminarCorreo(a);    
                                }
                                else if(q==2){
                                    System.out.println("--NOMBRE--");
                                    eliminarNombre(b);
                                }
                                else if(q==3){
                                    System.out.println("--VISIBLE--");
                                    eliminarVisibilidad(c);
                                }
                                else if (q==4){
                                  System.out.println("");
                                    eliminarTelefono(f);
                                        }    
                                System.out.println("MODIFICADO");
                                System.out.println("1. Salir");
                                System.out.println("2. Ingresar nuevo dato");
                                opcion2 = entrada.nextInt();
        }while(opcion2!=1);
} 

public static void crearDispositivo3(){ 
    String archivo = "Aplicacion_Texto.txt";
        BufferedReader br = null;
        try {
           br = new BufferedReader(new FileReader(archivo));
           String texto = br.readLine();
           while(texto != null)
           {
               System.out.println(texto);
               texto = br.readLine();
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());

}
        }
}

public static void eliminarCorreo(String a){
    try(Scanner entrada = new Scanner(new File("Aplicacion_Texto.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("Aplicacion_Texto.txt",true));
        String s [];
        boolean CorreoEncontrado= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(a))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(a);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el correo electronico: " + a +".");
                CorreoEncontrado = true; 
            }
        }
        if(!CorreoEncontrado)
        {
            System.out.println("No hay correo en existencia: " + a);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}

    public static void eliminarNombre(String b){
    try(Scanner entrada = new Scanner(new File("Aplicacion_Texto.txt"))){
        PrintWriter pw = new PrintWriter(new FileWriter("Aplicacion_Texto.txt",true));
        String s [];
        boolean NombreEncontrado= false;
        while(entrada.hasNextLine()){
            s = entrada.nextLine().split(":");
            if(s[0].equals(b)){
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(b);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el nombre del dispositivo: "+b);
                NombreEncontrado = true;
            }
        }
        if(!NombreEncontrado){
            System.out.println("No hay Ningun Nombre Existente: "+b);
        }
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
}
    
    public static void eliminarVisibilidad(String c){

    try(Scanner entrada = new Scanner(new File("Aplicacion_Texto.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("Aplicacion_Texto.txt",true));
        String s [];
        boolean Visible= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(c))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(c);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el Dispositivo Visible: "+c);
                Visible = true;
            }
        }
        if(!Visible)
        {
            System.out.println("No hay Dispositivo Visible: "+c);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}
    
    public static void eliminarEstado(String d){

    try(Scanner entrada = new Scanner(new File("Aplicacion_Texto.txt")))
    {
        PrintWriter pw = new PrintWriter(new FileWriter("Aplicacion_Texto.txt",true));
        String s [];
        boolean Estado= false;
        while(entrada.hasNextLine())
        {
            s = entrada.nextLine().split(":");
            if(s[0].equals(d))
            {
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(d);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el Estado: " + d + ".");
                Estado= true;
            }
        }
        if(!Estado)
        {
            System.out.println("No existe estado: "+d);
        }
    }
    catch(IOException ex)
    {
        System.out.println(ex.getMessage());
    }
}

    public static void eliminarTelefono(long f){
        
    try(Scanner entrada = new Scanner(new File("Aplicacion_Texto.txt"))){
        PrintWriter pw = new PrintWriter(new FileWriter("Aplicacion_Texto.txt",true));
        String s [];
        boolean TelefonoEncontrado= false;
        while(entrada.hasNextLine()){
            s = entrada.next().split(":");
            if(s[0].equals(f)){
                System.out.println(s[0]);
                System.out.println(s[1]);
                System.out.println(f);
                s[0] = "";
                s[1] = "";
                pw.write(s[0]+" "+s[1]);
                System.out.println("Se ha borrado el telefóno : "+f);
                TelefonoEncontrado = true;
            }
        }
        if(!TelefonoEncontrado){
            System.out.println("No existe este telefóno: "+f);
        }
    }catch(IOException ex){
        System.out.println(ex.getMessage());
    }
    }
}