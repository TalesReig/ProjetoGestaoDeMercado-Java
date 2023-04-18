# ConfigurationManagement

**OBS: Foi pego um projeto antigo para fazer esse detalhamento hipotético**

## O Sistema de Vendas tem as seguintes funcionalidades:

* O sistema possui interface gráfica ( segue exemplos do final do documento ) 
* O Sistema contará com 2 com 2 tipos de acesso.
  * ![Captura de tela 2023-04-17 220800](https://user-images.githubusercontent.com/90864593/232643347-553f551e-d92b-437e-8eb6-b7fb6a5bbc67.png)
  * Admim, que conseguirá inserir editar e excluir produtos do estoque, de acordo com as regras de validação que o cliente que comprar o produto decidir. Mas existem as regras padrões como o nome do produto não pode ser vazio, valor maior que zero e só pode excluir caso não esteja em algum pedido em aberto ou algo do tipo.
  ![Captura de tela 2023-04-17 220822](https://user-images.githubusercontent.com/90864593/232643243-95aba889-3a2e-4cb3-b89e-58b828202fc3.png)
  * Cliente o cliente poderá apenas adicionar item no pedido, remover e escolher forma de pagamento e Quando a forma de pagamento for escolhida como crédito, permitir o registro da quantidade de parcelas, sendo que cada parcela deve ser maior que R $20,00.
  ![Captura de tela 2023-04-17 220814](https://user-images.githubusercontent.com/90864593/232643289-5c21be9c-ee7f-44d5-a6d5-a74ba2d49f68.png)
* Os dados do arquivo seriam salvos em um Banco de dados local e na nuvem para garantir a segurança do sistema. 
* O projeto foi feito em uma linguagem híbrida no Caso Java.
* O projeto seria do tipo javax.swing.
Como foi conversado em sala, o projeto é hipotético e o Real não usa banco de dados, mas para fins de detalhamento ficou assim.


## Processo de Solicitação de Mudanças.

* Recebimento da solicitação de Mudança: O processo começa quando o Gerente de Produto recebe uma solicitação de mudança do cliente ou do próprio time interno da empresa. Essa solicitação deve ser registrada em uma ferramenta de gerenciamento de projetos ou em um sistema de rastreamento de problemas. É importante que a solicitação inclua informações claras e detalhadas sobre a mudança desejada, incluindo a justificativa para a mudança e quais funcionalidades serão afetadas.
* Triagem da solicitação:O Gerente de Produto analisa a solicitação para determinar sua viabilidade e prioridade. Se a solicitação for considerada viável e valiosa para o negócio, ela será adicionada à lista de backlog do produto. Caso contrário, a solicitação será rejeitada e o Gerente de Produto deve fornecer uma justificativa clara para o solicitante.
* Priorização da solicitação:O Product Owner trabalha em conjunto com o Gerente de Produto para priorizar a solicitação de mudança com base nas necessidades do negócio e dos usuários. Eles devem considerar o impacto da solicitação na experiência do usuário, na receita, no tempo de desenvolvimento e em outras considerações relevantes.
* Estimativa de esforço e Estimar data de entrega:O Líder de Equipe ou Desenvolvedor experiente é convidado a participar do processo para avaliar a complexidade da mudança e estimar o tempo necessário para a implementação. Eles devem levar em consideração o nível de esforço técnico necessário, bem como o impacto da mudança em outras partes do sistema.
* Revisão e Entrega:Após a conclusão dos testes de qualidade, a mudança é revisada pelo Product Owner e pelo Líder de Equipe para garantir que todos os requisitos foram atendidos e que a mudança não afeta negativamente outras partes do sistema. Se aprovado, a mudança é entregue ao cliente ou disponibilizada para uso interno.


## Versionamento do Código:

O código será versionado usando um sistema de controle de versão como o Git. Cada mudança será registrada em um commit com uma descrição clara do que foi alterado e por que.
* X é a versão principal (major)
* Y é a versão secundária (minor)
* Z é a versão de patch (patch)

A versão principal é incrementada quando ocorrem mudanças significativas no software que podem quebrar a compatibilidade com as versões anteriores. Por exemplo, uma mudança que afeta a API pública do software ou altera significativamente a forma como ele é usado.

A versão secundária é incrementada quando novas funcionalidades são adicionadas ou mudanças significativas são feitas, mas sem quebrar a compatibilidade com as versões anteriores. Por exemplo, uma nova funcionalidade que é adicionada ao software.

A versão de patch é incrementada quando pequenas correções de bugs são feitas ou pequenas melhorias são adicionadas ao software sem quebrar a compatibilidade com as versões anteriores.


## Organização Das Branches:

As branches serão organizadas usando o modelo Gitflow, que é um fluxo de trabalho baseado em duas branches principais: master e develop. A branch master será usada para manter o código de produção, enquanto a branch develop será usada para integrar o código de todos os desenvolvedores e para criar os releases. Além dessas branches, serão criadas branches feature para desenvolver novas funcionalidades ou correções de bugs, branches release para preparar a versão para lançamento e branches hotfix para correções emergenciais.

**Branch Master:** essa branch contém o código que está em produção. Nenhum código deve ser diretamente commitado nesta branch.

**Branch Develop:** está branch é onde os desenvolvedores integram seu código e onde as mudanças são testadas e validadas antes de serem lançadas. Novas branches de feature são criadas a partir desta branch.

**Branches de Feature:** cada funcionalidade ou mudança importante deve ser desenvolvida em uma branch de feature separada. Essas branches são criadas a partir da branch Develop e mescladas de volta a ela quando a funcionalidade estiver pronta.

**Branches de Release:** as branches de release são criadas a partir da branch Develop quando uma nova versão do software está pronta para ser lançada. Essas branches são usadas para preparar a versão para lançamento e garantir que tudo esteja funcionando corretamente.

**Branches de Hotfix:** quando uma falha crítica é encontrada no software em produção, uma branch de hotfix é criada a partir da branch Master. Essas branches são usadas para corrigir o problema o mais rápido possível e garantir que a versão corrigida seja lançada o mais rápido possível.


## Definição das humerações:
Cada commit será identificado com um número de humeração que seguirá um padrão estabelecido pela equipe de desenvolvimento, como por exemplo, "tr-implement-nomeDaIssue"(tr inicial de Tales Reig) ou “pn-fix-nomeDaIssue”(pn inicial de Pedro Nunes). Essa humeração será usada para fazer referência ao commit em outros lugares, como nas branches de feature ou nos relatórios de bugs. Além disso, os commits estarão associados a uma ou mais mudanças, que serão documentadas em uma ferramenta de gerenciamento de projetos como o Jira.


## Releases do Software:
As releases do software serão criadas a partir da branch develop, após um período de testes e validações das mudanças implementadas. Será utilizado o modelo de versionamento semântico, que consiste em definir um número de versão seguindo o formato "MAJOR.MINOR.PATCH", onde cada componente representa um nível de mudança. O número de versão será atualizado automaticamente durante o processo de release usando ferramentas como o Gitflow e o Jenkins.
E com base em cada versão liberada e publicado internamente também um release-notes onde fica claro tudo o que foi implementado ou corrigido naquela versão.
