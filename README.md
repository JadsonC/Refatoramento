# Refatoramento - Code smells corrigidos:

1 - LAZY CLASS. Em um sistema de biblioteca foram feitas 3 classes para objeto: Pessoa, Usuario e Livro. A classe Usuario herdava de Pessoa. A classe pessoa compartilhava somente dois atributos e para uma única classe.


Classe Pessoa - https://github.com/JadsonC/Refatoramento/blob/master/Pessoa.java

Classe Usuario - https://github.com/JadsonC/Refatoramento/blob/master/UsuarioHerdandoPessoa.java

Solução: A classe Pessoa foi excluída e os atributos dela foram inclusos diretamente na classe Usuario, assim como os getters e setters dos atributos.

Classe Usuario modificada - https://github.com/JadsonC/Refatoramento/blob/master/LazyClassCorrigido.java
