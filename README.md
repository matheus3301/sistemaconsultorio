# Sistema Consultório

Esse sistema foi desenvolvido durante a disciplina Laboratório de Software no curso Técnico em Informática na EEEP Walter Ramos de Araújo.
O sistema é baseado em um consultório médico que possui três usuários diferentes: Administrador, Secretária, Médico; cada um com suas devidas funções. 
![Login](https://i.imgsafe.org/7b/7b4f49fe0a.gif)
>Na tela de Login o usuário pode selecionar qual tipo de usuário é e logo em seguida fazer login




# Atores
### Secretária
![Secretária](https://i.imgsafe.org/7b/7b35c2e8c3.png)
 - Cadastrar Médico
 - Ver Médicos
 - Alterar Médico
 - Excluir Médico
 - Cadastrar Paciente
 - Ver Paciente
 - Alterar Paciente
 - Excluir Paciente
 - Agendar Compromissos(Externos ou Consulta) na Agenda de um médico
 - Ver Compromissos
 - Alterar Compromisso
 - Excluir Compromisso
 - Cadastrar Convênio
 - Ver Convênios
 - Alterar Convênio
 - Excluir Convênio
 - Emitir Relatórios

### Médico
![Médico](https://i.imgsafe.org/7b/7b56b4fa2f.png)
 - Consultar Agenda
 - Realizar Consultas
 - Consulta à tabela CID(Todas as doenças conhecidas)
 - Emitir Atestados
 - Emitir Receitas

### Administrador
![Administrador](https://i.imgsafe.org/7b/7b6615efb8.png)
 - Cadastrar Secretária
 - Ver Secretárias
 - Alterar Secretária
 - Excluir Secretárias
 - Alterar Informações da Clínica
 - Cadastrar Médico
 - Ver Médicos
 - Alterar Médico
 - Excluir Médico
 - Cadastrar Paciente
 - Ver Paciente
 - Alterar Paciente
 - Excluir Paciente
 - Agendar Compromissos(Externos ou Consulta) na Agenda de um médico
 - Ver Compromissos
 - Alterar Compromisso
 - Excluir Compromisso
 - Cadastrar Convênio
 - Ver Convênios
 - Alterar Convênio
 - Excluir Convênio
 - Emitir Relatórios

>NOTA: O Administrador é basicamente uma secretária que pode cadastrar novas secretárias e editar as informações da clínica


# Instalação 

O Software foi desenvolvido em Java, é compatível com os OS: Windows, MacOS e Linux. O Projeto NetBeans do sistema está sendo disponibilizado, mas caso você queria apenas executá-lo uma versão já compilada está no repositório.

### Caso queira apenas executar o projeto.

**Requisitos:**

 - JRE([Download](https://www.java.com/pt_BR/download/))
 - XAMPP(Para usarmos o MySQL)
 
 **Instalação:**
 
 O primeiro passo é baixar e extrair o projeto do GitHub para sua máquina. 
 ![download](https://i.imgsafe.org/7b/7bb6117017.gif)
Após o download, basta extrair o arquivo normalmente.

Após o download e extração, o segundo passo é instalar o Banco de Dados.
Inicie o XAMPP(Tanto o MySQL quanto o PHP, pois iremos usar o phpMyAdmin), em seguida acesse o phpMyAdmin(normalmente o endereço é http://localhost/phpmyadmin/). Iremos criar um novo Banco de  Dados chamado  *db_consultorio* e nele iremos importar o arquivo *db_consultorio.sql* disponiblizado na pasta do projeto
>NOTA: O processo de importação pode durar alguns minutos pois a tabela de doenças é muito extensa. 

 ![phpMyAdmin](https://i.imgsafe.org/7c/7c29925e36.gif)

Após a instalação do Banco de Dados, finalmente é hora de executar o Software. dentro do acesse o diretório: *SistemaConsultorio/dist*.
Dentro desse diretório haverá um arquivo chamado *SistemaConsultorio.jar*, para executá-lo basta executar o comando no terminal:

	    java -jar SistemaConsultorio.jar	    

![Executar](https://i.imgsafe.org/7c/7c8731a7de.gif)

Caso ocorra tudo como esperado, o sistema irá executar normalmente. Para primeiro login o usuário administrador padrão tem nome de usuário *admin* e senha *admin* (mais padrão impossível :stuck_out_tongue_closed_eyes:)

>NOTA: Caso queira copiar apenas o executável para outro diretório você pode, mas a pasta *lib* também será necessária pois a aplicação depende dessas bibliotecas. 


   
# Conclusão
O sistema foi desenvolvido como forma de aprendizado, com certeza ainda há muitas coisas a serem melhoradas e implementadas, hoje se eu refizesse o mesmo sistema do zero com certeza o faria com muitas coisas diferentes pois a bagagem de conhecimentos de Arquitetura de Software e outros durante o primeiro desenvolvimento foi muito grande e com certeza irá ajudar no desenvolvimento de algum possível software.

Caso tenha gostado do projeto e deseja contribuir, basta mandar um pull-request que eu irei fazer questão de conferir. Obrigado pela atenção e bom desenvolvimento a todos.  
