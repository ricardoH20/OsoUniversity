package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LectorTeclado Benito = LectorTeclado.getInstance();

        Menu Alma = new Menu();

        Alma.Camela();
        int option = Benito.obtenerEnteroValidado("Compa no sea Ricardo, ponga un numero");
        while(option!= 5){
            switch (option){
                case 1:                     System.out.println("Continuar aventura( siguiente parcial) ");
                    Alma.Camela();
                     option = Benito.obtenerEnteroValidado("Compa no sea Ricardo, ponga un numero");

                    break;

                case 2:                     System.out.println("2: Conocer chamacos ");
                    Alumnos marcela = new Alumnos();

                    marcela.generarNombresAleatorios();
                    for(int i = 0 ; i < 20 ; i++)
                        System.out.println(marcela.generarNombresAleatorios());
                    Alma.Camela();
                     option = Benito.obtenerEnteroValidado("Compa no sea Ricardo, ponga un numero");

                    break;

                case 3:                     System.out.println("3: Evaluacion de ternas(vive o muere) ");
                    Alma.Camela();
                     option = Benito.obtenerEnteroValidado("Compa no sea Ricardo, ponga un numero");

                    break;

                case 4:                     System.out.println(" 4: Consultar Clases");
                    Alma.Camela();
                     option = Benito.obtenerEnteroValidado("Compa no sea Ricardo, ponga un numero");

                    break;



                default:                     System.out.println("5:Bye ");

                    break;


            }

        }










/*        Alumnos marcela = new Alumnos();

        marcela.generarNombresAleatorios();
        for(int i = 0 ; i < 20 ; i++)
        System.out.println(marcela.generarNombresAleatorios());

 */





    }
}
