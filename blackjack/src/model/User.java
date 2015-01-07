/*
 * 
 * 	Nadine Smair		308573252			Anton Anton		203323902
 *	Ameer Dow			203844956			Geryes Moussa 	301622635
 *
 *
 */

package model;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class User implements java.io.Serializable {


	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private int highscore;
	private int losses;
	private int totalGames;
	private static ArrayList<User> users;


	/*
	 * Saves user data to the serialized file
	 */

	protected static void saveUsersData(){
		try
		{
			try (FileOutputStream fileOut = new FileOutputStream("./users.ser"); 
					ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
				out.writeObject(users);
			}
			System.out.println("Serialized data is saved in /users.ser");
		}catch(IOException i)
		{
		}
	}

	/*
	 * Retrieves the serialized file
	 */

	private static void retrieveUsersData(){
		users = new ArrayList<>();
		try
		{
			try (FileInputStream fileIn = new FileInputStream("./users.ser"); ObjectInputStream in = new ObjectInputStream(fileIn)) {
				Object obj = in.readObject();
				if(obj instanceof ArrayList<?>){
					ArrayList<?> al = (ArrayList<?>) obj;
					for(int i=0; i<al.size();i++){
						Object o = al.get(i);
						if(o instanceof User)
						{
							users.add((User) o);
						}
					}
				}
			}
		}catch(IOException i)
		{
		}catch(ClassNotFoundException c)
		{
			System.out.println("Users Array not found");
		}
	}


	/*
	 * Returns the requested user or null if not found
	 */

	private static User getUser(String username){
		retrieveUsersData();
		for(User usr : users){
			if(usr.username.equals(username))
				return usr;
		}
		return null;
	}

	/*
	 * Returns true if the sign up was successful or false otherwise
	 */

	public static boolean signUp(User user){
		if(getUser(user.username) == null) {
			users.add(user);
			User.saveUsersData();
			System.out.println(((new Date()).toString())+": signed up successfully as " + user.username );
			return true;
		}
		System.out.println(((new Date()).toString())+": signed up has failed as " + user.username + " it exists" );
		return false;
	}

	/*
	 * Returns the user if the login was successful and null otherwise
	 */

	public static User login(String username , String password){
		User usr = getUser(username);
		if(usr == null){
			System.out.println(((new Date()).toString())+": your username or password is incorrect, try again" );
			return null;
		}
		if(!usr.password.equals(password)){
			System.out.println(((new Date()).toString())+": your username or password is incorrect, try again" );
			return null;
		}
		System.out.println(((new Date()).toString())+": login successfully as " + username );
		return usr;
	}


	/*
	 * Username getter
	 */
	public String getUsername() {
		return username;
	}



	/*
	 * High score getter
	 */

	public int getHighscore() {
		return highscore;
	}

	/*
	 * High Score setter
	 */

	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

	/*
	 * Losses getter
	 */

	public int getLosses() {
		return losses;
	}

	/*
	 * Losses setter
	 */

	public void setLosses(int losses) {
		this.losses = losses;
	}

	/*
	 * Total Games getter
	 */

	public int getTotalGames() {
		return totalGames;
	}

	/*
	 * Total Games setter
	 */

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	/*
	 * Wins getter
	 */

	public int getWins() {
		return totalGames - losses;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.totalGames  = this.losses = this.highscore = 0; // this.wins = this.money
	}

}
