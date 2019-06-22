package entities;

import java.util.Date;

import entities.enums.StatusDoPedido;

public class Pedido {
	private Integer id;
	private Date momento;
	private StatusDoPedido status;

//construtores da classe

	public Pedido() {
	}

	public Pedido(Integer id, Date momento, StatusDoPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	

//getters e setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public StatusDoPedido getStatus(){
		return status;	
	}
	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
	
	//sobrecrevendo método to string
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento do pedido =" + momento + ", status do pedido =" + status + "]";
	}
	
	
}