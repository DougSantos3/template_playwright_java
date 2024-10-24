###  Criar um projeto
`mvn archetype:generate -DgroupId=com.example -DartifactId=playwright-java -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

### Compila e executa o projeto
`mvn compile exec:java -Dexec.mainClass=com.example.PlaywrightTest`

### Rodar os testes locais
`mvn test`