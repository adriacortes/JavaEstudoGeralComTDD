package JavaSintaxeBasica;

import java.util.*;

public class OrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("#Ordem aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg,Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("Licoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }

        System.out.println("#Ordem de insercao");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg,Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yuval Noah", new Livro("Licoes para o seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }

        System.out.println("#Ordem alfabetica dos autores: ");//Pela chave do MAP
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        System.out.println("#Ordem alfabetica dos livros:");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());/*Utilizando Comparator*/
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + "-" + livro.getValue().getNome());
        }
        System.out.println("#Ordenar pela pagina:");
        Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String,Livro> livro : meusLivros4) {
            System.out.println(livro.getKey()+"-"+livro.getValue().nome+"-"+livro.getValue().getPaginas());
        }
    }
}

class Livro{
    String nome;
    Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

    class ComparatorNome implements Comparator<Map.Entry<String,Livro>> {
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
        }
    }

class ComparatorPagina implements Comparator<Map.Entry<String,Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}