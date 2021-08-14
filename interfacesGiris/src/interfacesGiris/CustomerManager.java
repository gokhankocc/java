package interfacesGiris;

public class CustomerManager {
	
	private ICastomerDal customerdal;
	
	public CustomerManager(ICastomerDal customerdal) {
		super();
		this.customerdal = customerdal;
	}



	public void add() {
		//kodlar
		customerdal.add();
	}

}
