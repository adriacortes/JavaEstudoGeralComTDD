package JavaSintaxeBasica;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios=Arrays.asList("1","0","4","1","2","3","9","6","5");
        System.out.println("Listando dados do array");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um SET:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        /* Outra forma de fazer :
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());*/

        System.out.println("Transforme esta lista de String em uma lista de numeros inteiros:");
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        for (Integer i: numerosInteiros) {
            System.out.println(i);
        }
      /* Outra Forma:
      numerosAleatorios.stream().map(Integer::parseInt).
      collect(Collectors.toList()).forEach(System.out::println);
      */

        System.out.println("Pegue os numeros pares maiores que 2 e coloque em uma lista");
        List<Integer> numerosPares = numerosAleatorios.stream().map(Integer::parseInt).
                filter( i->i % 2 == 0 && i>2).collect(Collectors.toList());
        numerosPares.forEach(System.out::println);

        System.out.println("Media dos numeros");
        numerosAleatorios.stream().mapToInt( s -> Integer.parseInt(s)).average().ifPresent( System.out::println);

        System.out.println("Remova os valores impares");
        List<Integer> numerosImpares = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        numerosImpares.removeIf( i-> (i % 2 != 0));
        System.out.println(numerosImpares);

        System.out.println("Menor valor da lista");
        numerosAleatorios.stream().mapToInt( s -> Integer.parseInt(s))
                .min()
                .ifPresent(System.out::println);

        System.out.println("Maior valor da lista");
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s))
                .max()
                .ifPresent(System.out::println);

        System.out.println("Some os impares");
        int sum = numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s)).filter(i -> i % 2 != 0).sum();
        System.out.println(sum);

        System.out.println("Ordem numerica");
        Set<String> collect = numerosAleatorios.stream()
                .collect(Collectors.toSet());
        Set<String> ordem = new TreeSet<>(collect);
        ordem.forEach(System.out::println);

        System.out.println("Mostre a lista na ordem numerica: ");
        List<Integer> numerosOrdemNatural = numerosInteiros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores impares multiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosInteiros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);




    }//main
}
