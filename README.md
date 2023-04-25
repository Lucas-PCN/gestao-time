# Projeto Gestão time

<p>Projeto entregue durante o curso de desenvolvimento Web ministrado pela <a href="https://www.betrybe.com" targe="_blank" rel="nofollow">Trybe</a>.</p>

<p>Obtive a aprovação no projeto completando 100% dos requisitos obrigatórios e opcionais. Efetivando, assim, a conclusão do Bloco 9 (ORM: Hibernate) referente a Aceleração em Java.</p>

## Descrição
 Sistema que faz a gestão de times esportivos.
 
 O projeto é um sistema que utiliza o framework hibernate e que realiza operações de CRUD (CREATE, READ, UPDATE, DELETE) para todas as entidades listadas, conforme a especificação abaixo.
 
#### 🟡 Para isso, as seguintes etapas foram seguidas:

  1. Analisar o relacionamento entre as entidades e escolher as anotações do hibernate necessárias:

```java
@OnetoOne
@OneToMany
@ManyToOne
@ManyToMany
```

  2. Criar todas as classes Data Access Object (DAO)
  3. Criar todas as classes Entity

### 🔸 Diagrama de entidade relacionamento
 
 Para auxiliar a elaboração do sistema, foi elaborado um diagrama de entidade relacionamento, exposto abaixo. 
 
 ![diagrama-relacionamento](https://github.com/Lucas-PCN/gestao-time/blob/main/img/der.png)
 

:pushpin: Os seguintes dados foram armazenados no sistema:
|   Entidade    |   Atributos                                   |
| :-----------: | :------------------------------------------- |
|   Torcedor    | Id, Nome                           |
|     Time      | Id, Nome, Lista de Jogadores, Lista de Torcedores |
|    Jogador    | Id, Nome, Posição, Documento, Time no qual trabalha |
|   Documento   | Id, CPF, Número da Carteira de Trabalho, Número CBF |


-- o Jogador tem um Documento, mas o Documento não tem um Jogador.

## Rodando o projeto localmente
  1. Clone o repositório
   
     `git@github.com:Lucas-PCN/gestao-time.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd gestao-time`

  3. Instale as dependências:
    
     `mvn install`

---

Projeto desenvolvido por Lucas Castanheira, para fins didáticos. 2023
