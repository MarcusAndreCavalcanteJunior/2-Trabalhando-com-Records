public class Main {

    public static void main(String[] args) {
        var person = new Person("João");/*O age ele pegou e usou o do
construtor secundario do Person, então conseguimos trabalhar com mais de 1
construtor com record, porem somos obrigados a chamar o construtor default
do record e por eles serem imutaveis ele obrigatoriamente precisam receber
1 valor nem que seja um null em caso que eles aceitem. e o record é um
recurso adcionado no java 17*/

        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
}
