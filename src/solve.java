import java.util.Scanner;

public class solve {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu = 0;
        int opcionSubmenu = 0;
        boolean salir = false;

        while (!salir) {
            main.mostrarMenuPrincipal();
            opcionMenu = scanner.nextInt();
            boolean salirSubmenu = false;

            switch (opcionMenu) {
                case 1:
                    System.out.println("1. Casteo");


                    while (!salirSubmenu) {
                        main.mostrarSubmenuCasteo();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // ¿Cuál será el resultado de la siguiente operación?
                                solve.casteo1;
                                break;
                            case 2:
                                //2.  Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
                                casteo2();
                                break;
                            case 3:
                                // 3. ¿Qué valor se imprimirá?
                                casteo3();
                                break;
                            case 4:
                                // 4. Escribe código para convertir un String que contiene un número a un int.
                                casteo4();
                                break;
                            case 5:
                                // 5. ¿Cuál es el resultado de (int) (char) (byte) -1?
                                casteo5();
                                break;
                            case 6:
                                // 6. Convierte el número 65 a un char. ¿Qué carácter obtienes?
                                casteo6();
                                break;
                            case 7:
                                // 7. ¿Qué sucede si intentas asignar un long a un int sin casteo explícito?
                                casteo7();
                                break;
                            case 8:
                                //8. Escribe código para convertir un float a un String.
                                casteo8();
                                break;
                            case 9:
                                // 9. ¿Cuál es el resultado de (int) Math.round(3.7)?
                                casteo9();
                                break;
                            case 10:
                                //10. Dado byte b = 50;, ¿cómo lo convertirías a short?
                                casteo10();
                                break;
                            case 11:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("2. Operadores de Asignacion");

                    while (!salirSubmenu) {
                        mostrarSubmenuAsignacion();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // 1. ¿Cuál es el valor de x después de la siguiente operación?
                                int x = 10;
                                x += 5;
                                System.out.println(x);
                                break;
                            case 2:
                                // 2. Simplifica la siguiente expresión usando un operador de asignación compuesta:
                                //y = y (s + 5);
                                int s = 2;
                                int y = 25;
                                y *= (s + 5);
                                System.out.println(y);
                                break;
                            case 3:
                                // 3. ¿Cuál es el valor de a después de estas operaciones?
                                //int a = 15; a %= 4;
                                int a = 15;
                                a %= 4;
                                System.out.println(a);
                                break;
                            case 4:
                                // 4. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.
                                int h = 19;
                                int b = 17;
                                h+=b;
                                System.out.println(h);
                                break;
                            case 5:
                                // 5. Qué hace la siguiente operación? x ^= 2;
                                int m =5;
                                m^=2;
                                System.out.println(m);
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Operadores de Incremento y Decremento");

                    while (!salirSubmenu) {
                        mostrarSubmenuID();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                //1. ¿Cuál es el valor de x e y después de estas operaciones?
                                //int x = 5; int y = ++x;
                                int x = 5;
                                int y = ++x;
                                System.out.println(x);
                                System.out.println(y);
                                break;
                            case 2:
                                // 2. ¿Qué se imprimirá en la consola?
                                //int a = 5; System.out.println(a++); System.out.println(a);
                                int a = 5;
                                System.out.println(a++);
                                System.out.println(a);
                                break;
                            case 3:
                                // 3. Escribe código que use el operador de decremento para disminuir una variable count en 1.
                                int count = 3;
                                count--;
                                System.out.println(count);
                                break;
                            case 4:
                                // 4. ¿Cuál es la diferencia entre ++i y i++?
                                int i = 7;
                                ++i;
                                System.out.println("Operacion antes de usar el valor"+i);
                                int i2 = 7;
                                i2++;
                                System.out.println("Operacion despues de usar el valor"+i2);
                                break;
                            case 5:
                                // 5. ¿Qué valor tendrá xf después de esta operación?
                                int xf = 3;
                                xf++;
                                System.out.println(xf);
                                break;
                            case 6:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("4. Ejercicios Combinados");
                    while (!salirSubmenu) {
                        mostrarSubmenuCombinados();
                        opcionSubmenu = scanner.nextInt();

                        switch (opcionSubmenu) {
                            case 1:
                                // ¿Cuál será el resultado de la siguiente operación?
                                int x = (int) 5.89 + (int) 3.45;
                                System.out.println(x);
                                // El resultado es 8
                                break;
                            case 2:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 3:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 4:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 5:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 6:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 7:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 8:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 9:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 10:
                                System.out.println("Realizando operación de resta...");
                                // Aquí puedes implementar la lógica para la resta
                                break;
                            case 11:
                                System.out.println("Volviendo al menú principal.");
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtalo de nuevo.");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        scanner.close();
}