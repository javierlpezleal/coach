package personaltrainer.model;
// Generated 14-ago-2017 23:50:33 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Catalogo generated by hbm2java
 */
public class Catalogo implements java.io.Serializable {

	private Integer id;
	private String tipCatalogo;
	private int valor;
	private String nombre;
	private String descripcion;
	private int orden;
	private Set<Cliente> clientesForNivelFisico = new HashSet<Cliente>(0);
	private Set<Plan> plansForNivel = new HashSet<Plan>(0);
	private Set<Ejercicio> ejercicios = new HashSet<Ejercicio>(0);
	private Set<Plan> plansForMaquina = new HashSet<Plan>(0);
	private Set<Cliente> clientesForSexo = new HashSet<Cliente>(0);
	private Set<Plan> plansForObjetivo = new HashSet<Plan>(0);
	private Set<Cliente> clientesForObjetivo = new HashSet<Cliente>(0);
	private Set<Coach> coaches = new HashSet<Coach>(0);

	public Catalogo() {
	}

	public Catalogo(String tipCatalogo, int valor, String nombre, int orden) {
		this.tipCatalogo = tipCatalogo;
		this.valor = valor;
		this.nombre = nombre;
		this.orden = orden;
	}

	public Catalogo(String tipCatalogo, int valor, String nombre, String descripcion, int orden,
			Set<Cliente> clientesForNivelFisico, Set<Plan> plansForNivel, Set<Ejercicio> ejercicios,
			Set<Plan> plansForMaquina, Set<Cliente> clientesForSexo, Set<Plan> plansForObjetivo,
			Set<Cliente> clientesForObjetivo, Set<Coach> coaches) {
		this.tipCatalogo = tipCatalogo;
		this.valor = valor;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.orden = orden;
		this.clientesForNivelFisico = clientesForNivelFisico;
		this.plansForNivel = plansForNivel;
		this.ejercicios = ejercicios;
		this.plansForMaquina = plansForMaquina;
		this.clientesForSexo = clientesForSexo;
		this.plansForObjetivo = plansForObjetivo;
		this.clientesForObjetivo = clientesForObjetivo;
		this.coaches = coaches;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipCatalogo() {
		return this.tipCatalogo;
	}

	public void setTipCatalogo(String tipCatalogo) {
		this.tipCatalogo = tipCatalogo;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getOrden() {
		return this.orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public Set<Cliente> getClientesForNivelFisico() {
		return this.clientesForNivelFisico;
	}

	public void setClientesForNivelFisico(Set<Cliente> clientesForNivelFisico) {
		this.clientesForNivelFisico = clientesForNivelFisico;
	}

	public Set<Plan> getPlansForNivel() {
		return this.plansForNivel;
	}

	public void setPlansForNivel(Set<Plan> plansForNivel) {
		this.plansForNivel = plansForNivel;
	}

	public Set<Ejercicio> getEjercicios() {
		return this.ejercicios;
	}

	public void setEjercicios(Set<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}

	public Set<Plan> getPlansForMaquina() {
		return this.plansForMaquina;
	}

	public void setPlansForMaquina(Set<Plan> plansForMaquina) {
		this.plansForMaquina = plansForMaquina;
	}

	public Set<Cliente> getClientesForSexo() {
		return this.clientesForSexo;
	}

	public void setClientesForSexo(Set<Cliente> clientesForSexo) {
		this.clientesForSexo = clientesForSexo;
	}

	public Set<Plan> getPlansForObjetivo() {
		return this.plansForObjetivo;
	}

	public void setPlansForObjetivo(Set<Plan> plansForObjetivo) {
		this.plansForObjetivo = plansForObjetivo;
	}

	public Set<Cliente> getClientesForObjetivo() {
		return this.clientesForObjetivo;
	}

	public void setClientesForObjetivo(Set<Cliente> clientesForObjetivo) {
		this.clientesForObjetivo = clientesForObjetivo;
	}

	public Set<Coach> getCoaches() {
		return this.coaches;
	}

	public void setCoaches(Set<Coach> coaches) {
		this.coaches = coaches;
	}

}