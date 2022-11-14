package JavaSintaxeBasica;

import java.util.*;

public class InterfaceListPrincipaisMetodos {
    /* java.util.list
    * Elementos duplicados e garante a ordem de inserção
    * Interface List : ArrayList / Vector / LinkedList
    * Interface Queue: LinkedList / PriorityQueue
    * Quando usar ArrayList X LinkedList
    * ArrayList: Deve ser usado onde mais operações de pesquisa são necessárias
    * LinkedList: Deve ser usado onde mais operações de inserção e exlusão são necessárias
    * (lista duplamente ligada)
    * */

    public static void main(String[] args) {
        /*Criando uma LIST e adicionado dados*/

        /* Dados já fixados ! Não pode remover ou inserir outros itens!*/
        List<Double> notas1 = Arrays.asList(6.5d,5d,8.5d,7.0d);
        List<Double> notas2 = List.of(3.5d,5.6d,5.8d);

        List<Double> notas = new ArrayList<>();

        /*Inserindo os dados*/
        notas.add(2.3d);
        notas.add(0d);
        notas.add(7d);
        notas.add(8.1d);
        notas.add(5d);
        notas.add(8d);
        notas.add(8.5d);
        notas.add(9.7d);
        notas.add(10d);
        notas.add(8.3d);
        notas.add(8.4d);
        notas.add(8.2d);
        System.out.println(notas);
        System.out.println("Retorna a posião do valor informado:" +notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 7.4 na posicao 4:");
        notas.add(4,7.4d);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5.0d),6.0);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista:"+ notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem que foram informadas:");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada"+ notas.get(2));
        System.out.println("Menor nota:"+ Collections.min(notas));
        System.out.println("Maior nota:"+ Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores:"+soma);
        System.out.println("Exiba a media das notas:" +soma/notas.size());
        System.out.println("Remova a nota 0 :" );
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Remova a nota na posicao 0 :" );
        notas.remove(0);
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7:" );
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println("Verifique se a lisata esta vazia:"+ notas.isEmpty() );



    }
}
