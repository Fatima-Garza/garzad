public class  tarea3 {
    public static void main(String[] args) {
        int valor1=0;
        int valor2=0;
        int valor3=1;
        do {
                valor1 =valor3;
                valor2= valor3;
                valor3= valor1+valor2;
                System.out.println(valor3);

        } while (valor3 < 100);
        

    }
}
