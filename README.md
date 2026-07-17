# Lembrar de ler o repositório para conhecer os execicios de java com IA da DIO #

https://github.com/digitalinnovationone/exercicios-java-basico

Trabalhando com Records
Anotações e exercício da aula sobre Records em Java.
📌 Conceitos

record é um recurso adicionado no Java 16 (estável), voltado para representar objetos imutáveis.
Uma vez criado, os valores de um record não podem ser alterados — ele serve apenas para leitura.
Não é permitido declarar propriedades no corpo do record; apenas atributos estáticos são aceitos ali.
É possível adicionar métodos ao record, mesmo com essas limitações em relação a uma classe comum.
É possível ter construtores secundários, mas eles são obrigados a delegar para o construtor canônico (o construtor "padrão" do record) via this(...), passando um valor para cada campo — mesmo que seja null, se o tipo aceitar.
O construtor compacto (public Person { }) é chamado automaticamente em toda criação do objeto. Vazio, ele não faz nada além do que o construtor canônico já faz sozinho — mas é o lugar onde entrariam validações/normalizações dos dados, por exemplo:

javapublic Person {
    if (age < 0) {
        throw new IllegalArgumentException("Age não pode ser negativa");
    }
}
💻 Código
javapublic class Main {
    public static void main(String[] args) {
        var person = new Person("João");
        // O age foi pego do construtor secundário do Person,
        // então conseguimos trabalhar com mais de 1 construtor com record,
        // porém somos obrigados a chamar o construtor default do record
        // e, por eles serem imutáveis, precisam receber obrigatoriamente
        // 1 valor, nem que seja um null (caso o tipo aceite).

        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
}

public record Person(String name, int age) {
    // Também podemos trabalhar com métodos no record,
    // mesmo ele tendo algumas limitações em relação às classes,
    // e também podemos ter construtores secundários

    public Person {
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
✅ Saída esperada
Name: João, Age: 1
João
