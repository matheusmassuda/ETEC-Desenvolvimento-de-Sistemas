programa {
  
  cadeia nome_cliente, onde_comer, refeicao_escolhida, bebida_escolhida
  inteiro numero_opcao, numero_escolher_refeicao, numero_escolher_bebida

  funcao inicio() {
  
    escreva("================================\n")
    escreva("> Autoatendimento EDO-DS1 2025 <\n")
    escreva("================================\n")

    escreva("Digite seu nome: \n")
    leia(nome_cliente)

    escreva("======================================================================\n")
    escreva("Seja bem-vindo(a) ",nome_cliente, "! Digite o número da opção desejada: \n" )
    escreva("======================================================================\n")
    escreva("Digite (1) - Para comer aqui.\n")
    escreva("Digite (2) - Para levar.\n")
    leia(numero_opcao)

    inicio_onde_comer()

    escreva("======================================================================\n")
    escreva("Escolha a refeição: \n" )
    escreva("======================================================================\n")
    escreva("Digite (1) - Para escolher Hambúrguer.\n")
    escreva("Digite (2) - Para escolher Pizza.\n")
    escreva("Digite (3) - Para escolher Salgado.\n")
    leia(numero_escolher_refeicao)
    
    inicio_escolher_refeicao()

    numero_escolher_bebida
    escreva("Digite (1) - Para escolher Refrigerante.\n")
    escreva("Digite (2) - Para escolher Suco.\n")
    escreva("Digite (3) - Para escolher Água.\n")
    leia(numero_escolher_bebida)
    
    inicio_escolher_bebida()

    inicio_resposta()
    
    
  }

  funcao inicio_onde_comer(){
		se(numero_opcao == 1){ 
      onde_comer = "para comer no local, bom apetite!"     
		} senao se(numero_opcao == 2) { 
      onde_comer = "para levar, boa viagem!"
		}	

	}

  funcao inicio_escolher_refeicao(){
		se(numero_escolher_refeicao == 1){ 
      refeicao_escolhida = "hambúrguer"
		} senao se(numero_escolher_refeicao == 2) { 
      refeicao_escolhida = "pizza"
		}	senao se(numero_escolher_refeicao == 3) {
      refeicao_escolhida = "lanche"
    }

	}

  funcao inicio_escolher_bebida(){
    se(numero_escolher_bebida == 1){ 
      bebida_escolhida = "refrigerante"
		} senao se(numero_escolher_bebida == 2) { 
      bebida_escolhida = "suco"
		}	senao se(numero_escolher_bebida == 3) {
      bebida_escolhida = "água"
    } 
  }

  funcao inicio_resposta(){
    escreva("===================================================================================================\n")
    escreva("Pedido finalizado! Seu combo é: ",refeicao_escolhida, " com ", bebida_escolhida, " ", onde_comer, "\n")
    escreva("===================================================================================================\n")
  }

}

