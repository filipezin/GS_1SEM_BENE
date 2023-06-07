create sequence SQ_FRUTO start with 1 increment by 1;
create sequence SQ_PESSOA_FISICA start with 1 increment by 1;
create sequence SQ_PESSOA_JURIDICA start with 1 increment by 1;
create sequence SQ_RIG_LINHA start with 1 increment by 50;
create sequence SQ_SOCKET start with 1 increment by 50;

    create table TB_FRUTO (
       ID_FRUTO number(19,0) not null,
        NM_FENOTIPO varchar2(255 char),
        NM_FRUTO varchar2(255 char),
        CARBOIDRATOS float(53),
        monoinsaturada float(53),
        poliinsaturada float(53),
        saturada float(53),
        KCAL float(53),
        porcao float(53),
        PROTEINAS float(53),
        TP_FRUTO varchar2(255 char),
        primary key (ID_FRUTO)
    );

    create table TB_PESSOA_FISICA (
       ID_PESSOA_FISICA number(19,0) not null,
        NR_CPF varchar2(255 char),
        DT_CONTRATACAO date,
        DT_NASCIMENTO date,
        DS_EMAIL varchar2(255 char),
        DS_ENDERECO varchar2(255 char),
        DS_ESTADO_CIVIL varchar2(255 char),
        NR_FILHOS number(10,0),
        NM_PESSOA varchar2(255 char),
        DS_RENDA float(53),
        DS_RENDA_PER_CAPITA float(53),
        SENHA_ACESSO varchar2(255 char),
        sexo varchar2(255 char),
        NR_TELEFONE varchar2(255 char),
        primary key (ID_PESSOA_FISICA)
    );

    create table TB_PESSOA_JURIDICA (
       ID_PESSOA_JURIDICA number(19,0) not null,
        NR_CNPJ varchar2(255 char),
        DT_CONTRATACAO date,
        DS_EMAIL varchar2(255 char),
        DS_ENDERECO varchar2(255 char),
        NM_EMPRESA varchar2(255 char),
        SENHA_ACESSO varchar2(255 char),
        NR_TELEFONE varchar2(255 char),
        primary key (ID_PESSOA_JURIDICA)
    );

    create table TB_RIG_LINHA (
       ID_LINHA number(19,0) not null,
        fluxoAgua float(53),
        ligado number(1,0),
        ec float(53),
        ph float(53),
        ppm float(53),
        calcio float(53),
        fosforo float(53),
        magnesio float(53),
        nitrogenio float(53),
        potassio float(53),
        zinco float(53),
        NR_PLANTAS_RIG number(10,0),
        primary key (ID_LINHA)
    );

    create table TB_SOCKET (
       ID_SOCKET number(19,0) not null,
        SKT_DT_COLHEITA date,
        SKT_DT_PLANTIO date,
        SKT_PESO float(53),
        SKT_TEMPERATURA float(53),
        UMIDADE_AR float(53),
        primary key (ID_SOCKET)
    );

    alter table TB_FRUTO 
       add constraint UK_FENOTIPO unique (NM_FENOTIPO);

    alter table TB_PESSOA_FISICA 
       add constraint UK_CPF unique (NR_CPF);

    alter table TB_PESSOA_JURIDICA 
       add constraint UK_CNPJ unique (NR_CNPJ);
create sequence SQ_FRUTO start with 1 increment by 1;
create sequence SQ_PESSOA_FISICA start with 1 increment by 1;
create sequence SQ_PESSOA_JURIDICA start with 1 increment by 1;
create sequence SQ_RIG_LINHA start with 1 increment by 50;
create sequence SQ_SOCKET start with 1 increment by 50;

    create table TB_FRUTO (
       ID_FRUTO number(19,0) not null,
        NM_FENOTIPO varchar2(255 char),
        NM_FRUTO varchar2(255 char),
        CARBOIDRATOS float(53),
        monoinsaturada float(53),
        poliinsaturada float(53),
        saturada float(53),
        KCAL float(53),
        porcao float(53),
        PROTEINAS float(53),
        TP_FRUTO varchar2(255 char),
        primary key (ID_FRUTO)
    );

    create table TB_PESSOA_FISICA (
       ID_PESSOA_FISICA number(19,0) not null,
        NR_CPF varchar2(255 char),
        DT_CONTRATACAO date,
        DT_NASCIMENTO date,
        DS_EMAIL varchar2(255 char),
        DS_ENDERECO varchar2(255 char),
        DS_ESTADO_CIVIL varchar2(255 char),
        NR_FILHOS number(10,0),
        NM_PESSOA varchar2(255 char),
        DS_RENDA float(53),
        DS_RENDA_PER_CAPITA float(53),
        SENHA_ACESSO varchar2(255 char),
        sexo varchar2(255 char),
        NR_TELEFONE varchar2(255 char),
        primary key (ID_PESSOA_FISICA)
    );

    create table TB_PESSOA_JURIDICA (
       ID_PESSOA_JURIDICA number(19,0) not null,
        NR_CNPJ varchar2(255 char),
        DT_CONTRATACAO date,
        DS_EMAIL varchar2(255 char),
        DS_ENDERECO varchar2(255 char),
        NM_EMPRESA varchar2(255 char),
        SENHA_ACESSO varchar2(255 char),
        NR_TELEFONE varchar2(255 char),
        primary key (ID_PESSOA_JURIDICA)
    );

    create table TB_RIG_LINHA (
       ID_LINHA number(19,0) not null,
        fluxoAgua float(53),
        ligado number(1,0),
        ec float(53),
        ph float(53),
        ppm float(53),
        calcio float(53),
        fosforo float(53),
        magnesio float(53),
        nitrogenio float(53),
        potassio float(53),
        zinco float(53),
        NR_PLANTAS_RIG number(10,0),
        primary key (ID_LINHA)
    );

    create table TB_SOCKET (
       ID_SOCKET number(19,0) not null,
        SKT_DT_COLHEITA date,
        SKT_DT_PLANTIO date,
        SKT_PESO float(53),
        SKT_TEMPERATURA float(53),
        UMIDADE_AR float(53),
        primary key (ID_SOCKET)
    );

    alter table TB_FRUTO 
       add constraint UK_FENOTIPO unique (NM_FENOTIPO);

    alter table TB_PESSOA_FISICA 
       add constraint UK_CPF unique (NR_CPF);

    alter table TB_PESSOA_JURIDICA 
       add constraint UK_CNPJ unique (NR_CNPJ);
