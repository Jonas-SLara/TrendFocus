-- =====================================
-- INSERÇÃO DE TERMOS-CHAVE INICIAIS
-- =====================================
-- Estes termos são usados para vincular notícias aos tópicos e áreas de conhecimento

INSERT INTO termo_chave (termo, id_topico) VALUES
-- CIÊNCIAS AGRÁRIAS
('agricultura regenerativa', 1),  -- id 1
('cultivo orgânico', 2),          -- id 2
('suplementação animal', 3),      -- id 3

-- CIÊNCIAS BIOLÓGICAS
('DNA recombinante', 4),          -- id 4
('biodiversidade', 5),            -- id 5
('mutação genética', 6),          -- id 6

-- CIÊNCIAS DA SAÚDE
('sistema único de saúde', 7),    -- id 7
('plasticidade cerebral', 8),     -- id 8
('imunização', 9),                -- id 9

-- CIÊNCIAS EXATAS E DA TERRA
('simulação numérica', 10),       -- id 10
('geoprocessamento', 11),         -- id 11
('modelagem matemática', 12),     -- id 12

-- CIÊNCIAS HUMANAS
('pensamento crítico', 13),       -- id 13
('comportamento social', 14),     -- id 14
('pedagogia crítica', 15),        -- id 15

-- CIÊNCIAS SOCIAIS APLICADAS
('política fiscal', 16),          -- id 16
('gestão pública', 17),           -- id 17

-- ENGENHARIAS
('nanotecnologia', 18),           -- id 18
('inteligência artificial', 19),  -- id 19

-- LINGUÍSTICA, LETRAS E ARTES
('análise textual', 20),          -- id 20
('comparatismo literário', 21);   -- id 21
