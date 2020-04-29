import edu.ujcv.progra1.LectorTeclado;
import edu.ujcv.progra1.alumnos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.*;

import static edu.ujcv.progra1.NombresAleatorios.*;

public class Main {
    alumnos estudiantes = new alumnos;

    public static void main(String[] args) {

        LectorTeclado lc = LectorTeclado.getInstance();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        alumnos a = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos b = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos c = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        alumnos d = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio());
        ArrayList<Boolean> notasA = new ArrayList<Boolean>();
        ArrayList<alumnos> ClaseA = new ArrayList<alumnos>();
        ArrayList<alumnos> ClaseB = new ArrayList<alumnos>();
        ArrayList<Boolean> notasB = new ArrayList<Boolean>();
        ArrayList<alumnos> ClaseC = new ArrayList<alumnos>();
        ClaseA.add(a);
        ClaseA.add(b);
        ClaseA.add(c);
        ClaseA.add(d);
        int nota = (int) (r.nextDouble() * 100);
        if (nota <= 70) {
            notasA.add(Boolean.TRUE);
        } else {
            notasA.add(Boolean.FALSE);
        }
        ArrayList<alumnos> alumnosGenerados = new ArrayList<alumnos>();
        ArrayList<alumnos> alumnosExpulsados = new ArrayList<alumnos>();
        ArrayList<alumnos> alumnosEgresados = new ArrayList<alumnos>();
        alumnos a = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos b = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos c = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnos d = new alumnos(generarNombreAleatorio(), generarApellidoAleatorio(),generarNumCuenta());
        alumnosGenerados.add(a);
        alumnosGenerados.add(b);
        alumnosGenerados.add(c);
        alumnosGenerados.add(d);
        ArrayList<alumnos> ClaseA = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseB = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseC = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseD = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseE = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseG = new ArrayList<alumnos>(10);
        ArrayList<alumnos> ClaseF = new ArrayList<alumnos>(10);
        int contPasos = 0;

        Menu M = new Menu();
        boolean salir = false;
        while (salir == false)
        {
            M.menuPrincipal();
            try {
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        if (contPasos == 0) {
                            contPasos++;
                            for (int i = 0; i < alumnosGenerados.size(); i++) {
                                ClaseA.add(alumnosGenerados.get(i));
                                ClaseC.add(alumnosGenerados.get(i));
                            }
                            System.out.println("CLASE A");
                            for (int i = 0; i < ClaseA.size(); i++) {
                                System.out.println(ClaseA.get(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseA.get(i).setEvaluacionA(true);
                                    System.out.println("APROBADO");
                                    ClaseA.get(i).parcial();
                                } else {
                                    ClaseA.get(i).setEvaluacionA(false);
                                    ClaseA.get(i).reprobar();
                                    ClaseA.get(i).parcial();
                                    System.out.println("REPROBADO");
                                }
                                if (ClaseA.get(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(ClaseA.get(i));
                                    ClaseA.remove(i);
                                    i--;
                                }

                            }
                            System.out.println("CLASE C");
                            for (int i = 0; i < ClaseC.size(); i++) {
                                System.out.println(ClaseC.get(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseC.get(i).setEvaluacionC(true);
                                    ClaseC.get(i).parcial();
                                    System.out.println("APROBADDO");
                                } else {
                                    ClaseC.get(i).setEvaluacionC(false);
                                    ClaseC.get(i).parcial();
                                    System.out.println("REPROBADO");
                                }
                                if (ClaseC.get(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(ClaseC.get(i));
                                    ClaseC.remove(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < alumnosGenerados.size(); i++){
                                if (alumnosGenerados.get(i).getEvaluacionA() && alumnosGenerados.get(i).getEvaluacionC() == true) {
                                    ClaseD.add(alumnosGenerados.get(i));
                                }
                            }
                            break;
                        }
                        if (contPasos == 1)
                        {
                            contPasos++;
                            System.out.println("CLASE A");
                            for (int i = 0; i < ClaseA.size(); i++) {
                                System.out.println(ClaseA.get(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseA.get(i).setEvaluacionA(true);
                                    System.out.println("APROBADO");
                                    ClaseA.get(i).parcial();
                                } else {
                                    ClaseA.get(i).setEvaluacionA(false);
                                    ClaseA.get(i).reprobar();
                                    ClaseA.get(i).parcial();
                                    System.out.println("REPROBADO");
                                }
                                if (ClaseA.get(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(ClaseA.get(i));
                                    ClaseA.remove(i);
                                    i--;
                                }

                            }
                            System.out.println("CLASE C");
                            for (int i = 0; i < ClaseC.size(); i++) {
                                System.out.println(ClaseC.get(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseC.get(i).setEvaluacionC(true);
                                    ClaseC.get(i).parcial();
                                    System.out.println("APROBADDO");
                                } else {
                                    ClaseC.get(i).setEvaluacionC(false);
                                    ClaseC.get(i).parcial();
                                    System.out.println("REPROBADO");
                                }
                                if (ClaseC.get(i).getContReprobadas() > 2) {
                                    alumnosExpulsados.add(ClaseC.get(i));
                                    ClaseC.remove(i);
                                    i--;
                                }
                            }

                            for (int i = 0; i < ClaseD.size(); i++) {
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseD.get(i).setEvaluacionD(true);
                                    ClaseD.get(i).parcial();
                                } else {
                                    ClaseD.get(i).parcial();
                                    ClaseD.get(i).setEvaluacionD(false);
                                }
                            }
                            System.out.println("CLASE D");
                            for (int i = 0; i < ClaseD.size(); i++) {
                                System.out.println(ClaseD.get(i));
                            }
                            for (int i = 0; i < ClaseA.size(); i++) {
                                if (ClaseA.get(i).getEvaluacionA() == true) {
                                    ClaseB.add(ClaseA.get(i));
                                    ClaseA.remove(i);
                                    i--;
                                }

                            }
                            System.out.println("CLASE B");
                            for (int i = 0; i < ClaseB.size(); i++) {
                                System.out.println(ClaseB.get(i));
                                int nota = (int) (r.nextDouble() * 100);
                                if (nota <= 70) {
                                    ClaseB.get(i).setEvaluacionB(true);
                                    ClaseB.get(i).parcial();
                                } else {
                                    ClaseB.get(i).setEvaluacionB(false);
                                    ClaseB.get(i).parcial();
                                }
                            }
                            for (int i = 0; i < ClaseB.size(); i++) {
                                if (ClaseB.get(i).getEvaluacionB() == true) {
                                    ClaseE.add(ClaseB.get(i));
                                    ClaseB.remove(i);
                                    i--;
                                }
                            }
                            for (int i = 0; i < ClaseD.size(); i++) {
                                if (ClaseD.get(i).getEvaluacionD() == true) {
                                    ClaseF.add(ClaseD.get(i));
                                    ClaseD.remove(i);
                                    i--;
                                }
                            }
                            break;
                        }
                        if (contPasos == 2) {
                            contPasos++;
                            for (int i = 0; i <alumnosGenerados.size();i++){
                                if (alumnosGenerados.get(i).getEvaluacionE() && alumnosGenerados.get(i).getEvaluacionF() == true){
                                    ClaseG.add(alumnosGenerados.get(i));

                                }
                            }
                        }
                        break;
                    case 2:
                        M.alumnos();
                        int opcion2 = sc.nextInt();
                        switch (opcion2) {
                            case 1:
                                for (int i = 0; i < alumnosGenerados.size(); i++) {
                                    System.out.println(alumnosGenerados.get(i));
                                }
                                break;
                            case 2:
                                for (int i = 0; i < alumnosExpulsados.size(); i++) {
                                    System.out.println(alumnosExpulsados.get(i));
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                salir = true;
                                break;
                        }
                        break;
                    case 3:
                        boolean salir3 = false;
                        while (!salir3) {
                            M.consultarClase();
                            try {
                                int opcion3 = sc.nextInt();
                                switch (opcion3) {
                                    case 1:
                                        if (ClaseA.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseA.size(); i++) {
                                                System.out.println(ClaseA.get(i));
                                            }
                                        }
                                        break;

                                    case 2:
                                        if (ClaseB.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseB.size(); i++) {
                                                System.out.println(ClaseB.get(i));
                                            }
                                        }
                                        break;

                                    case 3:
                                        if (ClaseC.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseC.size(); i++) {
                                                System.out.println(ClaseC.get(i));
                                            }
                                        }
                                        break;

                                    case 4:
                                        if (ClaseD.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseD.size(); i++) {
                                                System.out.println(ClaseD.get(i));
                                            }
                                        }
                                        break;

                                    case 5:
                                        if (ClaseE.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseE.size(); i++) {
                                                System.out.println(ClaseE.get(i));
                                            }
                                        }
                                        break;

                                    case 6:
                                        if (ClaseF.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseF.size(); i++) {
                                                System.out.println(ClaseF.get(i));
                                            }
                                        }
                                        break;

                                    case 7:
                                        if (ClaseG.size() == 0) {
                                            System.out.println("No hay alumnos en esta clase");
                                        } else {
                                            for (int i = 0; i < ClaseG.size(); i++) {
                                                System.out.println(ClaseG.get(i));
                                            }
                                        }
                                        break;

                                    case 8:
                                        salir3 = true;
                                        break;
                                    default:
                                        System.out.println("Ingrese un numero rapido");
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Ingresaa un numero valido");
                            }
                        }
                        break;
                    case 4:
                        M.evaluacionTernas();
                        try {
                            int opcion4 = sc.nextInt();
                            switch (opcion4)
                            {
                                case 1:
                                    for (int i = 0; i < ClaseG.size();i++){
                                        System.out.println("Alumno " + i + ":");
                                        System.out.println(ClaseG.get(i));
                                        System.out.println("1) Aprobar \n 2)Reprobar");
                                        int calificacion = (int) lc.obtenerEnteroValidado("Debes insertar un numero");
                                        if (calificacion == 1){
                                            ClaseG.get(i).setEvaluacionG(true);
                                            ClaseG.get(i).parcial();
                                        }if (calificacion == 2){
                                            ClaseG.get(i).setEvaluacionG(false);
                                            ClaseG.get(i).reprobar();
                                            ClaseG.get(i).parcial();
                                        }else{
                                            System.out.println("Debe ser 1 o 2");
                                        }
                                    }
                                    break;

                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Ingresa un numero valido");
                        }

                    case 5:
                        salir = true;
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido");
                sc.next();
            }

        }
    }
}
