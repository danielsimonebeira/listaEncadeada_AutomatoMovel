Um autômato móvel é controlado a partir da indicação da direção que ele
deve seguir, num plano de duas dimensões, e a distância que deve percorrer.
As direções são 
frente, 
traz, 
esquerda e 
direita. 

Prepare um programa que permita armazenar, 
em uma lista dinâmica duplamente encadeada, 
um percurso completo digitado pelo usuário, 
composto de vários trechos. 
Cada trecho é formato por um número único de identificação do trecho, 
a direção (frente, traz, esquerda, direita) a seguir e a distância a ser percorrida (na
unidade apropriada). O número único de identificação do trecho é gerado
automaticamente pelo programa, sequencialmente; os demais dados são
digitados pelo usuário, ao construir o percurso.
A seguinte estrutura pode ser usada:

1
`typedef struct { 
    int idTrecho;
    char direcao;
    float distancia; 
 } TipoTrecho; `

Use as funções de manipulação de listas dinâmicas duplamente encadeadas
já implementadas, adaptando-as apropriadamente para os novos tipos e
estruturas.

Na função de impressão do percurso total, adicione o cálculo e impressão da
distância total que o autômato foi programado a percorrer, considerando o
percurso total digitado.