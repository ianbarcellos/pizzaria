package aplicacao;

import model.Pizza;

public class App {
    public static void main(String[] args) {
        Pizza pedido = new Pizza("frango", 30, 'p');

        System.out.println("Pedido criado!!!");
        System.out.println(pedido.pedidoIfood());
    }
}
