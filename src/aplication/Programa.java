package aplication;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) {
		Pedido novoPedido = new Pedido(2130,new Date(),StatusDoPedido.PENDENTE_PAGAMENTO);
		System.out.println(novoPedido);

	}

}
