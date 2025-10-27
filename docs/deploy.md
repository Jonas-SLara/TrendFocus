# Deploy

## Na máquina local com docker:

1. clone o repo com:

```bash
git clone https://github.com/Jonas-SLara/TrendFocus
```

2. ache o arquivo docker-compose.yml no backend que contenha o script para instanciar um container do postgresql e execute:

```bash
docker compose up -d
```

3. rode a aplicação no terminal ou sua IDE favorita:

```bash
./mvnw spring-boot:run
```

obs: para o comando acima funcionar, deve-se estar na pasta raiz do backend onde estão o pom.xml e o wrapper do maven alem da pasta src/

4. agora dentro do container do postgres insira o sql presente na pasta sql/ para preencher o banco com dados iniciais

