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
| Angular 17+ (TypeScript) | Interface de usuário (UI) dinâmica, dashboards de análise e visualização de tendências. |
| Chart.JS | Geração de gráficos para visualização de tendências e volume de notícias por tema.|

## Funcionalidades e regras do sistema

> ## Módulo de Autenticação e Autorização (Spring Security)

| ID |	Requisito Funcional (RF) |
|-|-|
|RF001|	O sistema deve permitir que usuários (estudantes/professores/profissionais) se cadastrem na plataforma.|
|RN001| O cadastro deve exigir, no mínimo: nome, e-mail institucional/válido e senha.|
|RF002|	O sistema deve permitir o login e logout de usuários cadastrados.|
|RN002| O login deve ser validado via Spring Security (token JWT ou OAuth2, por exemplo), garantindo a persistência da sessão.|
|RF003|	O sistema deve gerenciar dois perfis de acesso: VISITANTE (default) e MEMBRO_ANALISTA (logado).|
|RN003| A funcionalidade de Exportação para CSV e o Recurso de Comparação Avançada devem ser acessíveis apenas para usuários com o perfil MEMBRO_ANALISTA.|

> ## Módulo de Web Scraping e Classificação
| ID |	Requisito Funcional (RF) |
|-|-|
|RF005|	O sistema deve realizar a coleta de notícias de fontes pré-configuradas em intervalos regulares.|
|RN005| O serviço de scraping deve ser agendado via @Scheduled (Spring) com uma frequência mínima de 30 minutos (ajustável).|
|RF006|	O sistema deve ser capaz de extrair o Título, Resumo, URL Original, URL da Imagem e Data de Publicação de cada notícia.|
|RN006| A data de publicação deve ser normalizada para o fuso horário padrão do sistema, independentemente do formato da fonte.|
|RF007|	O sistema deve classificar automaticamente cada notícia em uma ou mais Áreas de Conhecimento (ex: Sistemas para Internet, Engenharia Civil).|
|RN007| A classificação deve ser baseada na correspondência de palavras-chave (dicionário pré-configurado) encontradas no Título e no Resumo da notícia.|
|RF008|	O sistema deve registrar a Fonte (ex: G1, MIT Review, Blog UFSM) e o Nível da Fonte (Local, Nacional, Internacional) para cada notícia.|
|RN008| Notícias duplicadas (mesma URL Original) devem ser identificadas e descartadas durante o processo de coleta.|

> ## Módulo de API REST (Serviços de Dados e Análise)
| ID |	Requisito Funcional (RF) |
|-|-|
|RF009|	O sistema deve fornecer endpoints para listar as notícias com recursos de Paginação, Ordenação (por data) e Filtro por Área.|
|RN009| A ordenação padrão deve ser pela data de publicação, das mais recentes para as mais antigas.|
|RF010|	O sistema deve fornecer um endpoint para calcular e retornar a frequência das palavras-chave mais citadas em um determinado período e área.|
|RN010| Esta análise de frequência deve excluir stopwords (palavras comuns como "o", "a", "de") antes do cálculo.|
|RF011|	O sistema deve fornecer um endpoint seguro para Exportação de Dados para CSV.|
|RN011| O acesso a este endpoint deve ser protegido por Spring Security e exigir o perfil MEMBRO_ANALISTA. O CSV deve incluir todas as colunas de dados da notícia e a Área Classificada.|
|RF012|	O sistema deve fornecer endpoints para a gestão das Áreas de Conhecimento e suas Palavras-Chave associadas (CRUD)|
|RN012| O CRUD de Áreas deve ser acessível apenas para perfis de Administrador (se houver, ou para o MEMBRO_ANALISTA em uma versão inicial).|

> ##Módulo de Interface do Usuário (Angular)

| ID |	Requisito Funcional (RF) |
|-|-|
|RF013|	O frontend deve exibir um Feed Personalizado baseado nas áreas de interesse selecionadas pelo usuário logado.|
|RN013| Usuários VISITANTES verão um feed com as notícias mais populares ou das Áreas pré-definidas (default).|
|RF014|	A plataforma deve exibir Gráficos de Tendência mostrando a evolução da frequência de termos por área ao longo do tempo.|
|RN014| A visualização de gráficos deve permitir ao usuário ajustar o período de análise (ex: Últimos 30 dias, 6 meses).|
|RF015|	O frontend deve apresentar o Recurso de Comparação de duas ou mais fontes/áreas.|
|RN015| Este recurso deve estar visível apenas para usuários logados (MEMBRO_ANALISTA) e utilizar os dados retornados pelo RF010 para comparação.|
|RF016|	O frontend deve ter um Painel de Exportação claro e seguro.|
|RN016| O botão de exportação (Exportar CSV) deve estar oculto se o usuário não estiver autenticado ou não tiver o perfil MEMBRO_ANALISTA.|
|RF004|	O sistema deve permitir a recuperação de senha através do e-mail cadastrado.|
|RN004| O sistema deve enviar um token de recuperação de uso único e tempo limitado para o e-mail do usuário.
