package estudoshashset.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class EstudosHashSetHashMap {
    public static void main(String[] args) {
        /*
        //HashSet
        //O HashSet permite a manipulação de conjuntos em Java
        
        HashSet<String> sabemJava = new HashSet<>();//O HashSet é construído de maneira similar as listas e possuem algumas funcionalidades similares também.
        sabemJava.add("João");//Como o método add por exemplo
        sabemJava.add("Teresa");
        
        
        sabemJava.add("Teresa");//Nos HashSets elementos iguais não são adicionados.
        System.out.println(sabemJava.size());
        sabemJava.forEach(System.out::println);
        
        
        HashSet<String> sabemJS = new HashSet<>();
        sabemJS.add("José");
        sabemJS.add("Teresa");
        
        //Interseção dos 2 conjuntos representados pelos HashSets
        HashSet<String> sabemJavaEJS = new HashSet<>(sabemJava);//Criando um novo HashSet com todos os dados presentes em sabemJava para armazenar o resultado da interseção sem alterar os HashSets anteriores.
        sabemJavaEJS.retainAll(sabemJS);//Utilizando o método retainAll(Collection), ele mantém no HashSet base apenas os elementos que se fazem presentes tanto nele quanto na Collection passada como parâmetro.
        System.out.println("Sabem Java e JavaScript: ");
        sabemJavaEJS.forEach(System.out::println);
        
        //Diferença dos 2 conjuntos representados pelos HashSets
        HashSet<String> sabemSoJava = new HashSet<>(sabemJava);//Criando um novo HashSet com todos os dados presentes em sabemJava para armazenar o resultado da diferença sem alterar os HashSets anteriores.
        sabemSoJava.removeAll(sabemJS);//Utilizando o método removeAll(Collection), ele mantém no HashSet base apenas os elementos que não estão presentes na Collection passada como parâmetro.
        System.out.println("\nSabem Só Java: ");
        sabemSoJava.forEach(System.out::println);    
        
        //HashSets assim como outras Collections podem ser usadas em conjuto com streams, os métodos anotados aqui creio serem os que mais diferenciam os HashSet de outras estuturas de listas.
        */
                
        //HashMap
        //Collection que armazena os elementos em pares <chave, valor>, onde a chave fica relacionada ao valor.
        //O tipo da chave e do valor pode ser qualquer um, exceto tipos primitivos.
        //Nos HashMaps os valores não são armazenados de forma ordenada.
        //Nos HashMaps valores podem ser iguais, mas as chaves devem ser únicas.
        //O motivo de se usar HashMaps é a recuperação de dados, pois por ele trablhar indexando a informação com a chave fica mais fácil para o programa encontrá-la tornando-o mais rápido e performático. 
        
        HashMap<Integer, String> carros = new HashMap<>();
        
        //Métodos do HashMap:
        //Adicionar elementos
        carros.put(0, "Fusca");//Usa-se o método put indicando a chave e o valor do elemento para adicioná-lo no HashMap.
        carros.put(1, "Uno");
        carros.put(2, "Polo");
        carros.put(3, "Gol");
        carros.put(4, "Meriva");
        carros.put(5, "Cadete");
        
        System.out.println(carros);//Resultado da impressão do HashMap inteiro, ele retorna todos os valores em forma de lista relacionados com suas respectivas chaves.
        
        System.out.println("\n==========================================\n");
        
        //Atualiza um elemeto
        carros.put(1,"Camaro");///Ao usar o método put indicando uma chave já existente no HashMap e um valor é feita uma atualização no HashMap e o valor indicado passa a ser o novo valor relacionado àquela chave.
        System.out.println(carros);
        
        System.out.println("\n==========================================\n");
        
        carros.replace(1,"Pajero");///Ao usar o método replace indicando uma chave já existente no HashMap e um valor é feita uma atualização no HashMap e o valor indicado passa a ser o novo valor relacionado àquela chave, porém se a chave não existir no HashMap esse método simplesmente não faz nada, ao invés de adicionar o par no HadhMap.
        carros.replace(6,"Belina");
        System.out.println(carros);
        
        System.out.println("\n==========================================\n");
        
        //put sem atualizar
        carros.putIfAbsent(1,"HVR");///Ao usar o método putIfAbsent o par só vai ser adicionado ao HashMap se a chave indicada não existir nele.
        carros.putIfAbsent(6, "Camaro");
        System.out.println(carros);
        
        System.out.println("\n==========================================\n");
        
        //Remover um elemeto
        carros.remove(5);//Usa-se o método remove(key) que remove essa chave do HashMap e o que estiver relacionada à ela, também há uma assinatura desse método que recebe um valor, além da chave, e só efetua a remoção caso a chave especificada esteja relacionada com o valor especificado.
        System.out.println(carros);
        
        System.out.println("\n==========================================\n");
        
        //Retorna um elemento específico.
        System.out.println(carros.get(1));//Usa-se o método get(key) para se retornar elementos, ele retorna o valor relacionado àquela chave.
        
        System.out.println("\n==========================================\n");
        
        //Retornar o tamanho do HashMap
        System.out.println(carros.size());//Usa-se o método size para retornar o tamanho do HashMap.
        
        System.out.println("\n==========================================\n");
        
        //Retornar todos os valores presentes no HashMap
        for(String carro:carros.values()){//O método values retorna uma Collection com os valores presentes no HashMap.
            System.out.println(carro);
        }  
        
        System.out.println("\n==========================================\n");
        
        //Verificar a existência de uma chave
        System.out.println(carros.containsKey(2));//Usa-se o método containsKey passando uma chave para verificar se ela existe ou não no HashMap retornando um boolean.
        
        System.out.println("\n==========================================\n");
        
        //Verificar a existência de um valor
        System.out.println(carros.containsValue("Uno"));//Usa-se o método containsValue passando um valor para verificar se ele existe ou não no HashMap retornando um boolean.
        
        System.out.println("\n==========================================\n");
        
        //Remover todos os elementos
        carros.clear();//Através do método clear é possível excluir todos os elementos do HashMap deixando-o vazio.
        System.out.println(carros);
        
        System.out.println("\n==========================================\n");
        
        //Verificar se o HashMap está vazio
        System.out.println(carros.isEmpty());//Esse método retorna um boolean verificando se o HashMap está vazio ou não.
        
        //HashMaps assim como outras Collections podem ser usadas em conjuto com streams.
    }    
}
