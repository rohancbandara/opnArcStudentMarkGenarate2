package com.rcb.utility;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DbConnection {

	static String url = "jdbc:mysql://localhost:3307/opn_student";

	public static Connection con() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = (Connection) DriverManager.getConnection(url, "root", "admin");

		return con1;

	}

	public void putData(String sql) throws Exception {
		Statement st = (Statement) con().createStatement();
		st.executeUpdate(sql);

	}

	public ResultSet getData(String sql) throws Exception {
		Statement st = (Statement) con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		con().close();
		return rs;
	}

}
