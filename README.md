# FiapRide 🚗

Projeto simples desenvolvido em Java para simular um sistema de transporte de passageiros.

## Classe Passageiro

A classe Passageiro representa um usuário do sistema FiapRide.

Cada passageiro possui:
- nome
- saldo disponível para pagar corridas

## Métodos

### adicionarSaldo(double valor)
Esse método adiciona saldo ao passageiro.

Regra de negócio:
O valor precisa ser maior que 0.

### pagarCorrida(double valorCorrida)
Esse método realiza o pagamento de uma corrida.

Regra de negócio:
O passageiro só pode pagar se tiver saldo suficiente.

## Teste do sistema

No arquivo SistemaPrincipal.java foram criados dois passageiros para testar o sistema.

## Autor

Gabriel Simioni