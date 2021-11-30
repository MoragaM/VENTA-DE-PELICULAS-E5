import java.util.Scanner;

public class INICIO {
    public static void main(String[] args){

        Scanner t = new Scanner(System.in);
        String n,c,c1,c2,c3,co,co1,co2,e,g;
        int OP;
        //crear cuenta//
         System.out.println("CREA TU CUENTA Y DISFRUTA DE NUESTRAS PELICULAS");
         System.out.println(" ");
         System.out.println("INTRODUCE TU NOMBRE: ");
         n = t.nextLine();
         System.out.println("INTRODUCE TU EDAD: ");
         e  = t.nextLine();
         System.out.println("GENERO: ");
         g = t.nextLine();
         System.out.println("INTRODUCE TU CORREO ELECTRONICO: ");
         c = t.next();
         System.out.println("CREA UNA CONTRASEÑA SEGURA: ");
         co = t.next();
         System.out.println(" ");
         System.out.println("¿DESEAS CREAR TU CUENTA CON ESTOS DATOS?");
         System.out.println("1) CREAR CUENTA CON ESTOS DATOS");
         System.out.println("2) CANCELAR CREACION DE CUENTA");
         OP = t.nextInt();
         if (OP==1) {
             System.out.println("TU CUENTA A SIDO CREADA CON EXITO, DISFRUTA DE NUESTRAS PELICULAS");
             System.out.println("¿DESEAS INICIAR SESION?");
             System.out.println("1) SI, DESEO INICIAR SESION");
             System.out.println("2) NO, DESEO INICIAR SESION EN OTRO MOMENTO");
             OP = t.nextInt();
             if (OP==1){
                 System.out.println("INICIO DE SESION");
                 System.out.println(" ");
                 System.out.println("INTRODUCE TU CORREO ELECTRONICO");
                 c1 = t.next();
                 System.out.println("INTRODUCE TU CONTRASEÑA");
                 co1= t.next();
                 if (c1==c && co1==co){
                     System.out.println("INCIO DE SESION EXITOSO, BIENVENIDO, DISFRUTA DE NUESTRAS NUEVAS PELICULAS");
                 }else{
                     System.out.println("A OCURRIDO UN ERROR, CORREO O CONTRASEÑA INCORRECTOS, INTENTALO DE NUEVO");
                     System.out.println("¿DESEAS RECORDAR TU CONTRASEÑA?");
                     System.out.println("1) SI, RECORDAR CONTRASEÑA");
                     System.out.println("2) NO, NO RECORDAR CONTRASEÑA");
                     OP = t.nextInt();
                     if (OP==1){
                         System.out.println("INTRODUCE TU CORREO ELECTRONICO");
                         c2 = t.next();
                         if (c2 == c){
                             System.out.println("TU CONTRASEÑA ES: "+co);
                             System.out.println("INTRODUCE TU CORREO ELECTRONICO");
                             c3 = t.nextLine();
                             System.out.println("INTRODUCE TU CONTRASEÑA:");
                             co2 = t.nextLine();
                             if (c3==c && co2==co){
                                 System.out.println("INICIO DE SESION EXITOSO");
                             }else {
                                 System.out.println("INICIO DE SESION INCORRECTO, INTENTALO MAS TARDE");
                             }
                             }

                         }


                 }
             }else{
                 System.out.println("HAS DESIDIDO NO INCIAR SESION, REGRESA MAS TARDE");
             }

         }else{
             System.out.println("HAS DECIDIDO NO REGISTRARTE EN NUESTRA PAGINA, INTENTALO MAS TARDE");
         }








}
}
