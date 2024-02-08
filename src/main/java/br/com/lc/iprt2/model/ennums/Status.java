package br.com.lc.iprt2.model.ennums;

public enum Status {
	
	ABERTO(0, "ABERTO"),  ENCERRADO(1, "ENCERRADO");
	
	private Integer cod;
	private String descricao;
	
	
	private Status(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}


	public Integer getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (Status x : Status.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Status invãlido");
	}
	

}
