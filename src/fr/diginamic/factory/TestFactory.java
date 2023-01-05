package fr.diginamic.factory;


public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjetConnecte obj1 = ObjetFactory.creerObjet(TypeObjet.PHONE, 9);

		System.out.println(obj1);

		ObjetConnecte obj2 = ObjetFactory.creerObjet(null, 9);

		System.out.println(obj2);


	}

}
