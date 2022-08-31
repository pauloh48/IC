# IC
dados IC

# Para artigo
## deepmatcher
* preparar exemplo similar os deepmatcher sobre diry, structured, textual, descrição do produto (descrição computador) 
* usa tabelas
* figura 1 colocar em portugues
* mostrar tupla t1 e t2 (dirty, structured, textual) com erro de digitação

* FIGURA 1 em portugues
 - t1 e t2 normal
 - criar t1.1 e t2.1 com erros 
 
 
 
 # artigo que descreve deepmatcher 'Entity Matching with Transformer Architectures - A Step Forward in Data Integration'
 * LSTM lida com memoria;



***********************************************************************************************************
trabalhar no resumo do relatorio. Pegar na introdução os ultimos paragrafos

cada frase do resumo é um paragrafo da introdução.
Qual o problem? Pq imoprtate? o que de ruim pode acarretar? Pq dificil para resolver? Limitçõe dos trabalhos anteriores,
limites textuais (o nosso) e indicativo dos resultados.

Artigo cientifico para o ERI citar no relatorio.

Introdução paragrafo por paragrafo para gerar resumo.



escrever e declara o termo especifico (descrver o termo)

Escrever seção 3 - olhar artigos pra usar como base

descrever dataset (mais tempo), metricas (F1), ambiente

e 4 do artigo

AMBIENTE (menor que resultados)**************************************************
=> tabela 1
A tabela 1 apresenta alguns datasets que foram utilizados
para para a realização dos experimentos, o atributo ''tipo'' 
se refere ao tipo de dados de entrada, assim para o tipo 
estruturados há cinco datasets, para textual há 1 dataset e 
para sujos há 2 datasets.

Os datasets estruturados (descrever datasets)

-> descrever de onde veio o dataset (olhar git deepmatcher)

O atributo rotulado se refere a quantidade de dados rotulado 
(descrever)

atributo atributo (comentar)


=> metricas (descrever brevemente)
Para mensurar o desempenho dos modelos do \textit{Ditto} e modelos de sumarização do \textit{DeepMatcher}, se usa o F1 que representa a acurácia em todos os modelos treinados para a identificação de menções de entidades e é obtido a partir da precisão e do recall. A precisão é definida como o verdadeiro positivo dividido pela soma do falso e verdadeiro positivo, $P = VP/(FP+VP)$, ela representa as correspondências corretas. Já o recall é obtido pelo verdadeiro positivo dividido pela soma do falso negativo e verdadeiro positivo, $R = VP/(VP+FN)$, ele representa as correspondências identificadas corretamente pelo modelo. Por fim o F1 é dado por $2PR/(P + R)$ \cite{doan2018DeepMatcher,12doan2020Ditto}.
 
 
 => tabela 2
 - definir Ei
 - descrever porcentagem de erros, a quantidade, atibutos 
 (pq tal atributo? mais representativo)
 
 => mais
 - citar pacotes e onde foram baixados
 - padronização do ambiente de execução
 - comentar sobre colab


RESULTADOS **************************************************
=> comentar sobre tempo (qual mais rapido e mais lento e pq)
=> comparação delta
 - descrver brevemente as tabelas
 - um paragrafo pra cada tabela
 - definir delta (original -e)
 - pq ditto é melhor?
