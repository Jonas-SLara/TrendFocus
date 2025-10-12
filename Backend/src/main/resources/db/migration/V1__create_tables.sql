CREATE TABLE "usuario" (
  "nome" varchar(100) NOT NULL,
  "id" bigint PRIMARY KEY NOT NULL,
  "email" varchar(255) NOT NULL,
  "senha" varchar(255) NOT NULL,
  "created" timestamp,
  "ativo" bool DEFAULT true
);

CREATE TABLE "perfil" (
  "id" bigint PRIMARY KEY,
  "tipo" enum NOT NULL
);

CREATE TABLE "usuario_perfil" (
  "id_usuario" bigint,
  "id_perfil" bigint
);

CREATE TABLE "area_conhecimento" (
  "id" bigint,
  "titulo" varchar(255),
  "descricao" varchar(255)
);

CREATE TABLE "noticia" (
  "id" bigint PRIMARY KEY NOT NULL,
  "titulo" varchar(255) NOT NULL,
  "resumo" text NOT NULL,
  "url_original" varchar(500) NOT NULL,
  "url_imagem" varchar(500),
  "data_publicacao" timestamp NOT NULL,
  "data_coleta" timestamp NOT NULL,
  "nivel_fonte" enum
);

CREATE TABLE "termo_chave" (
  "id" bigint PRIMARY KEY,
  "termo" varchar(100),
  "area_id" bigint
);

CREATE TABLE "noticia_area" (
  "noticia_id" bigint,
  "area_conhecimento_id" bigint
);

ALTER TABLE "usuario_perfil" ADD FOREIGN KEY ("id_usuario") REFERENCES "usuario" ("id");

ALTER TABLE "usuario_perfil" ADD FOREIGN KEY ("id_perfil") REFERENCES "perfil" ("id");

ALTER TABLE "termo_chave" ADD FOREIGN KEY ("area_id") REFERENCES "area_conhecimento" ("id");

ALTER TABLE "noticia_area" ADD FOREIGN KEY ("noticia_id") REFERENCES "noticia" ("id");

ALTER TABLE "noticia_area" ADD FOREIGN KEY ("area_conhecimento_id") REFERENCES "area_conhecimento" ("id");
