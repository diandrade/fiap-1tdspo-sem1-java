# Semana 7 

## construtores.ConstrutoresApp em Java

Em Java, os construtores são métodos especiais que servem para inicializar objetos no momento da sua criação. Eles *possuem o mesmo nome da classe* e *não possuem tipo de retorno*, nem mesmo `void`.

**Características Essenciais**:

* **Nome**: Sempre o mesmo nome da classe.
* **Retorno**: Sem tipo de retorno, nem `void`.
* **Modificadores de acesso**: Podem ser `public`, `private` ou `protected`.
* **Parâmetros**: Opcionalmente, podem receber parâmetros para inicializar os atributos do objeto.

**Funcionalidades**:

* **Inicialização de Atributos**: Permitem definir valores iniciais para os atributos de instância da classe.
* **Execução Automática**: São chamados automaticamente quando um novo objeto é criado com o operador `new`.
* **Sobrecarga**: É possível ter mais de um construtor com diferentes parâmetros, permitindo flexibilidade na criação de objetos.
* **Chamada ao Construtor da Superclasse**: O construtor da superclasse pode ser chamado explicitamente com a palavra-chave super.

**Tipos de construtores.ConstrutoresApp**:

* **Construtor Padrão**: Não possui parâmetros e é usado para criar objetos com valores default.
* **Construtor com Parâmetros**: Permite inicializar os atributos do objeto com valores específicos no momento da criação.
* **Construtor de Cópia**: Cria um novo objeto a partir de outro já existente.


**Exemplos**:
```java
class Carro {
  private String marca;
  private int ano;

  // Construtor padrão
  public Carro() {
    this.marca = "Fiat";
    this.ano = 2023;
  }

  // Construtor com parâmetros
  public Carro(String marca, int ano) {
    this.marca = marca;
    this.ano = ano;
  }

  // ...
}

// Criação de objetos usando construtores
Carro carro1 = new Carro(); // Usa o construtor padrão
Carro carro2 = new Carro("Volkswagen", 2024); // Usa o construtor com parâmetros
```


**Importância dos construtores.ConstrutoresApp**:

* Permitem controlar a inicialização dos objetos, garantindo que estejam em um estado consistente.
* Facilitam a criação de objetos com diferentes configurações.
* Promovem flexibilidade e reuso de código.

---

## Equals e HashCode em Java: Uma Dupla Essencial para Coleções e Comparação de Objetos

**Equals** e **HashCode** são dois métodos fundamentais em Java que trabalham em conjunto para garantir a comparação eficiente e precisa de objetos em coleções e outras operações.

**Equals:**

* **Objetivo**: Verifica se dois objetos são iguais em termos de seus valores.
* **Implementação padrão**: Compara os endereços de memória dos objetos, o que é ineficiente e inconsistente.
* **Boa prática**: Sobrescrever o método equals para comparar os atributos relevantes do objeto.

Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pessoa.Pessoa)) {
            return false;
        }
        pessoa.Pessoa other = (pessoa.Pessoa) obj;
        return Objects.equals(nome, other.nome) && idade == other.idade;
    }
}
```

**HashCode:**

* **Objetivo**: Gera um código hash para um objeto, que pode ser usado para comparação rápida em *coleções*.
* **Implementação padrão**: Gera um código hash baseado no endereço de memória do objeto, que é ineficiente e inconsistente.
* **Boa prática**: Sobrescrever o método hashCode para gerar um código hash consistente com base nos atributos do objeto.

Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
```

**Observação:** Aprofundaremos e HashCode no próximo semestre quando começarmos a estudar Vetores e Collections Framework.

---

## Métodos de acesso - Getters e Setters

**O que são Gets e Sets**?

Gets e sets são métodos especiais em Java que servem para acessar e modificar os atributos privados de uma classe.

* **Getters**: Retornam o valor de um atributo privado.
* **Setters**: Definem o valor de um atributo privado.

**Necessidade de Gets e Sets**:

* **Encapsulamento**: Permitem controlar o acesso aos atributos da classe, protegendo-os de alterações indevidas.
* **Validação**: Permitem realizar validações nos valores antes de serem atribuídos aos atributos.
* **Reutilização**: Permitem padronizar o acesso aos atributos, facilitando a reutilização do código.

**Importância de evitar Gets e Sets desnecessários**:

* **Eficiência**: A criação de métodos desnecessários pode tornar o código mais lento e menos eficiente.
* **Manutenabilidade**: Aumenta a quantidade de código que precisa ser mantida, tornando-a mais complexa.
* **Legibilidade**: Torna o código mais difícil de entender, pois aumenta o número de métodos sem necessidade.

**Quando usar Gets e Sets**:

* **Atributos privados**: Utilize gets e sets para acessar e modificar atributos privados.
* **Validação**: Utilize gets e sets para realizar validações nos valores antes de serem atribuídos aos atributos.
* **Reutilização**: Utilize gets e sets para padronizar o acesso aos atributos, facilitando a reutilização do código.

**Dicas para evitar Gets e Sets desnecessários**:

* **Métodos alternativos**: Utilize métodos específicos para realizar operações complexas nos atributos, em vez de gets e sets simples.
* **Considere o contexto**: Avalie se a necessidade de gets e sets justifica a criação de métodos adicionais.


**Exemplo**:

```java
public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

}
```

Neste exemplo, os gets e sets são necessários para proteger os atributos `nome` e `idade` de alterações indevidas. O setter de `idade` também realiza uma validação para garantir que a idade seja um valor positivo.


## Encapsulamento

O encapsulamento é um pilar fundamental da orientação a objetos em Java. Ele consiste em ocultar os detalhes internos de um objeto e expor apenas uma interface pública para sua manipulação. Essa prática oferece diversos benefícios, como:

**Segurança**: Protege os dados internos contra acessos e modificações indevidas, garantindo a integridade do objeto.

**Manutenabilidade**: Facilita a manutenção do código, pois os detalhes de implementação ficam ocultos, permitindo modificar o funcionamento interno sem afetar os usuários do objeto.

**Reutilização**: Permite criar objetos mais genéricos e reutilizáveis, pois a interface pública define um contrato claro de como o objeto pode ser usado.

**Flexibilidade**: Permite modificar a implementação interna do objeto sem afetar os clientes que o utilizam, desde que a interface pública permaneça a mesma.

**Mecanismos de Encapsulamento em Java**:

* **Modificadores de Acesso**: Permitem controlar o nível de acesso aos membros de uma classe (atributos e métodos).
    * `public`: Permite acesso de qualquer lugar.
    * `private`: Permite acesso apenas dentro da classe.
    * `protected`: Permite acesso dentro da classe e de classes filhas.

* **Atributos Privados**: Os atributos de um objeto geralmente são declarados como private para garantir que apenas os métodos da classe possam acessá-los diretamente.
* **Métodos Acessores (Getters e Setters)**: São métodos públicos que permitem ler e modificar os valores dos atributos privados.
    * `get` - Lê o valor de um atributo privado.
    * `set` - Modifica o valor de um atributo privado.


# Cursos extras na alura

[Plano de estudos na alura](https://cursos.alura.com.br/meu-plano-de-estudos-ferrertiago-1744399603028-p916621)
[Excalidraw](https://link.excalidraw.com/l/9AI4i5UmzF2/4YXxC5mNjDg)