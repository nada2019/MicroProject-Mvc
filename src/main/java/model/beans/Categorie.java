package model.beans;

public class Categorie {
	 
		private int ref;
		private String cat;
		
		
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Categorie(int ref, String cat) {
			super();
			this.ref = ref;
			this.cat = cat;
		}
		public int getRef() {
			return ref;
		}
		public void setRef(int ref) {
			this.ref = ref;
		}
		public String getCat() {
			return cat;
		}
		public void setCat(String cat) {
			this.cat = cat;
		}
		
		

}
