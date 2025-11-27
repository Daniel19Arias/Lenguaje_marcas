import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Proyecto_final {
    static Scanner sc = new Scanner(System.in);
    static Clip musicaMenu;
    static Boolean linterna = false;
    static Boolean hacha = false;
    static Boolean maza = false;
    static Boolean llaves = false;
    static String nombre;
    public static void main(String[] args) {
        Proyecto_final proyecto = new Proyecto_final();
        System.out.print("¿Cuál es tu nombre?: ");
        nombre = sc.nextLine();
        proyecto.juego();
    }
    public void juego(){
        while (true) {
            System.out.println("Bienvenido, "+nombre+", ya formas parte de nuestro experimento");
            iniciar_musica_juego();
            System.out.println("=================================🌲☘️ Ecos del Bosque Roto ☘️🌲=================================");
            inventario();
            System.out.println("Despiertas en un bosque oscuro rodeado de árboles muy altos, no llevas nada más que una camiseta negra, una chaqueta, unos pantalones medio rasgados y unas zapatillas de correr desgastadas, debido a la situación, tus sentidos se han agudizado, escuchas ruidos variados desde múltiples direcciones. Tienes tan solo de referencia un árbol marcado con un trébol, debes moverte, elige un camino:");
            int opcion;
            System.out.println("================================================================================================");
            System.out.println("¿Qué camino eliges??");
            System.out.println("1. Moverse por la parte izquierda del arbol marcado ‍🚶🏼‍♂️️");
            System.out.println("2. Moverse por la parte derecha del arbol marcado 🚶🏼‍♂️‍➡️");
            System.out.println("================================================================================================");
            System.out.print("Tu respuesta es: ");
            opcion = sc.nextInt();
            while (opcion != 1 && opcion != 2) {
                System.out.println("================================================================================================");
                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                System.out.println("Despiertas en un bosque oscuro rodeado de árboles muy altos, no llevas nada más que una camiseta negra, una chaqueta, unos pantalones medio rasgados y unas zapatillas de correr desgastadas, debido a la situación, tus sentidos se han agudizado, escuchas ruidos variados desde múltiples direcciones. Tienes tan solo de referencia un árbol marcado con un trébol, debes moverte, elige un camino:");
                System.out.println("Hacia que zona decides avanzar");
                System.out.println("1. Moverse por la parte izquierda del arbol marcado ‍🚶🏼‍♂️️");
                System.out.println("2. Moverse por la parte derecha del arbol marcado 🚶🏼‍♂️‍➡️");
                opcion = sc.nextInt();
            }
            if (opcion == 1) {
                System.out.println("================================================================================================");
                System.out.println("Elegiste avanzar por la parte izquierda del arbol marcado");
                System.out.println("Sigues por un camino donde la tierra comienza a humedecerse y sientes como se te empiezan a hundir los pies en charcas de lodo. ");
                sonido_pasos_arbol();
                System.out.println("================================================================================================");
                System.out.println("¿Qué decides hacer?");
                System.out.println("1. Subirte al árbol más cercano 🏃🏼‍♂️‍➡️⬆️🌲");
                System.out.println("2. Moverte más rápido para pasar el camino 🏃🏼‍♂️️💨");
                System.out.println("================================================================================================");
                System.out.print("Tu respuesta es: ");
                opcion = sc.nextInt();
                while (opcion != 1 && opcion != 2) {
                    System.out.println("================================================================================================");
                    System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                    System.out.println("Su eleccion fue avanzar por la parte izquierda del arbol marcado");
                    System.out.println("Sigues por un camino donde la tierra comienza a humedecerse y sientes como se te empiezan a hundir los pies en charcas de lodo. ");
                    System.out.println("¿Qué decisión tomarás?");
                    System.out.println("1. Subirte al árbol más cercano 🏃🏼‍♂️‍➡️⬆️🌲");
                    System.out.println("2. Moverte más rápido para pasar el camino 🏃🏼‍♂️️💨");
                    opcion = sc.nextInt();
                }
                if (opcion == 1) {
                    System.out.println("================================================================================================");
                    System.out.println("Elegiste subir al arbol mas cercano");
                    System.out.println("Al hacerlo acabas cansado así que decides reposar un poco. Al cabo de unos minutos escuchas unas campanas sonar, y ves como un grupo de personas encapuchadas pasan por debajo de ti. A uno de ellos se le caen unas llaves");
                    subir_arbol();
                    System.out.println("================================================================================================");
                    System.out.println("¿Decides bajar a cogerlas?");
                    System.out.println("1. Si ✅");
                    System.out.println("2. No 🔴");
                    System.out.println("================================================================================================");
                    System.out.print("Tu respuesta es: ");
                    opcion = sc.nextInt();
                    while (opcion != 1 && opcion != 2){
                        System.out.println("================================================================================================");
                        System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                        System.out.println("Elegiste subir al arbol más cercano");
                        System.out.println("Al hacerlo acabas cansado así que decides reposar un poco. Al cabo de unos minutos escuchas unas campanas sonar, y ves como un grupo de personas encapuchadas pasan por debajo de ti. A uno de ellos se le caen unas llaves");
                        System.out.println("¿Decides bajar a cogerlas?");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 1) {
                        llaves = true;
                        System.out.println("================================================================================================");
                        System.out.println("Elegiste bajar a coger las llaves");
                        System.out.println("Al intentar bajar, se te engancha la chaqueta en una de las ramas y caes a plomo contra el suelo haciendo mucho ruido. El grupo se da la vuelta y corren a por ti.");
                        sonido_llaves();
                        mensaje_perdedor();
                        System.out.println("================================================================================================");
                    }
                    else if (opcion == 2) {
                        llaves = true;
                        System.out.println("================================================================================================");
                        System.out.println("Decidiste no bajar a por las llaves");
                        System.out.println("Decides esperar a que se vayan. Bajas cautelosamente del árbol y guardas las llaves en el bolsillo de tu chaqueta. Pesan bastante y tienen formas extrañas. Están manchadas de algo aceitoso ");
                        sonido_llaves();
                        System.out.println("================================================================================================");
                        System.out.println("¿Qué camino elegirás?");
                        System.out.println("1. Ir por donde el grupo 👨🏿‍👩🏻‍👧🏾‍👦🏽");
                        System.out.println("2. Ir en dirección contraria al grupo ❌👨🏿‍👩🏻‍👧🏾‍👦🏽");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion = sc.nextInt();
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Decidiste no bajar a por las llaves");
                            System.out.println("Decides esperar a que se vayan. Bajas cautelosamente del árbol y guardas las llaves en el bolsillo de tu chaqueta. Pesan bastante y tienen formas extrañas. Están manchadas de algo aceitoso ");
                            System.out.println("¿Qué camino elegirias?");
                            System.out.println("1. Ir por donde el grupo 👨🏿‍👩🏻‍👧🏾‍👦🏽");
                            System.out.println("2. Ir en dirección contraria al grupo ❌👨🏿‍👩🏻‍👧🏾‍👦🏽");
                            opcion = sc.nextInt();
                        }
                        if (opcion == 1) {
                            System.out.println("Moviéndote de forma cautelosa siguiendo las huellas que van dejando, te encuentras con una enorme aldea de personas, coges unos ropajes que encuentras y caminas hasta un callejón en la que ves a varias personas encerradas en jaulas. Asustado metes las manos en los bolsillos y tocas las llaves ");
                            sonido_pasos_arbol();
                            System.out.println("1. Pruebas a abrir las jaulas ⛓️‍💥");
                            System.out.println("2. Decides continuar tu camino ➡️🚶🏼‍♂️‍➡️");
                            opcion = sc.nextInt();
                            while (opcion != 1 && opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Moviéndote de forma cautelosa siguiendo las huellas que van dejando, te encuentras con una enorme aldea de personas, coges unos ropajes que encuentras y caminas hasta un callejón en la que ves a varias personas encerradas en jaulas. Asustado metes las manos en los bolsillos y tocas las llaves ");
                                System.out.println("1. Pruebas a abrir las jaulas ⛓️‍💥");
                                System.out.println("2. Decides continuar tu camino ➡️🚶🏼‍♂️‍➡️");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                System.out.println("================================================================================================");
                                System.out.println("Tratas de abrir las jaulas, pero tardas demasiado en encontrar las llaves para cada una de ellas. Las personas atrapadas parecen idénticas unas de otras, llevan las mismas prendas y sus rostros son iguales. Al tratar de rescatar a una mujer, se te caen las llaves y al cogerlas, el grupo al que habías seguido te atrapa. En sus túnicas llevan el símbolo de un trébol ");
                                jaula_rota();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");

                            }else if (opcion == 2) {
                                System.out.println("================================================================================================");
                                System.out.println("Continuas por el callejón y al llegar al final de este, una mujer encerrada te dice: “no podrás salir de aquí, no tú solo contigo mismo” Extrañado por sus palabras sales del callejón y te encuentras de frente con el grupo al que estabas siguiendo. Te atrapan. En sus túnicas llevan el símbolo de un trébol");
                                sonido_pasos_arbol();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");

                            }
                        }else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Al ir en dirección contraria al grupo, te llevan a un camino donde ves a un grupo de personas que parecen ser cazadores de conejos. Uno de ellos se percata de tu presencia y comienza a gritarte. No parece querer hacerte daño, pero va armado ");
                            sonido_pasos_arbol();
                            System.out.println("================================================================================================");
                            System.out.println("1. Dialogas 💬");
                            System.out.println("2. Corres 🏃🏼‍♂️‍➡️");
                            System.out.println("================================================================================================");
                            System.out.print("Tu respuesta es: ");
                            opcion = sc.nextInt();
                            while (opcion != 1 && opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Al ir en dirección contraria al grupo, te llevan a un camino donde ves a un grupo de personas que parecen ser cazadores de conejos. Uno de ellos se percata de tu presencia y comienza a gritarte.No parece querer hacerte daño, pero va armado ");
                                System.out.println("1. Dialogas 💬");
                                System.out.println("2. Corres 🏃🏼‍♂️‍➡️");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                System.out.println("================================================================================================");
                                System.out.println("Hablas con el hombre, es un señor mayor equipado con los típicos pertrechos de un cazador veterano. Te dice que tengas cuidado, que hay un grupo de personas que están experimentando con seres humanos. Te invita a ir con el grupo de cazadores y te ofrecen una tienda de campaña donde dormir por unas horas. Al despertar, ves que no hay nadie. Tan solo una nota con el dibujo de un trébol y un texto que dice: “no confíes en nadie, más que en ti mismo” Tras leerlo sientes una presión en el pecho y acabas muriendo");
                                sonido_murmullos();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");

                            }else if (opcion == 2) {
                                System.out.println("================================================================================================");
                                System.out.println("Sales corriendo, de fondo escuchas silbidos y sonidos de los cazadores corriendo tras de ti. Comienzan a dispararte, saltas hacia un árbol caído para recuperar el aliento. Reposas un poco y antes de seguir corriendo ves la marca de un trébol en el árbol donde te has cubierto. El hombre que se acercó a ti te grita: “No deberías haber huido, tu solo no vas a conseguirlo” Te han disparado en la cabeza, no ha servido de nada huir, has sido un cobarde.");
                                huir_corriendo();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");

                            }
                        }
                    }
                }
                else if (opcion == 2) {
                    System.out.println("================================================================================================");
                    System.out.println("Escoges moverte rápido para pasar el camino");
                    System.out.println("Pasas corriendo por los enormes charcos de lodo y tropiezas con una piedra marcada con un trébol. Al levantarte sientes una presencia detrás de ti, estás atemorizado, pero curioso ");
                    huir_corriendo();
                    System.out.println("================================================================================================");
                    System.out.println("¿Decides darte la vuelta?");
                    System.out.println("1. Si ✅");
                    System.out.println("2. No 🔴");
                    System.out.println("================================================================================================");
                    System.out.print("Tu respuesta es: ");
                    opcion = sc.nextInt();
                    while (opcion != 1 &&  opcion != 2) {
                        System.out.println("================================================================================================");
                        System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                        System.out.println("Escoges moverte rápido para pasar el camino");
                        System.out.println("Pasas corriendo por los enormes charcos de lodo y tropiezas con una piedra marcada con un trébol. Al levantarte sientes una presencia detrás de ti, estás atemorizado, pero curioso ");
                        System.out.println("¿Decides darte la vuelta?");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 1) {
                        System.out.println("================================================================================================");
                        System.out.println("Le echas valor y al darte la vuelta ves que era un pequeño conejito cogiendo bellotas. Logras tranquilizarte y decides seguir el camino seco donde ves un pasadizo que lleva a una pequeña cabaña  ");
                        conejo_comiendo();
                        System.out.println("================================================================================================");
                        System.out.println("¿Qué harás ahora?");
                        System.out.println("1. Mirar los alrededores 🔎");
                        System.out.println("2. Entrar a la cabaña 🚶🏼‍♂️‍➡️🛖");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion = sc.nextInt();
                        while (opcion != 1 &&  opcion != 2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Le echas valor y al darte la vuelta ves que era un pequeño conejito cogiendo bellotas. Logras tranquilizarte y decides seguir el camino seco donde a ves un pasadizo que lleva a una pequeña cabaña  ");
                            System.out.println("¿Qué harás ahora?");
                            System.out.println("1. Mirar los alrededores 🔎");
                            System.out.println("2. Entrar a la cabaña 🚶🏼‍♂️‍➡️🛖");
                            opcion = sc.nextInt();
                        }
                        if (opcion == 1) {
                            System.out.println("================================================================================================");
                            System.out.println("Encuentras la entrada al sótano de la cabaña, ves unos tablones y decides tapiar la entrada. Te sientes más seguro, no hace tanto frío, pero sigues indefenso. Exploras la cabaña y encuentras comida, ropa y una pequeña estufa con la que entrar en calor. Cuando consigues sentirte cómodo, escuchas un ruido");
                            sonido_pasos_arbol();
                            System.out.println("================================================================================================");
                            System.out.println("¿Qué vas a hacer?");
                            System.out.println("1. Comprobar su origen 🧏🏼");
                            System.out.println("2. Esconderse 🐢");
                            System.out.println("================================================================================================");
                            System.out.print("Tu respuesta es: ");
                            opcion = sc.nextInt();
                            while (opcion != 1 &&  opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Encuentras la entrada al sótano de la cabaña, ves unos tablones y decides tapiar la entrada. Te sientes más seguro, no hace tanto frío, pero sigues indefenso. Exploras la cabaña y encuentras comida, ropa y una pequeña estufa con la que entrar en calor. Cuando consigues sentirte cómodo, escuchas un ruido");
                                System.out.println("¿Qué vas a hacer?");
                                System.out.println("1. Comprobar su origen 🧏🏼");
                                System.out.println("2. Esconderse 🐢");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                System.out.println("================================================================================================");
                                System.out.println("Abres la puerta y ves que eres tu mismo, pero completamente tatuado con tréboles. Todo se vuelve oscuro y tan solo escuchas una voz de ti mismo diciéndote “estás cerca, puedes conseguirlo”");
                                puerta_abierta();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                            else if (opcion == 2) {
                                System.out.println("================================================================================================");
                                System.out.println("Apagas rápidamente la estufa  y te escondes en un armario cerca de la entrada. En la parte interior de la puerta del armario ves un trébol tallado. Sientes una presión en el pecho, has muerto");
                                puerta_armario();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");

                            }
                        }
                        else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Entras en la cabaña por la puerta principal. No hay nadie, se respira un ambiente frío y desolador, cierras todas las puertas y ventanas y encuentras una manta que te cubre todo el cuerpo, comida y una hoguera que logras encender con unas cerillas que sacaste de un cajón.  Encuentras una escopeta y en ese preciso momento escuchas un ruido");
                            chirrido_puerta();
                            System.out.println("================================================================================================");
                            System.out.println("¿Qué vas a hacer?");
                            System.out.println("1. Comprobar su origen 🧏🏼🔎");
                            System.out.println("2. Esconderse 🐢");
                            System.out.println("================================================================================================");
                            System.out.print("Tu respuesta es: ");
                            opcion = sc.nextInt();
                            while (opcion != 1 &&  opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estas obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Entras en la cabaña por la puerta principal. No hay nadie, se respira un ambiente frío y desolador, cierras todas las puertas y ventanas y encuentras una manta que te cubre todo el cuerpo, comida y una hoguera que logras encender con unas cerillas que sacaste de un cajón.  Encuentras una escopeta y en ese preciso momento escuchas un ruido");
                                System.out.println("¿Qué vas a hacer?");
                                System.out.println("1. Comprobar su origen 🧏🏼🔎");
                                System.out.println("2. Esconderse 🐢");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                System.out.println("================================================================================================");
                                System.out.println("Al tener la escopeta en tus manos te sientes fuerte, pero realmente no sabes utilizarla, tratas de asomarte por la ventana cercana a la puerta y debido a los nervios disparas sin querer. Asustado, abres la puerta y te ves a ti mismo tirado en el suelo.  Hay una marca en la entrada de un trébol");
                                disparo_escopeta();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                            else if (opcion == 2) {
                                System.out.println("================================================================================================");
                                System.out.println("Piensas rápidamente donde podrías esconderte y al ir a apagar la hoguera, la puerta se abre de golpe y sientes un profundo dolor que te tumba al suelo. Lo último que logras ver es el símbolo del trébol en la pared interior de la chimenea");
                                puerta_armario();
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                        }
                    }else if (opcion == 2) {
                        System.out.println("================================================================================================");
                        System.out.println("Te quedas congelado, tratas de moverte hacia adelante, pero notas como algo empieza a tocarte la espalda y de repente sientes un golpe muy fuerte que te tira al suelo y acto seguido mueres ");
                        mensaje_perdedor();
                        System.out.println("================================================================================================");

                    }
                }
            }
            else if (opcion == 2) {
                System.out.println("================================================================================================");
                System.out.println("Elegiste avanzar por la parte derecha del árbol marcado");
                System.out.println("Sigues por un camino tranquilo en el que de pronto ves una extraña figura en la lejanía, entrando a lo que parece una cabaña ");
                sonido_pasos_arbol();
                System.out.println("================================================================================================");
                System.out.println("¿Qué vas a hacer?");
                System.out.println("1. Dirigirse hacia la figura 🚶🏼‍♂️‍➡️🗿");
                System.out.println("2. Explorar el entorno 🔎🌲🌳");
                System.out.println("================================================================================================");
                System.out.print("Tu respuesta es: ");
                opcion = sc.nextInt();
                while (opcion != 1 && opcion != 2) {
                    System.out.println("================================================================================================");
                    System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                    System.out.println("Elegiste avanzar por la parte derecha del árbol marcado");
                    System.out.println("Sigues por un camino tranquilo en el que de pronto ves una extraña figura en la lejanía, entrando a lo que parece una cabaña ");
                    System.out.println("¿Qué vas a hacer? (responde con 1 o 2)");
                    System.out.println("1. Dirigirse hacia la figura 🚶🏼‍♂️‍➡️🗿");
                    System.out.println("2. Explorar el entorno 🔎🌲🌳");
                    opcion = sc.nextInt();
                }
                if (opcion == 1) {
                    System.out.println("================================================================================================");
                    System.out.println("Conforme te acercas a la cabaña empiezas a ver plantas muertas, bandejas de comida tiradas por los alrededores y ves iluminación proveniente de una chimenea dentro de la cabaña. Hay una ventana medio abierta por la que cabes");
                    sonido_pasos_arbol();
                    System.out.println("================================================================================================");
                    System.out.println("¿Decides entrar");
                    System.out.println("1. Si ✅");
                    System.out.println("2. No 🔴");
                    System.out.println("================================================================================================");
                    System.out.print("Tu respuesta es: ");
                    opcion = sc.nextInt();
                    while (opcion != 1 && opcion != 2) {
                        System.out.println("================================================================================================");
                        System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                        System.out.println("Conforme te acercas a la cabaña empiezas a ver plantas muertas, bandejas de comida tiradas por los alrededores y ves iluminación proveniente de una chimenea dentro de la cabaña. Hay una ventana medio abierta por la que cabes");
                        System.out.println("¿Decides entrar");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 1) {
                        System.out.println("================================================================================================");
                        System.out.println("Entras sin hacer ningún ruido, te llega un olor a comida recién calentada y comienzas a escuchar murmullos de una persona. Al asomarte a la chimenea, ves a una persona apuntándote con una escopeta");
                        ventana_abriendo();
                        System.out.println("================================================================================================");
                        System.out.println("Aterrorizado solo tienes dos posibles opciones, ¿Cuál decides?");
                        System.out.println("1. Dialogar 💬");
                        System.out.println("2. Correr 🏃🏼‍♂️‍➡️");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion=sc.nextInt();
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Entras sin hacer ningún ruido, te llega un olor a comida recién calentada y comienzas a escuchar murmullos de una persona. Al asomarte a la chimenea, ves a una persona apuntándote con una escopeta");
                            System.out.println("Aterrorizado solo tienes dos posibles opciones, ¿Cuál decides?");
                            System.out.println("1. Dialogar 💬");
                            System.out.println("2. Correr 🏃🏼‍♂️‍➡️");
                            opcion=sc.nextInt();
                        }
                        if (opcion == 1) {
                            System.out.println("================================================================================================");
                            System.out.println("Tratas de explicarte y notas como tu atacante está tan sorprendido como tú, al fijarte más en los detalles de su rostro, sientes una similitud contigo mismo, pero antes de decir nada recibes un disparo en el estómago y al caer al suelo ves en el techo el símbolo del trébol");
                            sonido_murmullos();
                            mensaje_perdedor();
                            System.out.println("================================================================================================");
                        } else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Tratas de huir por donde habías venido, consigues sortear la ventana sin hacerte daño, pero cuando estás a punto de escapar recibes un disparo en la espalda. Sientes un frío con el que comienzas a desmayarte. Al alzar la mirada ves el símbolo del trébol marcado en el árbol más próximo");
                            huir_corriendo();
                            mensaje_perdedor();
                            System.out.println("================================================================================================");

                        }

                    }
                    else if (opcion == 2) {
                        linterna = true;
                        System.out.println("================================================================================================");
                        System.out.println("Decides comprobar los alrededores antes de entrar y encuentras un cobertizo con varias herramientas rotas. Logras rescatar una linterna de mucha potencia.");
                        linterna_encendida();
                        System.out.println("================================================================================================");
                        System.out.println("¿Entras en la cabaña?");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion = sc.nextInt();
                        while (opcion != 1  && opcion != 2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Decides comprobar los alrededores antes de entrar y encuentras un cobertizo con varias herramientas rotas. Logras rescatar una linterna de mucha potencia.");
                            System.out.println("¿Entras en la cabaña?");
                            System.out.println("1. Si ✅");
                            System.out.println("2. No 🔴");
                            opcion = sc.nextInt();
                        }
                        if (opcion == 1) {
                            System.out.println("================================================================================================");
                            System.out.println("Al entrar en la cabaña ves a un hombre con una manta que le cubre por completo, parece asustado. Tratas de hablar con él y cuando se da la vuelta ves que es muy parecido a ti. Juntos tratáis de explicar vuestra situación. Tras un largo rato recuperáis energía y discutís sobre lo que debéis hacer.");
                            chirrido_puerta();
                            System.out.println("================================================================================================");
                            System.out.println("¿Qué haréis?");
                            System.out.println("1. Pasar la noche en la cabaña 🌙🛖");
                            System.out.println("2. Salir de noche 🌙🚶🏼‍♂️‍➡️");
                            System.out.println("================================================================================================");
                            System.out.print("Tu respuesta es: ");
                            opcion = sc.nextInt();
                            while (opcion != 1  && opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Al entrar en la cabaña ves a un hombre con una manta que le cubre por completo, parece asustado. Tratas de hablar con él y cuando se da la vuelta ves que es muy parecido a ti. Juntos tratáis de explicar vuestra situación. Tras un largo rato recuperáis energía y discutís sobre lo que debéis hacer.");
                                System.out.println("¿Qué haréis?");
                                System.out.println("1. Pasar la noche en la cabaña 🌙🛖");
                                System.out.println("2. Salir de noche 🌙🚶🏼‍♂️‍➡️");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                pasar_noche();
                                System.out.println("================================================================================================");
                                System.out.println("Te despiertas, y al alzar la mirada ves a un grupo de personas encapuchadas que tienen a tu compañero amenazado por un cuchillo.  Te dicen: “deberíais haberos ido” Acto seguido degüellan a tu compañero y al momento sientes como tu pecho se hunde y acabas muriendo por un ataque al corazón");
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                            else if (opcion == 2) {
                                chirrido_puerta();
                                System.out.println("================================================================================================");
                                System.out.println("Decidís salir rápidamente de noche, tú iluminas el camino con tu linterna y tu compañero vigila los alrededores. Al cabo de un rato, te golpeas contra una pared. Todo este tiempo el bosque era falso, tu compañero y tu sois clones.  Has formado parte de un experimento que muestra si fuéramos capaces de confiar en nosotros mismos de forma literal");
                                mensaje_ganador();

                            }
                        }else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Decides no entrar, continúas por el bosque, está muy oscuro, no logras ver nada, escuchas a tu alrededor el sonido del agua, pero no logras intuir de dónde viene.  Logras llegar a un río y al otro lado ves un grupo de varias figuras extrañas observándote. Asustado, tratas de darte la vuelta y huir, pero es demasiado tarde. Te tenían rodeado. Uno de ellos te agarra por el cuello y te estrangula. Antes de morir ves que en su muñeca tiene tatuado un trébol");
                            mensaje_perdedor2();
                            System.out.println("================================================================================================");
                        }
                    }

                }
                else if (opcion == 2) {
                    System.out.println("Antes de dirigirte a la cabaña, exploras los alrededores. Hay un montón de pieles de conejo apiladas en un tocón y hay varios árboles marcados con un trébol. Al revisar uno de ellos encuentras un hacha oxidada ");
                    sonido_pasos_arbol();
                    System.out.println("================================================================================================");
                    System.out.println("¿Decides coger el hacha?");
                    System.out.println("1. Si ✅");
                    System.out.println("2. No 🔴");
                    System.out.println("================================================================================================");
                    System.out.print("Tu respuesta es: ");
                    opcion = sc.nextInt();
                    while (opcion != 1 && opcion != 2) {
                        System.out.println("================================================================================================");
                        System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                        System.out.println("Antes de dirigirte a la cabaña, exploras los alrededores. Hay un montón de pieles de conejo apiladas en un tocón y hay varios árboles marcados con un trébol. Al revisar uno de ellos encuentras un hacha oxidada ");
                        System.out.println("¿Decides coger el hacha?");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        opcion = sc.nextInt();
                    }
                    if (opcion == 1) {
                        hacha = true;
                        System.out.println("================================================================================================");
                        System.out.println("Pesa demasiado pero te sientes menos indefenso, al acercarte a la cabaña ves una entrada exterior al sótano pero está tapiada por maderas con clavos");
                        recoger_hacha();
                        System.out.println("================================================================================================");
                        System.out.println("¿Decides romperlas con el hacha? ");
                        System.out.println("1. Si ✅");
                        System.out.println("2. No 🔴");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion = sc.nextInt();
                        while (opcion != 1 && opcion != 2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Pesa demasiado pero te sientes menos indefenso, al acercarte a la cabaña ves una entrada exterior al sótano pero está tapiada por maderas con clavos");
                            System.out.println("¿decides romperlas con el hacha? ");
                            System.out.println("1. Si ✅");
                            System.out.println("2. No 🔴");
                            opcion = sc.nextInt();
                        }
                        if (opcion == 1) {
                            System.out.println("================================================================================================");
                            System.out.println("Al romper la madera haces un ruido tremendo y sientes como alguien dentro de la casa, comienza a correr por ella. Debido a la situación, sin pensarlo, corres escaleras arriba y atacas a alguien idéntico a ti.  Sientes una fuerte presión en el pecho y acabas muriendo sobre tu propio cadáver");
                            romper_madera();
                            mensaje_perdedor();
                            System.out.println("================================================================================================");

                        }else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Decides no hacerlo, piensas que es mejor idea tratar de buscar ayuda de manera pacífica.  Tocas la puerta principal de la cabaña y esperas a que alguien te abra.  Una persona de tu misma altura, tapado por una manta y equipado con una escopeta te pide que te identifiques. Le comentas tu situación y rápidamente te abre la puerta para que pases.  Juntos compartís vuestra experiencia y decidís tomar una decisión");
                            golpes_puerta();
                            System.out.println("================================================================================================");
                            System.out.println("1. Pasar la noche en la cabaña 🌙➡️☀️");
                            System.out.println("2. Salir de noche 🌙🚶🏼‍♂️‍➡️");
                            System.out.println("================================================================================================");
                            System.out.print("Tu respuesta es: ");
                            opcion = sc.nextInt();
                            while (opcion != 1 && opcion != 2) {
                                System.out.println("================================================================================================");
                                System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                                System.out.println("Decides no hacerlo, piensas que es mejor idea tratar de buscar ayuda de manera pacífica.  Tocas la puerta principal de la cabaña y esperas a que alguien te abra.  Una persona de tu misma altura, tapado por una manta y equipado con una escopeta te pide que te identifiques. Le comentas tu situación y rápidamente te abre la puerta para que pases.  Juntos compartís vuestra experiencia y decidís tomar una decisión");
                                System.out.println("1. Pasar la noche en la cabaña 🌙➡️☀️");
                                System.out.println("2. Salir de noche 🌙🚶🏼‍♂️‍➡️");
                                opcion = sc.nextInt();
                            }
                            if (opcion == 1) {
                                System.out.println("================================================================================================");
                                System.out.println("Pasáis la noche en vela, no podéis dormir, no entendéis cómo es posible que todo esto haya ocurrido. Empezáis a dudar el uno de otro. Os enfrentáis por ver quien es el verdadero tú");
                                System.out.println("¿Quién eres tu realmente? ¿De verdad vas a creerle? ¿A lo mejor tú también mientes?");
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                            else if (opcion == 2) {
                                System.out.println("================================================================================================");
                                System.out.println("Salís rápidamente de la cabaña, y al ir a ciegas tropiezas contra un árbol. Se te cae el hacha al suelo y antes de agacharte a cogerla. Tu compañero la recoge del suelo y te dice: “yo voy mejor preparado que tú, este no es tu camino” Ves que ya no es como tú, en sus ojos ves el símbolo del trébol. Te ha matado a sangre fría");
                                mensaje_perdedor2();
                                System.out.println("================================================================================================");
                            }
                        }
                    } else if (opcion == 2) {
                        maza = true;
                        System.out.println("================================================================================================");
                        System.out.println("Al estar oxidada es muy probable que se rompa al usarla así que decides ir camino a la cabaña y sin querer tropiezas con una maza que no habías visto así que decides cogerla e ir a la cabaña. Escuchas ruido dentro y parece aproximarse a dónde estás tu ");
                        recoger_hacha();
                        System.out.println("================================================================================================");
                        System.out.println("Le echas valor y decides ponerte en guardia ¿Qué harás?");
                        System.out.println("1. Golpear antes de aproximarse");
                        System.out.println("2. Esperar a que se aproxime");
                        System.out.println("================================================================================================");
                        System.out.print("Tu respuesta es: ");
                        opcion = sc.nextInt();
                        if (opcion == 1) {
                            System.out.println("================================================================================================");
                            System.out.println("Sin pensarlo dos veces, asestas un golpe certero contra una persona que cae redonda contra el suelo. Tus manos están manchadas de sangre, la maza se ha partido por el golpe y en la parte alta del mango reconoces el símbolo de un trébol. La persona que tienes a tus pies eres tu mismo, no entiendes cómo es posible. Sientes una presión en el corazón y acabas muriendo");
                            golpe_maza();
                            mensaje_perdedor();
                            System.out.println("================================================================================================");

                        }else if (opcion == 2) {
                            System.out.println("================================================================================================");
                            System.out.println("Esperas y de pronto ves el cañón de una escopeta a través de una ventana. Ves todo negro, no queda nada de ti, solo sientes que te has equivocado. Antes de quedarte sumido en el profundo vacío de la muerte, tienes una visión. Ves un símbolo de un trébol que está en varios lugares distintos. Escuchas ecos de tu propia de voz diciéndote que lo intentes una vez más");
                            disparo_escopeta();
                            mensaje_perdedor();
                            System.out.println("================================================================================================");
                        }
                        while (opcion !=1 && opcion !=2) {
                            System.out.println("================================================================================================");
                            System.out.println("🔁 Estás obligado a escoger. ¡No tienes escapatoria! 🔁");
                            System.out.println("Al estar oxidada es muy probable que se rompa al usarla así que decides ir camino a la cabaña y sin querer tropiezas con una maza que no habías visto así que decides cogerla e ir a la cabaña. Escuchas ruido dentro y parece aproximarse a dónde estás tu ");
                            System.out.println("Le echas valor y decides ponerte en guardia ¿Qué harás?");
                            System.out.println("1. Golpear antes de aproximarse");
                            System.out.println("2. Esperar  a que se aproxime");
                            opcion = sc.nextInt();
                        }
                    }
                }
            }
        }
    }
    public static void mensaje_ganador() {
        try{
            Thread.sleep(7000);
        }catch(InterruptedException e){
            System.out.println("Tiempo de espera fallido");
        }
        System.out.println("\n");
        System.out.println("   ___ ___  _  _  ___  ___    _ _____ _   _ _      _ _____ ___ ___  _  _ ___ ");
        System.out.println("  / __/ _ \\| \\| |/ __|| _ \\  /_\\_   _| | | | |    /_\\_   _|_ _/ _ \\| \\| / __|");
        System.out.println(" | (_| (_) | .` | (_ ||   / / _ \\| | | |_| | |__ / _ \\| |  | | (_) | .` \\__ \\");
        System.out.println("  \\___\\___/|_|\\_|\\___||_|_\\/_/ \\_\\_|  \\___/|____/_/ \\_\\_| |___\\___/|_|\\_|___/");
        System.out.println("\n           🥳 ¡HAS TOMADO LA DECISIÓN CORRECTA! 🥳");
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\victoria.wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);
            System.exit(0);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public void mensaje_perdedor(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("El tiempo de espera fallo");
        }
        System.out.println("\n");
        System.out.println("   ____    _    __  __ _____    _____     _______ ____  ");
        System.out.println("  / ___|  / \\  |  \\/  | ____|  / _ \\ \\   / / ____|  _ \\ ");
        System.out.println(" | |  _  / _ \\ | |\\/| |  _|   | | | \\ \\ / /|  _| | |_) |");
        System.out.println(" | |_| |/ ___ \\| |  | | |___  | |_| |\\ V / | |___|  _ < ");
        System.out.println("  \\____/_/   \\_\\_|  |_|_____|  \\___/  \\_/  |_____|_| \\_\\");
        System.out.println("\n=======================💀 Tu historia termina aquí 💀=======================\n");

    }
    public void mensaje_perdedor2(){
        try {
            Thread.sleep(7000);
        }catch (InterruptedException e){
            System.out.println("Tiempo de espera fallido");
        }
        System.out.println("\n");
        System.out.println("   ____    _    __  __ _____    _____     _______ ____  ");
        System.out.println("  / ___|  / \\  |  \\/  | ____|  / _ \\ \\   / / ____|  _ \\ ");
        System.out.println(" | |  _  / _ \\ | |\\/| |  _|   | | | \\ \\ / /|  _| | |_) |");
        System.out.println(" | |_| |/ ___ \\| |  | | |___  | |_| |\\ V / | |___|  _ < ");
        System.out.println("  \\____/_/   \\_\\_|  |_|_____|  \\___/  \\_/  |_____|_| \\_\\");
        System.out.println("\n=======================💀 Tu historia termina aquí 💀=======================\n");
        System.out.println("En tus manos esta, decides reiniciar el juego o por el contrario decides abandonarlo");
        System.out.println("1. Reiniciar el juego 🔁");
        System.out.println("2. Abandonar el juego ❌");
        int decision = sc.nextInt();
        while (decision != 1 && decision != 2) {
            System.out.println("================================================================================================");
            System.out.println("🔁 Estas obligado a escoger. ¡No tienes escapatoria! 🔁");
            System.out.println("En tus manos esta, decides reiniciar el juego o por el contrario decides abandonarlo");
            System.out.println("1. Reiniciar el juego 🔁");
            System.out.println("2. Abandonar el juego ❌");
            decision = sc.nextInt();
        }
        if (decision == 1) {
            System.out.println("Reiniciando el juego, tomaste una buena decisión");
        }else if (decision == 2) {
            System.out.println("Te dije que no podías matarme,"+nombre+", pero no te dije por qué, y la respuesta es simple");
            try {
                // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
                String ruta = "Sonidos\\081790_quotgame-overquot-evil-88883 (mp3cut.net).wav";

                AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

                // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
                Clip clipArbol = AudioSystem.getClip();

                // Abrir el audio antes de darle a start
                clipArbol.open(audio);
                clipArbol.start();

                //Pausar programa hasta que terine el audio
                long duracionMicrosegundos = clipArbol.getMicrosecondLength();
                long duracionMilisegundos = duracionMicrosegundos / 1000;
                Thread.sleep(duracionMilisegundos + 100);

            } catch (Exception e) {
                System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
                e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
            }
            System.exit(0);
        }
    }
    public static void inventario(){
        System.out.println("Hola, "+nombre+" Este es el inventario de tu partida actual:");
        System.out.println("================================================================================================");
        if (linterna == true){
            System.out.println("- Linterna 🔦, recuerda lo que pasó cuando decidiste cogerlas ☘️");
        }
        if (hacha == true){
            System.out.println("- Hacha 🪓, recuerda lo que pasó cuando decidiste cogerlas ☘️");
        }
        if (maza == true){
            System.out.println("- Maza 🔨, recuerda lo que pasó cuando decidiste cogerlas ☘️");
        }
        if (llaves == true){
            System.out.println("- Llaves 🗝️, recuerda lo que pasó cuando decidiste cogerlas ☘️");
        }
        if (linterna == false && hacha == false && maza == false && llaves == false){
            System.out.println("Tu inventario por el momento esta vacio 👜");
        }
        System.out.println("================================================================================================");
    }
    public static void iniciar_musica_juego() {
        try {
            // --- PARTE 1: MÚSICA DE FONDO ---
            System.out.println("Intentando cargar música de fondo...");
            String ruta = "Sonidos\\Sonidos-en-un-Cementerio-de-noche-_1HH3pTx9tek_.wav";

            File archivoFondo = new File(ruta);
            if(archivoFondo.exists()){
                AudioInputStream audio = AudioSystem.getAudioInputStream(archivoFondo);
                musicaMenu = AudioSystem.getClip();
                musicaMenu.open(audio);
                musicaMenu.loop(Clip.LOOP_CONTINUOUSLY);
                musicaMenu.start();
            } else {
                System.out.println("❌ ERROR: No encuentro el archivo de fondo: " + ruta);
            }

            // --- PARTE 2: EL SONIDO DEL CUERVO CADA 5 SEGUNDOS ---

            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

            scheduler.scheduleAtFixedRate(() -> {
                try {
                    String rutaSonidoExtra = "Sonidos\\raven-call-72946 (mp3cut.net).wav";
                    File archivoExtra = new File(rutaSonidoExtra);

                    if (archivoExtra.exists()) {
                        AudioInputStream audioExtra = AudioSystem.getAudioInputStream(archivoExtra);
                        Clip clipExtra = AudioSystem.getClip();
                        clipExtra.open(audioExtra);

                        // 1. Iniciamos el sonido
                        clipExtra.start();

                        // 2. ¡IMPORTANTE! Esperamos a que termine de sonar antes de matar este hilo
                        // Si no hacemos esto, Java puede cortar el sonido a medias.
                        long duracionMicrosegundos = clipExtra.getMicrosecondLength();
                        long duracionMilisegundos = duracionMicrosegundos / 1000;

                        Thread.sleep(duracionMilisegundos + 100); // Esperamos lo que dura el audio

                        // 3. Cerramos el clip para liberar memoria
                        clipExtra.close();
                        audioExtra.close();

                    } else {
                        System.out.println("❌ ERROR: No encuentro el sonido del cuervo: " + rutaSonidoExtra);
                    }
                } catch (Exception e) {
                    System.out.println("Error en el sonido extra: " + e.getMessage());
                    e.printStackTrace();
                }
            }, 0, 8, TimeUnit.SECONDS); // 0 espera inicial, repite cada 8 seg

        } catch (Exception e) {
            System.out.println("No se pudo cargar la música de fondo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void sonido_pasos_arbol() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\going-on-a-forest-road-gravel-and-grass-6404 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void subir_arbol() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\climbingdownfromtree-97783 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            //  Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu, para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void sonido_llaves() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\tintineo-de-llaves-333884 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void jaula_rota() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\hit-cage-45988 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void sonido_murmullos() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\murmullos-7133 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void huir_corriendo() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\running-in-the-woods-65579 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void conejo_comiendo() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\a-rabbit-is-eating-a-cucumber-28700 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void puerta_abierta() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\opening-door-411632 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void puerta_armario() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\cabinet-door-close-47724 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void disparo_escopeta() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\shotgun-sounds-6464 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void ventana_abriendo() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\window-open-89994 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void linterna_encendida() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\flashlight-clicking-on-and-off-71252 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void chirrido_puerta() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\chirrido-de-puerta-335976 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void recoger_hacha() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\sword-pick-up-and-throw-45573 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void romper_madera() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\chopping_small_wood_pieces-27536 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void golpes_puerta() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\door-knock-291150 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void golpe_maza() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\hammer-smash-effect-382731 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
    public static void pasar_noche() {
        try {
            // CORRECCIÓN 1: Quitamos las comillas dobles escapadas (\") que sobraban dentro de la ruta
            String ruta = "Sonidos\\fire-crackling-sounds-427410 (mp3cut.net).wav";

            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));

            // CORRECCIÓN 2: Usamos una variable nueva (clipArbol) en lugar de 'musicaMenu', para no cortar la música de fondo si estuviera sonando.
            Clip clipArbol = AudioSystem.getClip();

            // Abrir el audio antes de darle a start
            clipArbol.open(audio);
            clipArbol.start();

            //Pausar programa hasta que terine el audio
            long duracionMicrosegundos = clipArbol.getMicrosecondLength();
            long duracionMilisegundos = duracionMicrosegundos / 1000;
            Thread.sleep(duracionMilisegundos + 100);

        } catch (Exception e) {
            System.out.println("No se pudo cargar el sonido del árbol: " + e.getMessage());
            e.printStackTrace(); // Esto te ayudará a ver el error exacto en la consola si falla
        }
    }
}
