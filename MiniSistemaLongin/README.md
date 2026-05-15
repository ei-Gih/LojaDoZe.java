## Objetivo

/*Você foi contratado para criar um sistema bem simples da "Loja do Zé". O sistema precisa permitir que o usuário se cadastre, faça login e compre produtos, tudo a partir de um menu que fica aparecendo na tela até o usuário decidir sair.

Para guardar os dados dos clientes, você vai usar vetores paralelos, ou seja, três vetores onde a posição [i] em cada um deles representa o mesmo cliente: um vetor de String para os nomes, outro de String para as senhas e um de double para os saldos.

O sistema deve suportar no máximo 5 usuários cadastrados, então é importante criar também uma variável inteira que conte quantos já foram cadastrados, e outra variável inteira que guarde o índice do usuário que está logado no momento (inicializada com -1, indicando que ninguém está logado).

Assim que o programa começar, ele deve mostrar um menu em loop com as opções:

1 - Cadastrar
2 - Login
3 - Comprar
0 - Sair

O usuário escolhe um número pelo Scanner e o programa executa a ação correspondente, voltando ao menu logo depois (exceto quando ele escolher sair).

Na opção de cadastrar, o programa deve primeiro verificar se já existem 5 usuários cadastrados; se sim, mostra a mensagem "Limite atingido" e volta ao menu. Caso ainda haja espaço, ele pede o nome e a senha do novo usuário e salva nas próximas posições livres dos vetores. O saldo inicial de todo novo usuário deve ser 100.0, só para que ele já consiga testar a compra logo de cara. Por fim, o contador de cadastrados é incrementado em 1.

Na opção de login, o programa pede o nome e a senha e percorre o vetor de usuários com um for procurando uma posição onde o nome digitado bata com o nome cadastrado e a senha também bata. Se encontrar, guarda o índice dessa posição na variável de usuário logado e mostra uma mensagem de boas-vindas. Se não encontrar nenhuma combinação válida, mostra "Usuário ou senha incorretos".

Na opção de comprar, antes de tudo o programa precisa checar se existe alguém logado, usando um if que compara a variável de usuário logado com -1. Se ninguém estiver logado, mostra "Faça login primeiro!" e volta ao menu. Caso contrário, mostra um pequeno catálogo com duas opções:

1 - Camiseta (R$ 50)
2 - Boné (R$ 30)

Usando if / else if, o programa descobre o preço do produto escolhido e, em seguida, verifica se o saldo do usuário logado é suficiente para a compra. Se for, desconta o valor do saldo e mostra "Compra realizada!" junto com o saldo atualizado. Se não for, mostra "Saldo insuficiente".

A opção 0 - Sair simplesmente encerra o programa com uma mensagem de despedida.

Para testar, sugiro o seguinte fluxo: cadastre um usuário chamado "joao" com senha "1234", faça login com essas credenciais, tente comprar uma camiseta (deve funcionar e deixar o saldo em R$ 50), tente comprar outra camiseta (deve dar saldo insuficiente, porque sobrariam só R$ 0) e por fim saia do sistema. Esse caminho exercita todas as partes importantes do programa. */
