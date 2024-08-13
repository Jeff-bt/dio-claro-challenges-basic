# Conta Bancária

Desenhando arquitetura de um Iphone via UML

### Conhecimentos adquiridos:

- Padrão UML

### Resultado do Desafio 

```mermaid
classDiagram
    Iphone <|-- ReprodutoMusical
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet
    
    class ReprodutoMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

```


## Desafio
 [Link do Desafio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)
