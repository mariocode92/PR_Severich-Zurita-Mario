public class PR_Severich_Zurita_Mario {

    // ejemplo: 
//[0 0 0 0 0]
//[1 0 0 0 0]
//[2 0 0 0 0]
//[2 0 0 1 0]
//[2 2 2 2 2]
//[3 2 2 2 2]
//[3 2 2 2 4]

    /**
     * @param N
     * @param A
     * @return
     */
    public static int[] solution(int N, int[] A) { //creamos la clase y tipo entero de solucion, donde N es el numero de contadores y  A es el tamaño de la matriz
        int[] contadores = new int[N]; // se crea un array llamado contadores que sea de tamaño N
        int maxcontador = 0; //se crea un contador maximo para la 2da condicional
        int contadormaximo =0;
        while(N <= 100000 && A.length <=100000){ //aqui garantizamos la condicional de que N y  M(la longitud de A) sean menores o iguales a 100000
        for(int i = 0; i < A.length; i++) { //con este ciclo for se va moviendo de posicion en posicion hasta llegar a la ultima posicion del tamaño de A
            if(A[i] >= 1 && A[i] <= N) {  
                contadores[A[i]-1]=contadores[A[i]-1]+1;
                if(contadores[A[i]-1] > maxcontador) {
                    maxcontador = contadores[A[i]-1];
                }
            }
        } 
        if(A[i] == N + 1) { //Si el valor en A[i] = N + 1, se debe usa el valor del maxcontador
            contadormaximo = maxcontador;
            maxcontador = 0;
            contadores = new int[N];
        }
        for (int i = 0; i < N; i++) { // ciclo que recorre las operaciones que no se consideraron en la anterior operacion
        contadores[i]=contadormaximo;
        }
    }
        return contadores; //resultado de contadores
    }
}
