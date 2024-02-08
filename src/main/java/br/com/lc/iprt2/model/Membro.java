package br.com.lc.iprt2.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.lc.iprt2.model.ennums.Cargo;
import br.com.lc.iprt2.model.ennums.Dizimista;
import br.com.lc.iprt2.model.ennums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



public class Membro implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	@Column(unique = true)
	private String email;
	
	private String senha;
	private String telefone;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataConversao;
	
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataNascimento;
	
	
	private Set<Integer> perfil = new HashSet<>();
	private Set<Integer> cargo = new HashSet<>();
	private Set<Integer> dizimista = new HashSet<>();
	
	
	public Membro() {
		super();
		addPerfil(UserRole.MEMBRO);
	}


	public Membro(Integer id, String nome, String email, String senha, String telefone, LocalDate dataConversao,
			LocalDate dataNascimento, Set<Integer> perfil, Set<Integer> cargo, Set<Integer> dizimista) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.dataConversao = dataConversao;
		this.dataNascimento = dataNascimento;
		this.perfil = perfil;
		this.cargo = cargo;
		this.dizimista = dizimista;
		addPerfil(UserRole.MEMBRO);
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public LocalDate getDataConversao() {
		return dataConversao;
	}


	public void setDataConversao(LocalDate dataConversao) {
		this.dataConversao = dataConversao;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public Set<UserRole> getPerfil() {
		return perfil.stream().map(x -> UserRole.toEnum(x)).collect(Collectors.toSet());
	}


	public void addPerfil(UserRole userRole) {
		this.perfil.add(userRole.getCod());
	}


	public Set<Cargo> getCargo() {
		return cargo.stream().map(x -> Cargo.toEnum(x)).collect(Collectors.toSet());
	}


	public void addCargo(Cargo cargo) {
		this.cargo.add(cargo.getCod());
	}


	public Set<Dizimista> getDizimista() {
		return dizimista.stream().map(x -> Dizimista.toEnum(x)).collect(Collectors.toSet());
	}


	public void addDizimista(Dizimista dizimista) {
		this.dizimista.add(dizimista.getCodigo());
	}

	
	
}
