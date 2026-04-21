void setup() {
  // Define a porta 13 como saída
  pinMode (13, OUTPUT);
}

void loop() {
  // Acende LED na porta 13 como ALTO (Corrente)
  digitalWrite (13, HIGH);
  // Estabelece 1000 milsegundos de "espera" com ele aceso
  delay (1000);
  // Acende LED na porta 13 como BAIXO == DESLIGADO (Corrente)
  digitalWrite (13, LOW);
  // Estabelece 1000 milsegundos de "espera" com ele apagado
  delay (1000);
}
