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
//	private int highscore;
//	private int wins;
//	private int losses;
//	private int money;
//	private int totalGames;
	
	private static ArrayList<User> users;
    
    
	private static void saveUsersData(){
    	try
        {
           FileOutputStream fileOut = new FileOutputStream("./users.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(users);
           out.close();
           fileOut.close();
           System.out.println("Serialized data is saved in ./users.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
    
	private static void retrieveUsersData(){
    	users = new ArrayList<User>();
    	try
    	{
    		FileInputStream fileIn = new FileInputStream("./users.ser");
    		ObjectInputStream in = new ObjectInputStream(fileIn);
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
    		in.close();
    		fileIn.close();
    	}catch(IOException i)
    	{
    		i.printStackTrace();
    		return;
    	}catch(ClassNotFoundException c)
    	{
    		System.out.println("Users Array not found");
    		c.printStackTrace();
    		return;
    	}
    }
    
    private static User getUser(String username){
    	retrieveUsersData();
		for(User usr : users){
			if(usr.username.equals(username))
				return usr;
		}
		return null;
    }
	public static boolean signUp(User user){
		if(getUser(user.username).equals(null)) {
			users.add(user);
			User.saveUsersData();
			System.out.println(((new Date()).toString())+": signed up successfully as " + user.username );
			return true;
		}
		System.out.println(((new Date()).toString())+": signed up has failed as " + user.username + " it exists" );
		return false;
    }
	
	public static User login(String username , String password){
		User usr = getUser(username);
		if(usr.equals(null) || !usr.password.equals(password)){
			System.out.println(((new Date()).toString())+": your username or password is incorrect, try again" );
			return null;
		}
		System.out.println(((new Date()).toString())+": login successfully as " + username );
		return usr;
	}
	
	
	
	

	public String getUsername() {
		return username;
	}



	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
//		this.wins = this.totalGames = this.money = this.losses = this.highscore = 0;
	}

}
