# Programa_Completo
Realizado por:
  <li>Diego Alonso Fernández Delagadillo</li>
<h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  Indice </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">
                       <li> <a href="#DES"> Descripción del Problemario </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#COM"> Competencia de la Asignatura </a> </li>
                            </ul>
     <li> <a href="#Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio"> Métodos numéricos para encontrar las raíces </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#B"> Método de Bisección. </a> </li>
                                <li> <a href="#F"> Método de la Falsa Posición. </a> </li>
                                <li> <a href="#S"> Método de la Secante. </a> </li> 
                                <li> <a href="#N"> Método de Newton-Raphson. </a> </li> 
                            </ul>
                    </ul>
                     <li> <a href="#Sistemas de ecuaciones"> Sistemas de ecuaciones </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Eliminacion"> Eliminación-Gaussiana </a> </li>
                                <li> <a href="#Gauss"> Gauss-Jordan </a> </li>
                                <li> <a href="#Seidel"> Gauss-Seidel </a> </li> 
                                <li> <a href="#Jacobi"> Método de Jacobi </a> </li> 
                            </ul>
                    </ul>
                   <li> <a href = "#4"> Diferenciación e integración numérica </a> <br> </li>
          <ul class = "subindice">
              <li> <a href="#Trapecio"> Método del Trapecio </a> <br> </li>
              <li> <a href="#1/3"> Método de Simpson 1/3 </a> <br> </li>
              <li> <a href="#3/8"> Método de Simpson 3/8 </a> <br> </li> 
              <li> <a href="# Cuadratura"> Método de la Cuadratura Gaussiana </a> <br> </li> 
          </ul>
      </ul>
                </nav>
      <li> <a href="#Inter">  Interpolación  </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Lineal"> Interpolación lineal (5 ejemplos). </a> </li>
                                <li> <a href="#Cuadratica"> Interpolación cuadratica (1 ejemplo). </a> </li>
                                <li> <a href="#Langrage"> Interpolación langrage (5 ejemplos). </a> </li> 
                                <li> <a href="#Newton"> Interpolación de newton (5 ejemplos). </a> </li> 
                            </ul>
                    </ul>
                </nav>
   <li> <a href="#SO"> Solución de ecuaciones diferenciales </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#EU"> Euler (4 ejemplos). </a> </li>
                                <li> <a href="#RU"> Runge-Kutta (4 ejemplos). </a> </li>
                                <li> <a href="#LA"> Taylor (4 ejemplos). </a> </li> 
                            </ul>
                    </ul>
                </nav>
            </font> </header>

<h2 align = "center"> <font  size = "+6" > <a name="DES">Descripción del problemario</a></font> </h2>
En este documento, se realizará un exhaustivo análisis de los conocimientos adquiridos a lo largo del semestre en el curso de Métodos Numéricos. Se abordarán desde los fundamentos de los métodos para hallar raíces de ecuaciones hasta las técnicas avanzadas para la resolución de ecuaciones diferenciales. Se explorarán detalladamente las herramientas matemáticas y computacionales empleadas, destacando la importancia de cada método en la resolución de problemas numéricos. Además, se pondrá énfasis en la aplicación práctica de estos métodos, demostrando su relevancia en la solución de situaciones reales y su impacto en diversas áreas de la ciencia y la ingeniería.

<h2 align = "center"> <font  size = "+6" > <a name="COM">Competencia de la asignatura</a></font> </h2>
Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h1 align = "center"> <font  font face = "bauhaus 93">  Métodos para enontrar las raíces de una ecuacion </font> </h1>

<h2 align = "center"> <font font face = "forte">  <a name="B"> 1. Bisección </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de bisección es un algoritmo utilizado para encontrar las raíces de una función en un intervalo dado. Consiste en dividir repetidamente el intervalo a la mitad y seleccionar el subintervalo que contiene la raíz. Este proceso se repite hasta que se alcanza la precisión deseada. Los pasos principales son los siguientes:

<h3> <font font face = "arial">Pasos del Método de Bisección:</h3>
<h5>Inicio del Intervalo:</h5> Se elige un intervalo inicial donde se sospecha que se encuentra la raíz.
<h5>Cálculo del Punto Medio:</h5> Se calcula el punto medio del intervalo.
<h5>Evaluación de la Función:</h5> Se evalúa la función en el punto medio para determinar en qué subintervalo se encuentra la raíz.
<h5>Selección del Nuevo Intervalo:</h5> Se selecciona el nuevo intervalo basado en la evaluación de la función en el punto medio.
<h5>Iteración:</h5> Se repiten los pasos anteriores hasta que se alcance la precisión deseada, es decir, hasta que el intervalo sea lo suficientemente pequeño.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    import java.util.Scanner;
    public class Main {  

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el límite inferior: ");
        double a = input.nextDouble();

        System.out.print("Ingrese el límite superior: ");
        double b = input.nextDouble();

        System.out.print("Ingrese el máximo de iteraciones: ");
        int maxIterations = input.nextInt();

        System.out.print("Ingrese el error permitido: ");
        double error = input.nextDouble();

        double root = bisection(a, b, maxIterations, error);
        System.out.println("La raíz de la función es: " + root);
    }

    public static double bisection(double a, double b, int maxIterations, double error) {
        double fa = f(a);
        double fb = f(b);

        if (fa * fb > 0) {
            System.out.println("No se puede garantizar la existencia de una raíz en el intervalo dado.");
            return Double.NaN;
        }

        for (int i = 0; i < maxIterations; i++) {
            double c = (a + b) / 2;
            double fc = f(c);

            if (Math.abs(fc) < error) {
                return c;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        return (a + b) / 2;
    }

    public static double f(double x) {
    
        return x*x - 4; 
    }}
    
<h2 align = "center"> <font font face = "forte">  <a name="F">2.- Falsa posición </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de la falsa posición, también conocido como método de la regla falsa o regula falsi, es un algoritmo para encontrar las raíces de una función. A diferencia del método de bisección, que divide el intervalo por la mitad, el método de la falsa posición utiliza una línea recta para aproximar la función en el intervalo y encontrar la raíz.

<h3> <font font face = "arial">Pasos del Método de falsa posición: </h3>
<h5>Selección del intervalo inicial:</h5> Se elige un intervalo [a, b] donde se sospecha que se encuentra la raíz.
<h5>Cálculo del punto de intersección:</h5> Se calcula el punto c utilizando la fórmula: c = b - f(b) * (a - b) / (f(a) - f(b)).
<h5>Evaluación de la función:</h5>Se evalúa la función en c para determinar en qué subintervalo se encuentra la raíz.
<h5>Selección del nuevo intervalo:</h5> Se selecciona el nuevo intervalo basado en la evaluación de la función en c.
<h5>Iteración:</h5> Se repiten los pasos anteriores hasta que se alcance la precisión deseada, es decir, hasta que el intervalo sea lo suficientemente pequeño.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    import java.util.Scanner;
    public class Main {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el límite inferior: ");
        double a = input.nextDouble();

        System.out.print("Ingrese el límite superior: ");
        double b = input.nextDouble();

        System.out.print("Ingrese el máximo de iteraciones: ");
        int maxIterations = input.nextInt();

        System.out.print("Ingrese el error permitido: ");
        double error = input.nextDouble();

        double root = falsePosition(a, b, maxIterations, error);
        System.out.println("La raíz de la función es: " + root);
    }

    public static double falsePosition(double a, double b, int maxIterations, double error) {
        double fa = f(a);
        double fb = f(b);

        if (fa * fb > 0) {
            System.out.println("No se puede garantizar la existencia de una raíz en el intervalo dado.");
            return Double.NaN;
        }

        for (int i = 0; i < maxIterations; i++) {
            double c = (a * fb - b * fa) / (fb - fa);
            double fc = f(c);

            if (Math.abs(fc) < error) {
                return c;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        return (a * fb - b * fa) / (fb - fa);
    }

    public static double f(double x) {
        // Definir aquí la función para la cual se desea encontrar la raíz
        return x*x - 4; // Ejemplo: x^2 - 4
    }}
    
<h2 align = "center"> <font font face = "forte"> <a name="S"> 3.- De la secante </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de la secante es un algoritmo numérico utilizado para encontrar las raíces de una función. A diferencia de los métodos de bisección y falsa posición, el método de la secante no requiere que la función cambie de signo en el intervalo inicial. En su lugar, utiliza una aproximación de la pendiente de la recta secante entre dos puntos cercanos para iterar hacia la raíz.

<h3> <font font face = "arial">Pasos del Método de Bisección:</h3>
<h5>Selección de dos puntos iniciales:</h5> Se eligen dos puntos iniciales cercanos a la raíz.
<h5>Cálculo del siguiente punto:</h5> Se calcula el siguiente punto utilizando la fórmula: x_{n+1} = x_n - f(x_n) * (x_n - x_{n-1}) / (f(x_n) - f(x_{n-1})).
<h5>Convergencia hacia la raíz:</h5> Se repite el paso anterior hasta que se alcance la precisión deseada o se cumpla un criterio de convergencia.
<h5>Actualización de los puntos:</h5> Se actualizan los puntos para continuar iterando hacia la raíz.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    import java.util.Scanner;
    public class Main {
 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer punto inicial: ");
        double x0 = input.nextDouble();

        System.out.print("Ingrese el segundo punto inicial: ");
        double x1 = input.nextDouble();

        System.out.print("Ingrese el máximo de iteraciones: ");
        int maxIterations = input.nextInt();

        System.out.print("Ingrese el error permitido: ");
        double error = input.nextDouble();

        double root = secant(x0, x1, maxIterations, error);
        System.out.println("La raíz de la función es: " + root);
    }

    public static double secant(double x0, double x1, int maxIterations, double error) {
        for (int i = 0; i < maxIterations; i++) {
            double fx0 = f(x0);
            double fx1 = f(x1);

            if (Math.abs(fx1 - fx0) < error) {
                return x1;
            }

            double x2 = x1 - (fx1 * (x1 - x0)) / (fx1 - fx0);

            x0 = x1;
            x1 = x2;
        }

        return x1;
    }

    public static double f(double x) {
        
        return x*x - 4; 
    }}
    
<h2 align = "center"> <font font face = "forte"> <a name="N"> 4. Newton </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Newton, también conocido como método de Newton-Raphson, es un algoritmo utilizado para encontrar raíces de una función. Este método requiere conocer el valor de la primera derivada de la función en el punto de estudio. A continuación se detallan los pasos del método de Newton:

<h3> <font font face = "arial">Pasos del Método de Bisección:</h3>
<h5>Selección del punto inicial:</h5> Se elige un punto inicial cercano a la raíz deseada.
<h5>Cálculo de la pendiente:</h5> Se calcula la pendiente de la recta tangente a la curva en el punto seleccionado.
<h5>Determinación del siguiente punto:</h5> Se determina el siguiente punto de iteración utilizando la fórmula: x_{n+1} = x_n - f(x_n) / f'(x_n), donde f'(x) es la derivada de la función en x.
<h5>Convergencia hacia la raíz:</h5> Se repiten los pasos anteriores hasta alcanzar la precisión deseada o cumplir un criterio de convergencia.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    public class MetodoNewton {
    public static double epsilon = 0.0001; 

    //  f(x) = cos(x) - x
    public static double funcion(double x) {
        return Math.cos(x) - x;
    }

    // Calculamos la derivada de la función
    public static double derivada(double x) {
        return -Math.sin(x) - 1;
    }

   
    public static double metodoNewton(double xInicial) {
        double xActual = xInicial;
        double xSiguiente;

        do {
            xSiguiente = xActual - funcion(xActual) / derivada(xActual);
            xActual = xSiguiente;
        } while (Math.abs(funcion(xActual)) > epsilon);

        return xActual;
    }

    public static void main(String[] args) {
        double xInicial = 0.5; // Valor inicial de x
        double solucion = metodoNewton(xInicial);
        System.out.println("La solución aproximada es: " + solucion);
    }}


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h1 align = "center"> <font  font face = "bauhaus 93"> <a name="Sistemas de ecuaciones"> Sistemas de ecuaciones </font></a> </h1>

<h2 align = "center"> <font font face = "forte"><a name="Eliminacion">  1. Eliminación Gaussiana </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La eliminación gaussiana es un método utilizado en álgebra lineal para resolver sistemas de ecuaciones lineales de una manera sistemática y paso a paso. Este método consiste en llevar un sistema de ecuaciones a una forma matricial, convertir una matriz cuadrada en una matriz triangular superior equivalente a la original y luego resolver el sistema sustituyendo las variables en cada ecuación resultante:

<h3> <font font face = "arial">Pasos de la eliminación Gaussiana:</h3>
<h5>Formar la matriz aumentada:</h5> Combinar la matriz de coeficientes y el vector de términos independientes en una sola matriz aumentada.
<h5>Pivoteo parcial: </h5> Si es necesario, intercambiar filas para asegurar que el elemento en la posición de pivote sea el mayor en valor absoluto en su columna.
<h5>Escalonar la matriz: </h5> Comenzar con la primera fila y hacer ceros debajo del elemento de pivote, utilizando operaciones elementales de fila.
<h5>Repetir el proceso: </h5> Aplicar el mismo procedimiento a las filas restantes, avanzando hacia abajo y creando ceros debajo de los pivotes.
<h5>Sustitución hacia atrás: </h5> Una vez que la matriz está en forma triangular superior, resolver el sistema de ecuaciones resultante mediante sustitución hacia atrás, empezando por la última ecuación y despejando las incógnitas hacia arriba.
<h5>Verificar la solución: </h5> Sustituir las soluciones encontradas en las ecuaciones originales para comprobar si satisfacen todas las ecuaciones del sistema.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package Eliminacion_Gaussiana;


public class Ejercicio1 {

      public static void main(String[] args) {
        int n = 3; // Número de incógnitas
        double[][] matrix = {
                {2.0, 1.0, -1.0, 8.0},
                {-3.0, -1.0, 2.0, -11.0},
                {-2.0, 1.0, 2.0, -3.0}
        };
        double[] result = Eliminacion(matrix, n);
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + result[i]);
        }
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![1](https://github.com/Hante990/Tema-3/assets/107586879/adcd5200-7d62-47ac-834b-378bfeeb70ac)


      
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio2 {

      public static void main(String[] args) {
        int n = 3; // Número de incógnitas
        double[][] matrix = {
                {10, 4.0, -1.0, 8.0},
                {-7.0, -1.0, 8.0, -11.0},
                {6.0, 14.0, 0.0, -3.0}
        };
        double[] result = Eliminacion(matrix, n);
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + result[i]);
        }
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}



![2](https://github.com/Hante990/Tema-3/assets/107586879/99caa84e-e57b-49e4-88f6-17c09123c868)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package Eliminacion_Gaussiana;



public class Ejercicio3 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
        
        double[][] matrix = {
                
                {15, 2.0, 6.0, -8.0},
                
                {-8.0, -5.0, -8.0, 1.0},
        
                {-6.0, 3.0, 5.0, 13.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
       
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![3](https://github.com/Hante990/Tema-3/assets/107586879/66a42f0f-9a07-48f3-ac86-6d47d6ce41eb)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio4 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
       
        double[][] matrix = {
                
                {-8, -5.0, 7.0, 22.0},
                
                {4.0, 1.0, -9.0, 21.0},
        
                {-12.0, -14.0, 4.0, -3.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
    
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}


![4](https://github.com/Hante990/Tema-3/assets/107586879/fdcd0fb1-38e5-47f9-9989-bfafd2fbb262)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
package Eliminacion_Gaussiana;


public class Ejercicio5 {
   public static void main(String[] args) {
        
        int n = 3; // Número de incógnitas
        
        double[][] matrix = {
                
                {17, 14.0, -15.0, 18.0},
                
                {-7.0, 21.0, 8.0, -21.0},
        
                {16.0, 4.0, 10.0, 3.0}
        
        };
        
        double[] result = Eliminacion(matrix, n);
        
        for (int i = 0; i < n; i++) {
        
            System.out.println("x[" + i + "] = " + result[i]);
    
        }
   
    }

    public static double[] Eliminacion(double[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matrix[j][i] / matrix[i][i];
                for (int k = i; k < n + 1; k++) {
                    matrix[j][k] -= factor * matrix[i][k];
                }
            }
        }

        double[] result = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = matrix[i][n];
            for (int j = i + 1; j < n; j++) {
                result[i] -= matrix[i][j] * result[j];
            }
            result[i] /= matrix[i][i];
        }

        return result;
    }}



![5](https://github.com/Hante990/Tema-3/assets/107586879/15945e2b-010f-4498-b5a2-fc9a45620ebf)



<h2 align = "center"> <font font face = "forte"> <a name="Gauss">  2.- Gauss-Jordan </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Gauss-Jordan es una variante del método de eliminación gaussiana que se utiliza para resolver sistemas de ecuaciones lineales. En este método, al igual que en la eliminación gaussiana, se busca llevar la matriz de coeficientes a una forma escalonada, pero con la diferencia de que se busca obtener una matriz escalonada reducida a su forma más simple, conocida como forma escalonada reducida por filas o forma canónica.

<h3> <font font face = "arial">Pasos del Método de Gauss Jordan: </h3>
<h5>Formar la Matriz Aumentada: </h5> Se comienza escribiendo el sistema de ecuaciones en forma matricial, creando una matriz aumentada que incluya tanto los coeficientes de las variables como los términos independientes.
<h5>Escalonar la Matriz: </h5>Se aplican operaciones elementales de fila para obtener ceros debajo de la diagonal principal y unos en la diagonal principal. Esto implica realizar operaciones como intercambiar filas, multiplicar filas por constantes y sumar múltiplos de unas filas a otras.
<h5>Reducir la Matriz a su Forma Escalonada Reducida: </h5>Se continúa escalonando la matriz hasta obtener una forma escalonada reducida, donde la parte de los coeficientes de las variables se convierte en una matriz identidad.
<h5>Obtener las Soluciones: </h5>Una vez se ha alcanzado la forma escalonada reducida, se leen las soluciones directamente de la matriz identidad. Cada fila de la matriz identidad corresponde a una variable del sistema de ecuaciones.
<h5>Verificar las Soluciones: </h5> Es importante comprobar las soluciones obtenidas sustituyéndolas en las ecuaciones originales para asegurarse de que satisfacen todas las ecuaciones del sistema.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package com.mycompany.gauss.jordan;

public class GaussJordan {

    public static void main(String[] args) {
       System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {4,2,-2,1},
            {10,4,4,-4},
            {6,2,2,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![1](https://github.com/Hante990/Tema-3/assets/107586879/dfa61392-6b67-4e1f-b58e-dc3cb3e00b85)

   
    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package com.mycompany.gauss.jordan3;

import java.util.Scanner;

public class GaussJordan3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
        System.out.println("Ingrese el tamaño de la matriz cuadrada (n x n): ");
        int n = scanner.nextInt();
        
        double[][] matriz = new double[n][n+1];
        
        System.out.println("Ingrese los elementos de la matriz extendida (separados por espacios y por fila): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
        
        scanner.close();
    }

    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }

    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados son: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println((char)('X' + i) + " = " + matriz[i][matriz[i].length - 1]);
        }
    }}


![2-1](https://github.com/Hante990/Tema-3/assets/107586879/9f2e75da-ccd4-46f8-8ce8-13d6413f674a)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package com.mycompany.gauss.jordan4;

public class GaussJordan4 {

    public static void main(String[] args) {
        System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {4,-2,2,1},
            {10,4,4,-4},
            {3,1,1,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![2-2](https://github.com/Hante990/Tema-3/assets/107586879/0fd5353d-3a28-49a8-ae74-912cc342b4c6)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package com.mycompany.gauss_jordan;

public class Gauss_jordan {

    public static void main(String[] args) {
        System.out.println("GAUSS-JORDAN");
        double[][] matriz = 
        {   {2,1,-1,1},
            {5,2,2,-4},
            {3,1,1,5}    };
        double[][] resultados = operaciones(matriz);
        Resultados(resultados);
    }
    public static double[][] operaciones(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        for (int i = 0; i < fila; i++) {
            double pivote = matriz[i][i];
            for (int j = i + 1; j < columna; j++) {
                matriz[i][j] /= pivote;
            }
            matriz[i][i] = 1;
            for (int j = 0; j < fila; j++) {
                if (i != j) {
                    double epala = matriz[j][i];
                    for (int k = i; k < columna; k++) {
                        matriz[j][k] -= epala * matriz[i][k];
                    }
                }
            }
        }
        return matriz;
    }
    public static void Resultados(double[][] matriz) {
        System.out.println("Los resultados soooon: ");
        System.out.println("X = " + matriz[0][3] + " :)");
        System.out.println("Y = " + matriz[1][3] + " :)");
        System.out.println("Y = " + matriz[2][3] + " :)");
    }}



![2-4](https://github.com/Hante990/Tema-3/assets/107586879/5597f8c7-f6ee-4cae-8587-9286ec540628)


    
<h2 align = "center"> <font font face = "forte"> <a name="Seidel">  3.- Gauss-Seidel </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Gauss-Seidel es una técnica iterativa utilizada para resolver sistemas de ecuaciones lineales. En este método, se mejora el método de Jacobi al utilizar las soluciones más recientes a medida que se calculan, en lugar de esperar a completar una iteración completa. Esto significa que las soluciones se actualizan en cada paso, lo que puede acelerar la convergencia del método.

<h3> <font font face = "arial">Pasos de Gauss-Seidel:</h3>
<h5>Inicialización de las Variables: </h5> Se comienza con una estimación inicial de las soluciones del sistema de ecuaciones lineales.
<h5>Iteración:</h5>Para cada ecuación en el sistema:
<li>Utilizar los valores más recientes de las variables ya calculadas.</li>
<li>Resolver la ecuación para encontrar una nueva estimación de la variable.</li>
<li>Actualizar el valor de la variable con la nueva estimación.</li>
<li>Repetir este proceso para todas las ecuaciones del sistema en cada iteración.</li>
<h5>Criterio de parada:</h5><li>Establecer un criterio de convergencia, como una tolerancia o un número máximo de iteraciones.</li>
<li>Verificar si se ha alcanzado la precisión deseada o el número máximo de iteraciones.</li>
<h5>Convergencia:</h5><li> Comprobar si el método converge hacia la solución del sistema de ecuaciones lineales.</li>
<li>Ajustar los parámetros, como la elección inicial y la precisión, si es necesario para mejorar la convergencia.</li>
<h5>Obtencion de soluciones:</h5> <li>Una vez que se alcanza la convergencia, las soluciones obtenidas en la última iteración se consideran como las soluciones aproximadas del sistema de ecuaciones lineales.</li>
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>

package gausseseidel;

public class GausseSeidel1 {

    public static void main(String[] args) {
        double[][] A = {
                {4.0, -1.0, 0.0},
                {-1.0, 4.0, -1.0},
                {0.0, -1.0, 4.0}
        };
        double[] b = {1, -4,5};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        
        System.out.println("Me da ese redondeo por la tolerancia de los puntos decimales. ");

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}


![e1](https://github.com/Hante990/Tema-3/assets/107586879/e8ae6a06-3793-4c18-a150-9393cfcb946a)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel2 {

    public static void main(String[] args) {
        double[][] A = {
            {2, 1, -1},
            {5, 2, 2},
            {3, 1, 1}
        };
        double[] b = {1, -4,5};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e2](https://github.com/Hante990/Tema-3/assets/107586879/8513a426-a403-4018-bf01-6889f991e930)


    

<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel3 {

    public static void main(String[] args) {
        double[][] A = {
            {5, 7, 1},
            {6, 4, 2},
            {2, 3, 1}
        };
        double[] b = {4, 1,3};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e3](https://github.com/Hante990/Tema-3/assets/107586879/758c3cb5-95bd-435c-b3a8-a858556487f9)




<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel4 {

    public static void main(String[] args) {
        double[][] A = {
            {1, 7, 2},
            {3, 5, 6},
            {3, 4, 8}
        };
        double[] b = {2, -1,7};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}


![e4](https://github.com/Hante990/Tema-3/assets/107586879/f20b688e-d5cb-4dc8-8547-45114649fd31)


    

<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
package gausseseidel;

public class GausseSeidel5 {

    public static void main(String[] args) {
        double[][] A = {
            {2, 1, 4},
            {9, 5, 2},
            {7, 1, 6}
        };
        double[] b = {9,6,3};
        double[] x = gaussSeidel(A, b);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static double[] gaussSeidel(double[][] A, double[] b) {
        int n = A.length;
        double[] x = new double[n];
        double[] newX = new double[n];
        int max = 100;
        double epsilon = 1e-50;

        for (int iter = 0; iter < max; iter++) {
            for (int i = 0; i < n; i++) {
                newX[i] = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        newX[i] -= A[i][j] * x[j];
                    }
                }
                newX[i] /= A[i][i];
            }

            boolean stop = true;
            for (int i = 0; i < n; i++) {
                if (Math.abs(newX[i] - x[i]) > epsilon) {
                    stop = false;
                    break;
                }
            }

            if (stop) {
                break;
            }

            System.arraycopy(newX, 0, x, 0, n);
           
        }
        return x;
    }}



![e5](https://github.com/Hante990/Tema-3/assets/107586879/ba4fc671-7e49-4b86-9396-c08d3811c685)




    
<h2 align = "center"> <font font face = "forte"> <a name="Jacobi">  4. Jacobi </h2></a>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Jacobi es un algoritmo iterativo utilizado para resolver sistemas de ecuaciones lineales. En este método, se descompone la matriz de coeficientes del sistema en una suma de una matriz diagonal y dos matrices complementarias. Luego, se utiliza esta descomposición para iterar y encontrar soluciones aproximadas para el sistema de ecuaciones.

<h3> <font font face = "arial">Pasos del método de Jacobi:</h3>
<h5>Descomposición de la matriz: </h5><li> Descomponer la matriz de coeficientes del sistema en una matriz diagonal 
D y dos matrices complementarias L y U, de forma que = ++A=D+L+U, donde:</li>
<li>D es la matriz diagonal que contiene los elementos diagonales de A.
<li>L es la matriz triangular inferior con ceros en la diagonal.</li>
<li>U es la matriz triangular superior con ceros en la diagonal.</li>
<h5>Inicialización: </h5><li>Inicializar un vector de soluciones inicial x(0).</li>
<li>Establecer un criterio de convergencia, como una tolerancia ϵ o un número máximo de iteraciones.</li>
<h5>Iteración: </h5><li>Establecer un criterio de convergencia, como una tolerancia o un número máximo de iteraciones.</li>
<li>Verificar si se ha alcanzado la precisión deseada o el número máximo de iteraciones.</li>
<h5>Criterio de Parada: </h5><li>Verificar si se ha alcanzado la convergencia comparando la diferencia entre las soluciones actuales y las anteriores con la tolerancia establecida.</li>
<li>Detener las iteraciones si se cumple el criterio de convergencia o se alcanza el número máximo de iteraciones.</li>
<h5>Obtencion de soluciones:</h5> <li>Las soluciones aproximadas obtenidas en la última iteración se consideran como las soluciones del sistema de ecuaciones lineales.</li>
   
<h5> <font font face = "arial"> <b> <i> Ejemplo 1: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
   public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{5, 1, 1}, {1, 4, 1}, {2, 1, 3}}; 
        double[] constants = {10, 11, 12}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}



![ee1](https://github.com/Hante990/Tema-3/assets/107586879/68e40cb6-5a78-4667-a24c-0378d8c6f12e)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 2: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{4, -1, 0}, {-1, 4, -1}, {0, -1, 3}}; 
        double[] constants = {5, -7, 6}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}



![ee2](https://github.com/Hante990/Tema-3/assets/107586879/3ec8cab9-5632-4255-9534-3d542ecb27ea)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 3: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{3, 1, 1}, {2, 5, 1}, {1, 1, 4}}; 
        double[] constants = {5, 6, 7}; 
        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}


![ee3](https://github.com/Hante990/Tema-3/assets/107586879/276fab49-748c-4641-af03-8c3b21f326ec)



    
<h5> <font font face = "arial"> <b> <i> Ejemplo 4: </i> </b> </h5>
public class JacobiMethod {
    public static final double EPSILON = 0.0001;
    public static final int MAX_ITERATIONS = 100;

    public static void main(String[] args) {
        double[][] coefficients = {{4, -1, 0}, {-1, 5, -1}, {0, -1, 3}};
        double[] constants = {8, -3, 6}; 
        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}


![ee4](https://github.com/Hante990/Tema-3/assets/107586879/b2875573-1064-4780-8b5a-ced76725dca7)


    
<h5> <font font face = "arial"> <b> <i> Ejemplo 5: </i> </b> </h5>
  
      public class JacobiMethod {
      public static final double EPSILON = 0.0001;
      public static final int MAX_ITERATIONS = 100;
    public static void main(String[] args) {
        double[][] coefficients = {{2, -1, 0}, {-1, 2, -1}, {0, -1, 2}}; 
        double[] constants = {1, 0, 1}; 

        double[] solution = solveJacobi(coefficients, constants);
        
        System.out.println("Solución encontrada:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + (i + 1) + " = " + solution[i]);
        }
    }

    public static double[] solveJacobi(double[][] coefficients, double[] constants) {
        int n = constants.length;
        double[] solution = new double[n];
        double[] nextSolution = new double[n];
        int iterations = 0;
        boolean converged = false;

        while (!converged && iterations < MAX_ITERATIONS) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        sum -= coefficients[i][j] * solution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            double maxDifference = 0.0;
            for (int i = 0; i < n; i++) {
                double difference = Math.abs(nextSolution[i] - solution[i]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }

            if (maxDifference < EPSILON) {
                converged = true;
            }

            for (int i = 0; i < n; i++) {
                solution[i] = nextSolution[i];
            }

            iterations++;
        }

        if (iterations == MAX_ITERATIONS) {
            System.out.println("El método no converge después de " + MAX_ITERATIONS + " iteraciones.");
        }

        return solution;
    }}






![ee5](https://github.com/Hante990/Tema-3/assets/107586879/19658622-1d53-44ed-9891-412fe75136ba)

 <h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i><a name="4">  Tema 4: Métodos de solución de problemas aplicando diferenciación y integración</a><i> </b> </font> </h1>

-----------------------------------------------------------------------------------------

<h3 align = "center"> <font  font face = "bauhaus 93">   Descripción </font> </h3>

En este documento podremos obser el funcionamiento de diversos métodos aplicandolos en funciones de diferenciación e integración númerica, los cuales son:

  1. Método del Trapecio 
  2. Método de Simpson 1/3
  3. Método de Simpson 3/8
  4. Método de la Cuadratura Gaussiana

En cada una de las carpetas podremos encontrar lo que son los códigos de cada método, tanto de su diferenciación como la de integración, y en cada carpeta podremos encontrar cinco programas los cuales estan desarrollados en el lenguaje de programación Java, en los cuales estarán documentados para un mayor entendimiento del programa.

-----------------------------------------------------------------------------------------

<h3 align = "center"> <font  font face = "bauhaus 93">  <a name="Temario"> Temario</a> </font> </h3>

   4.1 Diferenciación Numérica 
   
   4.2 Integración Numérica
   
   4.3 Integración Múltiple
   
   4.4 Aplicación

-----------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos"> Métodos</a> </font> </h2>

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name="Trapecio">  Método del Trapecio </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>
  
Este método es útil cuando la función a integrar es difícil o imposible de integrar analíticamente, o cuando se necesita una solución numérica rápida y aceptable. Sin embargo, su precisión depende de la cantidad de segmentos utilizados y puede ser superado por métodos más avanzados, como la regla de Simpson, para funciones que son suaves y continuamente diferenciables.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Trapecio_Integración(f, a, b, n):
            h = (b - a) / n
            suma = 0.5 * (f(a) + f(b))
            Para i desde 1 hasta n-1:
                xi = a + i * h
                suma = suma + f(xi)
            resultado = h * suma
            Devolver resultado


2. Pseudocódigo para realizar la diferenciación

        Función Trapecio_Diferenciación(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                suma = suma + 2 * f(xi)
            resultado = h * suma / 2
            Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Trapecio;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
            
        
        // Método para calcular la integral numérica utilizando el Método del Trapecio
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = 0.5 * (func.apply(a) + func.apply(b));
            
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                sum += func.apply(x);
            }
            
            return h * sum;
        }
        
        // Método para calcular la derivada numérica utilizando el Método del Trapecio
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (func.apply(x + h) - func.apply(x - h)) / (2 * h);
            return result;
        }
        
        public static void main(String[] args) {
            // Definir la función que se desea integrar y diferenciar
            Function<Double, Double> func = (x) -> Math.sin(x); // Ejemplo: función seno
            
            // Definir los límites de integración y el número de segmentos
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 1000; // Número de segmentos
            
            // Calcular la integral numérica utilizando el Método del Trapecio
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
            
            // Calcular la derivada numérica utilizando el Método del Trapecio
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.001; // Tamaño del paso
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
            
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 134559](https://github.com/MiguelAngelFlores3/Metodos_T4/assets/167603831/dbc10aaf-0a47-49c8-9ebd-f0313ac94924)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name="1/3">  Método de Simpson 1/3 </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

Este método proporciona una mayor precisión que el Método del Trapecio para la misma cantidad de puntos de integración y es bastante eficaz para integrandos suaves. Sin embargo, para funciones con oscilaciones rápidas o discontinuidades, puede no ser tan eficaz. En esos casos, métodos más avanzados, como la regla de Simpson 3/8 o métodos adaptativos, pueden ser más apropiados.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Simpson_Integración(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                Si i es impar:
                    suma = suma + 4 * f(xi)
                Sino:
                    suma = suma + 2 * f(xi)
            resultado = h * suma / 3
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación
    
       Función Simpson_Diferenciación(f, a, b, n):
        h = (b - a) / n
        suma = f(a) + f(b)
        Para i desde 1 hasta n-1:
            xi = a + i * h
            Si i es impar:
                suma = suma + 4 * f(xi)
            Sino:
                suma = suma + 2 * f(xi)
        resultado = h * suma / 3
        resultado = resultado / h # Para la diferenciación
        Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Simpson1_3;
    
    import java.util.function.Function;
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Método para calcular la integral numérica utilizando el Método de Simpson 1/3
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = func.apply(a) + func.apply(b);
    
            for (int i = 1; i < n; i += 2) {
                double x = a + i * h;
                sum += 4 * func.apply(x);
            }
    
            for (int i = 2; i < n - 1; i += 2) {
                double x = a + i * h;
                sum += 2 * func.apply(x);
            }
    
            return (h / 3) * sum;
        }
        
        // Método para calcular la derivada numérica utilizando el Método de Simpson 1/3
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (func.apply(x - 2 * h) - 8 * func.apply(x - h) + 8 * func.apply(x + h) - func.apply(x + 2 * h)) / (12 * h);
            return result;
        }
        
        public static void main(String[] args) {
            // Definir la función que se desea integrar y diferenciar
            Function<Double, Double> func = (x) -> Math.sin(x); // Ejemplo: función seno
            
            // Definir los límites de integración y el número de segmentos
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 4; // Número de segmentos (debe ser par para el Método de Simpson 1/3)
            
            // Calcular la integral numérica utilizando el Método de Simpson 1/3
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
            
            // Calcular la derivada numérica utilizando el Método de Simpson 1/3
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 142010](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/4790a5b1-9e8c-4d36-ac32-fc21be24a584)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name="3/8">  Método de Simpson 3/8 </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>

El Método de Simpson 3/8 es una técnica de integración numérica que extiende el Método de Simpson 1/3 para mejorar aún más la precisión de la aproximación. Al igual que el Método de Simpson 1/3, utiliza polinomios de segundo grado (parábolas) para aproximar la función entre los puntos de integración. Sin embargo, en lugar de usar parábolas en cada subintervalo, el Método de Simpson 3/8 utiliza polinomios de tercer grado (cúbicos) para ajustar la función.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Simpson_3_8_Integración(f, a, b, n):
            h = (b - a) / n
            suma = f(a) + f(b)
            Para i desde 1 hasta n-1:
                xi = a + i * h
                Si i es divisible por 3:
                    suma = suma + 2 * f(xi)
                Sino Si i no es divisible por 3 pero es impar:
                    suma = suma + 3 * f(xi)
                Sino:
                    suma = suma + 3 * f(xi)
            resultado = 3 * h * suma / 8
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación

       Función Simpson_3_8_Diferenciación(f, a, b, n):
        h = (b - a) / n
        suma = f(a) + f(b)
        Para i desde 1 hasta n-1:
            xi = a + i * h
            Si i es divisible por 3:
                suma = suma + 2 * f(xi)
            Sino Si i no es divisible por 3 pero es impar:
                suma = suma + 3 * f(xi)
            Sino:
                suma = suma + 3 * f(xi)
        resultado = 3 * h * suma / 8
        resultado = resultado / h # Para la diferenciación
        Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Simpson3_8;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Método para calcular la integral numérica utilizando el Método de Simpson 3/8
    
        public static double integrate(double a, double b, int n, Function<Double, Double> func) {
            double h = (b - a) / n;
            double sum = func.apply(a) + func.apply(b);
    
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                sum += i % 3 == 0 ? 2 * func.apply(x) : 3 * func.apply(x);
            }
    
            return (3 * h / 8) * sum;
        }
    
        // Método para calcular la derivada numérica utilizando el Método de Simpson 3/8
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double result = (-func.apply(x + 2 * h) + 9 * func.apply(x + h) - 9 * func.apply(x - h) + func.apply(x - 2 * h)) / (24 * h);
            return result;
        }
    
        public static void main(String[] args) {
            Function<Double, Double> func = (x) -> Math.sin(x); // Función a integrar y diferenciar: sin(x)
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            int n = 3; // Número de segmentos (debe ser múltiplo de 3 para el Método de Simpson 3/8)
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
    
            // Calcular la integral numérica utilizando el Método de Simpson 3/8
            double integral = integrate(a, b, n, func);
            System.out.println("Resultado de la integración: " + integral);
    
            // Calcular la derivada numérica utilizando el Método de Simpson 3/8
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 144711](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/2f81f60f-9961-47cc-b7d6-9cc7e679a7eb)

<h3 align = "center"> <font  font face = "bauhaus 93"> <a name="Cuadratura">  Método de la Cuadratura Gaussiana </a> </font> </h3>

<h4> <font font face = "arial"> Descripción </h4>
  
El Método de la Cuadratura Gaussiana es una técnica de integración numérica que utiliza una selección cuidadosa de puntos de evaluación y pesos para proporcionar una alta precisión en la aproximación de integrales definidas. A diferencia de los métodos de interpolación como el Método del Trapecio o el Método de Simpson, la Cuadratura Gaussiana no intenta ajustar polinomios a la función a integrar. En cambio, aprovecha las propiedades de ciertas funciones de peso para elegir de manera óptima los puntos de evaluación.

<h4> <font font face = "arial">Pseudocódigo </h4>
  
1. Pseudocódigo para realizar la integración

        Función Cuadratura_Gaussiana_Integración(f, a, b, n):
            coeficientes, nodos = obtener_coeficientes_y_nodos(n)
            suma = 0
            Para i desde 0 hasta n-1:
                xi = (b - a) / 2 * nodos[i] + (b + a) / 2
                suma = suma + coeficientes[i] * f(xi)
            resultado = (b - a) / 2 * suma
            Devolver resultado

2. Pseudocódigo para realizar la diferenciación

        Función Cuadratura_Gaussiana_Diferenciación(f, a, b, n):
            coeficientes, nodos = obtener_coeficientes_y_nodos(n)
            suma = 0
            Para i desde 0 hasta n-1:
                xi = (b - a) / 2 * nodos[i] + (b + a) / 2
                suma = suma + coeficientes[i] * f(xi)
            resultado = suma
            Devolver resultado

<h4> <font font face = "arial"> <b> <i> Ejemplo en código </i> </b> </h4>

    package Método_Cuadratura_Gaussiana;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Migue
     */
    public class Ejercicio1 {
        // Coeficientes y nodos de Cuadratura Gaussiana para dos puntos
    
        private static final double[] nodes = {-0.5773502692, 0.5773502692};
        private static final double[] weights = {1.0, 1.0};
    
        // Método para calcular la integral numérica utilizando Cuadratura Gaussiana
        public static double integrate(double a, double b, Function<Double, Double> func) {
            double integral = 0.0;
            double transform = (b - a) / 2.0;
    
            for (int i = 0; i < nodes.length; i++) {
                double x = transform * nodes[i] + (a + b) / 2.0;
                integral += weights[i] * func.apply(x);
            }
    
            return transform * integral;
        }
    
        // Método para calcular la derivada numérica utilizando Cuadratura Gaussiana
        public static double differentiate(double x, double h, Function<Double, Double> func) {
            double derivative = 0.0;
    
            for (int i = 0; i < nodes.length; i++) {
                double xi = x + h * nodes[i];
                derivative += weights[i] * func.apply(xi);
            }
    
            return derivative / h;
        }
    
        public static void main(String[] args) {
            Function<Double, Double> func = (x) -> Math.sin(x); // Función a integrar y diferenciar: sin(x)
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
            double x0 = Math.PI / 4; // Punto en el que se desea calcular la derivada
            double h = 0.1; // Tamaño del paso
    
            // Calcular la integral numérica utilizando Cuadratura Gaussiana
            double integral = integrate(a, b, func);
            System.out.println("Resultado de la integración: " + integral);
    
            // Calcular la derivada numérica utilizando Cuadratura Gaussiana
            double derivative = differentiate(x0, h, func);
            System.out.println("Resultado de la diferenciación en x = " + x0 + ": " + derivative);
        }
    }

<h4> <font font face = "arial"> Programa ejecutado </h4>

![Captura de pantalla 2024-04-21 145400](https://github.com/MiguelAngelFlores3/M-TODOS_T4/assets/167603831/33d51347-cb05-4cdf-9611-78a99cd6448d)
-----------------------------------------------------------------------------------------

 <h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="Inter">  TEMA 5 - Interpolación y ajuste de funciones</a><i> </b> </font> </h1>

-----------------------------------------------------------------------------------------

<h2 align = "center"> <font font face = "forte">  Descripción </h2>
La interpolación es un método matemático utilizado para estimar valores desconocidos dentro de un rango de valores conocidos. Se basa en la suposición de que la función que describe los datos es continua y suave. La interpolación se utiliza en diversas áreas, como la ingeniería, la ciencia de datos, la física y la estadística, para predecir valores intermedios entre puntos de datos discretos.
  
Existen varios métodos de interpolación, cada uno con sus propias características y aplicaciones. Algunos de los más comunes son:
  <li>1.-Interpolación lineal</li>
  <li>2.-Interpolación cuadratica</li>
  <li>3.-Interpolación langrage</li>
  <li>4.-Interpolación de newton</li>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font font face = "forte">  <a name="Lineal"> 1. Interpolación lineal </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La interpolación lineal es un procedimiento numérico que permite aproximar valores desconocidos dentro de un intervalo conocido, asumiendo una relación lineal entre los puntos extremos. Este método es ampliamente utilizado en diversas áreas, como la ingeniería, la física y las matemáticas, para estimar valores intermedios de manera rápida y eficiente.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    public class Ejercicio4 {
    public static double interpolate(double[] x, double[] y, double xTarget) {
        int n = x.length;
        double yTarget = 0;

        int i = 0;
        while (i < n - 1 && x[i] < xTarget) {
            i++;
        }

        if (i == 0) {
            yTarget = y[0];
        } else if (i == n - 1) {
            yTarget = y[n - 1];
        } else {
            double x0 = x[i - 1];
            double x1 = x[i];
            double y0 = y[i - 1];
            double y1 = y[i];

            double m = (y1 - y0) / (x1 - x0);
            double b = y0 - m * x0;
            yTarget = m * xTarget + b;
        }

        return yTarget;
    }

    public static void main(String[] args) {
    double[] x = {0.8, 1.6, 2.8, 3.2, 4.6};
    double[] y = {1.2, 3.2, 5.2, 7.2, 9.2};
    double xTarget = 2.0;
    double yTarget = interpolate(x, y, xTarget);
    System.out.println("El valor de y para x = " + xTarget + " es " + yTarget);
     }
    }

  ![Lineal](https://github.com/Hante990/Interpolaci-n2/assets/107586879/0037a026-e06c-45ce-8827-166931a2d22e)

<h2 align = "center"> <font font face = "forte">  <a name="Cuadratica"> 2.- Interpolación cuadratica </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La interpolación cuadrática es una herramienta útil en la aproximación de funciones suaves y en la predicción de valores intermedios entre puntos conocidos. Sin embargo, es importante tener en cuenta que su uso debe ser cuidadoso para evitar problemas de sobreajuste y garantizar la validez de los resultados obtenidos.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    public class Interpolacion_Cuadratica {

    public static void main(String[] args) {
        System.out.println("Solucion de ecuaciones cuadráticas");
        double a, b, c, x1, x2, producto, cuadrado, diferencia, raiz;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el coeficiente a");
        a = scanner.nextDouble();
        System.out.println("Ingresa el coeficiente b");
        b = scanner.nextDouble();
        System.out.println("Ingresa el coeficiente c");
        c = scanner.nextDouble();

        cuadrado = Math.pow(b, 2);
        producto = 4 * a * c;
        diferencia = cuadrado - producto;
        raiz = Math.sqrt(diferencia);

        x1 = (-b + raiz) / (2 * a);
        x2 = (-b - raiz) / (2 * a);

        System.out.println("La ecuacion es: " + a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("Las raices son:");
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
      }
    } 
    
  ![Cua](https://github.com/Hante990/Interpolaci-n2/assets/107586879/88a62d83-01c4-421a-a441-54eec1a2f964)

<h2 align = "center"> <font font face = "forte"> <a name="Langrage">  3.- Interpolación langrage </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La interpolación de Lagrange es una técnica fundamental en el campo de los métodos numéricos y es ampliamente utilizada en diversas áreas, como la aproximación de funciones, la predicción de valores intermedios y la resolución de problemas matemáticos y computacionales que requieren el ajuste preciso de curvas a datos conocidos.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

      public class Ejercicio5 {
        public static double interpolate(double[] x, double[] y, double xTarget) {
        double result = 0;

        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term = term * (xTarget - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }

        return result;
    }

    public static void main(String[] args) {
        double[] x = {1.1, 2.2, 3.3, 4.4, 5.5};
    double[] y = {1.1, 3.1, 5.1, 7.1, 9.1};
    double xTarget = 4.5;

        double yTarget = interpolate(x, y, xTarget);

        System.out.println("El valor interpolado de y para x = " + xTarget + " es " + yTarget);
     }
    }

![langrage](https://github.com/Hante990/Interpolaci-n2/assets/107586879/dd6934bc-7890-444a-b38d-b6dcecd0ac99)
    
<h2 align = "center"> <font font face = "forte"> <a name="Newton">  4.Interpolación de newton </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

La interpolación de Newton es una técnica ampliamente utilizada en el campo de los métodos numéricos y es fundamental para la aproximación de funciones suaves y la resolución de problemas matemáticos y computacionales que requieren el ajuste preciso de curvas a datos conocidos.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>
  
     public static double interpolate(double[] x, double[] y, double xTarget) {
        double yTarget = y[0];
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] <= xTarget && x[i + 1] > xTarget) {
                double h = x[i + 1] - x[i];
                double k = (xTarget - x[i]) / h;
                double y0 = y[i];
                double y1 = y[i + 1];
                yTarget = y0 + k * (y1 - y0);
                break;
            }
        }
        return yTarget;
    }

    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 4.0, 6.0, 8.0, 10.0};

        double xTarget = 2.5;

        double yTarget = interpolate(x, y, xTarget);

        System.out.println("El valor interpolado de y para x = " + xTarget + " es " + yTarget);
      }
    }

  ![Screenshot 2024-05-14 204415](https://github.com/Hante990/Interpolaci-n2/assets/107586879/a5a337a4-8aac-4526-8771-3b708eac912c)
  
  -----------------------------------------------------------------------------------------
 <h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i>  <a name="SO"> Tema 6 - Solución de ecuaciones diferenciales<i> </b> </font> </h1>
   -----------------------------------------------------------------------------------------

<h2 align = "center"> <font font face = "forte"> Descripción </a></h2>
Los métodos de Euler, Taylor y Runge-Kutta son herramientas numéricas para resolver ecuaciones diferenciales. El método de Euler es simple pero puede ser inestable, el método de Taylor es preciso pero no se utiliza comúnmente, y el método de Runge-Kutta es preciso y estable, siendo especialmente popular el método de Runge-Kutta de orden 4.
  
Existen varios métodos para resolver ecuaciones diferenciales, cada uno con sus propias características y aplicaciones. Algunos de los más comunes son:
  <li>1.-Euler</li>
  <li>2.-Runge-Kutta</li>
  <li>3.-Taylor</li>

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font font face = "forte">  <a name="EU"> 1. Euler </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Euler es un método iterativo simple y rápido para resolver EDOs. Se basa en la aproximación de la pendiente en un punto y se utiliza para calcular el valor de la variable en el siguiente paso. El método de Euler es de orden 1, lo que significa que el error por paso es del orden de ℎ, donde ℎ es el tamaño del paso. Aunque es rápido, el método de Euler puede ser inestable y no es adecuado para problemas que requieren una alta precisión.   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    /*
      * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
      * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
    */
    package Euler;

     /**
     *
     * @author alons
    */
      public class E1 {

     public static void main(String[] args) {
        // Ecuación diferencial: dy/dx = (x + y + xy)
        // Condiciones iniciales: y(0) = 1
        double x0 = 0, y0 = 1, x, y, h = 0.025, xEnd = 0.1;
        int n = (int)((xEnd - x0) / h);
        
        x = x0;
        y = y0;
        
        System.out.println("x\ty");
        System.out.println(x + "\t" + y);
        
        for (int i = 0; i < n; i++) {
            y = y + h * dydx(x, y);
            x = x + h;
            System.out.println(x + "\t" + y);
         }
       }
    
        public static double dydx(double x, double y) {
        return x + y + x * y;
          }
       }
![Screenshot 2024-05-28 232923](https://github.com/Hante990/Tema_6/assets/107586879/d2b28a67-3dcc-45b8-8880-0f6e404a1b89)

<h2 align = "center"> <font font face = "forte">  <a name="RU"> 2.- Runge-Kutta </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Runge-Kutta es un conjunto de métodos numéricos iterativos que se utilizan para resolver EDOs. Estos métodos se basan en la expansión de la función en serie de Taylor y se utilizan para calcular la pendiente en varios puntos dentro del intervalo de integración. El método de Runge-Kutta es de orden 𝑛, donde 𝑛 es el orden del método. Los métodos de Runge-Kutta son más precisos que el método de Euler y se utilizan ampliamente en problemas que requieren una alta precisión. El método de Runge-Kutta de orden 4 es especialmente popular debido a su buena precisión y estabilidad.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    /*
      * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
      * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
    */
     package Rugen_Kutta;

    /**
    *
    * @author alons
    */
    public class E1 {
    public static void main(String[] args) {
        // Ecuación diferencial: dy/dx = x^2 - y
        // Condiciones iniciales: y(0) = 1
        double x0 = 0, y0 = 1, x, y, h = 0.025, xEnd = 0.1;
        int n = (int)((xEnd - x0) / h);
        
        x = x0;
        y = y0;
        
        System.out.println("x\ty");
        System.out.println(x + "\t" + y);
        
        for (int i = 0; i < n; i++) {
            double k1 = h * dydx(x, y);
            double k2 = h * dydx(x + 0.5 * h, y + 0.5 * k1);
            double k3 = h * dydx(x + 0.5 * h, y + 0.5 * k2);
            double k4 = h * dydx(x + h, y + k3);
            
            y = y + (k1 + 2*k2 + 2*k3 + k4) / 6;
            x = x + h;
            System.out.println(x + "\t" + y);
         }
       }
    
        public static double dydx(double x, double y) {
        return x * x - y;
          }
       }
 
![Screenshot 2024-05-28 233417](https://github.com/Hante990/Tema_6/assets/107586879/c9594910-de12-47a5-8109-85a09064a8d7)

<h2 align = "center"> <font font face = "forte"> <a name="LA">  3.- Taylor </a></h2>

<h3> <font font face = "arial"> DESCRIPCIÓN: </h3>

El método de Taylor es una técnica para expandir una función en serie de Taylor, lo que permite aproximar la solución de una EDO. El método de Taylor se basa en la expansión de la función en serie de Taylor en torno a un punto y se utiliza para calcular la pendiente en ese punto. El método de Taylor es de orden 𝑛, donde 𝑛 es el orden de la expansión. Sin embargo, el método de Taylor no se utiliza comúnmente debido a que los métodos de Runge-Kutta de orden 𝑛 tienen la misma precisión que el método de Taylor de orden 𝑛, pero requieren menos evaluaciones de la función.
   
<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

     /*
       * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
       * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
        package Taylor;

      /**
      *
      * @author alons
      */
         public class E1 {
         public static void main(String[] args) {
        // Ecuación diferencial: dy/dx = x^2 - y
        // Condiciones iniciales: y(0) = 1
        double x0 = 0, y0 = 1, x, y, h = 0.025, xEnd = 0.1;
        int n = (int)((xEnd - x0) / h);
        
        x = x0;
        y = y0;
        
        System.out.println("x\ty");
        System.out.println(x + "\t" + y);
        
        for (int i = 0; i < n; i++) {
            double k1 = h * dydx(x, y);
            double k2 = h * (dydx(x + h, y + k1));
            
            y = y + (k1 + k2) / 2;
            x = x + h;
            System.out.println(x + "\t" + y);
        }
    }
    
    public static double dydx(double x, double y) {
        return x * x - y;
     }
    }

![Screenshot 2024-05-28 233815](https://github.com/Hante990/Tema_6/assets/107586879/49668357-7db1-4707-a52e-1c704bc75cc7)




