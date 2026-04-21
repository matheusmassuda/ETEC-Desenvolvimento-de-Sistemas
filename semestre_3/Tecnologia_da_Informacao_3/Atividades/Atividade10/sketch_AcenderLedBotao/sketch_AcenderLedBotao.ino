// Define uma VARIÁVEL para o botão (push) a ser acionado manualmente
int Botao = 0;

void setup() {
  //Define a porta 7 como ENTRADA (Captura da informação com botão)
  pinMode(7, INPUT);
  //Define a porta 13 como SAÍDA (saída da informação para o mundo físico LED)
  pinMode(13, OUTPUT);

}

void loop() {
  //Pega o valor que está na porta "7" que é o botão e joga na dentro do valor da variável
  Botao = digitalRead(7);

  // Condicional para valor do botão e resposta no LED 0 -> Acende | 1 -> Desliga
  if (Botao == 0) {
    digitalWrite(13, HIGH);
  } else {
    digitalWrite(13, LOW);
  }

  //Define um tempo de 10ms entre o tempo de acionar o botão e o resultado aparecer no LED
  delay(10);
}
