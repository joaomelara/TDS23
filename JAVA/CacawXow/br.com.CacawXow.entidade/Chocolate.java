import java.sql.Date;

public class Chocolate {
	protected int Id_Chocolate;
	protected String Nome_Chocoate;
	protected String Tipo_Chocolate;
	protected String Marca_Chocolate;
	protected Date Data_Val;
	protected Double Preco_Chocolate;
	protected String Img_Chocolate;
	
	public Chocolate() {
		
	}
	
	public Chocolate(int id_Chocolate, String nome_Chocoate, String tipo_Chocolate, String marca_Chocolate,
			Date data_Val, Double preco_Chocolate, String img_Chocolate) {
		super();
		Id_Chocolate = id_Chocolate;
		Nome_Chocoate = nome_Chocoate;
		Tipo_Chocolate = tipo_Chocolate;
		Marca_Chocolate = marca_Chocolate;
		Data_Val = data_Val;
		Preco_Chocolate = preco_Chocolate;
		Img_Chocolate = img_Chocolate;
	}

	public Chocolate(String nome_Chocoate, String tipo_Chocolate, String marca_Chocolate, Date data_Val,
			Double preco_Chocolate, String img_Chocolate) {
		super();
		Nome_Chocoate = nome_Chocoate;
		Tipo_Chocolate = tipo_Chocolate;
		Marca_Chocolate = marca_Chocolate;
		Data_Val = data_Val;
		Preco_Chocolate = preco_Chocolate;
		Img_Chocolate = img_Chocolate;
	}

	public int getId_Chocolate() {
		return Id_Chocolate;
	}
	public void setId_Chocolate(int id_Chocolate) {
		Id_Chocolate = id_Chocolate;
	}
	public String getNome_Chocoate() {
		return Nome_Chocoate;
	}
	public void setNome_Chocoate(String nome_Chocoate) {
		Nome_Chocoate = nome_Chocoate;
	}
	public String getTipo_Chocolate() {
		return Tipo_Chocolate;
	}
	public void setTipo_Chocolate(String tipo_Chocolate) {
		Tipo_Chocolate = tipo_Chocolate;
	}
	public String getMarca_Chocolate() {
		return Marca_Chocolate;
	}
	public void setMarca_Chocolate(String marca_Chocolate) {
		Marca_Chocolate = marca_Chocolate;
	}
	public Date getData_Val() {
		return Data_Val;
	}
	public void setData_Val(Date data_Val) {
		Data_Val = data_Val;
	}
	public Double getPreco_Chocolate() {
		return Preco_Chocolate;
	}
	public void setPreco_Chocolate(Double preco_Chocolate) {
		Preco_Chocolate = preco_Chocolate;
	}
	public String getImg_Chocolate() {
		return Img_Chocolate;
	}
	public void setImg_Chocolate(String img_Chocolate) {
		Img_Chocolate = img_Chocolate;
	}
	
	
	

}
