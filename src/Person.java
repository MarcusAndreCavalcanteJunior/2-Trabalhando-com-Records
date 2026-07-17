/*record não permite ser declaradas propriedades no corpo dele, só é
permitido declarar atributos estaticos. e record é uma classe imutavel
os valores dela não podem ser alterados, vc só pode usar ela para leitura
ELA FOI FEITA PARA TRABALHAR COM OBJETOS IMUTAVEIS*/
public record Person(String name, int age) {
/*Também podemos trabalhar com métodosno record,mesmo ele tendo algumas
limitações em relação as classes e tbm podemos ter construtores
secundários */
    public Person {

    }

    public Person (String name){
        this(name, 1);
    }

    public String getInfo(){
        return "Name: " + name + ", Age: " + age;
    }
}
