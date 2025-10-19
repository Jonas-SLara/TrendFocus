INSERT INTO topico (titulo, descricao, area_conhecimento) VALUES
('Inteligência Artificial', 'Tópicos avançados em Machine Learning e Deep Learning.', 'CIÊNCIAS EXATAS E DA TERRA'), -- id: 1
('Sustentabilidade Energética', 'Pesquisas em fontes de energia limpa e renovável.', 'ENGENHARIAS'), -- id: 2
('Bioinformática', 'Aplicações de TI em dados biológicos e genômicos.', 'CIÊNCIAS BIOLÓGICAS'), -- id: 3
('Direito Digital e Ética', 'Regulamentação e aspectos legais relacionados à internet e tecnologia.', 'CIÊNCIAS SOCIAIS APLICADAS'), -- id: 4
('Patologias Humanas', 'Estudos sobre doenças crônicas e infecciosas.', 'CIÊNCIAS DA SAÚDE'), -- id: 5
('Linguística Computacional', 'Análise de linguagem natural e ferramentas computacionais.', 'LINGUÍSTICA, LETRAS E ARTES'); -- id: 6

INSERT INTO termo_chave (termo, topico_id) VALUES
-- Tópico: Inteligência Artificial (id = 1)
('Machine Learning', 1),
('Redes Neurais Convolucionais', 1),
('Visão Computacional', 1),
('Processamento de Linguagem Natural (PLN)', 1),
-- Tópico: Sustentabilidade Energética (id = 2)
('Hidrogênio Verde', 2),
('Eólica Offshore', 2),
('Células Solares Perovskita', 2),
('Armazenamento de Energia', 2),
-- Tópico: Bioinformática (id = 3)
('Edição Genômica CRISPR', 3),
('Sequenciamento de DNA', 3),
('Análise de Proteômica', 3),
('Algoritmos de Alinhamento', 3),
-- Tópico: Direito Digital e Ética (id = 4)
('LGPD', 4),
('Governança de Dados', 4),
('Marco Civil da Internet', 4),
-- Tópico: Patologias Humanas (id = 5)
('Biomarcadores Tumorais', 5),
('Imunoterapia', 5),
('Medicina de Precisão', 5),
-- Tópico: Linguística Computacional (id = 6)
('Modelos de Linguagem Grande (LLMs)', 6),
('Análise de Sentimento', 6);

-- Inserir a Notícia
INSERT INTO noticia (titulo, resumo, url_original, url_imagem, data_publicacao, data_coleta, fonte) VALUES
(
  'Estudo Combina IA e Bioinformática para Prever Estruturas Proteicas Raras',
  'Pesquisadores utilizaram Redes Neurais Convolucionais para acelerar o processo de Análise de Proteômica, resultando na identificação de novas estruturas que podem levar a avanços significativos no design de fármacos.',
  'http://exemplo.com/noticia-ia-proteinas',
  'http://exemplo.com/imagem-ia-proteinas.jpg',
  '2025-11-05 09:00:00',
  NOW(),
  'Journal of Advanced Bioinformatics'
);

-- Assumindo que a notícia acima recebeu o id = 1.
-- Relacionar a Notícia com Termos-Chave:
-- 'Redes Neurais Convolucionais' (topico_id=1, termo_id assumido=2), 'Análise de Proteômica' (topico_id=3, termo_id assumido=11)
INSERT INTO noticia_termo (noticia_id, termo_id) VALUES
(1, 2),  -- Redes Neurais Convolucionais
(1, 11); -- Análise de Proteômica