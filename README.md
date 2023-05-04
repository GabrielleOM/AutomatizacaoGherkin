## Teste Gherkin Automatizado
Esse é um repositório que contém a automação de um teste de software em Gherkin.

## Tecnologias Utilizadas
- Java
  https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html
- JUnit
  https://mvnrepository.com/artifact/junit/junit/4.13.2
- Maven
  https://maven.apache.org/

- Cucumber
  https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.12.0
  https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.12.0
- Selenium WebDriver
  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.9.0

## Testes Automatizados
Teste criado para validar se o cenário de teste em Gherkin considerado como crítico funciona conforme o esperado na tela de login na plataforma da empresa Toro

## Notas Gerais
Foi criado um arquivo **.feature** para o armazenamento do cenário de teste em Gherkin.
Para que esse cenário possa ser executado de forma automatizada, foi criado também uma classe **Runner.java** que possui o intuito de executar os testes definidos nos arquivos .feature e também encontrar os métodos correspondentes no arquivo **LoginSteps.java** de definição de passos.