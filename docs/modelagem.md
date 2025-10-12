Table usuario{
  nome varchar(100) [not null]
  id bigint pk [not null]
  email varchar(255) [not null]
  senha varchar(255) [not null]
  created timestamp  
  ativo bool [default: true]
}

Table perfil{
  id bigint pk
  tipo enum [not null]
}

Table usuario_perfil{
  id_usuario bigint [ref: > usuario.id]
  id_perfil bigint [ref: > perfil.id]
}

Table area_conhecimento{
  id bigint
  titulo varchar(255)
  descricao varchar(255)
}

Table noticia{
  id bigint pk [not null]
  titulo varchar(255) [not null]
  resumo text [not null]
  url_original varchar(500) [not null]
  url_imagem varchar(500)
  data_publicacao timestamp [not null]
  data_coleta timestamp [not null]
  nivel_fonte enum
}

Table termo_chave{
  id bigint pk
  termo varchar(100)
  area_id bigint [ref: > area_conhecimento.id]
}

Table noticia_area{
  noticia_id bigint [ref: > noticia.id]
  area_conhecimento_id bigint [ref: > area_conhecimento.id]
}
