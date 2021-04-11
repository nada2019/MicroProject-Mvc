package model.beans;

public class Commandes {
	
	private int num;
	private Client code_client;
	private String datecom;
    private LineCommande line;
    
    
	public Commandes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commandes(int num, Client code_client, String datecom, LineCommande line) {
		super();
		this.num = num;
		this.code_client = code_client;
		this.datecom = datecom;
		this.line = line;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Client getCode_client() {
		return code_client;
	}
	public void setCode_client(Client code_client) {
		this.code_client = code_client;
	}
	public String getDatecom() {
		return datecom;
	}
	public void setDatecom(String datecom) {
		this.datecom = datecom;
	}
	public LineCommande getLine() {
		return line;
	}
	public void setLine(LineCommande line) {
		this.line = line;
	}
    
    

}
