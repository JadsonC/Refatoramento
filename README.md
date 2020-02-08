# Refatoramento - Code smells corrigidos:

***1 - LAZY CLASS:*** Em um sistema de biblioteca foram feitas 3 classes para objeto: Pessoa, Usuario e Livro. A classe Usuario herdava de Pessoa. A classe pessoa compartilhava somente dois atributos e para uma única classe.


Classe Pessoa - https://github.com/JadsonC/Refatoramento/blob/master/Pessoa.java

Classe Usuario - https://github.com/JadsonC/Refatoramento/blob/master/UsuarioHerdandoPessoa.java

Solução: A classe Pessoa foi excluída e os atributos dela foram inclusos diretamente na classe Usuario, assim como os getters e setters dos atributos.

Classe Usuario modificada - https://github.com/JadsonC/Refatoramento/blob/master/LazyClassCorrigido.java

***2 - CODE DUPLICATION:*** No mesmo sistema do Lazy Class corrigido acima, em uma classe que tem acesso ao banco de dados possuia dois métodos com um loop cada e idênticos, que tinham a função de 'limpar a tela', printando vários "\n" consecutivos.

Classe com os loops duplicados (mostrarNomeLivro e mostrarLivroPorGenero) - https://github.com/JadsonC/Refatoramento/blob/master/CodeDuplication.java

Solução: Um novo método chamado "limparTela" foi criado com um único loop, o qual é chamado dentro dos métodos "mostrarNomeLivro" e "mostraLivroPorGenero".

Code Duplication corrigido - https://github.com/JadsonC/Refatoramento/blob/master/CodeDuplicationCorrigido.java

***3 - LONG METHOD:*** Em um sistema de gerenciamento de lojas, há uma classe na qual os métodos possuem vários prints simulando o menu de escolhas que o usuário deve fazer, o que torna os métodos mais longos e consequentemente menos legíveis.

Métodos com simuladores de menus (menu, cashierManagement, clientManagement, employeeManagement e stockManagement) - https://github.com/paulov59/Projeto-OO/blob/master/src/main/StoreManager.java

Solução: Criar um método para cada simulação de menu. Cada simulador de menu será chamado dentro dos métodos, ao invés de ser printado diretamente deles.

Long Method corrigido - https://github.com/JadsonC/Refatoramento/blob/master/LongMethodCorrigido.java

OBS: também foi criado o método "showException" que evita a repetição de código em 6 partes diferentes da classe, assim sendo chamado quando necessário. Isso corrige code duplication e long method.

***Referências de códigos:*** 

https://github.com/JadsonC/Projeto_OO

https://github.com/paulov59/Projeto-OO
