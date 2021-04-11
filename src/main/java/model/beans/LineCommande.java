package model.beans;

public class LineCommande {
	
	private int numcommande;
	private int codeArticle;
	private int qtrCde;
	
	
	public LineCommande(int numcommande, int codeArticle, int qtrCde) {
		super();
		this.numcommande = numcommande;
		this.codeArticle = codeArticle;
		this.qtrCde = qtrCde;
	}
	public int getNumcommande() {
		return numcommande;
	}
	public void setNumcommande(int numcommande) {
		this.numcommande = numcommande;
	}
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public int getQtrCde() {
		return qtrCde;
	}
	public void setQtrCde(int qtrCde) {
		this.qtrCde = qtrCde;
	}
	
	

}
