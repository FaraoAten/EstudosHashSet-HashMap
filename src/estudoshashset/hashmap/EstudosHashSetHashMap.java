package estudoshashset.hashmap;

import java.util.HashSet;

public class EstudosHashSetHashMap {
    public static void main(String[] args) {
        //HashSet
        //O HashSet permite a manipulação de conjuntos em Java
        
        HashSet<String> sabemJava = new HashSet<>();//O HashSet é construído de maneira similar as listas e possuem algumas funcionalidades similares também.
        sabemJava.add("João");//Como o método add por exemplo
        sabemJava.add("Teresa");
        
        /*
        sabemJava.add("Teresa");//Em estruturas Hash, elementos iguais não são adicionados.
        System.out.println(sabemJava.size());
        sabemJava.forEach(System.out::println);
        */
        
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
    }
    
}
