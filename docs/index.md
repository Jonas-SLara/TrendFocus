# TrendFocus
___

> **TrendFocus: Hub Inteligente de Notícias Acadêmicas e Profissionais**

## Visão Geral do Projeto

O TrendFocus é um agregador de notícias especializado, desenvolvido para enfrentar a sobrecarga de informação e a dificuldade em manter-se atualizado com as tendências específicas de cada área de conhecimento da graduação, pós e atuação profissional.

A plataforma ainda coletará dados de fontes estratégicas (regionais, nacionais e internacionais) através de técnicas
para coleta de dados tais como Web crawling e web scraping que por sua vez serão eorganizados em relatórios agendados para depois serem consumidos pela API, USUARIOS com a permisão de
ADM ficão responsáveis de atualizar esta API com relatórios,
mas também conta com a colaboração de outros USUARIOS com a permissão de ANALISTA para inserir dados e atualizar de forma manual

O objetivo final é fornecer a estudantes, professores e profissionais um feed de notícias filtrado, analítico e acionável, transformando o consumo de notícias em uma ferramenta de pesquisa e planejamento de carreira.

## Funcionalidades:
As funcionalidades para usuários que dejesam consultar os dados da API incluem:

- pesquisa de analise de tendencias (uma consulta que retorna os dados agrupados do total de notícias por categoria e termo chave)

- consulta de noticias recentes (permite consultar ultimas noticias em uma determinada data através de um filtro por área de conhecimento também)

- consulta por termos chaves (permite visualizar os termos chaves com seus devidos tópico linkados e a área de conhecimento)

- consulta por tópicos (permite visualizar todos os tópicos cadastrados com sua área de conhecimento)

## Regras de Negócio
- paginação de dados: para consultas maiores como noticias, termos chaves e topicos, os dados devem ser paginados, preciando assim de uma requisição nova para acessar a pagina e os itens
especificados

- na consulta de analise de tendencias os dados precisam OBRIGATORIAMENTE seguir uma ordenação por categoria e quantidade de noticias de forma decrescente

- exclusão de tópicos gera exclusão em cascata de todos os seus termos

- é obrigatório a inclusão de pelo menos um termo chave nas noticias

## Modelagem Conceitual

**veja sobre o modelo ER em [Artefatos](artefatos.md)**

## Permissões de usuario, casos de uso

**veja sobre o diagram de casos de uso em [Artefatos](artefatos.md)**

## Documentação da API

**veja sobre o springdocs em [Para desenvolvedores](devs.md)**