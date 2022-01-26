package TVButton;

 class TV {      // request class (receiver class) which have the methods and do their actions 
//	boolean flag = true ;
	public boolean isON() {
		return true;
	}
	public void onTv() {
		System.out.println("TV is opened.");
	}
	public void offTv() {
		System.out.println("TV is closed.");
	}

}
