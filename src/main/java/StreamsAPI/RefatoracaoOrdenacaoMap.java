package StreamsAPI;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("#Listando itens - ordem aleatoria");
        HashMap<Integer, Contato> agenda = new HashMap<>(){{
            put(1,new Contato("Simba",222));
            put(3,new Contato("Cami",5555));
            put(2,new Contato("Jon",111));
        }};

        /*
        *Entry em Java fornece certos métodos para acessar a entrada no Mapa.
        *Ao obter acesso à entrada do Mapa, podemos manipulá-los facilmente
        * */
        /* for (Map.Entry<Integer,Contato> entry: entries) {
            System.out.println(entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero());
        }*/
        Set<Map.Entry<Integer, Contato>> entries = agenda.entrySet();
        entries.forEach(entry-> System.out.println("\n"+entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero()));

        System.out.println("#Listando itens - ordem do telefone"); /*Classe Anonima*/
        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().numero,contato2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set) {
            System.out.println(entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero());
        }

        System.out.println("#Listando itens - ordem do telefone(Comparator.comparing)");

        Set<Map.Entry<Integer,Contato>> set2 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> integerContatoEntry) {
                return integerContatoEntry.getValue().getNumero();
            }
        }));
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set2) {
            System.out.println(entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero());
        }
        System.out.println("#Listando itens - ordem do telefone(Lambda)");
        /*  Variável e o dado que quer ordenar  (cont -> cont.getValue.getNumero()) */
        Set<Map.Entry<Integer,Contato>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set3.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set3) {
            System.out.println(entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero());
        }

        System.out.println("#Listando itens - ordenar por nome");
        Set<Map.Entry<Integer,Contato>> dadosContato = new TreeSet<>(Comparator.comparing( contato -> contato.getValue().getNome()));
        dadosContato.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry : dadosContato) {
            System.out.println(entry.getKey()+"-"+entry.getValue().getNome()+"-"+entry.getValue().getNumero());
        }

    }
}

class Contato{
    String nome;
    Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
