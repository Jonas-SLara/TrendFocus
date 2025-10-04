# TrendFocus
> **TrendFocus: Hub Inteligente de Notícias Acadêmicas e Profissionais**

## Visão Geral do Projeto

O TrendFocus é um agregador de notícias especializado, desenvolvido para enfrentar a sobrecarga de informação e a dificuldade em manter-se atualizado com as tendências específicas de cada área de graduação e atuação profissional.

A plataforma coleta dados de fontes estratégicas (regionais, nacionais e internacionais) através de Web Scraping e os classifica automaticamente por áreas de conhecimento (ex: Sistemas para Internet, Ciencias Agrárias, Engenharia Cívil).

O objetivo final é fornecer a estudantes, professores e profissionais um feed de notícias filtrado, analítico e acionável, transformando o consumo de notícias em uma ferramenta de pesquisa e planejamento de carreira.

## Stack Tecnológico

Este projeto é uma aplicação full-stack utilizando Java para a inteligência de dados e Angular para a experiência do usuário.

| Tecnologia | Proposito |
|------------|-----------|
| Java + Spring Boot 3 | Lógica de negócios, segurança, persistência de dados e gerenciamento de agendamento de tarefas.|
| Jsoup / Selenium | Coleta de dados não estruturados de portais de notícias e transformação em datasets. |
| PostgreSQL | Armazenamento de notícias, histórico de coleta, fontes de áreas |

## Funcionalidades do sistema

### Coleta e Classificação (Web Scraping)

- [ ] Agendamento Robusto: Serviço em Java agendado (@Scheduled) para coletar dados em intervalos regulares, garantindo a atualização quase em tempo real.
- [ ] Curadoria de Fontes: Mapeamento de fontes de notícias em três níveis (Local/RS, Nacional e Internacional) para garantir uma perspectiva completa.
- [ ] Classificação Inteligente: Uso de dicionários de palavras-chave para classificar automaticamente as notícias raspadas nas áreas acadêmicas definidas.

### API REST e Geração de Dados (Spring Boot)

- [ ] Endpoints de Busca Avançada: Filtro de notícias por Múltiplas Áreas, Fonte, Palavra-chave e Período.
- [ ] Análise de Tendências: Endpoints dedicados para retornar dados de frequência de termos, permitindo ao frontend gerar gráficos de tendências.
- [ ] Exportação para CSV: Endpoint dedicado que gera um arquivo CSV estruturado, permitindo que professores e pesquisadores baixem datasets de notícias filtradas para uso em estudos.(apenas usuario logado e autenticado)

### Interface de Usuário (Angular)
- [ ] Painel Personalizado: Dashboard que exibe apenas as notícias relevantes para as áreas de interesse selecionadas pelo usuário.
- [ ] Visualização Analítica: Gráficos interativos mostrando a distribuição de volume de notícias entre as áreas de estudo e a flutuação da menção de keywords ao longo do tempo.
- [ ] Painel para exportação de csv (apenas usuario logado e autenticado)
- [ ] Recurso de Comparação: Permite a comparação lado a lado de fontes ou temas, avaliando a cobertura midiática de diferentes assuntos.


| Angular 17+ (TypeScript) | Interface de usuário (UI) dinâmica, dashboards de análise e visualização de tendências. |
| Chart.JS | Geração de gráficos para visualização de tendências e volume de notícias por tema.|
