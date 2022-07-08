package pers.quan.customException;

public class TeamException extends Exception {
	static final long serialVersionUID = -3387516993124229948L;
	
    public TeamException(String message) {
        super(message);
    }

    public TeamException() {
        super();
    }
}
