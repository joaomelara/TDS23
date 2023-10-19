
public class Bebida {


	private int id;

	private String Nome;

	private String Tipo;

	private String Marca;

	private String Data;

	private double Preco;

	private String Img;

	

	

	public Bebida(int id, String nome, String tipo, String marca, String data, double preco, String img) {

		super();

		this.id = id;

		Nome = nome;

		Tipo = tipo;

		Marca = marca;

		Data = data;

		Preco = preco;

		Img = img;

	}
	
	

	

	public Bebida() {

		

	}


	public int getId() {

		return id;

	}


	public void setId(int id) {

		this.id = id;

	}


	public String getNome() {

		return Nome;

	}


	public void setNome(String nome) {

		Nome = nome;

	}


	public String getTipo() {

		return Tipo;

	}


	public void setTipo(String tipo) {

		Tipo = tipo;

	}


	public String getMarca() {

		return Marca;

	}


	public void setMarca(String marca) {

		Marca = marca;

	}


	public String getData() {

		return Data;

	}


	public void setData(String data) {

		Data = data;

	}


	public double getPreco() {

		return Preco;

	}


	public void setPreco(double preco) {

		Preco = preco;

	}


	public String getImg() {

		return Img;

	}


	public void setImg(String img) {

		Img = img;

	}


	@Override

	public String toString() {

		return "Bebida [id=" + id + ", Nome=" + Nome + ", Tipo=" + Tipo + ", Marca=" + Marca + ", Data=" + Data

				+ ", Preco=" + Preco + ", Img=" + Img + "]";

	}

	

	

}