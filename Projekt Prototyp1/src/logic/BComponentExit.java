package logic;

public class BComponentExit implements BComponent{
	@SuppressWarnings("unused")
	private int alignment;
	private String img;
	
	public BComponentExit(int alignment) {
		super();
		this.img = "/dto/Player.png";
	}
	
    public boolean canWalk(int direction){
        return true;
    }
    
    public boolean isExit() {
    	return true;
    }
    
    public String getImage() {
		return this.img;
	}

	@Override
	public void replaceWithPlayer() {
	}

	@Override
	public void replaceNoPlayer() {
	}
}