public class solve {
    public static void main(String[] args) {
// CASTEO
        // 1.¿Cuál será el resultado de la siguiente operación?
       /* int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
        // El resultado es 8

        double z = (double) 5.89 + (double) 3.45;
        System.out.println(z);
        */
        // El resultado es 9.34


        //2.  Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
        /*char myChar = 'A';
        int myInt = (int) myChar;
        System.out.println(myInt);
         */
        // El resultado sera 65 (ASCII de 'A')


        // 3. ¿Qué valor se imprimirá?
       /* double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
        */
        // El resultado es 100

        // 4. Escribe código para convertir un String que contiene un número a un int.
      /* char myChar = 'E';
        int myInt = (int) myChar;
        System.out.println(myInt);
        // El resultado es 69
       */

        // 5. ¿Cuál es el resultado de (int) (char) (byte) -1?
        /*int result = (int) (char) (byte) -1;
        System.out.println("Resultado: " + result);
         */
        //El resultado es 65535

        // 6. Convierte el número 65 a un char. ¿Qué carácter obtienes?
       /* int myInt = 65;
        char myChar = (char) myInt;
        System.out.println(myChar);
        */
        // El resultado es A

        // 7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?
        /*long c = 180;
        int z = (int)c;
        System.out.println(z);
         */
        //El resultado es 180

        //8. Escribe código para convertir un float a un String.
        /*float v = 17;
        String m = "" + v;
        System.out.println(m);
        */
        // El resultado es 17.0

        // 9. ¿Cuál es el resultado de (int) Math.round(3.7)?
        /*int resultado = (int) Math.round(3.7);
        System.out.println(resultado);
         */
        // El resultado es 4

        //10. Dado byte b = 50;, ¿cómo lo convertirías a short?
       /* byte b = 50;
        short s = (short) b;
        System.out.println(s);
         */
        // El resultado es 50
// FIN CASTEO

        //OPERADORES DE ASIGNACION
        // 1. ¿Cuál es el valor de x después de la siguiente operación?
        //int x = 10; x += 5;

       /* int x = 10; x += 5;
        System.out.println(x);
        */
        // El resultado es 15

        // 2. Simplifica la siguiente expresión usando un operador de asignación compuesta:
        //y = y * (x + 5);

       /* int x = 0;
        int y = 20;
        y *= (x + 5);
        System.out.println(y);
         */
        //El resultado es 100

        // 3. ¿Cuál es el valor de a después de estas operaciones?
        //int a = 15; a %= 4;
       /* int a = 15;
        a %= 4;
        System.out.println(a);
        */
        // El resultado es 3

        // 4. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.
       /* int x = 4;
        int y = 2;
        x+=y;
        System.out.println(x);
       */
        // El resultado es 6

        // 5. Qué hace la siguiente operación? x ^= 2;
        /*int x =1;
        x^=2;
        System.out.println(x);
        */
        // El resultado es 3

        //FIN OPERACIONES ASIGNACION


        //OPERADORES DE INCREMENTO Y DECREMENTO

        //1. ¿Cuál es el valor de x e y después de estas operaciones?
        //int x = 5; int y = ++x;

        /*int x = 5;
        System.out.println(x);
        int y = ++x;
        System.out.println(y);
         */
        //El resultado es 5 y 6

        // 2. ¿Qué se imprimirá en la consola?
        //int a = 5; System.out.println(a++); System.out.println(a);

       /* int a = 5;
        System.out.println(a++);
        System.out.println(a);
         */
        // El resultado es 5 y 6

        // 3.scribe código que use el operador de decremento para disminuir una variable count en 1.
        /*int count = 20;
        count --;
        System.out.println(count);
        */
        //El resultado es 19

        // 4. ¿Cuál es la diferencia entre ++i y i++?
        /*int i = 5;
        i++;
        System.out.println(i);
        */
        // El resultado es 6

        // 5. ¿Qué valor tendrá x después de esta operación?
        /*int x = 3;
         x++;
        System.out.println(x);
       */
        //El resultado es 4
        //FIN OPERADORES DE INCREMENTO Y DECREMENTO

        //EJERCICIOS COMBINADOS

        //Ejercicio 1
       /* int i = 5;
        i += ++i + i++ + ++i;
        System.out.println(i);
       */
        // El resultado es 25

        //Ejercicio 2
       /*double myDouble = 6.5;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        System.out.println(++myInt);
       */
        //El resultado es 6 y 7


        // Ejercicio 3
        /*double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
         */
        //El resultado es 10

        // Ejercicio 4
       /* int i = 10;
        double d = i;
        d /= 2.0;
        System.out.println(d);
        */
        //El resultado es 5.0

        //Ejercicio 5
        /*char c = 'X';
        c += 32;
        System.out.println(c);
        */
        //El resultado es X

        //Ejercicio 6
        long l = 12345L;
        short s = (short) l;
        s *= 3;
        System.out.println(s);
        // El resultado es -28501




























    }

}
