# Para Desenvolvedores

Toda documentação da api é gerada pela dependência instalada pelo maven

```xml
<dependency>
	<groupId>org.springdoc</groupId>
	<artifactId>springdoc-openapi-starter-webmvc-ui<artifactId>
	<version>2.8.13</version>
</dependency>
```

Esta documentação pode ser acessível acessando o endereço de onde a aplicação está pelo caminho definido no aplication.properties que é o padrão:

```yml
#springdoc
springdoc.api-docs.enabled=true
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.enabled=true
springdoc.swagger-ui.path=swagger-ui.html
```

Na url, se estiver rodando a aplicação em servidor local na porta 3000 com o contexo em api -- ver configurações no aplication.properties! ficaria:

```bash
http://localhost:3000/api/swagger-ui.html
```
