package JavaSintaxeBasica;

import java.util.*;

public class CollectionsOrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '170s show","Comedia",25));
        }};

        System.out.println("# Ordem aleatoria #");
        for (Serie serie: minhasSeries) {
        System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        System.out.println("# Ordem de Insercao #");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Got","fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '70s show","comedia",25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        System.out.println("# Ordem Natural #");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        System.out.println("# Ordenar por Nome/Geneo/TempoEpisodio#");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        System.out.println("# Ordenar Genero #");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) {
            System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }

        System.out.println("# Ordenar Tempo de Episodio #");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatoTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) {
            System.out.println(serie.getNome()+"-"+ serie.getGenero()+"-"+serie.getTempoEpisodio());
        }


    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
        if ( tempoEpisodio != 0 ) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatoGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {// 0 - indica que são iguais
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0 ) return nome;/*Se os nomes forem diferentes,compara por nome*/

        /*Se os nomes são iguais,e o genero diferente,compara genero*/
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0 ) return genero;

        return  Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());
    }
}

class ComparatoGenero implements Comparator<Serie>{
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareTo(s2.getGenero());
    }
}

class ComparatoTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {  // 0 - indica que são iguais
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0 ) return nome;

        return   s1.getGenero().compareTo(s2.getGenero());
    }
}