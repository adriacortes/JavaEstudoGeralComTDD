package JavaSintaxeBasica;

import java.util.*;

/*
* Elementos únicos(key) para cada valor(value)
*
* */
public class InterfaceMap {
    public static void main(String[] args) {
      //  HashMap<String,Double> carrosPopulares = new HashMap<>();
       // Map<String,Double> carrosPopulares2020 = Map.of("gol",14.0,"uno",14.6);

        System.out.println("# Crie um dicionario que relacione modelo e seus respctivos consumos #");
        /*Tipo da chave e tipo do valor*/
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",17.6);
            put("mobi",18.1);
            put("hb20",18.50);
            put("kwid",19.6);
        }};

        System.out.println(carrosPopulares);
        System.out.println("#Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares);
        System.out.println("#Confira se o modelo tucson esta no dicionario:" + carrosPopulares.containsKey("kwid"));
        System.out.println("#Exiba o consumo do Uno: "+carrosPopulares.get("uno"));

        System.out.println("#Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("#Exiba os consumos:  ");
        Collection<Double> cosumos = carrosPopulares.values();
        System.out.println(cosumos);

        System.out.println("#Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficientes = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente="";
        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficientes)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Moloe mais eficiente: "+modeloMaisEficiente+"-"+consumoMaisEficientes);
            }

        }
        System.out.println("#Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente="";

        /*Retorna um SET para trabalhar com valores separadamente - entrySet*/
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + "-" + consumoMenosEficiente);
            }
        }
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("#Exiba a soma dos consumos: "+soma);

        System.out.println("#Media do consumo :"+soma/carrosPopulares.size());

        System.out.println("#Remova os modelos com consumo igual a 18,1 km/l:");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(18.1)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("#Exibir os carros na ordem de insercao:");
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",17.6);
            put("mobi",18.1);
            put("hb20",18.50);
            put("kwid",19.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("Ordene pelo modelo: ");
        Map<String,Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println("Apague os dados");
        carrosPopulares.clear();
        System.out.println("O conjunto esta vazio:"+carrosPopulares.isEmpty());



    }
}
