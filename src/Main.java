import exeptions.LoginException;

public class Main {
	public static void main(String[] args) {
		try {
			// here is the login propt


			// else
			throw new LoginException();
		} catch (LoginException e) {

			// Launch again the login prompt.
		}
	}
}
