package JavaSintaxeBasica;

import java.util.*;

/**
 * java.util.Set
 * Não permite elementos duplicados!
 * Não possui índice!
 * Quando utilizar HashSet,LinkedHashSet e TreeSet
 *    HashSet                       LinkedHashSet                       TreeSet
 *   Utilizaa                        Utiliza LinkedHasMap               Utiliza a TreeMap
 *   a implementação
 *   HashMap para armazenar
 *   os elementos.
 *
 *   Não mantém a                    Mantém a ordem de inserção.       Mantém a ordem natural dos
 *   ordem do elemento(fica                                            elementos(ordena).
 *   aleatoria).
 *
 *   Performace melhor em             Performace intermediaria,entre    Performace baixa em relação a
 *   relação a LinkedHashSet e        HashSetXTreeSet                   HashSetXLinkedHashSet
 *   TreeSet.
 *
 *  Permite no máximo                 Permite no máximo um elemento     Não permite elemento null
 *  um elemento null                  null
 *
 */

public class ColletionSet {
    public static void main(String[] args) {
        //Set<Double> notas = new HasSet<>();
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5d,9.3d,5d,7d,0d,3.d));

        System.out.println("### Listando notas ###");
        System.out.println(notas);

        System.out.println("# Confira se a nota 5.0 esta no conjunto: "+notas.contains(5d));
        System.out.println("# Maior nota: "+ Collections.max(notas));
        System.out.println("# Menor nota: "+ Collections.min(notas));
        Double soma = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("# Exiba a soma dos valores :"+soma);
        System.out.println("# Media das notas :"+soma/notas.size());
        System.out.println("# Remova a nota 0 :");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exibir as notas na ordem que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5d,9.3d,5d,7d,0d,3.d));
        System.out.println(notas2);

        System.out.println("Ordem Crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apagando dados do conjunto............");
        notas.clear();
        System.out.println("Dados apagados? " +notas.isEmpty());

    }
}
