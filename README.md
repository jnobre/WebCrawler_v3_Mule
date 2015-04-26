##Descrição

Implementação de uma aplicação empresarial cujo objectivo é receber informação sobre filmes e processar essa informação de modo a fornece-la a terceiros. Os clientes desta aplicação podem ligar-se através de um browser ou cliente SOAP onde poderão subscrever a recepção informação relativa à chegada de novos filmes.

##Flows
#Subscription to Movie Information
**Static Web Page **
	1. Um utilizador pode fazer subscribe ou unsubscribe através de uma página web.

A informação inserida na página HTML é enviada através de um get para o endereço localhost:8081/subscribe/. O flow divide-se então em subscribe e unsubscribe verificando para ambas a existência do email na base de dados (enviando uma mensagem informativa caso já exista no subscribe ou não exista no unsubscribe). Por fim envia um email para o endereço inserido com um link para confirmar a acção escolhida.

**Cliente SOAP**

O utilizador poderá também fazer subscribe/unsubscribe através do cliente SOAP através de uma interface em versão linha de comandos.

A nível de flow o funcionamento é semelhante ao anterior excepto pelo facto de a informação ser recebida pelo cliente SOAP sob o formato de XML e retirada através da utilização de XPATH.

**Confirmação**

Quando o utilizador seguir o link de confirmação, este será inserido ou removido da base de dados.

##Adding New MOvies
**XML File**

Novos filmes podem ser adicionados ao sistema colocando um ficheiro XML com a informação sobre estes numa pasta específica (“movie_xml”).

**SOAP**

Os filmes podem da mesma forma ser inseridos através de um cliente SOAP com seu respectivo menu em versão modo texto.
A informação é recebida pelo sistema, convertida de XML para um objecto da classe correspondente e encaminhado para o flow seguinte onde será adicionado.

**Adição dos Filmes**
Para cada filme passado, são filtrados aqueles que não têm score. Caso o filme já exista, será enviada uma mensagem informativa para o servidor. Caso contrário o filme é adicionado à base de dados, sendo enviado um email ou criado um tweet conforme o rating do filme. Por fim, são actualizadas as estatísticas com base no género do filme.

**Tweet**

O tweet é criado sob o formato “<Nome do filme> was added.”.

**Envio do Email**
Para um non-digest email ser enviado, o sistema vai buscar todos os non-digest users à base de dados, envia-lhes o email com o filme adicionado e actualiza as estatísticas que controlam os emails enviados.

**Digest Emails**

Os digest emails são enviados periodicamente, controlados por um Quartz. Quando a altura chega de enviar um novo digest email o sistema vai buscar todos os filmes que ainda não foram enviados ao utilizador. Após o envio do email, o filme é marcado como enviado e as estatísticas relativas aos emails enviados são actualizadas.

**Estatísticas**
As estatísticas registadas são apresentadas ao utilizador. Em modo texto. 

Para obter o número de filmes processados é feita uma query a base de dados para obter o número total de filmes. O número de filmes processados por categoria e o número de digest e non digest emails enviados são também obtidos através de queries à base de dados.


**Tabelas**

Novas tabelas foram criadas e utilizadas neste projecto:
Esforço
(EM FALTA)



