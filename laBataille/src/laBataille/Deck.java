package laBataille;


import java.util.LinkedList;

public class Deck {
	
	int nbVals;
	int val;
	String couleur;
	
	LinkedList <Integer> deck= new LinkedList<Integer> ();

	public Deck() {
		
		deck= new LinkedList <Integer> ();
	}
   

	public Deck(String couleur) {
		super();
		this.couleur = couleur;
	}






	public Deck(int nbVals) {
		
		deck= new LinkedList<Integer> ();
		
		for(int i=0; i<=nbVals; i++){
			
			for(int j=0; j<=4; j++){
			
				deck.add(j);
			
			}
		}
	}

	
	// renvoie true si le paquet est vide sinon false;
	
	public boolean isEmpty (){
		
		for (int i=0; i<deck.size(); i++){
		
			if( this.deck.isEmpty()){
			
			   return true;
			}else {
		
		
		return false;
			}
		}
		return false;
	
	
	}
	
	
	// cette m�thode renvoie le nombre de carte que contient le paquet
	
	public int size(){
		
		return  this.deck.size();
		
	}
	
	
	// cette m�thode renvoie une cha�ne de caract�res representant le paquet.
	@Override
	public String toString() {
		return deck.size() + " " +(deck.size()==0||deck.size()==1?"carte":"cartes")+" "+deck;
	}



	// Si le paquet d n'est pas vide, supprime sa premi�re carte, l'ajoute �
	//la fin du paquet courtant, puis renvoie sa valeur courante, sinon renvoie
	//null tandis que les paquets restent inchang�s.
	
	public Integer pick (Deck d){
		
		d= new Deck ();
		int j=0;
		if (!d.isEmpty()){
		
			j= d.deck.removeFirst();
			d.deck.addLast(j);
		return nbVals;	
		} else {
			
			return null;
		}
		
		
	}
	//Cette m�thode supprime une � une toutes les cartes du paquet d et les ajoutes � la fin du paquet courant.
	
		public void  pickAll(Deck d){
		
		d= new Deck ();
		int card=0;
		
		for (int i=0; i<d.size(); i++){
			
			card=d.deck.removeFirst();
			
			d.deck.addLast(card);
			
		}
		
	}
	
  // Cette m�thode renvoie true  si l'objet courant est un paquet valide
	public boolean isDeck (int nbVals){
	
		if(nbVals<1 || nbVals>4){
			
			return true;
		} else{
		
		return false;
		}
		
	}
}
