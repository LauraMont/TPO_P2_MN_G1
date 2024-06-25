package Ejercicio5;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 2.5: pila ordenada
        DynamicStack pilaDesordenada = new DynamicStack();
        pilaDesordenada.add(56);
        pilaDesordenada.add(23);
        pilaDesordenada.add(2);
        pilaDesordenada.add(2);
        pilaDesordenada.add(56);
        pilaDesordenada.add(1);
        pilaDesordenada.add(23);
        ordenarYRemoverDuplicados(pilaDesordenada);
        //Metodo montecarlo
//      1. Cree un TDA que represente una coordenada en el plano --> clase Coordenada
//      2. Defina una región cuadrada en el primer cuadrante. --> Primer cuadrante es el cuadrado correspondiente a 1x1 (0 a 1)
//      3. Cree un TDA Montecarlo que tenga un método que reciba una coordenada y la almacene dentro de
//      su estructura solo si esta presente en la región delimitada por el cuadrado.
        SetMontecarlo conjunto = new SetMontecarlo(0, 1, 0, 1);
//      4. Cree un conjunto de coordenadas y agreguele elementos hasta que su cardinal sea 1000, de forma aleatoria.
        for (int i=0; i<1000;i++){
            Random random = new Random();
            conjunto.add(new Coordenada(random.nextFloat(1),random.nextFloat(1)));
        }
//      5. Llene la estructura Montecarlo con estos elementos y utilícelos para aproximar π.
        int dentroDelCirculo = 0;
        for (int i = 0; i < conjunto.size(); i++) {
            Coordenada coord = conjunto.getCoordenadas(i);
            //calcular si esta dentro del circulo
            if (Math.pow(coord.getX(), 2) + Math.pow(coord.getY(), 2) <= 1) {
                dentroDelCirculo++;
            }
        }
        double piAproximado = 4.0 * dentroDelCirculo / 1000;
        System.out.println("Aproximación de π: " + piAproximado);
    }
    //Complejidad computacional : O(n2) + O(n) = O(n2)
    public static DynamicStack ordenarYRemoverDuplicados(DynamicStack pila){
        //ordenamos listado restante
        DynamicStack pilaOrdenada = ordenarPila(pila); //O(n2)
        //removemos numeros repetidos y retornar pila final
        return removerDuplicados(pilaOrdenada); //O(n)
    }
    //Complejidad computacional: O(n)+O(n)*O(n)=O(n)+O(n2) = O(n2)
    public static DynamicStack ordenarPila(DynamicStack pila){
        DynamicStack input = duplicarPila(pila);//O(n)
        DynamicStack tmpStack= new DynamicStack();
        while(!input.isEmpty()){ //O(n)*O(n)
            int tmp = input.getTop();
            input.remove();
            while(!tmpStack.isEmpty() && tmpStack.getTop()< tmp){
                input.add(tmpStack.getTop());
                tmpStack.remove();
            }
            tmpStack.add(tmp);
        }
        return tmpStack;
    }
    //Complejidad computacional: O(n)
    public static DynamicStack removerDuplicados(DynamicStack s){
        DynamicStack returner = new DynamicStack();
        //Supongo que s es una pila con elementos ordenados
        int n = 0;
        while(!s.isEmpty()) { //O(n)
            n = s.getTop();
            s.remove();
            if (!s.isEmpty() && s.getTop() != n )  {
                returner.add(n);
            }
        }
        returner.add(n);
        return returner;
    }

    //Complejidad computacional = O(n) + O(n) = O(n)
    public static DynamicStack duplicarPila(DynamicStack pila){
        DynamicStack aux = new DynamicStack();
        DynamicStack copia = new DynamicStack();
        while(!pila.isEmpty()){ //O(n)
            aux.add(pila.getTop());
            pila.remove();
        }
        while(!aux.isEmpty()){ //O(n)
            copia.add(aux.getTop());
            pila.add(aux.getTop());
            aux.remove();
        }
        return copia;
    }
}