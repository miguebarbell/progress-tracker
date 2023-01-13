package populator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;
//
import connection.ConnectionManager;

public class Populator {
//	private static Connection conn = ConnectionManager.getConnection();
	private static Connection conn = ConnectionManager.getConnection();

	public static void reset() {
		String fullQuery = """
				DROP SCHEMA IF EXISTS progresstracker;
				CREATE SCHEMA progresstracker;
				USE progresstracker;

				CREATE TABLE users (
				user_id INT auto_increment PRIMARY KEY,
				username varchar(255) unique,
				password varchar(255)
				);
				describe users;

				CREATE TABLE albums (
				album_id INT auto_increment PRIMARY KEY,
				album varchar(255));
				describe albums;

				-- drop table albums;

				CREATE TABLE progress (
				user_id INT NOT NULL,
				album_id INT NOT NULL,
				progress varchar(255),
				foreign key (user_id) references users(user_id),
				foreign key (album_id) references albums(album_id)
				);
				describe progress;

				-- drop table progress;

				INSERT into users(username, password) values ('charina1', md5('root'));
				INSERT into users(username, password) values ('sam2', md5('root'));
				INSERT into users(username, password) values ('Adrian3', md5('root'));
				INSERT into users(username, password) values ('Ayden4', md5('root'));
				INSERT into users(username, password) values ('miguel5', md5('root'));
				INSERT into users(username, password) values ('freezingSnow6', md5('root'));
				INSERT into users(username, password) values ('Cyb0Rg7', md5('root'));
				INSERT into users(username, password) values ('1Aney8', md5('root'));
				INSERT into users(username, password) values ('aragorn_9', md5('root'));
				INSERT into users(username, password) values ('buck$eak10', md5('root'));

				-- INSERT into users(username, password) values ('charina1', 'root');
				-- INSERT into users(username, password) values ('sam2', 'root');
				-- INSERT into users(username, password) values ('Adrian3', 'root');
				-- INSERT into users(username, password) values ('Ayden4', 'root');
				-- INSERT into users(username, password) values ('miguel5', 'root');
				-- INSERT into users(username, password) values ('freezingSnow6', 'root');
				-- INSERT into users(username, password) values ('Cyb0Rg7', 'root');
				-- INSERT into users(username, password) values ('1Aney8', 'root');
				-- INSERT into users(username, password) values ('aragorn_9', 'root');
				-- INSERT into users(username, password) values ('buck$eak10', 'root');

				select * from users;

				insert into albums values(NULL, "Lauryn Hill, 'The Miseducation of Lauryn Hill'");
				insert into albums values(NULL, "Bob Dylan, 'Blood on the Tracks'");
				insert into albums values(NULL, "Prince and the Revolution, 'Purple Rain'");
				insert into albums values(NULL, "Fleetwood Mac, 'Rumours'");
				insert into albums values(NULL, "Nirvana, 'Nevermind'");
				insert into albums values(NULL, "The Beatles, 'Abbey Road'");
				insert into albums values(NULL, "Stevie Wonder, 'Songs in the Key of Life'");
				insert into albums values(NULL, "Joni Mitchell, 'Blue'");
				insert into albums values(NULL, "The Beach Boys, 'Pet Sounds'");
				insert into albums values(NULL, "Marvin Gaye, 'What's Going On'");
				""";
		// String q = "DROP SCHEMA IF EXISTS progresstracker;";
		try (Statement statement = conn.createStatement();) {
//			Statement statement = conn.createStatement();
			statement.execute("DROP SCHEMA IF EXISTS progresstracker;");
			statement.execute("CREATE SCHEMA progresstracker;");
			statement.execute("USE progresstracker;");
			statement.execute("CREATE TABLE users (" + "user_id INT auto_increment PRIMARY KEY,"
					+ "username varchar(255) unique," + "password varchar(255));");
			statement.execute(
					"CREATE TABLE albums (" + "album_id INT auto_increment PRIMARY KEY," + "album varchar(255));");
			statement.execute("CREATE TABLE progress (" + "user_id INT NOT NULL," + "album_id INT NOT NULL,"
					+ "progress varchar(255)," + "foreign key (user_id) references users(user_id),"
					+ "foreign key (album_id) references albums(album_id));");
			statement.execute("INSERT into users(username, password) values ('sam2', md5('root'));");
			statement.execute("INSERT into users(username, password) values ('charina1', md5('root'));");
			statement.execute("insert into albums values(NULL, \"Lauryn Hill, 'The Miseducation of Lauryn Hill'\");");
			statement.execute("insert into albums values(NULL, \"Bob Dylan, 'Blood on the Tracks'\");");
			statement.execute("insert into albums values(NULL, \"Prince and the Revolution, 'Purple Rain'\");");
			statement.execute("insert into albums values(NULL, \"Fleetwood Mac, 'Rumours'\");");
			statement.execute("insert into albums values(NULL, \"Nirvana, 'Nevermind'\");");
			statement.execute("insert into albums values(NULL, \"The Beatles, 'Abbey Road'\");");
			statement.execute("insert into albums values(NULL, \"Stevie Wonder, 'Songs in the Key of Life'\");");
			statement.execute("insert into albums values(NULL, \"Joni Mitchell, 'Blue'\");");
			statement.execute("insert into albums values(NULL, \"The Beach Boys, 'Pet Sounds'\");");
			statement.execute("insert into albums values(NULL, \"Marvin Gaye, 'What's Going On'\");");
			
//			statement.execute("insert into progress(user_id, album_id, progress)values(2,11,'not completed');");
//			statement.execute("update progress set user_id = 3, album_id = 7, progress = 'in-progress' where user_id = 3;");
			// statement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
//		String q2 = "CREATE SCHEMA progresstracker;";
//		try (Statement statement = conn.createStatement();){
////			Statement statement = conn.createStatement();
//			statement.execute(q2);
//			//statement.close();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
	}
}
//		try {
//			Statement statement = conn.createStatement();
//			statement.execute("DROP SCHEMA IF EXISTS progresstracker;");
////			statement.execute("create schema progresstracker;");
////			statement.execute("USE progresstracker;");
////		//	statement.execute("drop database progresstracker;");
////			statement.execute("CREATE TABLE 'users' (" +
////			                  "user_id INT auto_increment PRIMARY KEY," +
////			                  "username varchar(255) unique," +
////			                  "password varchar(255));");
//} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
//}

//drop database progresstracker;
//create database progresstracker;
//use progresstracker;
//
//CREATE TABLE users (
//user_id INT auto_increment PRIMARY KEY,
//username varchar(255) unique,
//password varchar(255)
//);
//describe users;
//CREATE TABLE albums (
//album_id INT auto_increment PRIMARY KEY,
//album varchar(255));
//describe albums;
//-- drop table albums;
//CREATE TABLE progress (
//user_id INT NOT NULL,
//album_id INT NOT NULL,
//progress varchar(255),
//foreign key (user_id) references users(user_id),
//foreign key (album_id) references albums(album_id)
//);
//describe progress;
//-- drop table progress;
//INSERT into users(username, password) values ('charina1', md5('root'));
//INSERT into users(username, password) values ('sam2', md5('root'));
//INSERT into users(username, password) values ('Adrian3', md5('root'));
//INSERT into users(username, password) values ('Ayden4', md5('root'));
//INSERT into users(username, password) values ('miguel5', md5('root'));
//INSERT into users(username, password) values ('freezingSnow6', md5('root'));
//INSERT into users(username, password) values ('Cyb0Rg7', md5('root'));
//INSERT into users(username, password) values ('1Aney8', md5('root'));
//INSERT into users(username, password) values ('aragorn_9', md5('root'));
//INSERT into users(username, password) values ('buck$eak10', md5('root'));
//-- INSERT into users(username, password) values ('charina1', 'root');
//-- INSERT into users(username, password) values ('sam2', 'root');
//-- INSERT into users(username, password) values ('Adrian3', 'root');
//-- INSERT into users(username, password) values ('Ayden4', 'root');
//-- INSERT into users(username, password) values ('miguel5', 'root');
//-- INSERT into users(username, password) values ('freezingSnow6', 'root');
//-- INSERT into users(username, password) values ('Cyb0Rg7', 'root');
//-- INSERT into users(username, password) values ('1Aney8', 'root');
//-- INSERT into users(username, password) values ('aragorn_9', 'root');
//-- INSERT into users(username, password) values ('buck$eak10', 'root');
//select * from users;
//insert into albums values(NULL, "Lauryn Hill, 'The Miseducation of Lauryn Hill'");
//insert into albums values(NULL, "Bob Dylan, 'Blood on the Tracks'");
//insert into albums values(NULL, "Prince and the Revolution, 'Purple Rain'");
//insert into albums values(NULL, "Fleetwood Mac, 'Rumours'");
//insert into albums values(NULL, "Nirvana, 'Nevermind'");
//insert into albums values(NULL, "The Beatles, 'Abbey Road'");
//insert into albums values(NULL, "Stevie Wonder, 'Songs in the Key of Life'");
//insert into albums values(NULL, "Joni Mitchell, 'Blue'");
//insert into albums values(NULL, "The Beach Boys, 'Pet Sounds'");
//insert into albums values(NULL, "Marvin Gaye, 'What's Going On'");
//select * from albums;
//select * from progress;
//select * from users where username = 'sam2' and password = md5('root');
//insert into progress(user_id, album_id, progress)values(2,11,'not completed');
//update progress set user_id = 3, album_id = 7, progress = 'in-progress' where user_id = 3;"