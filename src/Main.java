
public class main {
    public static void mostrarMenuPrincipal() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Casteo");
        System.out.println("2. Operadores de Asignacion");
        System.out.println("3. Operadores de Incremento y Decremento");
        System.out.println("4. Ejercicios Combinados");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void mostrarSubmenuCasteo() {
        System.out.println("----- CASTEO -----");
        System.out.println("1. Ejercicio");
        System.out.println("2. Ejercicio");
        System.out.println("3. Ejercicio");
        System.out.println("4. Ejercicio");
        System.out.println("5. Ejercicio");
        System.out.println("6. Ejercicio");
        System.out.println("7. Ejercicio");
        System.out.println("8. Ejercicio");
        System.out.println("9. Ejercicio");
        System.out.println("10. Ejercicio");
        System.out.println("11. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
    }
    public static void mostrarSubmenuAsignacion() {
        System.out.println("----- CASTEO -----");
        System.out.println("1. Ejercicio");
        System.out.println("2. Ejercicio");
        System.out.println("3. Ejercicio");
        System.out.println("4. Ejercicio");
        System.out.println("5. Ejercicio");
        System.out.println("6. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
    }

    public static void mostrarSubmenuID() {
        System.out.println("----- CASTEO -----");
        System.out.println("1. Ejercicio");
        System.out.println("2. Ejercicio");
        System.out.println("3. Ejercicio");
        System.out.println("4. Ejercicio");
        System.out.println("5. Ejercicio");
        System.out.println("6. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
    }

    public static void mostrarSubmenuCombinados() {
        System.out.println("----- CASTEO -----");
        System.out.println("1. Ejercicio");
        System.out.println("2. Ejercicio");
        System.out.println("3. Ejercicio");
        System.out.println("4. Ejercicio");
        System.out.println("5. Ejercicio");
        System.out.println("6. Ejercicio");
        System.out.println("7. Ejercicio");
        System.out.println("8. Ejercicio");
        System.out.println("9. Ejercicio");
        System.out.println("10. Ejercicio");
        System.out.println("11. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
    }
}
// CASTEO
// 1.¿Cuál será el resultado de la siguiente operación?
public static void casteo1() {
    int x = (int) 5.89 + (int) 3.45;
    System.out.println("El resultado es: " + x);
}


//2.  Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
public static void casteo2() {
    char myChar = 'A';
    int myInt = (int) myChar;
    System.out.println(myInt);
}
// El resultado sera 65 (ASCII de 'A')


// 3. ¿Qué valor se imprimirá?
public static void casteo3() {
    double d = 100.04;
    long l = (long) d;
    int i = (int) l;
    System.out.println(i);
}
// El resultado es 100

// 4. Escribe código para convertir un String que contiene un número a un int.
public static void casteo4() {
    char myChar = 'E';
    int myInt = (int) myChar;
    System.out.println(myInt);
}
// El resultado es 69

// 5. ¿Cuál es el resultado de (int) (char) (byte) -1?
public static void casteo5(){
    int result = (int) (char) (byte) -1;
    System.out.println("Resultado: " + result);
    {
        //El resultado es 65535

        // 6. Convierte el número 65 a un char. ¿Qué carácter obtienes
        public static void casteo6() {
        int myInt = 65;
        char myChar = (char) myInt;
        System.out.println(myChar);
    }
        // El resultado es A

        // 7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?
        public static void casteo7() {
        long c = 180;
        int z = (int) c;
        System.out.println(z);
    }
        //El resultado es 180

        //8. Escribe código para convertir un float a un String.
        public static void casteo8() {
        float v = 17;
        String m = "" + v;
        System.out.println(m);
    }
        // El resultado es 17.0

        // 9. ¿Cuál es el resultado de (int) Math.round(3.7)?
        public static void casteo9() {
        int resultado = (int) Math.round(3.7);
        System.out.println(resultado);
    }// El resultado es 4

        //10. Dado byte b = 50;, ¿cómo lo convertirías a short?
        public static void casteo10() {
        byte b = 50;
        short s = (short) b;
        System.out.println(s);
    } // El resultado es 50
// FIN CASTEO

        //OPERADORES DE ASIGNACION
        // 1. ¿Cuál es el valor de x después de la siguiente operación?
        //int x = 10; x += 5;
        public static void asignacion1() {
        int x = 10;
        x += 5;
        System.out.println(x);
    } // El resultado es 15

        // 2. Simplifica la siguiente expresión usando un operador de asignación compuesta:
        //y = y * (x + 5);

        public static void asignacion2() {
        int x = 0;
        int y = 20;
        y *= (x + 5);
        System.out.println(y);
    }//El resultado es 100

        // 3. ¿Cuál es el valor de a después de estas operaciones?
        //int a = 15; a %= 4;
        public static void asignacion3() {
        int a = 15;
        a %= 4;
        System.out.println(a);
    } // El resultado es 3

        // 4. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.
        public static void asignacion4() {
        int x = 4;
        int y = 2;
        x += y;
        System.out.println(x);
    }// El resultado es 6

        // 5. Qué hace la siguiente operación? x ^= 2;
        public static void asignacion5() {
        int x = 1;
        x ^= 2;
        System.out.println(x);
    } // El resultado es 3

        //FIN OPERACIONES ASIGNACION


        //OPERADORES DE INCREMENTO Y DECREMENTO

        //1. ¿Cuál es el valor de x e y después de estas operaciones?
        //int x = 5; int y = ++x;

        public static void incrementoDecremento1() {
        int x = 5;
        System.out.println(x);
        int y = ++x;
        System.out.println(y);
    }//El resultado es 5 y 6

        // 2. ¿Qué se imprimirá en la consola?
        //int a = 5; System.out.println(a++); System.out.println(a);

        public static void incrementoDecremento2() {
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }// El resultado es 5 y 6

        // 3.scribe código que use el operador de decremento para disminuir una variable count en 1.
        public static void incrementoDecremento3() {
        int count = 20;
        count--;
        System.out.println(count);
    }  //El resultado es 19

        // 4. ¿Cuál es la diferencia entre ++i y i++?
        public static void incrementoDecremento4() {
        int i = 5;
        i++;
        System.out.println(i);
    }// El resultado es 6

        // 5. ¿Qué valor tendrá x después de esta operación?
        public static void incrementoDecremento5() {
        int x = 3;
        x++;
        System.out.println(x);
    }//El resultado es 4
        //FIN OPERADORES DE INCREMENTO Y DECREMENTO

        //EJERCICIOS COMBINADOS

        //Ejercicio 1
        public static void combinados1() {
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println(i);
    }// El resultado es 25

        //Ejercicio 2
        public static void combinados2() {
        double myDouble = 6.5;
        int myInt = (int) myDouble;
        System.out.println(myInt);
        System.out.println(++myInt);
    }//El resultado es 6 y 7


        // Ejercicio 3
        public static void combinados3() {
        double d = 5.7;
        int i = (int) d;
        i *= 2;
        System.out.println(i--);
    }//El resultado es 10

        // Ejercicio 4
        public static void combinados4() {
        int i = 10;
        double d = i;
        d /= 2.0;
        System.out.println(d);
    } //El resultado es 5.0

        //Ejercicio 5
        public static void combinados5() {
            char c = 'X';
        c += 32;
        System.out.println(c);
        } //El resultado es X

        //Ejercicio 6
        public static void combinados6() {
        long l = 12345L;
        short s = (short) l;
        s *= 3;
        System.out.println(s);
    }// El resultado es -28501

        //Ejercicio 7
        public static void combinados7() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println("El resultado es: " + x);
    }//El resultado es 32

        //Ejercicio 8
        public static void combinados8() {
        float f = 10.5f;
        byte b = (byte) f;
        b = (byte) (--b);
        System.out.println("El resultado es: " + b);
    } //El resultado es 9

        //Ejercicio 9
        public static void combinados9() {
        int i = 257;
        byte b = (byte) i;
        System.out.println("El resultado es: " + b);
    } //El resultado es 1

        //Ejercicio 10
        public static void combinados10() { double d = 7.8;
        int i = (int) d;
        i += 5;
        i++;
        System.out.println("El resultado es: " + i);}
        //El resultado es 13
    }

}