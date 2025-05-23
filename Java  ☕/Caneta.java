public class Caneta {
    // Atributos = características
    String cor; 
    String modelo;
    String marca;
    String tampada;
    String escrevendo;

    // Método tampar()
    //void = sem retorno
    void tampar(String tampada) {
        if (this.tampada == "Tampada") {
            System.out.println("Caneta está tampada");
        }
        else {
            System.out.println("Caneta está destampada");
        }
    }
    
    void escrever(String escrevendo) {
        if (this.escrevendo == "Escrevendo") {
            System.out.println("Caneta está escrevendo");
        }
        else {
            System.out.println("Caneta está tampada, não pode escrever");
        }
    }
    
    void caneta(){
        System.out.println("Minha caneta é "+this.cor + " com o modelo sendo uma " +this.modelo + " com a marca " + this.marca +  ", e nesse momento ela está " + this.tampada + " com status de " + this.escrevendo);
    }
    public static void main(String[] args) {

        // Instanciando a classe Caneta
        // Atributos sendo inicializados
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.marca = "Faber Castell";
        c1.tampada = "Tampada";
        c1.modelo = "esferográfica";
        c1.escrevendo = "Escrevendo";

        //Métodos sendo chamados
        c1.escrever(String.valueOf(c1.escrevendo));
        c1.tampar(String.valueOf(c1.tampada));
        c1.caneta();
    }
}