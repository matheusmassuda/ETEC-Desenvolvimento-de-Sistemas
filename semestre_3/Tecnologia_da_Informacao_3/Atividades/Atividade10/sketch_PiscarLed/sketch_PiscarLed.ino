void setup() {
  // Define a porta 13 como saída
  pinMode (13, OUTPUT);
}

void loop() {
  // Acende LED na porta 13 como ALTO (Corrente)
  digitalWrite (13, HIGH);
  // Estabelece 140 milsegundos de "espera" com ele aceso
  delay (140);
  // Acende LED na porta 13 como BAIXO == DESLIGADO (Corrente)
  digitalWrite (13, LOW);
  // Estabelece 140 milsegundos de "espera" com ele apagado
  delay (140);

  // Acende LED na porta 13 como ALTO (Corrente)
  digitalWrite (13, HIGH);
  // Estabelece 140 milsegundos de "espera" com ele aceso
  delay (140);
  // Acende LED na porta 13 como BAIXO == DESLIGADO (Corrente)
  digitalWrite (13, LOW);
  // Estabelece 500 milsegundos de "espera" com ele apagado, para simular "descanço" do coração
  delay (500);
}
