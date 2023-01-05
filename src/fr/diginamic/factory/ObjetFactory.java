package fr.diginamic.factory;

public class ObjetFactory {

	public static ObjetConnecte creerObjet(TypeObjet type, int limiteVolts) {
////----------------
//		if (type != null) {
//			if (type.equals(TypeObjet.SOUND)) {
//				return new EnceinteConnectee(limiteVolts);
//			} else if (type.equals(TypeObjet.PAD)) {
//				return new Tablette(limiteVolts);
//			} else  {
//				return new TelephonePortable(limiteVolts);
//			}
//		} else
//			return null;
//-------------------
		switch (type) {
		case SOUND:
			return new EnceinteConnectee(limiteVolts);
		case PAD:
			return new Tablette(limiteVolts);
		case PHONE:
			return new TelephonePortable(limiteVolts);
		default:
			return null;
		}
	}
}